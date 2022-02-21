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
         * ElasticDailyPlanList.
         */
        public Builder elasticDailyPlanList(java.util.List < ElasticDailyPlanList> elasticDailyPlanList) {
            this.elasticDailyPlanList = elasticDailyPlanList;
            return this;
        }

        /**
         * RequestId.
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
            private String endTs; 
            private String planEndTs; 
            private String planName; 
            private String planStartTs; 
            private String resourcePoolName; 
            private String startTs; 
            private Integer status; 

            /**
             * Day.
             */
            public Builder day(String day) {
                this.day = day;
                return this;
            }

            /**
             * ElasticNodeNum.
             */
            public Builder elasticNodeNum(Integer elasticNodeNum) {
                this.elasticNodeNum = elasticNodeNum;
                return this;
            }

            /**
             * EndTs.
             */
            public Builder endTs(String endTs) {
                this.endTs = endTs;
                return this;
            }

            /**
             * PlanEndTs.
             */
            public Builder planEndTs(String planEndTs) {
                this.planEndTs = planEndTs;
                return this;
            }

            /**
             * PlanName.
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * PlanStartTs.
             */
            public Builder planStartTs(String planStartTs) {
                this.planStartTs = planStartTs;
                return this;
            }

            /**
             * ResourcePoolName.
             */
            public Builder resourcePoolName(String resourcePoolName) {
                this.resourcePoolName = resourcePoolName;
                return this;
            }

            /**
             * StartTs.
             */
            public Builder startTs(String startTs) {
                this.startTs = startTs;
                return this;
            }

            /**
             * Status.
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
