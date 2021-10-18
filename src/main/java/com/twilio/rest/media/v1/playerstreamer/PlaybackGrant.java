/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.media.v1.playerstreamer;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.Converter;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class PlaybackGrant extends Resource {
    private static final long serialVersionUID = 273006766773829L;

    /**
     * Create a PlaybackGrantCreator to execute create.
     *
     * @param pathSid The unique string that identifies the PlayerStreamer
     *                associated with this PlaybackGrant.
     * @return PlaybackGrantCreator capable of executing the create
     */
    public static PlaybackGrantCreator creator(final String pathSid) {
        return new PlaybackGrantCreator(pathSid);
    }

    /**
     * Create a PlaybackGrantFetcher to execute fetch.
     *
     * @param pathSid The SID that identifies the resource to fetch
     * @return PlaybackGrantFetcher capable of executing the fetch
     */
    public static PlaybackGrantFetcher fetcher(final String pathSid) {
        return new PlaybackGrantFetcher(pathSid);
    }

    /**
     * Converts a JSON String into a PlaybackGrant object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return PlaybackGrant object represented by the provided JSON
     */
    public static PlaybackGrant fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, PlaybackGrant.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a PlaybackGrant object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return PlaybackGrant object represented by the provided JSON
     */
    public static PlaybackGrant fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, PlaybackGrant.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final URI url;
    private final String accountSid;
    private final ZonedDateTime dateCreated;
    private final Map<String, Object> grant;

    @JsonCreator
    private PlaybackGrant(@JsonProperty("sid")
                          final String sid,
                          @JsonProperty("url")
                          final URI url,
                          @JsonProperty("account_sid")
                          final String accountSid,
                          @JsonProperty("date_created")
                          final String dateCreated,
                          @JsonProperty("grant")
                          final Map<String, Object> grant) {
        this.sid = sid;
        this.url = url;
        this.accountSid = accountSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.grant = grant;
    }

    /**
     * Returns The unique string that identifies the PlayerStreamer associated with
     * this PlaybackGrant..
     *
     * @return The unique string that identifies the PlayerStreamer associated with
     *         this PlaybackGrant.
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The absolute URL of the resource.
     *
     * @return The absolute URL of the resource
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns The SID of the Account that created the resource.
     *
     * @return The SID of the Account that created the resource
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The ISO 8601 date and time in GMT when the resource was created.
     *
     * @return The ISO 8601 date and time in GMT when the resource was created
     */
    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The grant that authorizes the player sdk to connect to the
     * livestream.
     *
     * @return The grant that authorizes the player sdk to connect to the livestream
     */
    public final Map<String, Object> getGrant() {
        return this.grant;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PlaybackGrant other = (PlaybackGrant) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(url, other.url) &&
               Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(grant, other.grant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            url,
                            accountSid,
                            dateCreated,
                            grant);
    }
}