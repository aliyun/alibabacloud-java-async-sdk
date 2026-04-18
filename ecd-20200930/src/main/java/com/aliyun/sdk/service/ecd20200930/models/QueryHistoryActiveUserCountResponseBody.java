// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link QueryHistoryActiveUserCountResponseBody} extends {@link TeaModel}
 *
 * <p>QueryHistoryActiveUserCountResponseBody</p>
 */
public class QueryHistoryActiveUserCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActiveUserCount")
    private ActiveUserCount activeUserCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryHistoryActiveUserCountResponseBody(Builder builder) {
        this.activeUserCount = builder.activeUserCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryHistoryActiveUserCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activeUserCount
     */
    public ActiveUserCount getActiveUserCount() {
        return this.activeUserCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ActiveUserCount activeUserCount; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryHistoryActiveUserCountResponseBody model) {
            this.activeUserCount = model.activeUserCount;
            this.requestId = model.requestId;
        } 

        /**
         * ActiveUserCount.
         */
        public Builder activeUserCount(ActiveUserCount activeUserCount) {
            this.activeUserCount = activeUserCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryHistoryActiveUserCountResponseBody build() {
            return new QueryHistoryActiveUserCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryHistoryActiveUserCountResponseBody} extends {@link TeaModel}
     *
     * <p>QueryHistoryActiveUserCountResponseBody</p>
     */
    public static class ActiveUserCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DailyActiveUserCount")
        private Integer dailyActiveUserCount;

        @com.aliyun.core.annotation.NameInMap("MonthlyActiveUserCount")
        private Integer monthlyActiveUserCount;

        private ActiveUserCount(Builder builder) {
            this.dailyActiveUserCount = builder.dailyActiveUserCount;
            this.monthlyActiveUserCount = builder.monthlyActiveUserCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActiveUserCount create() {
            return builder().build();
        }

        /**
         * @return dailyActiveUserCount
         */
        public Integer getDailyActiveUserCount() {
            return this.dailyActiveUserCount;
        }

        /**
         * @return monthlyActiveUserCount
         */
        public Integer getMonthlyActiveUserCount() {
            return this.monthlyActiveUserCount;
        }

        public static final class Builder {
            private Integer dailyActiveUserCount; 
            private Integer monthlyActiveUserCount; 

            private Builder() {
            } 

            private Builder(ActiveUserCount model) {
                this.dailyActiveUserCount = model.dailyActiveUserCount;
                this.monthlyActiveUserCount = model.monthlyActiveUserCount;
            } 

            /**
             * DailyActiveUserCount.
             */
            public Builder dailyActiveUserCount(Integer dailyActiveUserCount) {
                this.dailyActiveUserCount = dailyActiveUserCount;
                return this;
            }

            /**
             * MonthlyActiveUserCount.
             */
            public Builder monthlyActiveUserCount(Integer monthlyActiveUserCount) {
                this.monthlyActiveUserCount = monthlyActiveUserCount;
                return this;
            }

            public ActiveUserCount build() {
                return new ActiveUserCount(this);
            } 

        } 

    }
}
