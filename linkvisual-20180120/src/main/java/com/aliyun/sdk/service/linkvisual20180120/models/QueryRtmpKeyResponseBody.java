// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRtmpKeyResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRtmpKeyResponseBody</p>
 */
public class QueryRtmpKeyResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryRtmpKeyResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRtmpKeyResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryRtmpKeyResponseBody build() {
            return new QueryRtmpKeyResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("PullAuthKey")
        private String pullAuthKey;

        @NameInMap("PullKeyExpireTime")
        private Integer pullKeyExpireTime;

        @NameInMap("PushAuthKey")
        private String pushAuthKey;

        @NameInMap("PushKeyExpireTime")
        private Integer pushKeyExpireTime;

        @NameInMap("StreamName")
        private String streamName;

        private Data(Builder builder) {
            this.pullAuthKey = builder.pullAuthKey;
            this.pullKeyExpireTime = builder.pullKeyExpireTime;
            this.pushAuthKey = builder.pushAuthKey;
            this.pushKeyExpireTime = builder.pushKeyExpireTime;
            this.streamName = builder.streamName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pullAuthKey
         */
        public String getPullAuthKey() {
            return this.pullAuthKey;
        }

        /**
         * @return pullKeyExpireTime
         */
        public Integer getPullKeyExpireTime() {
            return this.pullKeyExpireTime;
        }

        /**
         * @return pushAuthKey
         */
        public String getPushAuthKey() {
            return this.pushAuthKey;
        }

        /**
         * @return pushKeyExpireTime
         */
        public Integer getPushKeyExpireTime() {
            return this.pushKeyExpireTime;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        public static final class Builder {
            private String pullAuthKey; 
            private Integer pullKeyExpireTime; 
            private String pushAuthKey; 
            private Integer pushKeyExpireTime; 
            private String streamName; 

            /**
             * PullAuthKey.
             */
            public Builder pullAuthKey(String pullAuthKey) {
                this.pullAuthKey = pullAuthKey;
                return this;
            }

            /**
             * PullKeyExpireTime.
             */
            public Builder pullKeyExpireTime(Integer pullKeyExpireTime) {
                this.pullKeyExpireTime = pullKeyExpireTime;
                return this;
            }

            /**
             * PushAuthKey.
             */
            public Builder pushAuthKey(String pushAuthKey) {
                this.pushAuthKey = pushAuthKey;
                return this;
            }

            /**
             * PushKeyExpireTime.
             */
            public Builder pushKeyExpireTime(Integer pushKeyExpireTime) {
                this.pushKeyExpireTime = pushKeyExpireTime;
                return this;
            }

            /**
             * StreamName.
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
