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
 * {@link DescribeChannelUserMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChannelUserMetricsResponseBody</p>
 */
public class DescribeChannelUserMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MetricDatas")
    private java.util.List<MetricDatas> metricDatas;

    @com.aliyun.core.annotation.NameInMap("OverallData")
    private OverallData overallData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeChannelUserMetricsResponseBody(Builder builder) {
        this.metricDatas = builder.metricDatas;
        this.overallData = builder.overallData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChannelUserMetricsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metricDatas
     */
    public java.util.List<MetricDatas> getMetricDatas() {
        return this.metricDatas;
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
        private java.util.List<MetricDatas> metricDatas; 
        private OverallData overallData; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeChannelUserMetricsResponseBody model) {
            this.metricDatas = model.metricDatas;
            this.overallData = model.overallData;
            this.requestId = model.requestId;
        } 

        /**
         * MetricDatas.
         */
        public Builder metricDatas(java.util.List<MetricDatas> metricDatas) {
            this.metricDatas = metricDatas;
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

        public DescribeChannelUserMetricsResponseBody build() {
            return new DescribeChannelUserMetricsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeChannelUserMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChannelUserMetricsResponseBody</p>
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
     * {@link DescribeChannelUserMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChannelUserMetricsResponseBody</p>
     */
    public static class MetricDatas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<Nodes> nodes;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private MetricDatas(Builder builder) {
            this.nodes = builder.nodes;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricDatas create() {
            return builder().build();
        }

        /**
         * @return nodes
         */
        public java.util.List<Nodes> getNodes() {
            return this.nodes;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<Nodes> nodes; 
            private String type; 

            private Builder() {
            } 

            private Builder(MetricDatas model) {
                this.nodes = model.nodes;
                this.type = model.type;
            } 

            /**
             * Nodes.
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MetricDatas build() {
                return new MetricDatas(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeChannelUserMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChannelUserMetricsResponseBody</p>
     */
    public static class OverallData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalBadExpNum")
        private Long totalBadExpNum;

        @com.aliyun.core.annotation.NameInMap("TotalJoinFailNum")
        private Long totalJoinFailNum;

        @com.aliyun.core.annotation.NameInMap("TotalPubUserNum")
        private Long totalPubUserNum;

        @com.aliyun.core.annotation.NameInMap("TotalSubUserNum")
        private Long totalSubUserNum;

        @com.aliyun.core.annotation.NameInMap("TotalUserNum")
        private Long totalUserNum;

        private OverallData(Builder builder) {
            this.totalBadExpNum = builder.totalBadExpNum;
            this.totalJoinFailNum = builder.totalJoinFailNum;
            this.totalPubUserNum = builder.totalPubUserNum;
            this.totalSubUserNum = builder.totalSubUserNum;
            this.totalUserNum = builder.totalUserNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverallData create() {
            return builder().build();
        }

        /**
         * @return totalBadExpNum
         */
        public Long getTotalBadExpNum() {
            return this.totalBadExpNum;
        }

        /**
         * @return totalJoinFailNum
         */
        public Long getTotalJoinFailNum() {
            return this.totalJoinFailNum;
        }

        /**
         * @return totalPubUserNum
         */
        public Long getTotalPubUserNum() {
            return this.totalPubUserNum;
        }

        /**
         * @return totalSubUserNum
         */
        public Long getTotalSubUserNum() {
            return this.totalSubUserNum;
        }

        /**
         * @return totalUserNum
         */
        public Long getTotalUserNum() {
            return this.totalUserNum;
        }

        public static final class Builder {
            private Long totalBadExpNum; 
            private Long totalJoinFailNum; 
            private Long totalPubUserNum; 
            private Long totalSubUserNum; 
            private Long totalUserNum; 

            private Builder() {
            } 

            private Builder(OverallData model) {
                this.totalBadExpNum = model.totalBadExpNum;
                this.totalJoinFailNum = model.totalJoinFailNum;
                this.totalPubUserNum = model.totalPubUserNum;
                this.totalSubUserNum = model.totalSubUserNum;
                this.totalUserNum = model.totalUserNum;
            } 

            /**
             * TotalBadExpNum.
             */
            public Builder totalBadExpNum(Long totalBadExpNum) {
                this.totalBadExpNum = totalBadExpNum;
                return this;
            }

            /**
             * TotalJoinFailNum.
             */
            public Builder totalJoinFailNum(Long totalJoinFailNum) {
                this.totalJoinFailNum = totalJoinFailNum;
                return this;
            }

            /**
             * TotalPubUserNum.
             */
            public Builder totalPubUserNum(Long totalPubUserNum) {
                this.totalPubUserNum = totalPubUserNum;
                return this;
            }

            /**
             * TotalSubUserNum.
             */
            public Builder totalSubUserNum(Long totalSubUserNum) {
                this.totalSubUserNum = totalSubUserNum;
                return this;
            }

            /**
             * TotalUserNum.
             */
            public Builder totalUserNum(Long totalUserNum) {
                this.totalUserNum = totalUserNum;
                return this;
            }

            public OverallData build() {
                return new OverallData(this);
            } 

        } 

    }
}
