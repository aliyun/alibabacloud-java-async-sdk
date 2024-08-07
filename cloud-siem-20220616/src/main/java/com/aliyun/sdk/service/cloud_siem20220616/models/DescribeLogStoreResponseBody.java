// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogStoreResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogStoreResponseBody</p>
 */
public class DescribeLogStoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLogStoreResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogStoreResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The response of the threat analysis feature.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLogStoreResponseBody build() {
            return new DescribeLogStoreResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppendMeta")
        private Boolean appendMeta;

        @com.aliyun.core.annotation.NameInMap("AutoSplit")
        private Boolean autoSplit;

        @com.aliyun.core.annotation.NameInMap("EnableTracking")
        private Boolean enableTracking;

        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("MaxSplitShard")
        private Integer maxSplitShard;

        @com.aliyun.core.annotation.NameInMap("ShardCount")
        private Integer shardCount;

        @com.aliyun.core.annotation.NameInMap("Ttl")
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
             * Indicates whether the following time points are added after the log arrives: the time points when the public IP address of the client and the log arrive. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder appendMeta(Boolean appendMeta) {
                this.appendMeta = appendMeta;
                return this;
            }

            /**
             * Indicates whether the automatic sharding feature is enabled. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder autoSplit(Boolean autoSplit) {
                this.autoSplit = autoSplit;
                return this;
            }

            /**
             * Indicates whether the web tracking feature is enabled to collect user information from browsers, iOS applications, or Android applications. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder enableTracking(Boolean enableTracking) {
                this.enableTracking = enableTracking;
                return this;
            }

            /**
             * The name of the Logstore in Simple Log Service.
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * The maximum number of shards that can be generated by using the automatic sharding feature.
             */
            public Builder maxSplitShard(Integer maxSplitShard) {
                this.maxSplitShard = maxSplitShard;
                return this;
            }

            /**
             * The number of shards in Log Service.
             */
            public Builder shardCount(Integer shardCount) {
                this.shardCount = shardCount;
                return this;
            }

            /**
             * The retention period of data. Unit: day.
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
