// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticityAssuranceInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticityAssuranceInstancesResponseBody</p>
 */
public class DescribeElasticityAssuranceInstancesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("ElasticityAssuranceItem")
    private ElasticityAssuranceItem elasticityAssuranceItem;

    private DescribeElasticityAssuranceInstancesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.maxResults = builder.maxResults;
        this.elasticityAssuranceItem = builder.elasticityAssuranceItem;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElasticityAssuranceInstancesResponseBody create() {
        return builder().build();
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

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return elasticityAssuranceItem
     */
    public ElasticityAssuranceItem getElasticityAssuranceItem() {
        return this.elasticityAssuranceItem;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private Integer maxResults; 
        private ElasticityAssuranceItem elasticityAssuranceItem; 

        /**
         * The start flag of the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of records that meet the query criteria.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The list of instances that have been matched by the elastic protection service.
         */
        public Builder elasticityAssuranceItem(ElasticityAssuranceItem elasticityAssuranceItem) {
            this.elasticityAssuranceItem = elasticityAssuranceItem;
            return this;
        }

        public DescribeElasticityAssuranceInstancesResponseBody build() {
            return new DescribeElasticityAssuranceInstancesResponseBody(this);
        } 

    } 

    public static class InstanceIdSet extends TeaModel {
        @NameInMap("InstanceId")
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
             * The ID of the instance.
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
        @NameInMap("InstanceIdSet")
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
