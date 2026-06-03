// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_dbaudit20180320.models;

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
 * {@link GetRiskLevelDistributionResponseBody} extends {@link TeaModel}
 *
 * <p>GetRiskLevelDistributionResponseBody</p>
 */
public class GetRiskLevelDistributionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TimeList")
    private java.util.List<TimeList> timeList;

    private GetRiskLevelDistributionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.timeList = builder.timeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRiskLevelDistributionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timeList
     */
    public java.util.List<TimeList> getTimeList() {
        return this.timeList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TimeList> timeList; 

        private Builder() {
        } 

        private Builder(GetRiskLevelDistributionResponseBody model) {
            this.requestId = model.requestId;
            this.timeList = model.timeList;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TimeList.
         */
        public Builder timeList(java.util.List<TimeList> timeList) {
            this.timeList = timeList;
            return this;
        }

        public GetRiskLevelDistributionResponseBody build() {
            return new GetRiskLevelDistributionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRiskLevelDistributionResponseBody} extends {@link TeaModel}
     *
     * <p>GetRiskLevelDistributionResponseBody</p>
     */
    public static class TimeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginDate")
        private String beginDate;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("HighRiskCount")
        private Long highRiskCount;

        @com.aliyun.core.annotation.NameInMap("LowRiskCount")
        private Long lowRiskCount;

        @com.aliyun.core.annotation.NameInMap("MiddleRiskCount")
        private Long middleRiskCount;

        @com.aliyun.core.annotation.NameInMap("RiskCount")
        private Long riskCount;

        private TimeList(Builder builder) {
            this.beginDate = builder.beginDate;
            this.endDate = builder.endDate;
            this.highRiskCount = builder.highRiskCount;
            this.lowRiskCount = builder.lowRiskCount;
            this.middleRiskCount = builder.middleRiskCount;
            this.riskCount = builder.riskCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeList create() {
            return builder().build();
        }

        /**
         * @return beginDate
         */
        public String getBeginDate() {
            return this.beginDate;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return highRiskCount
         */
        public Long getHighRiskCount() {
            return this.highRiskCount;
        }

        /**
         * @return lowRiskCount
         */
        public Long getLowRiskCount() {
            return this.lowRiskCount;
        }

        /**
         * @return middleRiskCount
         */
        public Long getMiddleRiskCount() {
            return this.middleRiskCount;
        }

        /**
         * @return riskCount
         */
        public Long getRiskCount() {
            return this.riskCount;
        }

        public static final class Builder {
            private String beginDate; 
            private String endDate; 
            private Long highRiskCount; 
            private Long lowRiskCount; 
            private Long middleRiskCount; 
            private Long riskCount; 

            private Builder() {
            } 

            private Builder(TimeList model) {
                this.beginDate = model.beginDate;
                this.endDate = model.endDate;
                this.highRiskCount = model.highRiskCount;
                this.lowRiskCount = model.lowRiskCount;
                this.middleRiskCount = model.middleRiskCount;
                this.riskCount = model.riskCount;
            } 

            /**
             * BeginDate.
             */
            public Builder beginDate(String beginDate) {
                this.beginDate = beginDate;
                return this;
            }

            /**
             * EndDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * HighRiskCount.
             */
            public Builder highRiskCount(Long highRiskCount) {
                this.highRiskCount = highRiskCount;
                return this;
            }

            /**
             * LowRiskCount.
             */
            public Builder lowRiskCount(Long lowRiskCount) {
                this.lowRiskCount = lowRiskCount;
                return this;
            }

            /**
             * MiddleRiskCount.
             */
            public Builder middleRiskCount(Long middleRiskCount) {
                this.middleRiskCount = middleRiskCount;
                return this;
            }

            /**
             * RiskCount.
             */
            public Builder riskCount(Long riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            public TimeList build() {
                return new TimeList(this);
            } 

        } 

    }
}
