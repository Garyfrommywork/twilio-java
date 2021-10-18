/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.video.v1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.Twilio;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.TwilioException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;

import static com.twilio.TwilioTest.serialize;
import static org.junit.Assert.*;

public class RoomTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Before
    public void setUp() throws Exception {
        Twilio.init("AC123", "AUTH TOKEN");
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.VIDEO.toString(),
                                          "/v1/Rooms/RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Room.fetcher("RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"status\": \"in-progress\",\"type\": \"peer-to-peer\",\"sid\": \"RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"enable_turn\": true,\"unique_name\": \"unique_name\",\"max_participants\": 10,\"max_concurrent_published_tracks\": 0,\"duration\": 0,\"status_callback_method\": \"POST\",\"status_callback\": null,\"record_participants_on_connect\": false,\"video_codecs\": [\"VP8\"],\"audio_only\": false,\"media_region\": \"us1\",\"end_time\": \"2015-07-30T20:00:00Z\",\"url\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"participants\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\",\"recordings\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings\",\"recording_rules\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/RecordingRules\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Room.fetcher("RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.VIDEO.toString(),
                                          "/v1/Rooms");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Room.creator().create();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"status\": \"in-progress\",\"type\": \"peer-to-peer\",\"sid\": \"RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"enable_turn\": true,\"unique_name\": \"RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"max_concurrent_published_tracks\": 0,\"max_participants\": 10,\"duration\": 0,\"status_callback_method\": \"POST\",\"status_callback\": null,\"record_participants_on_connect\": false,\"video_codecs\": [\"VP8\"],\"media_region\": \"us1\",\"audio_only\": false,\"end_time\": \"2015-07-30T20:00:00Z\",\"url\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"participants\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\",\"recordings\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings\",\"recording_rules\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/RecordingRules\"}}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Room.creator().create();
    }

    @Test
    public void testCreateWebrtcGoResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"status\": \"in-progress\",\"type\": \"go\",\"sid\": \"RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"enable_turn\": true,\"unique_name\": \"room1\",\"max_participants\": 10,\"max_concurrent_published_tracks\": 0,\"duration\": 0,\"status_callback_method\": \"POST\",\"status_callback\": null,\"record_participants_on_connect\": false,\"video_codecs\": [\"VP8\"],\"media_region\": \"us1\",\"audio_only\": false,\"end_time\": \"2015-07-30T20:00:00Z\",\"url\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"participants\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\",\"recordings\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings\",\"recording_rules\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/RecordingRules\"}}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Room.creator().create();
    }

    @Test
    public void testCreateGroupRoomsResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"status\": \"in-progress\",\"type\": \"group\",\"sid\": \"RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"enable_turn\": true,\"unique_name\": \"grouproom\",\"max_participants\": 50,\"max_concurrent_published_tracks\": 170,\"duration\": 0,\"status_callback_method\": \"POST\",\"status_callback\": null,\"record_participants_on_connect\": false,\"video_codecs\": [\"VP8\"],\"media_region\": \"us1\",\"audio_only\": false,\"end_time\": \"2015-07-30T20:00:00Z\",\"url\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"participants\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\",\"recordings\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings\",\"recording_rules\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/RecordingRules\"}}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Room.creator().create();
    }

    @Test
    public void testCreateGroupRoomsWithAudioOnlyEnabledResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"status\": \"in-progress\",\"type\": \"group\",\"sid\": \"RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"enable_turn\": true,\"unique_name\": \"grouproom\",\"max_participants\": 50,\"max_concurrent_published_tracks\": 170,\"duration\": 0,\"status_callback_method\": \"POST\",\"status_callback\": null,\"record_participants_on_connect\": false,\"video_codecs\": [],\"media_region\": \"us1\",\"audio_only\": true,\"end_time\": \"2015-07-30T20:00:00Z\",\"url\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"participants\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\",\"recordings\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings\",\"recording_rules\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/RecordingRules\"}}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Room.creator().create();
    }

    @Test
    public void testCreateSmallGroupRoomsResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"status\": \"in-progress\",\"type\": \"group-small\",\"sid\": \"RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"enable_turn\": true,\"unique_name\": \"SmallDailyStandup\",\"max_participants\": 4,\"max_concurrent_published_tracks\": 170,\"duration\": 0,\"status_callback_method\": \"POST\",\"status_callback\": null,\"record_participants_on_connect\": false,\"video_codecs\": [\"VP8\"],\"media_region\": \"us1\",\"audio_only\": false,\"end_time\": \"2015-07-30T20:00:00Z\",\"url\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"participants\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\",\"recordings\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings\",\"recording_rules\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/RecordingRules\"}}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Room.creator().create();
    }

    @Test
    public void testCreateLargeGroupRoomsResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"status\": \"in-progress\",\"type\": \"group\",\"sid\": \"RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"enable_turn\": true,\"unique_name\": \"MyWebinar\",\"max_participants\": 50,\"max_concurrent_published_tracks\": 16,\"duration\": 0,\"status_callback_method\": \"POST\",\"status_callback\": null,\"record_participants_on_connect\": false,\"video_codecs\": [\"VP8\"],\"media_region\": \"us1\",\"audio_only\": false,\"end_time\": \"2015-07-30T20:00:00Z\",\"url\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"participants\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\",\"recordings\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings\",\"recording_rules\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/RecordingRules\"}}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Room.creator().create();
    }

    @Test
    public void testCreateLargeGroupRoomsWithAudioOnlyEnabledResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"status\": \"in-progress\",\"type\": \"group\",\"sid\": \"RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"enable_turn\": true,\"unique_name\": \"MyWebinar\",\"max_participants\": 50,\"max_concurrent_published_tracks\": 16,\"duration\": 0,\"status_callback_method\": \"POST\",\"status_callback\": null,\"record_participants_on_connect\": false,\"video_codecs\": [],\"media_region\": \"us1\",\"audio_only\": true,\"end_time\": \"2015-07-30T20:00:00Z\",\"url\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"participants\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\",\"recordings\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings\",\"recording_rules\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/RecordingRules\"}}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Room.creator().create();
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.VIDEO.toString(),
                                          "/v1/Rooms");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Room.reader().read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"rooms\": [],\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://video.twilio.com/v1/Rooms?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://video.twilio.com/v1/Rooms?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"rooms\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Room.reader().read());
    }

    @Test
    public void testReadWithStatusResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"rooms\": [{\"sid\": \"RM4070b618362c1682b2385b1f9982833c\",\"status\": \"completed\",\"date_created\": \"2017-04-03T22:21:49Z\",\"date_updated\": \"2017-04-03T22:21:51Z\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"type\": \"peer-to-peer\",\"enable_turn\": true,\"unique_name\": \"RM4070b618362c1682b2385b1f9982833c\",\"status_callback\": null,\"status_callback_method\": \"POST\",\"end_time\": \"2017-04-03T22:21:51Z\",\"duration\": 2,\"max_participants\": 10,\"max_concurrent_published_tracks\": 10,\"record_participants_on_connect\": false,\"video_codecs\": [\"VP8\"],\"media_region\": \"us1\",\"audio_only\": false,\"url\": \"https://video.twilio.com/v1/Rooms/RM4070b618362c1682b2385b1f9982833c\",\"links\": {\"participants\": \"https://video.twilio.com/v1/Rooms/RM4070b618362c1682b2385b1f9982833c/Participants\",\"recordings\": \"https://video.twilio.com/v1/Rooms/RM4070b618362c1682b2385b1f9982833c/Recordings\",\"recording_rules\": \"https://video.twilio.com/v1/Rooms/RM4070b618362c1682b2385b1f9982833c/RecordingRules\"}}],\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://video.twilio.com/v1/Rooms?Status=completed&PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://video.twilio.com/v1/Rooms?Status=completed&PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"rooms\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Room.reader().read());
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.VIDEO.toString(),
                                          "/v1/Rooms/RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            request.addPostParam("Status", serialize(Room.RoomStatus.IN_PROGRESS));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Room.updater("RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", Room.RoomStatus.IN_PROGRESS).update();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"status\": \"completed\",\"type\": \"peer-to-peer\",\"sid\": \"RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"enable_turn\": true,\"unique_name\": \"unique_name\",\"max_participants\": 10,\"max_concurrent_published_tracks\": 10,\"status_callback_method\": \"POST\",\"status_callback\": null,\"record_participants_on_connect\": false,\"video_codecs\": [\"VP8\"],\"media_region\": \"us1\",\"audio_only\": false,\"end_time\": \"2015-07-30T20:00:00Z\",\"duration\": 10,\"url\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"participants\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\",\"recordings\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings\",\"recording_rules\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/RecordingRules\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Room.updater("RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", Room.RoomStatus.IN_PROGRESS).update();
    }
}