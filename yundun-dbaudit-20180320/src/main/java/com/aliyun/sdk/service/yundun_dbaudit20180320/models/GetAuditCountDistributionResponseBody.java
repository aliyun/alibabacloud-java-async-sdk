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
 * {@link GetAuditCountDistributionResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuditCountDistributionResponseBody</p>
 */
public class GetAuditCountDistributionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TimeList")
    private java.util.List<TimeList> timeList;

    private GetAuditCountDistributionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.timeList = builder.timeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuditCountDistributionResponseBody create() {
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

        private Builder(GetAuditCountDistributionResponseBody model) {
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

        public GetAuditCountDistributionResponseBody build() {
            return new GetAuditCountDistributionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAuditCountDistributionResponseBody} extends {@link TeaModel}
     *
     * <p>GetAuditCountDistributionResponseBody</p>
     */
    public static class TimeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginDate")
        private String beginDate;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("RiskCount")
        private Long riskCount;

        @com.aliyun.core.annotation.NameInMap("SessionCount")
        private Long sessionCount;

        @com.aliyun.core.annotation.NameInMap("SqlCount")
        private Long sqlCount;

        private TimeList(Builder builder) {
            this.beginDate = builder.beginDate;
            this.endDate = builder.endDate;
            this.riskCount = builder.riskCount;
            this.sessionCount = builder.sessionCount;
            this.sqlCount = builder.sqlCount;
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
         * @return riskCount
         */
        public Long getRiskCount() {
            return this.riskCount;
        }

        /**
         * @return sessionCount
         */
        public Long getSessionCount() {
            return this.sessionCount;
        }

        /**
         * @return sqlCount
         */
        public Long getSqlCount() {
            return this.sqlCount;
        }

        public static final class Builder {
            private String beginDate; 
            private String endDate; 
            private Long riskCount; 
            private Long sessionCount; 
            private Long sqlCount; 

            private Builder() {
            } 

            private Builder(TimeList model) {
                this.beginDate = model.beginDate;
                this.endDate = model.endDate;
                this.riskCount = model.riskCount;
                this.sessionCount = model.sessionCount;
                this.sqlCount = model.sqlCount;
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
             * RiskCount.
             */
            public Builder riskCount(Long riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * SessionCount.
             */
            public Builder sessionCount(Long sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            /**
             * SqlCount.
             */
            public Builder sqlCount(Long sqlCount) {
                this.sqlCount = sqlCount;
                return this;
            }

            public TimeList build() {
                return new TimeList(this);
            } 

        } 

    }
}
