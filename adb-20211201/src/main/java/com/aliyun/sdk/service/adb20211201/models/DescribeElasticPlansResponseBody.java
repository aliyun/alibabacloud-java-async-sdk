// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeElasticPlansResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticPlansResponseBody</p>
 */
public class DescribeElasticPlansResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ElasticPlans")
    private java.util.List<ElasticPlans> elasticPlans;

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
    public java.util.List<ElasticPlans> getElasticPlans() {
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
        private java.util.List<ElasticPlans> elasticPlans; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The queried scaling plans.</p>
         */
        public Builder elasticPlans(java.util.List<ElasticPlans> elasticPlans) {
            this.elasticPlans = elasticPlans;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A5C433C2-001F-58E3-99F5-3274C14DF8BD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeElasticPlansResponseBody build() {
            return new DescribeElasticPlansResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeElasticPlansResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeElasticPlansResponseBody</p>
     */
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
             * <p>Indicates whether <strong>Proportional Default Scaling for EIUs</strong> is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoScale(Boolean autoScale) {
                this.autoScale = autoScale;
                return this;
            }

            /**
             * <p>The name of the scaling plan.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder elasticPlanName(String elasticPlanName) {
                this.elasticPlanName = elasticPlanName;
                return this;
            }

            /**
             * <p>Indicates whether the scaling plan is immediately enabled after the plan is created. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The time when the next scheduling is performed.</p>
             * <blockquote>
             * <p>The time is in the yyyy-MM-ddTHH:mm:ssZ format.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2022-01-01T12:01:00Z</p>
             */
            public Builder nextScheduleTime(String nextScheduleTime) {
                this.nextScheduleTime = nextScheduleTime;
                return this;
            }

            /**
             * <p>The name of the resource group.</p>
             * <blockquote>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/459446.html">DescribeDBResourceGroup</a> operation to query the name of a resource group within a cluster.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * <p>The amount of elastic resources after scaling.</p>
             * 
             * <strong>example:</strong>
             * <p>32ACU</p>
             */
            public Builder targetSize(String targetSize) {
                this.targetSize = targetSize;
                return this;
            }

            /**
             * <p>The type of the scaling plan. Valid values:</p>
             * <ul>
             * <li><strong>EXECUTOR</strong>: the interactive resource group type, which specifies the computing resource type.</li>
             * <li><strong>WORKER</strong>: the EIU type.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EXECUTOR</p>
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
