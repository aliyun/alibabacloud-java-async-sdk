// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20220930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMeetingTransResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMeetingTransResponseBody</p>
 */
public class CreateMeetingTransResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private CreateMeetingTransResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMeetingTransResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * 状态码。
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 返回对象。
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 状态说明。
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求ID，仅用于联调。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMeetingTransResponseBody build() {
            return new CreateMeetingTransResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("MeetingId")
        private String meetingId;

        @NameInMap("MeetingJoinUrl")
        private String meetingJoinUrl;

        @NameInMap("MeetingKey")
        private String meetingKey;

        private Data(Builder builder) {
            this.meetingId = builder.meetingId;
            this.meetingJoinUrl = builder.meetingJoinUrl;
            this.meetingKey = builder.meetingKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return meetingId
         */
        public String getMeetingId() {
            return this.meetingId;
        }

        /**
         * @return meetingJoinUrl
         */
        public String getMeetingJoinUrl() {
            return this.meetingJoinUrl;
        }

        /**
         * @return meetingKey
         */
        public String getMeetingKey() {
            return this.meetingKey;
        }

        public static final class Builder {
            private String meetingId; 
            private String meetingJoinUrl; 
            private String meetingKey; 

            /**
             * 会议ID。
             */
            public Builder meetingId(String meetingId) {
                this.meetingId = meetingId;
                return this;
            }

            /**
             * 会议语音推流地址。
             */
            public Builder meetingJoinUrl(String meetingJoinUrl) {
                this.meetingJoinUrl = meetingJoinUrl;
                return this;
            }

            /**
             * 用户创建会议时设置的会议标识。
             */
            public Builder meetingKey(String meetingKey) {
                this.meetingKey = meetingKey;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
