/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.media.v1;

import com.twilio.base.Creator;
import com.twilio.converter.Converter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.net.URI;
import java.util.Map;

public class MediaProcessorCreator extends Creator<MediaProcessor> {
    private final String extension;
    private final String extensionContext;
    private Map<String, Object> extensionEnvironment;
    private URI statusCallback;
    private HttpMethod statusCallbackMethod;

    /**
     * Construct a new MediaProcessorCreator.
     *
     * @param extension The Media Extension name or URL
     * @param extensionContext The Media Extension context
     */
    public MediaProcessorCreator(final String extension,
                                 final String extensionContext) {
        this.extension = extension;
        this.extensionContext = extensionContext;
    }

    /**
     * User-defined environment variables for the Media Extension, represented as a
     * JSON dictionary of key/value strings. See the documentation for the specific
     * <a href="/docs/live/api/media-extensions-overview">Media Extension</a> you
     * are using for more information about whether you need to provide this..
     *
     * @param extensionEnvironment The Media Extension environment
     * @return this
     */
    public MediaProcessorCreator setExtensionEnvironment(final Map<String, Object> extensionEnvironment) {
        this.extensionEnvironment = extensionEnvironment;
        return this;
    }

    /**
     * The URL to which Twilio will send asynchronous webhook requests for every
     * MediaProcessor event. See <a href="/docs/live/status-callbacks">Status
     * Callbacks</a> for details..
     *
     * @param statusCallback The URL to send MediaProcessor event updates to your
     *                       application
     * @return this
     */
    public MediaProcessorCreator setStatusCallback(final URI statusCallback) {
        this.statusCallback = statusCallback;
        return this;
    }

    /**
     * The URL to which Twilio will send asynchronous webhook requests for every
     * MediaProcessor event. See <a href="/docs/live/status-callbacks">Status
     * Callbacks</a> for details..
     *
     * @param statusCallback The URL to send MediaProcessor event updates to your
     *                       application
     * @return this
     */
    public MediaProcessorCreator setStatusCallback(final String statusCallback) {
        return setStatusCallback(Promoter.uriFromString(statusCallback));
    }

    /**
     * The HTTP method Twilio should use to call the `status_callback` URL. Can be
     * `POST` or `GET` and the default is `POST`..
     *
     * @param statusCallbackMethod The HTTP method Twilio should use to call the
     *                             `status_callback` URL
     * @return this
     */
    public MediaProcessorCreator setStatusCallbackMethod(final HttpMethod statusCallbackMethod) {
        this.statusCallbackMethod = statusCallbackMethod;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created MediaProcessor
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public MediaProcessor create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.MEDIA.toString(),
            "/v1/MediaProcessors"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("MediaProcessor creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return MediaProcessor.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (extension != null) {
            request.addPostParam("Extension", extension);
        }

        if (extensionContext != null) {
            request.addPostParam("ExtensionContext", extensionContext);
        }

        if (extensionEnvironment != null) {
            request.addPostParam("ExtensionEnvironment", Converter.mapToJson(extensionEnvironment));
        }

        if (statusCallback != null) {
            request.addPostParam("StatusCallback", statusCallback.toString());
        }

        if (statusCallbackMethod != null) {
            request.addPostParam("StatusCallbackMethod", statusCallbackMethod.toString());
        }
    }
}