// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeElasticPlanResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticPlanResponseBody</p>
 */
public class DescribeElasticPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ElasticPlanList")
    private java.util.List<ElasticPlanList> elasticPlanList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return elasticPlanList
     */
    public java.util.List<ElasticPlanList> getElasticPlanList() {
        return this.elasticPlanList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ElasticPlanList> elasticPlanList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeElasticPlanResponseBody model) {
            this.elasticPlanList = model.elasticPlanList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The queried scaling plans.</p>
         */
        public Builder elasticPlanList(java.util.List<ElasticPlanList> elasticPlanList) {
            this.elasticPlanList = elasticPlanList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeElasticPlanResponseBody build() {
            return new DescribeElasticPlanResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeElasticPlanResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeElasticPlanResponseBody</p>
     */
    public static class ElasticPlanList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ElasticNodeNum")
        private Integer elasticNodeNum;

        @com.aliyun.core.annotation.NameInMap("ElasticPlanType")
        private String elasticPlanType;

        @com.aliyun.core.annotation.NameInMap("ElasticPlanWorkerSpec")
        private String elasticPlanWorkerSpec;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("EndDay")
        private String endDay;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("MonthlyRepeat")
        private String monthlyRepeat;

        @com.aliyun.core.annotation.NameInMap("PlanName")
        private String planName;

        @com.aliyun.core.annotation.NameInMap("ResourcePoolName")
        private String resourcePoolName;

        @com.aliyun.core.annotation.NameInMap("StartDay")
        private String startDay;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("WeeklyRepeat")
        private String weeklyRepeat;

        private ElasticPlanList(Builder builder) {
            this.elasticNodeNum = builder.elasticNodeNum;
            this.elasticPlanType = builder.elasticPlanType;
            this.elasticPlanWorkerSpec = builder.elasticPlanWorkerSpec;
            this.enable = builder.enable;
            this.endDay = builder.endDay;
            this.endTime = builder.endTime;
            this.monthlyRepeat = builder.monthlyRepeat;
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
         * @return monthlyRepeat
         */
        public String getMonthlyRepeat() {
            return this.monthlyRepeat;
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
            private String monthlyRepeat; 
            private String planName; 
            private String resourcePoolName; 
            private String startDay; 
            private String startTime; 
            private String weeklyRepeat; 

            private Builder() {
            } 

            private Builder(ElasticPlanList model) {
                this.elasticNodeNum = model.elasticNodeNum;
                this.elasticPlanType = model.elasticPlanType;
                this.elasticPlanWorkerSpec = model.elasticPlanWorkerSpec;
                this.enable = model.enable;
                this.endDay = model.endDay;
                this.endTime = model.endTime;
                this.monthlyRepeat = model.monthlyRepeat;
                this.planName = model.planName;
                this.resourcePoolName = model.resourcePoolName;
                this.startDay = model.startDay;
                this.startTime = model.startTime;
                this.weeklyRepeat = model.weeklyRepeat;
            } 

            /**
             * <p>The number of nodes that are involved in the scaling plan.</p>
             * <ul>
             * <li>If ElasticPlanType is set to <strong>worker</strong>, a value of 0 or null is returned.</li>
             * <li>If ElasticPlanType is set to <strong>executorcombineworker</strong> or <strong>executor</strong>, a value greater than 0 is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder elasticNodeNum(Integer elasticNodeNum) {
                this.elasticNodeNum = elasticNodeNum;
                return this;
            }

            /**
             * <p>The type of the scaling plan. Valid values:</p>
             * <ul>
             * <li><strong>worker</strong>: scales only elastic I/O resources.</li>
             * <li><strong>executor</strong>: scales only computing resources.</li>
             * <li><strong>executorcombineworker</strong> (default): scales both elastic I/O resources and computing resources by proportion.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>worker</p>
             */
            public Builder elasticPlanType(String elasticPlanType) {
                this.elasticPlanType = elasticPlanType;
                return this;
            }

            /**
             * <p>The resource specifications that can be scaled up by the scaling plan. Valid values:</p>
             * <ul>
             * <li>8 Core 64 GB (default)</li>
             * <li>16 Core 64 GB</li>
             * <li>32 Core 64 GB</li>
             * <li>64 Core 128 GB</li>
             * <li>12 Core 96 GB</li>
             * <li>24 Core 96 GB</li>
             * <li>52 Core 86 GB</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>16 Core 64 GB</p>
             */
            public Builder elasticPlanWorkerSpec(String elasticPlanWorkerSpec) {
                this.elasticPlanWorkerSpec = elasticPlanWorkerSpec;
                return this;
            }

            /**
             * <p>Indicates whether the scaling plan takes effect. Valid values:</p>
             * <ul>
             * <li><strong>true</strong> (default)</li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The end date of the scaling plan. This parameter is returned only if the end date of the scaling plan is set. The date is in the yyyy-MM-dd format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-09</p>
             */
            public Builder endDay(String endDay) {
                this.endDay = endDay;
                return this;
            }

            /**
             * <p>The restoration time of the scaling plan. The interval between the scale-up time and the restoration time cannot be more than 24 hours. The time is in the HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>10:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The days of the month when the scaling plan was executed. A value indicates a day of the month. Multiple values are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>1,15,25</p>
             */
            public Builder monthlyRepeat(String monthlyRepeat) {
                this.monthlyRepeat = monthlyRepeat;
                return this;
            }

            /**
             * <p>The name of the scaling plan.</p>
             * 
             * <strong>example:</strong>
             * <p>realtime</p>
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * <p>The name of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>USER_DEFAULT</p>
             */
            public Builder resourcePoolName(String resourcePoolName) {
                this.resourcePoolName = resourcePoolName;
                return this;
            }

            /**
             * <p>The start date of the scaling plan. This parameter is returned only if the start date of the scaling plan is set. The date is in the yyyy-MM-dd format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-02</p>
             */
            public Builder startDay(String startDay) {
                this.startDay = startDay;
                return this;
            }

            /**
             * <p>The scale-up time of the scaling plan. The time is in the HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>08:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The days of the week when the scaling plan was executed. Valid values: 0 to 6, which indicate Sunday to Saturday. Multiple values are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>3,4,5,6</p>
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
