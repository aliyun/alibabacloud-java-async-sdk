// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateScheduleConferenceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateScheduleConferenceResponseBody</p>
 */
public class CreateScheduleConferenceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("phones")
    private java.util.List < String > phones;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("roomCode")
    private String roomCode;

    @com.aliyun.core.annotation.NameInMap("scheduleConferenceId")
    private String scheduleConferenceId;

    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    private CreateScheduleConferenceResponseBody(Builder builder) {
        this.phones = builder.phones;
        this.requestId = builder.requestId;
        this.roomCode = builder.roomCode;
        this.scheduleConferenceId = builder.scheduleConferenceId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScheduleConferenceResponseBody create() {
        return builder().build();
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
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private java.util.List < String > phones; 
        private String requestId; 
        private String roomCode; 
        private String scheduleConferenceId; 
        private String url; 

        /**
         * phones.
         */
        public Builder phones(java.util.List < String > phones) {
            this.phones = phones;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
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
         * url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public CreateScheduleConferenceResponseBody build() {
            return new CreateScheduleConferenceResponseBody(this);
        } 

    } 

}
