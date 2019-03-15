/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.ipmessaging.v2.service.channel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Invite extends Resource {
    private static final long serialVersionUID = 189960368613614L;

    /**
     * Create a InviteFetcher to execute fetch.
     * 
     * @param pathServiceSid The SID of the Service to fetch the resource from
     * @param pathChannelSid The SID of the Channel the resource to fetch belongs to
     * @param pathSid The unique string that identifies the resource
     * @return InviteFetcher capable of executing the fetch
     */
    public static InviteFetcher fetcher(final String pathServiceSid, 
                                        final String pathChannelSid, 
                                        final String pathSid) {
        return new InviteFetcher(pathServiceSid, pathChannelSid, pathSid);
    }

    /**
     * Create a InviteCreator to execute create.
     * 
     * @param pathServiceSid The SID of the Service to create the resource under
     * @param pathChannelSid The SID of the Channel the new resource belongs to
     * @param identity The `identity` value that identifies the new resource's User
     * @return InviteCreator capable of executing the create
     */
    public static InviteCreator creator(final String pathServiceSid, 
                                        final String pathChannelSid, 
                                        final String identity) {
        return new InviteCreator(pathServiceSid, pathChannelSid, identity);
    }

    /**
     * Create a InviteReader to execute read.
     * 
     * @param pathServiceSid The SID of the Service to read the resources from
     * @param pathChannelSid The SID of the Channel the resources to read belong to
     * @return InviteReader capable of executing the read
     */
    public static InviteReader reader(final String pathServiceSid, 
                                      final String pathChannelSid) {
        return new InviteReader(pathServiceSid, pathChannelSid);
    }

    /**
     * Create a InviteDeleter to execute delete.
     * 
     * @param pathServiceSid The SID of the Service to delete the resource from
     * @param pathChannelSid The SID of the Channel the resource to delete belongs
     *                       to
     * @param pathSid The unique string that identifies the resource
     * @return InviteDeleter capable of executing the delete
     */
    public static InviteDeleter deleter(final String pathServiceSid, 
                                        final String pathChannelSid, 
                                        final String pathSid) {
        return new InviteDeleter(pathServiceSid, pathChannelSid, pathSid);
    }

    /**
     * Converts a JSON String into a Invite object using the provided ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Invite object represented by the provided JSON
     */
    public static Invite fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Invite.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Invite object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Invite object represented by the provided JSON
     */
    public static Invite fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Invite.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String channelSid;
    private final String serviceSid;
    private final String identity;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final String roleSid;
    private final String createdBy;
    private final URI url;

    @JsonCreator
    private Invite(@JsonProperty("sid")
                   final String sid, 
                   @JsonProperty("account_sid")
                   final String accountSid, 
                   @JsonProperty("channel_sid")
                   final String channelSid, 
                   @JsonProperty("service_sid")
                   final String serviceSid, 
                   @JsonProperty("identity")
                   final String identity, 
                   @JsonProperty("date_created")
                   final String dateCreated, 
                   @JsonProperty("date_updated")
                   final String dateUpdated, 
                   @JsonProperty("role_sid")
                   final String roleSid, 
                   @JsonProperty("created_by")
                   final String createdBy, 
                   @JsonProperty("url")
                   final URI url) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.channelSid = channelSid;
        this.serviceSid = serviceSid;
        this.identity = identity;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.roleSid = roleSid;
        this.createdBy = createdBy;
        this.url = url;
    }

    /**
     * Returns The The unique string that identifies the resource.
     * 
     * @return The unique string that identifies the resource
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The The SID of the Account that created the resource.
     * 
     * @return The SID of the Account that created the resource
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The The SID of the Channel the new resource belongs to.
     * 
     * @return The SID of the Channel the new resource belongs to
     */
    public final String getChannelSid() {
        return this.channelSid;
    }

    /**
     * Returns The The SID of the Service that the resource is associated with.
     * 
     * @return The SID of the Service that the resource is associated with
     */
    public final String getServiceSid() {
        return this.serviceSid;
    }

    /**
     * Returns The The string that identifies the resource's User.
     * 
     * @return The string that identifies the resource's User
     */
    public final String getIdentity() {
        return this.identity;
    }

    /**
     * Returns The The RFC 2822 date and time in GMT when the resource was created.
     * 
     * @return The RFC 2822 date and time in GMT when the resource was created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The The RFC 2822 date and time in GMT when the resource was last
     * updated.
     * 
     * @return The RFC 2822 date and time in GMT when the resource was last updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The The SID of the Role assigned to the member.
     * 
     * @return The SID of the Role assigned to the member
     */
    public final String getRoleSid() {
        return this.roleSid;
    }

    /**
     * Returns The The identity of the User that created the invite.
     * 
     * @return The identity of the User that created the invite
     */
    public final String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Returns The The absolute URL of the Invite resource.
     * 
     * @return The absolute URL of the Invite resource
     */
    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Invite other = (Invite) o;

        return Objects.equals(sid, other.sid) && 
               Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(channelSid, other.channelSid) && 
               Objects.equals(serviceSid, other.serviceSid) && 
               Objects.equals(identity, other.identity) && 
               Objects.equals(dateCreated, other.dateCreated) && 
               Objects.equals(dateUpdated, other.dateUpdated) && 
               Objects.equals(roleSid, other.roleSid) && 
               Objects.equals(createdBy, other.createdBy) && 
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            accountSid,
                            channelSid,
                            serviceSid,
                            identity,
                            dateCreated,
                            dateUpdated,
                            roleSid,
                            createdBy,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("sid", sid)
                          .add("accountSid", accountSid)
                          .add("channelSid", channelSid)
                          .add("serviceSid", serviceSid)
                          .add("identity", identity)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("roleSid", roleSid)
                          .add("createdBy", createdBy)
                          .add("url", url)
                          .toString();
    }
}