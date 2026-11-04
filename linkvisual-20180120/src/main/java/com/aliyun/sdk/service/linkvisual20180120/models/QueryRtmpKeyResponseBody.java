// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryRtmpKeyResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRtmpKeyResponseBody</p>
 */
public class QueryRtmpKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryRtmpKeyResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

    /**
     * 
     * {@link QueryRtmpKeyResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRtmpKeyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PullAuthKey")
        private String pullAuthKey;

        @com.aliyun.core.annotation.NameInMap("PullKeyExpireTime")
        private Integer pullKeyExpireTime;

        @com.aliyun.core.annotation.NameInMap("PushAuthKey")
        private String pushAuthKey;

        @com.aliyun.core.annotation.NameInMap("PushKeyExpireTime")
        private Integer pushKeyExpireTime;

        @com.aliyun.core.annotation.NameInMap("StreamName")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.pullAuthKey = model.pullAuthKey;
                this.pullKeyExpireTime = model.pullKeyExpireTime;
                this.pushAuthKey = model.pushAuthKey;
                this.pushKeyExpireTime = model.pushKeyExpireTime;
                this.streamName = model.streamName;
            } 

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
