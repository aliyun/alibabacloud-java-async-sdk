// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticPlansResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticPlansResponseBody</p>
 */
public class DescribeElasticPlansResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ElasticPlans")
    private java.util.List < ElasticPlans> elasticPlans;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeElasticPlansResponseBody(Builder builder) {
        this.elasticPlans = builder.elasticPlans;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElasticPlansResponseBody create() {
        return builder().build();
    }

    /**
     * @return elasticPlans
     */
    public java.util.List < ElasticPlans> getElasticPlans() {
        return this.elasticPlans;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private java.util.List < ElasticPlans> elasticPlans; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The scaling plans.
         */
        public Builder elasticPlans(java.util.List < ElasticPlans> elasticPlans) {
            this.elasticPlans = elasticPlans;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        public DescribeElasticPlansResponseBody build() {
            return new DescribeElasticPlansResponseBody(this);
        } 

    } 

    public static class ElasticPlans extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoScale")
        private Boolean autoScale;

        @com.aliyun.core.annotation.NameInMap("ElasticPlanName")
        private String elasticPlanName;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("NextScheduleTime")
        private String nextScheduleTime;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("TargetSize")
        private String targetSize;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ElasticPlans(Builder builder) {
            this.autoScale = builder.autoScale;
            this.elasticPlanName = builder.elasticPlanName;
            this.enabled = builder.enabled;
            this.nextScheduleTime = builder.nextScheduleTime;
            this.resourceGroupName = builder.resourceGroupName;
            this.targetSize = builder.targetSize;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticPlans create() {
            return builder().build();
        }

        /**
         * @return autoScale
         */
        public Boolean getAutoScale() {
            return this.autoScale;
        }

        /**
         * @return elasticPlanName
         */
        public String getElasticPlanName() {
            return this.elasticPlanName;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return nextScheduleTime
         */
        public String getNextScheduleTime() {
            return this.nextScheduleTime;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        /**
         * @return targetSize
         */
        public String getTargetSize() {
            return this.targetSize;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean autoScale; 
            private String elasticPlanName; 
            private Boolean enabled; 
            private String nextScheduleTime; 
            private String resourceGroupName; 
            private String targetSize; 
            private String type; 

            /**
             * Indicates whether **Proportional Default Scaling for EIUs** is enabled. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder autoScale(Boolean autoScale) {
                this.autoScale = autoScale;
                return this;
            }

            /**
             * The name of the scaling plan.
             */
            public Builder elasticPlanName(String elasticPlanName) {
                this.elasticPlanName = elasticPlanName;
                return this;
            }

            /**
             * Indicates whether the scaling plan was immediately enabled after the plan is created. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The time when the next scheduling is performed.
             * <p>
             * 
             * > The time is in the yyyy-MM-ddTHH:mm:ssZ format.
             */
            public Builder nextScheduleTime(String nextScheduleTime) {
                this.nextScheduleTime = nextScheduleTime;
                return this;
            }

            /**
             * The name of the resource group.
             * <p>
             * 
             * > You can call the [DescribeDBResourceGroup](~~459446~~) operation to query the name of a resource group within a cluster.
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * The amount of elastic resources after scaling.
             */
            public Builder targetSize(String targetSize) {
                this.targetSize = targetSize;
                return this;
            }

            /**
             * The type of the scaling plan. Valid values:
             * <p>
             * 
             * *   EXECUTOR: interactive resource group.
             * *   WORKER: EIU.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ElasticPlans build() {
                return new ElasticPlans(this);
            } 

        } 

    }
}
