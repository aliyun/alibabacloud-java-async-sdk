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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeFaultDiagnosisOverallDataResponseBody model) {
            this.metricData = model.metricData;
            this.overallData = model.overallData;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The exception metric data.</p>
         */
        public Builder metricData(MetricData metricData) {
            this.metricData = metricData;
            return this;
        }

        /**
         * <p>The list of overview data for exception diagnostics.</p>
         */
        public Builder overallData(OverallData overallData) {
            this.overallData = overallData;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
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

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.ext = model.ext;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>The extended properties, where ratio indicates the proportion of abnormal users per unit time and totalCount indicates the total number of users per unit time.</p>
             */
            public Builder ext(java.util.Map<String, ?> ext) {
                this.ext = ext;
                return this;
            }

            /**
             * <p>The x-axis coordinate in the metric trends chart. The unit of time is 1 minute.</p>
             * 
             * <strong>example:</strong>
             * <p>1615824000</p>
             */
            public Builder x(String x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The y-axis coordinate in the metric trends chart.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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

            private Builder() {
            } 

            private Builder(MetricData model) {
                this.nodes = model.nodes;
            } 

            /**
             * <p>The list of coordinate points for the metric trends chart.</p>
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

            private Builder() {
            } 

            private Builder(OverallData model) {
                this.faultUserCount = model.faultUserCount;
                this.faultUserRatio = model.faultUserRatio;
                this.totalUserCount = model.totalUserCount;
            } 

            /**
             * <p>The number of abnormal user visits or abnormal users.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder faultUserCount(Integer faultUserCount) {
                this.faultUserCount = faultUserCount;
                return this;
            }

            /**
             * <p>The total proportion of abnormal users.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder faultUserRatio(Float faultUserRatio) {
                this.faultUserRatio = faultUserRatio;
                return this;
            }

            /**
             * <p>The total number of user visits or total users.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
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
