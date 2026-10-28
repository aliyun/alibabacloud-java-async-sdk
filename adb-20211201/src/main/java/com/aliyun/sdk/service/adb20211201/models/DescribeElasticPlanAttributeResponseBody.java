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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeElasticPlanAttributeResponseBody model) {
            this.elasticPlan = model.elasticPlan;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The elastic plan.</p>
         */
        public Builder elasticPlan(ElasticPlan elasticPlan) {
            this.elasticPlan = elasticPlan;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A5C433C2-001F-58E3-99F5-3274C14DF8BD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeElasticPlanAttributeResponseBody build() {
            return new DescribeElasticPlanAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeElasticPlanAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeElasticPlanAttributeResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ElasticPlan model) {
                this.autoScale = model.autoScale;
                this.cronExpression = model.cronExpression;
                this.elasticPlanName = model.elasticPlanName;
                this.enabled = model.enabled;
                this.endTime = model.endTime;
                this.resourceGroupName = model.resourceGroupName;
                this.startTime = model.startTime;
                this.targetSize = model.targetSize;
                this.type = model.type;
            } 

            /**
             * <p>Indicates whether <strong>proportional default elastic scaling for the storage acceleration service (EIU)</strong> is enabled.
             * Valid values:</p>
             * <ul>
             * <li>true: Enabled. After this feature is enabled, storage resources scale in or out along with the elastic scaling of compute resources.</li>
             * <li>false: Disabled.<blockquote>
             * <p>Only one storage elastic plan with proportional default elastic scaling for the storage acceleration service (EIU) can be enabled for the entire cluster. After this type of elastic plan is enabled, no other storage elastic plans can be enabled.</p>
             * </blockquote>
             * </li>
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
             * <p>The cron expression, which indicates the scaling cycle and scaling time of the elastic plan.</p>
             * 
             * <strong>example:</strong>
             * <p>0 20 14 * * ?</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>The name of the elastic plan.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder elasticPlanName(String elasticPlanName) {
                this.elasticPlanName = elasticPlanName;
                return this;
            }

            /**
             * <p>Indicates whether the elastic plan is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The end time.</p>
             * <blockquote>
             * <p>The time is in the yyyy-MM-ddTHH:mm:ssZ format.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2025-01-01T12:01:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The name of the resource group to which the elastic plan belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * <p>The start time.</p>
             * <blockquote>
             * <p>The time is in the yyyy-MM-ddTHH:mm:ssZ format.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2022-01-01T12:01:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The target specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>32ACU</p>
             */
            public Builder targetSize(String targetSize) {
                this.targetSize = targetSize;
                return this;
            }

            /**
             * <p>The type of the elastic plan.</p>
             * 
             * <strong>example:</strong>
             * <p>EXECUTOR</p>
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
