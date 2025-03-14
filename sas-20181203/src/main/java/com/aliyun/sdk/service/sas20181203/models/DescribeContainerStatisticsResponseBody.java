// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeContainerStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerStatisticsResponseBody</p>
 */
public class DescribeContainerStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeContainerStatisticsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The alert statistics of container assets.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>21DA46CA-2DCE-4FF6-907D-D5DBBB7518C8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContainerStatisticsResponseBody build() {
            return new DescribeContainerStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeContainerStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerStatisticsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RemindAlarmCount")
        private Integer remindAlarmCount;

        @com.aliyun.core.annotation.NameInMap("SeriousAlarmCount")
        private Integer seriousAlarmCount;

        @com.aliyun.core.annotation.NameInMap("SuspiciousAlarmCount")
        private Integer suspiciousAlarmCount;

        @com.aliyun.core.annotation.NameInMap("TotalAlarmCount")
        private Integer totalAlarmCount;

        @com.aliyun.core.annotation.NameInMap("TotalNode")
        private Integer totalNode;

        @com.aliyun.core.annotation.NameInMap("hasRiskNode")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.remindAlarmCount = model.remindAlarmCount;
                this.seriousAlarmCount = model.seriousAlarmCount;
                this.suspiciousAlarmCount = model.suspiciousAlarmCount;
                this.totalAlarmCount = model.totalAlarmCount;
                this.totalNode = model.totalNode;
                this.hasRiskNode = model.hasRiskNode;
            } 

            /**
             * <p>The number of alerts whose risk level is <strong>Reminder</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder remindAlarmCount(Integer remindAlarmCount) {
                this.remindAlarmCount = remindAlarmCount;
                return this;
            }

            /**
             * <p>The number of alerts whose risk level is <strong>Urgent</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder seriousAlarmCount(Integer seriousAlarmCount) {
                this.seriousAlarmCount = seriousAlarmCount;
                return this;
            }

            /**
             * <p>The number of alerts whose risk level is <strong>Suspicious</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder suspiciousAlarmCount(Integer suspiciousAlarmCount) {
                this.suspiciousAlarmCount = suspiciousAlarmCount;
                return this;
            }

            /**
             * <p>The total number of alerts that are generated in the current container cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder totalAlarmCount(Integer totalAlarmCount) {
                this.totalAlarmCount = totalAlarmCount;
                return this;
            }

            /**
             * <p>The total number of nodes in the current container cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder totalNode(Integer totalNode) {
                this.totalNode = totalNode;
                return this;
            }

            /**
             * <p>The number of nodes on which alerts are generated in the current container cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
