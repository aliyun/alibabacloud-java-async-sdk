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
 * {@link DescribeChannelOverallDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChannelOverallDataResponseBody</p>
 */
public class DescribeChannelOverallDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallInfo")
    private CallInfo callInfo;

    @com.aliyun.core.annotation.NameInMap("MetricDatas")
    private java.util.List<MetricDatas> metricDatas;

    @com.aliyun.core.annotation.NameInMap("OverallData")
    private OverallData overallData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeChannelOverallDataResponseBody(Builder builder) {
        this.callInfo = builder.callInfo;
        this.metricDatas = builder.metricDatas;
        this.overallData = builder.overallData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChannelOverallDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callInfo
     */
    public CallInfo getCallInfo() {
        return this.callInfo;
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
        private CallInfo callInfo; 
        private java.util.List<MetricDatas> metricDatas; 
        private OverallData overallData; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeChannelOverallDataResponseBody model) {
            this.callInfo = model.callInfo;
            this.metricDatas = model.metricDatas;
            this.overallData = model.overallData;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Basic communication information.</p>
         */
        public Builder callInfo(CallInfo callInfo) {
            this.callInfo = callInfo;
            return this;
        }

        /**
         * <p>List of metric data.</p>
         */
        public Builder metricDatas(java.util.List<MetricDatas> metricDatas) {
            this.metricDatas = metricDatas;
            return this;
        }

        /**
         * <p>Overview data.</p>
         */
        public Builder overallData(OverallData overallData) {
            this.overallData = overallData;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeChannelOverallDataResponseBody build() {
            return new DescribeChannelOverallDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeChannelOverallDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChannelOverallDataResponseBody</p>
     */
    public static class CallInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CallStatus")
        private String callStatus;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("CreatedTs")
        private Long createdTs;

        @com.aliyun.core.annotation.NameInMap("DestroyedTs")
        private Long destroyedTs;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        private CallInfo(Builder builder) {
            this.appId = builder.appId;
            this.callStatus = builder.callStatus;
            this.channelId = builder.channelId;
            this.createdTs = builder.createdTs;
            this.destroyedTs = builder.destroyedTs;
            this.duration = builder.duration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallInfo create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return callStatus
         */
        public String getCallStatus() {
            return this.callStatus;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return createdTs
         */
        public Long getCreatedTs() {
            return this.createdTs;
        }

        /**
         * @return destroyedTs
         */
        public Long getDestroyedTs() {
            return this.destroyedTs;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        public static final class Builder {
            private String appId; 
            private String callStatus; 
            private String channelId; 
            private Long createdTs; 
            private Long destroyedTs; 
            private Long duration; 

            private Builder() {
            } 

            private Builder(CallInfo model) {
                this.appId = model.appId;
                this.callStatus = model.callStatus;
                this.channelId = model.channelId;
                this.createdTs = model.createdTs;
                this.destroyedTs = model.destroyedTs;
                this.duration = model.duration;
            } 

            /**
             * <p>Application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rjdhtnqy</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>Communication status. Valid values:  </p>
             * <ul>
             * <li><p><strong>IN</strong>: In progress.  </p>
             * </li>
             * <li><p><strong>OUT</strong>: Ended.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IN</p>
             */
            public Builder callStatus(String callStatus) {
                this.callStatus = callStatus;
                return this;
            }

            /**
             * <p>Channel ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>The UNIX timestamp when the channel was created, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1615860711</p>
             */
            public Builder createdTs(Long createdTs) {
                this.createdTs = createdTs;
                return this;
            }

            /**
             * <p>The UNIX timestamp when the channel was released, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1615860811</p>
             */
            public Builder destroyedTs(Long destroyedTs) {
                this.destroyedTs = destroyedTs;
                return this;
            }

            /**
             * <p>Channel duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            public CallInfo build() {
                return new CallInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeChannelOverallDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChannelOverallDataResponseBody</p>
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
             * <p>Extension data.</p>
             */
            public Builder ext(java.util.Map<String, ?> ext) {
                this.ext = ext;
                return this;
            }

            /**
             * <p>X-axis coordinate in the Trend Indicator.</p>
             * 
             * <strong>example:</strong>
             * <p>1612418625</p>
             */
            public Builder x(String x) {
                this.x = x;
                return this;
            }

            /**
             * <p>Y-axis coordinate in the Trend Indicator.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
     * {@link DescribeChannelOverallDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChannelOverallDataResponseBody</p>
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
             * <p>List of coordinate points for the Trend Indicator.</p>
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * <p>Metric Type. Valid values:</p>
             * <ul>
             * <li><strong>CALL_QUALITY</strong>: Call quality.</li>
             * <li><strong>CONN_NUM</strong>: Distribution of time intervals for successful channel joins.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CALL_QUALITY</p>
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
     * {@link DescribeChannelOverallDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChannelOverallDataResponseBody</p>
     */
    public static class OverallData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnAvgTime")
        private Float connAvgTime;

        @com.aliyun.core.annotation.NameInMap("FiveSecJoinRate")
        private Float fiveSecJoinRate;

        @com.aliyun.core.annotation.NameInMap("TotalAudioStuckRate")
        private Float totalAudioStuckRate;

        @com.aliyun.core.annotation.NameInMap("TotalVideoStuckRate")
        private Float totalVideoStuckRate;

        @com.aliyun.core.annotation.NameInMap("TotalVideoVagueRate")
        private Float totalVideoVagueRate;

        private OverallData(Builder builder) {
            this.connAvgTime = builder.connAvgTime;
            this.fiveSecJoinRate = builder.fiveSecJoinRate;
            this.totalAudioStuckRate = builder.totalAudioStuckRate;
            this.totalVideoStuckRate = builder.totalVideoStuckRate;
            this.totalVideoVagueRate = builder.totalVideoVagueRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverallData create() {
            return builder().build();
        }

        /**
         * @return connAvgTime
         */
        public Float getConnAvgTime() {
            return this.connAvgTime;
        }

        /**
         * @return fiveSecJoinRate
         */
        public Float getFiveSecJoinRate() {
            return this.fiveSecJoinRate;
        }

        /**
         * @return totalAudioStuckRate
         */
        public Float getTotalAudioStuckRate() {
            return this.totalAudioStuckRate;
        }

        /**
         * @return totalVideoStuckRate
         */
        public Float getTotalVideoStuckRate() {
            return this.totalVideoStuckRate;
        }

        /**
         * @return totalVideoVagueRate
         */
        public Float getTotalVideoVagueRate() {
            return this.totalVideoVagueRate;
        }

        public static final class Builder {
            private Float connAvgTime; 
            private Float fiveSecJoinRate; 
            private Float totalAudioStuckRate; 
            private Float totalVideoStuckRate; 
            private Float totalVideoVagueRate; 

            private Builder() {
            } 

            private Builder(OverallData model) {
                this.connAvgTime = model.connAvgTime;
                this.fiveSecJoinRate = model.fiveSecJoinRate;
                this.totalAudioStuckRate = model.totalAudioStuckRate;
                this.totalVideoStuckRate = model.totalVideoStuckRate;
                this.totalVideoVagueRate = model.totalVideoVagueRate;
            } 

            /**
             * <p>Average communication connection time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder connAvgTime(Float connAvgTime) {
                this.connAvgTime = connAvgTime;
                return this;
            }

            /**
             * <p>Connection success rate within 5 seconds, represented as a decimal. For example, 1.0 indicates a 100% connection success rate.</p>
             * 
             * <strong>example:</strong>
             * <p>0.91</p>
             */
            public Builder fiveSecJoinRate(Float fiveSecJoinRate) {
                this.fiveSecJoinRate = fiveSecJoinRate;
                return this;
            }

            /**
             * <p>Overall audio stuttering rate, represented as a decimal. For example, 0.02 indicates an audio stuttering rate of 2%.</p>
             * 
             * <strong>example:</strong>
             * <p>0.02</p>
             */
            public Builder totalAudioStuckRate(Float totalAudioStuckRate) {
                this.totalAudioStuckRate = totalAudioStuckRate;
                return this;
            }

            /**
             * <p>Overall video stuttering rate, represented as a decimal. For example, 0.02 indicates a video stuttering rate of 2%.</p>
             * 
             * <strong>example:</strong>
             * <p>0.02</p>
             */
            public Builder totalVideoStuckRate(Float totalVideoStuckRate) {
                this.totalVideoStuckRate = totalVideoStuckRate;
                return this;
            }

            /**
             * <p>Overall video blur rate, represented as a decimal. For example, 0.02 indicates a video blur rate of 2%.</p>
             * 
             * <strong>example:</strong>
             * <p>0.02</p>
             */
            public Builder totalVideoVagueRate(Float totalVideoVagueRate) {
                this.totalVideoVagueRate = totalVideoVagueRate;
                return this;
            }

            public OverallData build() {
                return new OverallData(this);
            } 

        } 

    }
}
