// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticDailyPlanResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticDailyPlanResponseBody</p>
 */
public class DescribeElasticDailyPlanResponseBody extends TeaModel {
    @NameInMap("ElasticDailyPlanList")
    private java.util.List < ElasticDailyPlanList> elasticDailyPlanList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeElasticDailyPlanResponseBody(Builder builder) {
        this.elasticDailyPlanList = builder.elasticDailyPlanList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElasticDailyPlanResponseBody create() {
        return builder().build();
    }

    /**
     * @return elasticDailyPlanList
     */
    public java.util.List < ElasticDailyPlanList> getElasticDailyPlanList() {
        return this.elasticDailyPlanList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ElasticDailyPlanList> elasticDailyPlanList; 
        private String requestId; 

        /**
         * Details of the current-day scaling plans.
         */
        public Builder elasticDailyPlanList(java.util.List < ElasticDailyPlanList> elasticDailyPlanList) {
            this.elasticDailyPlanList = elasticDailyPlanList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeElasticDailyPlanResponseBody build() {
            return new DescribeElasticDailyPlanResponseBody(this);
        } 

    } 

    public static class ElasticDailyPlanList extends TeaModel {
        @NameInMap("Day")
        private String day;

        @NameInMap("ElasticNodeNum")
        private Integer elasticNodeNum;

        @NameInMap("ElasticPlanType")
        private String elasticPlanType;

        @NameInMap("ElasticPlanWorkerSpec")
        private String elasticPlanWorkerSpec;

        @NameInMap("EndTs")
        private String endTs;

        @NameInMap("PlanEndTs")
        private String planEndTs;

        @NameInMap("PlanName")
        private String planName;

        @NameInMap("PlanStartTs")
        private String planStartTs;

        @NameInMap("ResourcePoolName")
        private String resourcePoolName;

        @NameInMap("StartTs")
        private String startTs;

        @NameInMap("Status")
        private Integer status;

        private ElasticDailyPlanList(Builder builder) {
            this.day = builder.day;
            this.elasticNodeNum = builder.elasticNodeNum;
            this.elasticPlanType = builder.elasticPlanType;
            this.elasticPlanWorkerSpec = builder.elasticPlanWorkerSpec;
            this.endTs = builder.endTs;
            this.planEndTs = builder.planEndTs;
            this.planName = builder.planName;
            this.planStartTs = builder.planStartTs;
            this.resourcePoolName = builder.resourcePoolName;
            this.startTs = builder.startTs;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticDailyPlanList create() {
            return builder().build();
        }

        /**
         * @return day
         */
        public String getDay() {
            return this.day;
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
         * @return endTs
         */
        public String getEndTs() {
            return this.endTs;
        }

        /**
         * @return planEndTs
         */
        public String getPlanEndTs() {
            return this.planEndTs;
        }

        /**
         * @return planName
         */
        public String getPlanName() {
            return this.planName;
        }

        /**
         * @return planStartTs
         */
        public String getPlanStartTs() {
            return this.planStartTs;
        }

        /**
         * @return resourcePoolName
         */
        public String getResourcePoolName() {
            return this.resourcePoolName;
        }

        /**
         * @return startTs
         */
        public String getStartTs() {
            return this.startTs;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String day; 
            private Integer elasticNodeNum; 
            private String elasticPlanType; 
            private String elasticPlanWorkerSpec; 
            private String endTs; 
            private String planEndTs; 
            private String planName; 
            private String planStartTs; 
            private String resourcePoolName; 
            private String startTs; 
            private Integer status; 

            /**
             * The start date of the current-day scaling plan. The date is in the yyyy-MM-dd format.
             */
            public Builder day(String day) {
                this.day = day;
                return this;
            }

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
             * The actual restoration time. The time is in the yyyy-MM-dd hh:mm:ss format. The time is displayed in UTC.
             */
            public Builder endTs(String endTs) {
                this.endTs = endTs;
                return this;
            }

            /**
             * The scheduled restoration time. The time is in the yyyy-MM-dd hh:mm:ss format. The time is displayed in UTC.
             */
            public Builder planEndTs(String planEndTs) {
                this.planEndTs = planEndTs;
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
             * The scheduled scale-up time. The time is in the yyyy-MM-dd hh:mm:ss format. The time is displayed in UTC.
             */
            public Builder planStartTs(String planStartTs) {
                this.planStartTs = planStartTs;
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
             * The actual scale-up time. The time is in the yyyy-MM-dd hh:mm:ss format. The time is displayed in UTC.
             */
            public Builder startTs(String startTs) {
                this.startTs = startTs;
                return this;
            }

            /**
             * The execution state of the current-day scaling plan. Multiple values are separated by commas (,). Valid values:
             * <p>
             * 
             * *   **1**: The scaling plan is not executed.
             * *   **2**: The scaling plan is being executed.
             * *   **3**: The scaling plan is executed.
             * *   **4**: The scaling plan fails to be executed.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public ElasticDailyPlanList build() {
                return new ElasticDailyPlanList(this);
            } 

        } 

    }
}
