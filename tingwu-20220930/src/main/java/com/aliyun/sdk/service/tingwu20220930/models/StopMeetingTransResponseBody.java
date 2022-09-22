// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20220930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopMeetingTransResponseBody} extends {@link TeaModel}
 *
 * <p>StopMeetingTransResponseBody</p>
 */
public class StopMeetingTransResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private StopMeetingTransResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopMeetingTransResponseBody create() {
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

        public StopMeetingTransResponseBody build() {
            return new StopMeetingTransResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("MeetingId")
        private String meetingId;

        @NameInMap("MeetingKey")
        private String meetingKey;

        @NameInMap("MeetingStatus")
        private String meetingStatus;

        private Data(Builder builder) {
            this.meetingId = builder.meetingId;
            this.meetingKey = builder.meetingKey;
            this.meetingStatus = builder.meetingStatus;
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
         * @return meetingKey
         */
        public String getMeetingKey() {
            return this.meetingKey;
        }

        /**
         * @return meetingStatus
         */
        public String getMeetingStatus() {
            return this.meetingStatus;
        }

        public static final class Builder {
            private String meetingId; 
            private String meetingKey; 
            private String meetingStatus; 

            /**
             * 会议ID。
             */
            public Builder meetingId(String meetingId) {
                this.meetingId = meetingId;
                return this;
            }

            /**
             * 用户创建会议时设置的会议标识。
             */
            public Builder meetingKey(String meetingKey) {
                this.meetingKey = meetingKey;
                return this;
            }

            /**
             * 会议状态。
             * <p>
             * NEW：新会议。
             * ONGOING：会议转写中。
             * PAUSED：会议转写暂停。
             * PRE_COMPLETE：会议转写结束后，进行会后智能提取。
             * COMPLETED：会议完成。
             * FAILED：会议转写结束后，会后智能提取失败。
             * INVALID：无效会议。
             */
            public Builder meetingStatus(String meetingStatus) {
                this.meetingStatus = meetingStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
