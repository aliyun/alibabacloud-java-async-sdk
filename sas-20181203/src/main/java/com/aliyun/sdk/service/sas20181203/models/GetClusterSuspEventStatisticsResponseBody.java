// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterSuspEventStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterSuspEventStatisticsResponseBody</p>
 */
public class GetClusterSuspEventStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuspStatistics")
    private SuspStatistics suspStatistics;

    private GetClusterSuspEventStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.suspStatistics = builder.suspStatistics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterSuspEventStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return suspStatistics
     */
    public SuspStatistics getSuspStatistics() {
        return this.suspStatistics;
    }

    public static final class Builder {
        private String requestId; 
        private SuspStatistics suspStatistics; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of alerts by risk level.
         */
        public Builder suspStatistics(SuspStatistics suspStatistics) {
            this.suspStatistics = suspStatistics;
            return this;
        }

        public GetClusterSuspEventStatisticsResponseBody build() {
            return new GetClusterSuspEventStatisticsResponseBody(this);
        } 

    } 

    public static class SuspStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Remind")
        private Integer remind;

        @com.aliyun.core.annotation.NameInMap("Serious")
        private Integer serious;

        @com.aliyun.core.annotation.NameInMap("Suspicious")
        private Integer suspicious;

        private SuspStatistics(Builder builder) {
            this.remind = builder.remind;
            this.serious = builder.serious;
            this.suspicious = builder.suspicious;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuspStatistics create() {
            return builder().build();
        }

        /**
         * @return remind
         */
        public Integer getRemind() {
            return this.remind;
        }

        /**
         * @return serious
         */
        public Integer getSerious() {
            return this.serious;
        }

        /**
         * @return suspicious
         */
        public Integer getSuspicious() {
            return this.suspicious;
        }

        public static final class Builder {
            private Integer remind; 
            private Integer serious; 
            private Integer suspicious; 

            /**
             * The number of alerts whose Emergency level is Reminder.
             */
            public Builder remind(Integer remind) {
                this.remind = remind;
                return this;
            }

            /**
             * The number of alerts whose Emergency level is Urgent.
             */
            public Builder serious(Integer serious) {
                this.serious = serious;
                return this;
            }

            /**
             * The number of alerts whose Emergency level is Suspicious.
             */
            public Builder suspicious(Integer suspicious) {
                this.suspicious = suspicious;
                return this;
            }

            public SuspStatistics build() {
                return new SuspStatistics(this);
            } 

        } 

    }
}
