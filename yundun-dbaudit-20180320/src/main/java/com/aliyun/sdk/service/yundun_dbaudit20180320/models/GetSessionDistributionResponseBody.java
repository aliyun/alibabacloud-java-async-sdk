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
 * {@link GetSessionDistributionResponseBody} extends {@link TeaModel}
 *
 * <p>GetSessionDistributionResponseBody</p>
 */
public class GetSessionDistributionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TimeList")
    private java.util.List<TimeList> timeList;

    private GetSessionDistributionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.timeList = builder.timeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSessionDistributionResponseBody create() {
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

        private Builder(GetSessionDistributionResponseBody model) {
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

        public GetSessionDistributionResponseBody build() {
            return new GetSessionDistributionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSessionDistributionResponseBody} extends {@link TeaModel}
     *
     * <p>GetSessionDistributionResponseBody</p>
     */
    public static class TimeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveSessionCount")
        private Long activeSessionCount;

        @com.aliyun.core.annotation.NameInMap("BeginDate")
        private String beginDate;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("ErrorSessionCount")
        private Long errorSessionCount;

        @com.aliyun.core.annotation.NameInMap("LoginSessionCount")
        private Long loginSessionCount;

        private TimeList(Builder builder) {
            this.activeSessionCount = builder.activeSessionCount;
            this.beginDate = builder.beginDate;
            this.endDate = builder.endDate;
            this.errorSessionCount = builder.errorSessionCount;
            this.loginSessionCount = builder.loginSessionCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeList create() {
            return builder().build();
        }

        /**
         * @return activeSessionCount
         */
        public Long getActiveSessionCount() {
            return this.activeSessionCount;
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
         * @return errorSessionCount
         */
        public Long getErrorSessionCount() {
            return this.errorSessionCount;
        }

        /**
         * @return loginSessionCount
         */
        public Long getLoginSessionCount() {
            return this.loginSessionCount;
        }

        public static final class Builder {
            private Long activeSessionCount; 
            private String beginDate; 
            private String endDate; 
            private Long errorSessionCount; 
            private Long loginSessionCount; 

            private Builder() {
            } 

            private Builder(TimeList model) {
                this.activeSessionCount = model.activeSessionCount;
                this.beginDate = model.beginDate;
                this.endDate = model.endDate;
                this.errorSessionCount = model.errorSessionCount;
                this.loginSessionCount = model.loginSessionCount;
            } 

            /**
             * ActiveSessionCount.
             */
            public Builder activeSessionCount(Long activeSessionCount) {
                this.activeSessionCount = activeSessionCount;
                return this;
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
             * ErrorSessionCount.
             */
            public Builder errorSessionCount(Long errorSessionCount) {
                this.errorSessionCount = errorSessionCount;
                return this;
            }

            /**
             * LoginSessionCount.
             */
            public Builder loginSessionCount(Long loginSessionCount) {
                this.loginSessionCount = loginSessionCount;
                return this;
            }

            public TimeList build() {
                return new TimeList(this);
            } 

        } 

    }
}
