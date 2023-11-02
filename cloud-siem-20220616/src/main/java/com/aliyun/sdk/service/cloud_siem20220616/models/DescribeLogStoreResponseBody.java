// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogStoreResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogStoreResponseBody</p>
 */
public class DescribeLogStoreResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("DyCode")
    private String dyCode;

    @NameInMap("DyMessage")
    private String dyMessage;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeLogStoreResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dyCode = builder.dyCode;
        this.dyMessage = builder.dyMessage;
        this.errCode = builder.errCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogStoreResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dyCode
     */
    public String getDyCode() {
        return this.dyCode;
    }

    /**
     * @return dyMessage
     */
    public String getDyMessage() {
        return this.dyMessage;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String dyCode; 
        private String dyMessage; 
        private String errCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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
         * DyCode.
         */
        public Builder dyCode(String dyCode) {
            this.dyCode = dyCode;
            return this;
        }

        /**
         * DyMessage.
         */
        public Builder dyMessage(String dyMessage) {
            this.dyMessage = dyMessage;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public DescribeLogStoreResponseBody build() {
            return new DescribeLogStoreResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AppendMeta")
        private Boolean appendMeta;

        @NameInMap("AutoSplit")
        private Boolean autoSplit;

        @NameInMap("EnableTracking")
        private Boolean enableTracking;

        @NameInMap("LogStoreName")
        private String logStoreName;

        @NameInMap("MaxSplitShard")
        private Integer maxSplitShard;

        @NameInMap("ShardCount")
        private Integer shardCount;

        @NameInMap("Ttl")
        private Integer ttl;

        private Data(Builder builder) {
            this.appendMeta = builder.appendMeta;
            this.autoSplit = builder.autoSplit;
            this.enableTracking = builder.enableTracking;
            this.logStoreName = builder.logStoreName;
            this.maxSplitShard = builder.maxSplitShard;
            this.shardCount = builder.shardCount;
            this.ttl = builder.ttl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appendMeta
         */
        public Boolean getAppendMeta() {
            return this.appendMeta;
        }

        /**
         * @return autoSplit
         */
        public Boolean getAutoSplit() {
            return this.autoSplit;
        }

        /**
         * @return enableTracking
         */
        public Boolean getEnableTracking() {
            return this.enableTracking;
        }

        /**
         * @return logStoreName
         */
        public String getLogStoreName() {
            return this.logStoreName;
        }

        /**
         * @return maxSplitShard
         */
        public Integer getMaxSplitShard() {
            return this.maxSplitShard;
        }

        /**
         * @return shardCount
         */
        public Integer getShardCount() {
            return this.shardCount;
        }

        /**
         * @return ttl
         */
        public Integer getTtl() {
            return this.ttl;
        }

        public static final class Builder {
            private Boolean appendMeta; 
            private Boolean autoSplit; 
            private Boolean enableTracking; 
            private String logStoreName; 
            private Integer maxSplitShard; 
            private Integer shardCount; 
            private Integer ttl; 

            /**
             * AppendMeta.
             */
            public Builder appendMeta(Boolean appendMeta) {
                this.appendMeta = appendMeta;
                return this;
            }

            /**
             * AutoSplit.
             */
            public Builder autoSplit(Boolean autoSplit) {
                this.autoSplit = autoSplit;
                return this;
            }

            /**
             * EnableTracking.
             */
            public Builder enableTracking(Boolean enableTracking) {
                this.enableTracking = enableTracking;
                return this;
            }

            /**
             * LogStoreName.
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * MaxSplitShard.
             */
            public Builder maxSplitShard(Integer maxSplitShard) {
                this.maxSplitShard = maxSplitShard;
                return this;
            }

            /**
             * ShardCount.
             */
            public Builder shardCount(Integer shardCount) {
                this.shardCount = shardCount;
                return this;
            }

            /**
             * Ttl.
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
