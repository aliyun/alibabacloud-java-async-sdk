// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChannelOverallDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChannelOverallDataResponseBody</p>
 */
public class DescribeChannelOverallDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallInfo")
    private CallInfo callInfo;

    @com.aliyun.core.annotation.NameInMap("MetricDatas")
    private java.util.List < MetricDatas> metricDatas;

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

    /**
     * @return callInfo
     */
    public CallInfo getCallInfo() {
        return this.callInfo;
    }

    /**
     * @return metricDatas
     */
    public java.util.List < MetricDatas> getMetricDatas() {
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
        private java.util.List < MetricDatas> metricDatas; 
        private OverallData overallData; 
        private String requestId; 

        /**
         * CallInfo.
         */
        public Builder callInfo(CallInfo callInfo) {
            this.callInfo = callInfo;
            return this;
        }

        /**
         * MetricDatas.
         */
        public Builder metricDatas(java.util.List < MetricDatas> metricDatas) {
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

        public DescribeChannelOverallDataResponseBody build() {
            return new DescribeChannelOverallDataResponseBody(this);
        } 

    } 

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

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CallStatus.
             */
            public Builder callStatus(String callStatus) {
                this.callStatus = callStatus;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * CreatedTs.
             */
            public Builder createdTs(Long createdTs) {
                this.createdTs = createdTs;
                return this;
            }

            /**
             * DestroyedTs.
             */
            public Builder destroyedTs(Long destroyedTs) {
                this.destroyedTs = destroyedTs;
                return this;
            }

            /**
             * Duration.
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
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ext")
        private java.util.Map < String, ? > ext;

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
        public java.util.Map < String, ? > getExt() {
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
            private java.util.Map < String, ? > ext; 
            private String x; 
            private String y; 

            /**
             * Ext.
             */
            public Builder ext(java.util.Map < String, ? > ext) {
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
    public static class MetricDatas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List < Nodes> nodes;

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
        public java.util.List < Nodes> getNodes() {
            return this.nodes;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < Nodes> nodes; 
            private String type; 

            /**
             * Nodes.
             */
            public Builder nodes(java.util.List < Nodes> nodes) {
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

            /**
             * ConnAvgTime.
             */
            public Builder connAvgTime(Float connAvgTime) {
                this.connAvgTime = connAvgTime;
                return this;
            }

            /**
             * FiveSecJoinRate.
             */
            public Builder fiveSecJoinRate(Float fiveSecJoinRate) {
                this.fiveSecJoinRate = fiveSecJoinRate;
                return this;
            }

            /**
             * TotalAudioStuckRate.
             */
            public Builder totalAudioStuckRate(Float totalAudioStuckRate) {
                this.totalAudioStuckRate = totalAudioStuckRate;
                return this;
            }

            /**
             * TotalVideoStuckRate.
             */
            public Builder totalVideoStuckRate(Float totalVideoStuckRate) {
                this.totalVideoStuckRate = totalVideoStuckRate;
                return this;
            }

            /**
             * TotalVideoVagueRate.
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
