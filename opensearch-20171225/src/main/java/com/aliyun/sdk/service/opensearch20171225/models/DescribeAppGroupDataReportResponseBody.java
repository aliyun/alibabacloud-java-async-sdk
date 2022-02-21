// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppGroupDataReportResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppGroupDataReportResponseBody</p>
 */
public class DescribeAppGroupDataReportResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    private DescribeAppGroupDataReportResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppGroupDataReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeAppGroupDataReportResponseBody build() {
            return new DescribeAppGroupDataReportResponseBody(this);
        } 

    } 

    public static class Message extends TeaModel {
        @NameInMap("arg1")
        private String arg1;

        @NameInMap("arg3")
        private String arg3;

        @NameInMap("args")
        private String args;

        @NameInMap("clientIp")
        private String clientIp;

        @NameInMap("eventId")
        private Integer eventId;

        @NameInMap("page")
        private String page;

        @NameInMap("sdkType")
        private String sdkType;

        @NameInMap("sdkVersion")
        private String sdkVersion;

        @NameInMap("sessionId")
        private String sessionId;

        @NameInMap("userId")
        private String userId;

        private Message(Builder builder) {
            this.arg1 = builder.arg1;
            this.arg3 = builder.arg3;
            this.args = builder.args;
            this.clientIp = builder.clientIp;
            this.eventId = builder.eventId;
            this.page = builder.page;
            this.sdkType = builder.sdkType;
            this.sdkVersion = builder.sdkVersion;
            this.sessionId = builder.sessionId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Message create() {
            return builder().build();
        }

        /**
         * @return arg1
         */
        public String getArg1() {
            return this.arg1;
        }

        /**
         * @return arg3
         */
        public String getArg3() {
            return this.arg3;
        }

        /**
         * @return args
         */
        public String getArgs() {
            return this.args;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return eventId
         */
        public Integer getEventId() {
            return this.eventId;
        }

        /**
         * @return page
         */
        public String getPage() {
            return this.page;
        }

        /**
         * @return sdkType
         */
        public String getSdkType() {
            return this.sdkType;
        }

        /**
         * @return sdkVersion
         */
        public String getSdkVersion() {
            return this.sdkVersion;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String arg1; 
            private String arg3; 
            private String args; 
            private String clientIp; 
            private Integer eventId; 
            private String page; 
            private String sdkType; 
            private String sdkVersion; 
            private String sessionId; 
            private String userId; 

            /**
             * arg1.
             */
            public Builder arg1(String arg1) {
                this.arg1 = arg1;
                return this;
            }

            /**
             * arg3.
             */
            public Builder arg3(String arg3) {
                this.arg3 = arg3;
                return this;
            }

            /**
             * args.
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * clientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * eventId.
             */
            public Builder eventId(Integer eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * page.
             */
            public Builder page(String page) {
                this.page = page;
                return this;
            }

            /**
             * sdkType.
             */
            public Builder sdkType(String sdkType) {
                this.sdkType = sdkType;
                return this;
            }

            /**
             * sdkVersion.
             */
            public Builder sdkVersion(String sdkVersion) {
                this.sdkVersion = sdkVersion;
                return this;
            }

            /**
             * sessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Message build() {
                return new Message(this);
            } 

        } 

    }
    public static class ReceivedSample extends TeaModel {
        @NameInMap("message")
        private Message message;

        @NameInMap("receivedTimeMs")
        private Long receivedTimeMs;

        private ReceivedSample(Builder builder) {
            this.message = builder.message;
            this.receivedTimeMs = builder.receivedTimeMs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReceivedSample create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public Message getMessage() {
            return this.message;
        }

        /**
         * @return receivedTimeMs
         */
        public Long getReceivedTimeMs() {
            return this.receivedTimeMs;
        }

        public static final class Builder {
            private Message message; 
            private Long receivedTimeMs; 

            /**
             * message.
             */
            public Builder message(Message message) {
                this.message = message;
                return this;
            }

            /**
             * receivedTimeMs.
             */
            public Builder receivedTimeMs(Long receivedTimeMs) {
                this.receivedTimeMs = receivedTimeMs;
                return this;
            }

            public ReceivedSample build() {
                return new ReceivedSample(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("receivedCount")
        private Integer receivedCount;

        @NameInMap("receivedSample")
        private java.util.List < ReceivedSample> receivedSample;

        private Result(Builder builder) {
            this.receivedCount = builder.receivedCount;
            this.receivedSample = builder.receivedSample;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return receivedCount
         */
        public Integer getReceivedCount() {
            return this.receivedCount;
        }

        /**
         * @return receivedSample
         */
        public java.util.List < ReceivedSample> getReceivedSample() {
            return this.receivedSample;
        }

        public static final class Builder {
            private Integer receivedCount; 
            private java.util.List < ReceivedSample> receivedSample; 

            /**
             * receivedCount.
             */
            public Builder receivedCount(Integer receivedCount) {
                this.receivedCount = receivedCount;
                return this;
            }

            /**
             * receivedSample.
             */
            public Builder receivedSample(java.util.List < ReceivedSample> receivedSample) {
                this.receivedSample = receivedSample;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
