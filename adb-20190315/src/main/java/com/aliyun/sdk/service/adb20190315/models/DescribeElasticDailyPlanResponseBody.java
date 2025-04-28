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
 * {@link DescribeElasticDailyPlanResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticDailyPlanResponseBody</p>
 */
public class DescribeElasticDailyPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ElasticDailyPlanList")
    private java.util.List<ElasticDailyPlanList> elasticDailyPlanList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return elasticDailyPlanList
     */
    public java.util.List<ElasticDailyPlanList> getElasticDailyPlanList() {
        return this.elasticDailyPlanList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ElasticDailyPlanList> elasticDailyPlanList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeElasticDailyPlanResponseBody model) {
            this.elasticDailyPlanList = model.elasticDailyPlanList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Details of the current-day scaling plans.</p>
         */
        public Builder elasticDailyPlanList(java.util.List<ElasticDailyPlanList> elasticDailyPlanList) {
            this.elasticDailyPlanList = elasticDailyPlanList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeElasticDailyPlanResponseBody build() {
            return new DescribeElasticDailyPlanResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeElasticDailyPlanResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeElasticDailyPlanResponseBody</p>
     */
    public static class ElasticDailyPlanList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Day")
        private String day;

        @com.aliyun.core.annotation.NameInMap("ElasticNodeNum")
        private Integer elasticNodeNum;

        @com.aliyun.core.annotation.NameInMap("ElasticPlanType")
        private String elasticPlanType;

        @com.aliyun.core.annotation.NameInMap("ElasticPlanWorkerSpec")
        private String elasticPlanWorkerSpec;

        @com.aliyun.core.annotation.NameInMap("EndTs")
        private String endTs;

        @com.aliyun.core.annotation.NameInMap("PlanEndTs")
        private String planEndTs;

        @com.aliyun.core.annotation.NameInMap("PlanName")
        private String planName;

        @com.aliyun.core.annotation.NameInMap("PlanStartTs")
        private String planStartTs;

        @com.aliyun.core.annotation.NameInMap("ResourcePoolName")
        private String resourcePoolName;

        @com.aliyun.core.annotation.NameInMap("StartTs")
        private String startTs;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(ElasticDailyPlanList model) {
                this.day = model.day;
                this.elasticNodeNum = model.elasticNodeNum;
                this.elasticPlanType = model.elasticPlanType;
                this.elasticPlanWorkerSpec = model.elasticPlanWorkerSpec;
                this.endTs = model.endTs;
                this.planEndTs = model.planEndTs;
                this.planName = model.planName;
                this.planStartTs = model.planStartTs;
                this.resourcePoolName = model.resourcePoolName;
                this.startTs = model.startTs;
                this.status = model.status;
            } 

            /**
             * <p>The start date of the current-day scaling plan. The date is in the yyyy-MM-dd format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-02</p>
             */
            public Builder day(String day) {
                this.day = day;
                return this;
            }

            /**
             * <p>The number of nodes involved in the scaling plan.</p>
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
             * <p>The type of the scaling plan. Default value: executorcombineworker. Valid values:</p>
             * <ul>
             * <li><strong>worker</strong>: scales only elastic I/O resources.</li>
             * <li><strong>executor</strong>: scales only computing resources.</li>
             * <li><strong>executorcombineworker</strong>: scales both elastic I/O resources and computing resources by proportion.</li>
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
             * <p>The resource specifications that can be scaled up by the scaling plan. Default value: 8 Core 64 GB. Valid values:</p>
             * <ul>
             * <li>8 Core 64 GB</li>
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
             * <p>The actual restoration time. The time is in the yyyy-MM-dd hh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-02 16:00:00</p>
             */
            public Builder endTs(String endTs) {
                this.endTs = endTs;
                return this;
            }

            /**
             * <p>The scheduled restoration time. The time is in the yyyy-MM-dd hh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-02 16:00:00</p>
             */
            public Builder planEndTs(String planEndTs) {
                this.planEndTs = planEndTs;
                return this;
            }

            /**
             * <p>The name of the scaling plan.</p>
             * 
             * <strong>example:</strong>
             * <p>realtimeplan</p>
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * <p>The scheduled scale-up time. The time is in the yyyy-MM-dd hh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-02 15:00:00</p>
             */
            public Builder planStartTs(String planStartTs) {
                this.planStartTs = planStartTs;
                return this;
            }

            /**
             * <p>The name of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder resourcePoolName(String resourcePoolName) {
                this.resourcePoolName = resourcePoolName;
                return this;
            }

            /**
             * <p>The actual scale-up time. The time is in the yyyy-MM-dd hh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-02 16:00:00</p>
             */
            public Builder startTs(String startTs) {
                this.startTs = startTs;
                return this;
            }

            /**
             * <p>The execution state of the current-day scaling plan. Multiple values are separated by commas (,). Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The scaling plan is not executed.</li>
             * <li><strong>2</strong>: The scaling plan is being executed.</li>
             * <li><strong>3</strong>: The scaling plan is executed.</li>
             * <li><strong>4</strong>: The scaling plan fails to be executed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
