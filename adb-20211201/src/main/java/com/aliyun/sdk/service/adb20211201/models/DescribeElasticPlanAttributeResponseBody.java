// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticPlanAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticPlanAttributeResponseBody</p>
 */
public class DescribeElasticPlanAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ElasticPlan")
    private ElasticPlan elasticPlan;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeElasticPlanAttributeResponseBody(Builder builder) {
        this.elasticPlan = builder.elasticPlan;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElasticPlanAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return elasticPlan
     */
    public ElasticPlan getElasticPlan() {
        return this.elasticPlan;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ElasticPlan elasticPlan; 
        private String requestId; 

        /**
         * The queried scaling plan.
         */
        public Builder elasticPlan(ElasticPlan elasticPlan) {
            this.elasticPlan = elasticPlan;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeElasticPlanAttributeResponseBody build() {
            return new DescribeElasticPlanAttributeResponseBody(this);
        } 

    } 

    public static class ElasticPlan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoScale")
        private Boolean autoScale;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("ElasticPlanName")
        private String elasticPlanName;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TargetSize")
        private String targetSize;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ElasticPlan(Builder builder) {
            this.autoScale = builder.autoScale;
            this.cronExpression = builder.cronExpression;
            this.elasticPlanName = builder.elasticPlanName;
            this.enabled = builder.enabled;
            this.endTime = builder.endTime;
            this.resourceGroupName = builder.resourceGroupName;
            this.startTime = builder.startTime;
            this.targetSize = builder.targetSize;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticPlan create() {
            return builder().build();
        }

        /**
         * @return autoScale
         */
        public Boolean getAutoScale() {
            return this.autoScale;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
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
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
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
            private String cronExpression; 
            private String elasticPlanName; 
            private Boolean enabled; 
            private String endTime; 
            private String resourceGroupName; 
            private String startTime; 
            private String targetSize; 
            private String type; 

            /**
             * Indicates whether **Default Proportional Scaling for EIUs** is enabled. Valid values: true: Default Proportional Scaling for EIUs is enabled. If you set this parameter to true, storage resources are scaled along with computing resources. false: Default Proportional Scaling for EIUs is not enabled.
             * <p>
             * 
             * >  You can enable Default Proportional Scaling for EIUs for only a single scaling plan of a cluster. After you enable a scaling plan of the Default Proportional Scaling for EIUs type, you cannot enable scaling plans of other types.
             */
            public Builder autoScale(Boolean autoScale) {
                this.autoScale = autoScale;
                return this;
            }

            /**
             * A CORN expression that indicates the scaling cycle and time for the scaling plan.
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
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
             * Indicates whether the scaling plan is enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The end time of the scaling plan.
             * <p>
             * 
             * >  The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The name of the resource group used by the scaling plan.
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * The start time of the scaling plan.
             * <p>
             * 
             * >  The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
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
             * The type of the scaling plan.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ElasticPlan build() {
                return new ElasticPlan(this);
            } 

        } 

    }
}
