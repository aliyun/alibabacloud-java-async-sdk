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
         * ElasticPlanList.
         */
        public Builder elasticPlanList(java.util.List < ElasticPlanList> elasticPlanList) {
            this.elasticPlanList = elasticPlanList;
            return this;
        }

        /**
         * RequestId.
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
            private Boolean enable; 
            private String endDay; 
            private String endTime; 
            private String planName; 
            private String resourcePoolName; 
            private String startDay; 
            private String startTime; 
            private String weeklyRepeat; 

            /**
             * ElasticNodeNum.
             */
            public Builder elasticNodeNum(Integer elasticNodeNum) {
                this.elasticNodeNum = elasticNodeNum;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * EndDay.
             */
            public Builder endDay(String endDay) {
                this.endDay = endDay;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
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
             * ResourcePoolName.
             */
            public Builder resourcePoolName(String resourcePoolName) {
                this.resourcePoolName = resourcePoolName;
                return this;
            }

            /**
             * StartDay.
             */
            public Builder startDay(String startDay) {
                this.startDay = startDay;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * WeeklyRepeat.
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
