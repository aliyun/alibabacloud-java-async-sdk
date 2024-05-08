// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticityAssuranceInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticityAssuranceInstancesResponseBody</p>
 */
public class DescribeElasticityAssuranceInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ElasticityAssuranceItem")
    private ElasticityAssuranceItem elasticityAssuranceItem;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeElasticityAssuranceInstancesResponseBody(Builder builder) {
        this.elasticityAssuranceItem = builder.elasticityAssuranceItem;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElasticityAssuranceInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return elasticityAssuranceItem
     */
    public ElasticityAssuranceItem getElasticityAssuranceItem() {
        return this.elasticityAssuranceItem;
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
        private ElasticityAssuranceItem elasticityAssuranceItem; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details about the instances that match and use the elasticity assurance.
         */
        public Builder elasticityAssuranceItem(ElasticityAssuranceItem elasticityAssuranceItem) {
            this.elasticityAssuranceItem = elasticityAssuranceItem;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token used to start the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeElasticityAssuranceInstancesResponseBody build() {
            return new DescribeElasticityAssuranceInstancesResponseBody(this);
        } 

    } 

    public static class InstanceIdSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private InstanceIdSet(Builder builder) {
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceIdSet create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String instanceId; 

            /**
             * The instance ID
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstanceIdSet build() {
                return new InstanceIdSet(this);
            } 

        } 

    }
    public static class ElasticityAssuranceItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceIdSet")
        private java.util.List < InstanceIdSet> instanceIdSet;

        private ElasticityAssuranceItem(Builder builder) {
            this.instanceIdSet = builder.instanceIdSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticityAssuranceItem create() {
            return builder().build();
        }

        /**
         * @return instanceIdSet
         */
        public java.util.List < InstanceIdSet> getInstanceIdSet() {
            return this.instanceIdSet;
        }

        public static final class Builder {
            private java.util.List < InstanceIdSet> instanceIdSet; 

            /**
             * InstanceIdSet.
             */
            public Builder instanceIdSet(java.util.List < InstanceIdSet> instanceIdSet) {
                this.instanceIdSet = instanceIdSet;
                return this;
            }

            public ElasticityAssuranceItem build() {
                return new ElasticityAssuranceItem(this);
            } 

        } 

    }
}
