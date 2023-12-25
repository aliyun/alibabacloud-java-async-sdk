// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryScheduleConferenceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryScheduleConferenceResponseBody</p>
 */
public class QueryScheduleConferenceResponseBody extends TeaModel {
    @NameInMap("endTime")
    private Long endTime;

    @NameInMap("phones")
    private java.util.List < String > phones;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("roomCode")
    private String roomCode;

    @NameInMap("scheduleConferenceId")
    private String scheduleConferenceId;

    @NameInMap("startTime")
    private Long startTime;

    @NameInMap("title")
    private String title;

    @NameInMap("url")
    private String url;

    private QueryScheduleConferenceResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.phones = builder.phones;
        this.requestId = builder.requestId;
        this.roomCode = builder.roomCode;
        this.scheduleConferenceId = builder.scheduleConferenceId;
        this.startTime = builder.startTime;
        this.title = builder.title;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryScheduleConferenceResponseBody create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return phones
     */
    public java.util.List < String > getPhones() {
        return this.phones;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roomCode
     */
    public String getRoomCode() {
        return this.roomCode;
    }

    /**
     * @return scheduleConferenceId
     */
    public String getScheduleConferenceId() {
        return this.scheduleConferenceId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private Long endTime; 
        private java.util.List < String > phones; 
        private String requestId; 
        private String roomCode; 
        private String scheduleConferenceId; 
        private Long startTime; 
        private String title; 
        private String url; 

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * phones.
         */
        public Builder phones(java.util.List < String > phones) {
            this.phones = phones;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * roomCode.
         */
        public Builder roomCode(String roomCode) {
            this.roomCode = roomCode;
            return this;
        }

        /**
         * scheduleConferenceId.
         */
        public Builder scheduleConferenceId(String scheduleConferenceId) {
            this.scheduleConferenceId = scheduleConferenceId;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public QueryScheduleConferenceResponseBody build() {
            return new QueryScheduleConferenceResponseBody(this);
        } 

    } 

}
