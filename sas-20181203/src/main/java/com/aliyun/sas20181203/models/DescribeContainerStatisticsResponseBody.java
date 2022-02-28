// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerStatisticsResponseBody</p>
 */
public class DescribeContainerStatisticsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeContainerStatisticsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContainerStatisticsResponseBody build() {
            return new DescribeContainerStatisticsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("RemindAlarmCount")
        private Integer remindAlarmCount;

        @NameInMap("SeriousAlarmCount")
        private Integer seriousAlarmCount;

        @NameInMap("SuspiciousAlarmCount")
        private Integer suspiciousAlarmCount;

        @NameInMap("TotalAlarmCount")
        private Integer totalAlarmCount;

        @NameInMap("TotalNode")
        private Integer totalNode;

        @NameInMap("hasRiskNode")
        private Integer hasRiskNode;

        private Data(Builder builder) {
            this.remindAlarmCount = builder.remindAlarmCount;
            this.seriousAlarmCount = builder.seriousAlarmCount;
            this.suspiciousAlarmCount = builder.suspiciousAlarmCount;
            this.totalAlarmCount = builder.totalAlarmCount;
            this.totalNode = builder.totalNode;
            this.hasRiskNode = builder.hasRiskNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return remindAlarmCount
         */
        public Integer getRemindAlarmCount() {
            return this.remindAlarmCount;
        }

        /**
         * @return seriousAlarmCount
         */
        public Integer getSeriousAlarmCount() {
            return this.seriousAlarmCount;
        }

        /**
         * @return suspiciousAlarmCount
         */
        public Integer getSuspiciousAlarmCount() {
            return this.suspiciousAlarmCount;
        }

        /**
         * @return totalAlarmCount
         */
        public Integer getTotalAlarmCount() {
            return this.totalAlarmCount;
        }

        /**
         * @return totalNode
         */
        public Integer getTotalNode() {
            return this.totalNode;
        }

        /**
         * @return hasRiskNode
         */
        public Integer getHasRiskNode() {
            return this.hasRiskNode;
        }

        public static final class Builder {
            private Integer remindAlarmCount; 
            private Integer seriousAlarmCount; 
            private Integer suspiciousAlarmCount; 
            private Integer totalAlarmCount; 
            private Integer totalNode; 
            private Integer hasRiskNode; 

            /**
             * RemindAlarmCount.
             */
            public Builder remindAlarmCount(Integer remindAlarmCount) {
                this.remindAlarmCount = remindAlarmCount;
                return this;
            }

            /**
             * SeriousAlarmCount.
             */
            public Builder seriousAlarmCount(Integer seriousAlarmCount) {
                this.seriousAlarmCount = seriousAlarmCount;
                return this;
            }

            /**
             * SuspiciousAlarmCount.
             */
            public Builder suspiciousAlarmCount(Integer suspiciousAlarmCount) {
                this.suspiciousAlarmCount = suspiciousAlarmCount;
                return this;
            }

            /**
             * TotalAlarmCount.
             */
            public Builder totalAlarmCount(Integer totalAlarmCount) {
                this.totalAlarmCount = totalAlarmCount;
                return this;
            }

            /**
             * TotalNode.
             */
            public Builder totalNode(Integer totalNode) {
                this.totalNode = totalNode;
                return this;
            }

            /**
             * hasRiskNode.
             */
            public Builder hasRiskNode(Integer hasRiskNode) {
                this.hasRiskNode = hasRiskNode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
