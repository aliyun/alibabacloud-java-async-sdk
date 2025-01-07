// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DescribeFaultDiagnosisOverallDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFaultDiagnosisOverallDataResponseBody</p>
 */
public class DescribeFaultDiagnosisOverallDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MetricData")
    private MetricData metricData;

    @com.aliyun.core.annotation.NameInMap("OverallData")
    private OverallData overallData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeFaultDiagnosisOverallDataResponseBody(Builder builder) {
        this.metricData = builder.metricData;
        this.overallData = builder.overallData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFaultDiagnosisOverallDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return metricData
     */
    public MetricData getMetricData() {
        return this.metricData;
    }

    /**
     * @return overallData
     */
    public OverallData getOverallData() {
        return this.overallData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MetricData metricData; 
        private OverallData overallData; 
        private String requestId; 

        /**
         * MetricData.
         */
        public Builder metricData(MetricData metricData) {
            this.metricData = metricData;
            return this;
        }

        /**
         * OverallData.
         */
        public Builder overallData(OverallData overallData) {
            this.overallData = overallData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFaultDiagnosisOverallDataResponseBody build() {
            return new DescribeFaultDiagnosisOverallDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFaultDiagnosisOverallDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFaultDiagnosisOverallDataResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ext")
        private java.util.Map<String, ?> ext;

        @com.aliyun.core.annotation.NameInMap("X")
        private String x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private String y;

        private Nodes(Builder builder) {
            this.ext = builder.ext;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return ext
         */
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

        /**
         * @return x
         */
        public String getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public String getY() {
            return this.y;
        }

        public static final class Builder {
            private java.util.Map<String, ?> ext; 
            private String x; 
            private String y; 

            /**
             * Ext.
             */
            public Builder ext(java.util.Map<String, ?> ext) {
                this.ext = ext;
                return this;
            }

            /**
             * X.
             */
            public Builder x(String x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(String y) {
                this.y = y;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFaultDiagnosisOverallDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFaultDiagnosisOverallDataResponseBody</p>
     */
    public static class MetricData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<Nodes> nodes;

        private MetricData(Builder builder) {
            this.nodes = builder.nodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricData create() {
            return builder().build();
        }

        /**
         * @return nodes
         */
        public java.util.List<Nodes> getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private java.util.List<Nodes> nodes; 

            /**
             * Nodes.
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            public MetricData build() {
                return new MetricData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFaultDiagnosisOverallDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFaultDiagnosisOverallDataResponseBody</p>
     */
    public static class OverallData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaultUserCount")
        private Integer faultUserCount;

        @com.aliyun.core.annotation.NameInMap("FaultUserRatio")
        private Float faultUserRatio;

        @com.aliyun.core.annotation.NameInMap("TotalUserCount")
        private Integer totalUserCount;

        private OverallData(Builder builder) {
            this.faultUserCount = builder.faultUserCount;
            this.faultUserRatio = builder.faultUserRatio;
            this.totalUserCount = builder.totalUserCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverallData create() {
            return builder().build();
        }

        /**
         * @return faultUserCount
         */
        public Integer getFaultUserCount() {
            return this.faultUserCount;
        }

        /**
         * @return faultUserRatio
         */
        public Float getFaultUserRatio() {
            return this.faultUserRatio;
        }

        /**
         * @return totalUserCount
         */
        public Integer getTotalUserCount() {
            return this.totalUserCount;
        }

        public static final class Builder {
            private Integer faultUserCount; 
            private Float faultUserRatio; 
            private Integer totalUserCount; 

            /**
             * FaultUserCount.
             */
            public Builder faultUserCount(Integer faultUserCount) {
                this.faultUserCount = faultUserCount;
                return this;
            }

            /**
             * FaultUserRatio.
             */
            public Builder faultUserRatio(Float faultUserRatio) {
                this.faultUserRatio = faultUserRatio;
                return this;
            }

            /**
             * TotalUserCount.
             */
            public Builder totalUserCount(Integer totalUserCount) {
                this.totalUserCount = totalUserCount;
                return this;
            }

            public OverallData build() {
                return new OverallData(this);
            } 

        } 

    }
}
