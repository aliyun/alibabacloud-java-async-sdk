// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticPlanResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticPlanResponseBody</p>
 */
public class DescribeElasticPlanResponseBody extends TeaModel {
    @NameInMap("ElasticPlanList")
    private java.util.List < ElasticPlanList> elasticPlanList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeElasticPlanResponseBody(Builder builder) {
        this.elasticPlanList = builder.elasticPlanList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElasticPlanResponseBody create() {
        return builder().build();
    }

    /**
     * @return elasticPlanList
     */
    public java.util.List < ElasticPlanList> getElasticPlanList() {
        return this.elasticPlanList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ElasticPlanList> elasticPlanList; 
        private String requestId; 

        /**
         * Details of the scaling plans.
         */
        public Builder elasticPlanList(java.util.List < ElasticPlanList> elasticPlanList) {
            this.elasticPlanList = elasticPlanList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeElasticPlanResponseBody build() {
            return new DescribeElasticPlanResponseBody(this);
        } 

    } 

    public static class ElasticPlanList extends TeaModel {
        @NameInMap("ElasticNodeNum")
        private Integer elasticNodeNum;

        @NameInMap("ElasticPlanType")
        private String elasticPlanType;

        @NameInMap("ElasticPlanWorkerSpec")
        private String elasticPlanWorkerSpec;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("EndDay")
        private String endDay;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("PlanName")
        private String planName;

        @NameInMap("ResourcePoolName")
        private String resourcePoolName;

        @NameInMap("StartDay")
        private String startDay;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("WeeklyRepeat")
        private String weeklyRepeat;

        private ElasticPlanList(Builder builder) {
            this.elasticNodeNum = builder.elasticNodeNum;
            this.elasticPlanType = builder.elasticPlanType;
            this.elasticPlanWorkerSpec = builder.elasticPlanWorkerSpec;
            this.enable = builder.enable;
            this.endDay = builder.endDay;
            this.endTime = builder.endTime;
            this.planName = builder.planName;
            this.resourcePoolName = builder.resourcePoolName;
            this.startDay = builder.startDay;
            this.startTime = builder.startTime;
            this.weeklyRepeat = builder.weeklyRepeat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticPlanList create() {
            return builder().build();
        }

        /**
         * @return elasticNodeNum
         */
        public Integer getElasticNodeNum() {
            return this.elasticNodeNum;
        }

        /**
         * @return elasticPlanType
         */
        public String getElasticPlanType() {
            return this.elasticPlanType;
        }

        /**
         * @return elasticPlanWorkerSpec
         */
        public String getElasticPlanWorkerSpec() {
            return this.elasticPlanWorkerSpec;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return endDay
         */
        public String getEndDay() {
            return this.endDay;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return planName
         */
        public String getPlanName() {
            return this.planName;
        }

        /**
         * @return resourcePoolName
         */
        public String getResourcePoolName() {
            return this.resourcePoolName;
        }

        /**
         * @return startDay
         */
        public String getStartDay() {
            return this.startDay;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return weeklyRepeat
         */
        public String getWeeklyRepeat() {
            return this.weeklyRepeat;
        }

        public static final class Builder {
            private Integer elasticNodeNum; 
            private String elasticPlanType; 
            private String elasticPlanWorkerSpec; 
            private Boolean enable; 
            private String endDay; 
            private String endTime; 
            private String planName; 
            private String resourcePoolName; 
            private String startDay; 
            private String startTime; 
            private String weeklyRepeat; 

            /**
             * The number of nodes involved in the scaling plan.
             * <p>
             * 
             * *   If ElasticPlanType is set to **worker**, a value of 0 or null is returned.
             * *   If ElasticPlanType is set to **executorcombineworker** or **executor**, a value greater than 0 is returned.
             */
            public Builder elasticNodeNum(Integer elasticNodeNum) {
                this.elasticNodeNum = elasticNodeNum;
                return this;
            }

            /**
             * The type of the scaling plan. Default value: executorcombineworker. Valid values:
             * <p>
             * 
             * *   **worker**: scales only elastic I/O resources.
             * *   **executor**: scales only computing resources.
             * *   **executorcombineworker**: scales both elastic I/O resources and computing resources by proportion.
             */
            public Builder elasticPlanType(String elasticPlanType) {
                this.elasticPlanType = elasticPlanType;
                return this;
            }

            /**
             * The resource specifications that can be scaled up by the scaling plan. Default value: 8 Core 64 GB. Valid values:
             * <p>
             * 
             * *   8 Core 64 GB
             * *   16 Core 64 GB
             * *   32 Core 64 GB
             * *   64 Core 128 GB
             * *   12 Core 96 GB
             * *   24 Core 96 GB
             * *   52 Core 86 GB
             */
            public Builder elasticPlanWorkerSpec(String elasticPlanWorkerSpec) {
                this.elasticPlanWorkerSpec = elasticPlanWorkerSpec;
                return this;
            }

            /**
             * Specifies whether the scaling plan takes effect. Default value: true. Valid values:
             * <p>
             * 
             * *   **true**: The scaling plan takes effect.
             * *   **false**: The scaling plan does not take effect.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The end date of the scaling plan. This parameter is returned only if the end date of the scaling plan is set. The date is in the yyyy-MM-dd format.
             */
            public Builder endDay(String endDay) {
                this.endDay = endDay;
                return this;
            }

            /**
             * The restoration time of the scaling plan. The interval between the scale-up time and the restoration time cannot be more than 24 hours. The time is in the HH:mm:ss format.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The name of the scaling plan.
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * The name of the resource group.
             */
            public Builder resourcePoolName(String resourcePoolName) {
                this.resourcePoolName = resourcePoolName;
                return this;
            }

            /**
             * The start date of the scaling plan. This parameter is returned only if the start date of the scaling plan is set. The date is in the yyyy-MM-dd format.
             */
            public Builder startDay(String startDay) {
                this.startDay = startDay;
                return this;
            }

            /**
             * The scale-up time of the scaling plan. The time is in the HH:mm:ss format.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The days of the week when you want to execute the scaling plan. Valid values: 0 to 6, which indicate Sunday to Saturday. Multiple values are separated by commas (,).
             */
            public Builder weeklyRepeat(String weeklyRepeat) {
                this.weeklyRepeat = weeklyRepeat;
                return this;
            }

            public ElasticPlanList build() {
                return new ElasticPlanList(this);
            } 

        } 

    }
}
