/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.media.v1;

import com.twilio.base.Updater;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class PlayerStreamerUpdater extends Updater<PlayerStreamer> {
    private final String pathSid;
    private final PlayerStreamer.UpdateStatus status;

    /**
     * Construct a new PlayerStreamerUpdater.
     *
     * @param pathSid The SID that identifies the resource to update
     * @param status The status the PlayerStreamer should be transitioned to
     */
    public PlayerStreamerUpdater(final String pathSid,
                                 final PlayerStreamer.UpdateStatus status) {
        this.pathSid = pathSid;
        this.status = status;
    }

    /**
     * Make the request to the Twilio API to perform the update.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Updated PlayerStreamer
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public PlayerStreamer update(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.MEDIA.toString(),
            "/v1/PlayerStreamers/" + this.pathSid + ""
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("PlayerStreamer update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return PlayerStreamer.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (status != null) {
            request.addPostParam("Status", status.toString());
        }
    }
}