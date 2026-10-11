// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.epg20260715.models;

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
 * {@link ListEgressProxyIpPoolsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEgressProxyIpPoolsResponseBody</p>
 */
public class ListEgressProxyIpPoolsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EgressProxyIpPools")
    private java.util.List<EgressProxyIpPools> egressProxyIpPools;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListEgressProxyIpPoolsResponseBody(Builder builder) {
        this.egressProxyIpPools = builder.egressProxyIpPools;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEgressProxyIpPoolsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return egressProxyIpPools
     */
    public java.util.List<EgressProxyIpPools> getEgressProxyIpPools() {
        return this.egressProxyIpPools;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<EgressProxyIpPools> egressProxyIpPools; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListEgressProxyIpPoolsResponseBody model) {
            this.egressProxyIpPools = model.egressProxyIpPools;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * EgressProxyIpPools.
         */
        public Builder egressProxyIpPools(java.util.List<EgressProxyIpPools> egressProxyIpPools) {
            this.egressProxyIpPools = egressProxyIpPools;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEgressProxyIpPoolsResponseBody build() {
            return new ListEgressProxyIpPoolsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEgressProxyIpPoolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEgressProxyIpPoolsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEgressProxyIpPoolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEgressProxyIpPoolsResponseBody</p>
     */
    public static class EgressProxyIpPools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressType")
        private String addressType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EgressProxyGatewayId")
        private String egressProxyGatewayId;

        @com.aliyun.core.annotation.NameInMap("EgressProxyIpPoolId")
        private String egressProxyIpPoolId;

        @com.aliyun.core.annotation.NameInMap("EgressProxyIpPoolName")
        private String egressProxyIpPoolName;

        @com.aliyun.core.annotation.NameInMap("HashFactor")
        private String hashFactor;

        @com.aliyun.core.annotation.NameInMap("HashHeaderName")
        private String hashHeaderName;

        @com.aliyun.core.annotation.NameInMap("Scheduler")
        private String scheduler;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private EgressProxyIpPools(Builder builder) {
            this.addressType = builder.addressType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.egressProxyGatewayId = builder.egressProxyGatewayId;
            this.egressProxyIpPoolId = builder.egressProxyIpPoolId;
            this.egressProxyIpPoolName = builder.egressProxyIpPoolName;
            this.hashFactor = builder.hashFactor;
            this.hashHeaderName = builder.hashHeaderName;
            this.scheduler = builder.scheduler;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EgressProxyIpPools create() {
            return builder().build();
        }

        /**
         * @return addressType
         */
        public String getAddressType() {
            return this.addressType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return egressProxyGatewayId
         */
        public String getEgressProxyGatewayId() {
            return this.egressProxyGatewayId;
        }

        /**
         * @return egressProxyIpPoolId
         */
        public String getEgressProxyIpPoolId() {
            return this.egressProxyIpPoolId;
        }

        /**
         * @return egressProxyIpPoolName
         */
        public String getEgressProxyIpPoolName() {
            return this.egressProxyIpPoolName;
        }

        /**
         * @return hashFactor
         */
        public String getHashFactor() {
            return this.hashFactor;
        }

        /**
         * @return hashHeaderName
         */
        public String getHashHeaderName() {
            return this.hashHeaderName;
        }

        /**
         * @return scheduler
         */
        public String getScheduler() {
            return this.scheduler;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String addressType; 
            private String createTime; 
            private String description; 
            private String egressProxyGatewayId; 
            private String egressProxyIpPoolId; 
            private String egressProxyIpPoolName; 
            private String hashFactor; 
            private String hashHeaderName; 
            private String scheduler; 
            private String status; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(EgressProxyIpPools model) {
                this.addressType = model.addressType;
                this.createTime = model.createTime;
                this.description = model.description;
                this.egressProxyGatewayId = model.egressProxyGatewayId;
                this.egressProxyIpPoolId = model.egressProxyIpPoolId;
                this.egressProxyIpPoolName = model.egressProxyIpPoolName;
                this.hashFactor = model.hashFactor;
                this.hashHeaderName = model.hashHeaderName;
                this.scheduler = model.scheduler;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * AddressType.
             */
            public Builder addressType(String addressType) {
                this.addressType = addressType;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EgressProxyGatewayId.
             */
            public Builder egressProxyGatewayId(String egressProxyGatewayId) {
                this.egressProxyGatewayId = egressProxyGatewayId;
                return this;
            }

            /**
             * EgressProxyIpPoolId.
             */
            public Builder egressProxyIpPoolId(String egressProxyIpPoolId) {
                this.egressProxyIpPoolId = egressProxyIpPoolId;
                return this;
            }

            /**
             * EgressProxyIpPoolName.
             */
            public Builder egressProxyIpPoolName(String egressProxyIpPoolName) {
                this.egressProxyIpPoolName = egressProxyIpPoolName;
                return this;
            }

            /**
             * HashFactor.
             */
            public Builder hashFactor(String hashFactor) {
                this.hashFactor = hashFactor;
                return this;
            }

            /**
             * HashHeaderName.
             */
            public Builder hashHeaderName(String hashHeaderName) {
                this.hashHeaderName = hashHeaderName;
                return this;
            }

            /**
             * Scheduler.
             */
            public Builder scheduler(String scheduler) {
                this.scheduler = scheduler;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public EgressProxyIpPools build() {
                return new EgressProxyIpPools(this);
            } 

        } 

    }
}
