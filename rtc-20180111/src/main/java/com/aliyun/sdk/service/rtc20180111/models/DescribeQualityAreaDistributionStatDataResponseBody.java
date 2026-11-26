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
 * {@link DescribeQualityAreaDistributionStatDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeQualityAreaDistributionStatDataResponseBody</p>
 */
public class DescribeQualityAreaDistributionStatDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QualityStatDataList")
    private java.util.List<QualityStatDataList> qualityStatDataList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeQualityAreaDistributionStatDataResponseBody(Builder builder) {
        this.qualityStatDataList = builder.qualityStatDataList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQualityAreaDistributionStatDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return qualityStatDataList
     */
    public java.util.List<QualityStatDataList> getQualityStatDataList() {
        return this.qualityStatDataList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<QualityStatDataList> qualityStatDataList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeQualityAreaDistributionStatDataResponseBody model) {
            this.qualityStatDataList = model.qualityStatDataList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of quality distribution data.</p>
         */
        public Builder qualityStatDataList(java.util.List<QualityStatDataList> qualityStatDataList) {
            this.qualityStatDataList = qualityStatDataList;
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

        public DescribeQualityAreaDistributionStatDataResponseBody build() {
            return new DescribeQualityAreaDistributionStatDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeQualityAreaDistributionStatDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeQualityAreaDistributionStatDataResponseBody</p>
     */
    public static class QualityStatDataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioDelay")
        private Long audioDelay;

        @com.aliyun.core.annotation.NameInMap("AudioHighQualityTransmissionRate")
        private String audioHighQualityTransmissionRate;

        @com.aliyun.core.annotation.NameInMap("AudioStuckRate")
        private String audioStuckRate;

        @com.aliyun.core.annotation.NameInMap("CallDurationRatio")
        private String callDurationRatio;

        @com.aliyun.core.annotation.NameInMap("JoinChannelSucFiveSecRate")
        private String joinChannelSucFiveSecRate;

        @com.aliyun.core.annotation.NameInMap("JoinChannelSucRate")
        private String joinChannelSucRate;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("VideoDelay")
        private Long videoDelay;

        @com.aliyun.core.annotation.NameInMap("VideoFirstPicDuration")
        private Long videoFirstPicDuration;

        @com.aliyun.core.annotation.NameInMap("VideoHighQualityTransmissionRate")
        private String videoHighQualityTransmissionRate;

        @com.aliyun.core.annotation.NameInMap("VideoStuckRate")
        private String videoStuckRate;

        private QualityStatDataList(Builder builder) {
            this.audioDelay = builder.audioDelay;
            this.audioHighQualityTransmissionRate = builder.audioHighQualityTransmissionRate;
            this.audioStuckRate = builder.audioStuckRate;
            this.callDurationRatio = builder.callDurationRatio;
            this.joinChannelSucFiveSecRate = builder.joinChannelSucFiveSecRate;
            this.joinChannelSucRate = builder.joinChannelSucRate;
            this.name = builder.name;
            this.videoDelay = builder.videoDelay;
            this.videoFirstPicDuration = builder.videoFirstPicDuration;
            this.videoHighQualityTransmissionRate = builder.videoHighQualityTransmissionRate;
            this.videoStuckRate = builder.videoStuckRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityStatDataList create() {
            return builder().build();
        }

        /**
         * @return audioDelay
         */
        public Long getAudioDelay() {
            return this.audioDelay;
        }

        /**
         * @return audioHighQualityTransmissionRate
         */
        public String getAudioHighQualityTransmissionRate() {
            return this.audioHighQualityTransmissionRate;
        }

        /**
         * @return audioStuckRate
         */
        public String getAudioStuckRate() {
            return this.audioStuckRate;
        }

        /**
         * @return callDurationRatio
         */
        public String getCallDurationRatio() {
            return this.callDurationRatio;
        }

        /**
         * @return joinChannelSucFiveSecRate
         */
        public String getJoinChannelSucFiveSecRate() {
            return this.joinChannelSucFiveSecRate;
        }

        /**
         * @return joinChannelSucRate
         */
        public String getJoinChannelSucRate() {
            return this.joinChannelSucRate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return videoDelay
         */
        public Long getVideoDelay() {
            return this.videoDelay;
        }

        /**
         * @return videoFirstPicDuration
         */
        public Long getVideoFirstPicDuration() {
            return this.videoFirstPicDuration;
        }

        /**
         * @return videoHighQualityTransmissionRate
         */
        public String getVideoHighQualityTransmissionRate() {
            return this.videoHighQualityTransmissionRate;
        }

        /**
         * @return videoStuckRate
         */
        public String getVideoStuckRate() {
            return this.videoStuckRate;
        }

        public static final class Builder {
            private Long audioDelay; 
            private String audioHighQualityTransmissionRate; 
            private String audioStuckRate; 
            private String callDurationRatio; 
            private String joinChannelSucFiveSecRate; 
            private String joinChannelSucRate; 
            private String name; 
            private Long videoDelay; 
            private Long videoFirstPicDuration; 
            private String videoHighQualityTransmissionRate; 
            private String videoStuckRate; 

            private Builder() {
            } 

            private Builder(QualityStatDataList model) {
                this.audioDelay = model.audioDelay;
                this.audioHighQualityTransmissionRate = model.audioHighQualityTransmissionRate;
                this.audioStuckRate = model.audioStuckRate;
                this.callDurationRatio = model.callDurationRatio;
                this.joinChannelSucFiveSecRate = model.joinChannelSucFiveSecRate;
                this.joinChannelSucRate = model.joinChannelSucRate;
                this.name = model.name;
                this.videoDelay = model.videoDelay;
                this.videoFirstPicDuration = model.videoFirstPicDuration;
                this.videoHighQualityTransmissionRate = model.videoHighQualityTransmissionRate;
                this.videoStuckRate = model.videoStuckRate;
            } 

            /**
             * <p>The audio delay, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>347</p>
             */
            public Builder audioDelay(Long audioDelay) {
                this.audioDelay = audioDelay;
                return this;
            }

            /**
             * <p>The high-quality transmission rate of audio, represented by a four-decimal number.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9933</p>
             */
            public Builder audioHighQualityTransmissionRate(String audioHighQualityTransmissionRate) {
                this.audioHighQualityTransmissionRate = audioHighQualityTransmissionRate;
                return this;
            }

            /**
             * <p>The audio stuttering rate, represented by a four-decimal number.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0021</p>
             */
            public Builder audioStuckRate(String audioStuckRate) {
                this.audioStuckRate = audioStuckRate;
                return this;
            }

            /**
             * <p>The ratio of the call duration, represented by a four-decimal number. For example, 1.0000 indicates that the call duration ratio is 100%.</p>
             * 
             * <strong>example:</strong>
             * <p>0.6654</p>
             */
            public Builder callDurationRatio(String callDurationRatio) {
                this.callDurationRatio = callDurationRatio;
                return this;
            }

            /**
             * <p>The success rate of joining a channel within 5 seconds, represented by a four-decimal number.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9338</p>
             */
            public Builder joinChannelSucFiveSecRate(String joinChannelSucFiveSecRate) {
                this.joinChannelSucFiveSecRate = joinChannelSucFiveSecRate;
                return this;
            }

            /**
             * <p>The success rate of joining a channel, represented by a four-decimal number.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9356</p>
             */
            public Builder joinChannelSucRate(String joinChannelSucRate) {
                this.joinChannelSucRate = joinChannelSucRate;
                return this;
            }

            /**
             * <p>The name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>China_Zhejiang Province</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The video delay, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>291</p>
             */
            public Builder videoDelay(Long videoDelay) {
                this.videoDelay = videoDelay;
                return this;
            }

            /**
             * <p>The time taken to render the first video frame, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1363</p>
             */
            public Builder videoFirstPicDuration(Long videoFirstPicDuration) {
                this.videoFirstPicDuration = videoFirstPicDuration;
                return this;
            }

            /**
             * <p>The high-quality transmission rate of video, represented by a four-decimal number.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9967</p>
             */
            public Builder videoHighQualityTransmissionRate(String videoHighQualityTransmissionRate) {
                this.videoHighQualityTransmissionRate = videoHighQualityTransmissionRate;
                return this;
            }

            /**
             * <p>The video stuttering rate, represented by a four-decimal number.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0058</p>
             */
            public Builder videoStuckRate(String videoStuckRate) {
                this.videoStuckRate = videoStuckRate;
                return this;
            }

            public QualityStatDataList build() {
                return new QualityStatDataList(this);
            } 

        } 

    }
}
