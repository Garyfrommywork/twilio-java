/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.media.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
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
public class PlayerStreamer extends Resource {
    private static final long serialVersionUID = 200958137353202L;

    public enum Status {
        CREATED("created"),
        STARTED("started"),
        ENDED("ended"),
        FAILED("failed");

        private final String value;

        private Status(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a Status from a string.
         * @param value string value
         * @return generated Status
         */
        @JsonCreator
        public static Status forValue(final String value) {
            return Promoter.enumFromString(value, Status.values());
        }
    }

    public enum UpdateStatus {
        ENDED("ended");

        private final String value;

        private UpdateStatus(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a UpdateStatus from a string.
         * @param value string value
         * @return generated UpdateStatus
         */
        @JsonCreator
        public static UpdateStatus forValue(final String value) {
            return Promoter.enumFromString(value, UpdateStatus.values());
        }
    }

    public enum Order {
        ASC("asc"),
        DESC("desc");

        private final String value;

        private Order(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a Order from a string.
         * @param value string value
         * @return generated Order
         */
        @JsonCreator
        public static Order forValue(final String value) {
            return Promoter.enumFromString(value, Order.values());
        }
    }

    public enum EndedReason {
        ENDED_VIA_API("ended-via-api"),
        MAX_DURATION_EXCEEDED("max-duration-exceeded"),
        STREAM_DISCONNECTED_BY_SOURCE("stream-disconnected-by-source"),
        UNEXPECTED_FAILURE("unexpected-failure");

        private final String value;

        private EndedReason(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a EndedReason from a string.
         * @param value string value
         * @return generated EndedReason
         */
        @JsonCreator
        public static EndedReason forValue(final String value) {
            return Promoter.enumFromString(value, EndedReason.values());
        }
    }

    /**
     * Create a PlayerStreamerFetcher to execute fetch.
     *
     * @param pathSid The SID that identifies the resource to fetch
     * @return PlayerStreamerFetcher capable of executing the fetch
     */
    public static PlayerStreamerFetcher fetcher(final String pathSid) {
        return new PlayerStreamerFetcher(pathSid);
    }

    /**
     * Create a PlayerStreamerCreator to execute create.
     *
     * @return PlayerStreamerCreator capable of executing the create
     */
    public static PlayerStreamerCreator creator() {
        return new PlayerStreamerCreator();
    }

    /**
     * Create a PlayerStreamerUpdater to execute update.
     *
     * @param pathSid The SID that identifies the resource to update
     * @param status The status the PlayerStreamer should be transitioned to
     * @return PlayerStreamerUpdater capable of executing the update
     */
    public static PlayerStreamerUpdater updater(final String pathSid,
                                                final PlayerStreamer.UpdateStatus status) {
        return new PlayerStreamerUpdater(pathSid, status);
    }

    /**
     * Create a PlayerStreamerReader to execute read.
     *
     * @return PlayerStreamerReader capable of executing the read
     */
    public static PlayerStreamerReader reader() {
        return new PlayerStreamerReader();
    }

    /**
     * Converts a JSON String into a PlayerStreamer object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return PlayerStreamer object represented by the provided JSON
     */
    public static PlayerStreamer fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, PlayerStreamer.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a PlayerStreamer object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return PlayerStreamer object represented by the provided JSON
     */
    public static PlayerStreamer fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, PlayerStreamer.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final Boolean video;
    private final Map<String, String> links;
    private final String sid;
    private final PlayerStreamer.Status status;
    private final URI url;
    private final URI statusCallback;
    private final HttpMethod statusCallbackMethod;
    private final PlayerStreamer.EndedReason endedReason;

    @JsonCreator
    private PlayerStreamer(@JsonProperty("account_sid")
                           final String accountSid,
                           @JsonProperty("date_created")
                           final String dateCreated,
                           @JsonProperty("date_updated")
                           final String dateUpdated,
                           @JsonProperty("video")
                           final Boolean video,
                           @JsonProperty("links")
                           final Map<String, String> links,
                           @JsonProperty("sid")
                           final String sid,
                           @JsonProperty("status")
                           final PlayerStreamer.Status status,
                           @JsonProperty("url")
                           final URI url,
                           @JsonProperty("status_callback")
                           final URI statusCallback,
                           @JsonProperty("status_callback_method")
                           final HttpMethod statusCallbackMethod,
                           @JsonProperty("ended_reason")
                           final PlayerStreamer.EndedReason endedReason) {
        this.accountSid = accountSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.video = video;
        this.links = links;
        this.sid = sid;
        this.status = status;
        this.url = url;
        this.statusCallback = statusCallback;
        this.statusCallbackMethod = statusCallbackMethod;
        this.endedReason = endedReason;
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
     * Returns The ISO 8601 date and time in GMT when the resource was last updated.
     *
     * @return The ISO 8601 date and time in GMT when the resource was last updated
     */
    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns Whether the PlayerStreamer is configured to stream video.
     *
     * @return Whether the PlayerStreamer is configured to stream video
     */
    public final Boolean getVideo() {
        return this.video;
    }

    /**
     * Returns The URLs of related resources.
     *
     * @return The URLs of related resources
     */
    public final Map<String, String> getLinks() {
        return this.links;
    }

    /**
     * Returns The unique string that identifies the resource.
     *
     * @return The unique string that identifies the resource
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The status of the PlayerStreamer.
     *
     * @return The status of the PlayerStreamer
     */
    public final PlayerStreamer.Status getStatus() {
        return this.status;
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
     * Returns The URL to which Twilio will send PlayerStreamer event updates.
     *
     * @return The URL to which Twilio will send PlayerStreamer event updates
     */
    public final URI getStatusCallback() {
        return this.statusCallback;
    }

    /**
     * Returns The HTTP method Twilio should use to call the `status_callback` URL.
     *
     * @return The HTTP method Twilio should use to call the `status_callback` URL
     */
    public final HttpMethod getStatusCallbackMethod() {
        return this.statusCallbackMethod;
    }

    /**
     * Returns The reason why a PlayerStreamer ended.
     *
     * @return The reason why a PlayerStreamer ended
     */
    public final PlayerStreamer.EndedReason getEndedReason() {
        return this.endedReason;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PlayerStreamer other = (PlayerStreamer) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(video, other.video) &&
               Objects.equals(links, other.links) &&
               Objects.equals(sid, other.sid) &&
               Objects.equals(status, other.status) &&
               Objects.equals(url, other.url) &&
               Objects.equals(statusCallback, other.statusCallback) &&
               Objects.equals(statusCallbackMethod, other.statusCallbackMethod) &&
               Objects.equals(endedReason, other.endedReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            dateCreated,
                            dateUpdated,
                            video,
                            links,
                            sid,
                            status,
                            url,
                            statusCallback,
                            statusCallbackMethod,
                            endedReason);
    }
}