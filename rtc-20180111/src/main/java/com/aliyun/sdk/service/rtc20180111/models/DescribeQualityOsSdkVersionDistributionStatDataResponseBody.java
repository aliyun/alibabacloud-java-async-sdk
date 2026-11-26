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
 * {@link DescribeQualityOsSdkVersionDistributionStatDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeQualityOsSdkVersionDistributionStatDataResponseBody</p>
 */
public class DescribeQualityOsSdkVersionDistributionStatDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QualityOsSdkVersionStatDataList")
    private java.util.List<QualityOsSdkVersionStatDataList> qualityOsSdkVersionStatDataList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeQualityOsSdkVersionDistributionStatDataResponseBody(Builder builder) {
        this.qualityOsSdkVersionStatDataList = builder.qualityOsSdkVersionStatDataList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQualityOsSdkVersionDistributionStatDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return qualityOsSdkVersionStatDataList
     */
    public java.util.List<QualityOsSdkVersionStatDataList> getQualityOsSdkVersionStatDataList() {
        return this.qualityOsSdkVersionStatDataList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<QualityOsSdkVersionStatDataList> qualityOsSdkVersionStatDataList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeQualityOsSdkVersionDistributionStatDataResponseBody model) {
            this.qualityOsSdkVersionStatDataList = model.qualityOsSdkVersionStatDataList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of data for operating systems and SDK versions in quality statistics.</p>
         */
        public Builder qualityOsSdkVersionStatDataList(java.util.List<QualityOsSdkVersionStatDataList> qualityOsSdkVersionStatDataList) {
            this.qualityOsSdkVersionStatDataList = qualityOsSdkVersionStatDataList;
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

        public DescribeQualityOsSdkVersionDistributionStatDataResponseBody build() {
            return new DescribeQualityOsSdkVersionDistributionStatDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeQualityOsSdkVersionDistributionStatDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeQualityOsSdkVersionDistributionStatDataResponseBody</p>
     */
    public static class QualityOsSdkVersionStatDataList extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("VideoDelay")
        private Long videoDelay;

        @com.aliyun.core.annotation.NameInMap("VideoFirstPicDuration")
        private Long videoFirstPicDuration;

        @com.aliyun.core.annotation.NameInMap("VideoHighQualityTransmissionRate")
        private String videoHighQualityTransmissionRate;

        @com.aliyun.core.annotation.NameInMap("VideoStuckRate")
        private String videoStuckRate;

        private QualityOsSdkVersionStatDataList(Builder builder) {
            this.audioDelay = builder.audioDelay;
            this.audioHighQualityTransmissionRate = builder.audioHighQualityTransmissionRate;
            this.audioStuckRate = builder.audioStuckRate;
            this.callDurationRatio = builder.callDurationRatio;
            this.joinChannelSucFiveSecRate = builder.joinChannelSucFiveSecRate;
            this.joinChannelSucRate = builder.joinChannelSucRate;
            this.name = builder.name;
            this.os = builder.os;
            this.videoDelay = builder.videoDelay;
            this.videoFirstPicDuration = builder.videoFirstPicDuration;
            this.videoHighQualityTransmissionRate = builder.videoHighQualityTransmissionRate;
            this.videoStuckRate = builder.videoStuckRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityOsSdkVersionStatDataList create() {
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
         * @return os
         */
        public String getOs() {
            return this.os;
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
            private String os; 
            private Long videoDelay; 
            private Long videoFirstPicDuration; 
            private String videoHighQualityTransmissionRate; 
            private String videoStuckRate; 

            private Builder() {
            } 

            private Builder(QualityOsSdkVersionStatDataList model) {
                this.audioDelay = model.audioDelay;
                this.audioHighQualityTransmissionRate = model.audioHighQualityTransmissionRate;
                this.audioStuckRate = model.audioStuckRate;
                this.callDurationRatio = model.callDurationRatio;
                this.joinChannelSucFiveSecRate = model.joinChannelSucFiveSecRate;
                this.joinChannelSucRate = model.joinChannelSucRate;
                this.name = model.name;
                this.os = model.os;
                this.videoDelay = model.videoDelay;
                this.videoFirstPicDuration = model.videoFirstPicDuration;
                this.videoHighQualityTransmissionRate = model.videoHighQualityTransmissionRate;
                this.videoStuckRate = model.videoStuckRate;
            } 

            /**
             * <p>The audio delay, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>248</p>
             */
            public Builder audioDelay(Long audioDelay) {
                this.audioDelay = audioDelay;
                return this;
            }

            /**
             * <p>The audio high-quality transmission rate, represented by four decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9987</p>
             */
            public Builder audioHighQualityTransmissionRate(String audioHighQualityTransmissionRate) {
                this.audioHighQualityTransmissionRate = audioHighQualityTransmissionRate;
                return this;
            }

            /**
             * <p>The audio stuttering rate, represented by four decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0011</p>
             */
            public Builder audioStuckRate(String audioStuckRate) {
                this.audioStuckRate = audioStuckRate;
                return this;
            }

            /**
             * <p>The call duration ratio, represented by four decimal places. For example, 1.0000 indicates that the call duration ratio is 100%.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0984</p>
             */
            public Builder callDurationRatio(String callDurationRatio) {
                this.callDurationRatio = callDurationRatio;
                return this;
            }

            /**
             * <p>The 5-second channel join success rate, represented by four decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>0.8276</p>
             */
            public Builder joinChannelSucFiveSecRate(String joinChannelSucFiveSecRate) {
                this.joinChannelSucFiveSecRate = joinChannelSucFiveSecRate;
                return this;
            }

            /**
             * <p>The channel join success rate, represented by four decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>0.8276</p>
             */
            public Builder joinChannelSucRate(String joinChannelSucRate) {
                this.joinChannelSucRate = joinChannelSucRate;
                return this;
            }

            /**
             * <p>The SDK version name, such as 1.0.0 or 1.1.1.</p>
             * 
             * <strong>example:</strong>
             * <p>2.1.0.210316.dev--release/rtcsdk_v2.1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The operating system name, such as iOS or Android.</p>
             * 
             * <strong>example:</strong>
             * <p>macOS</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>The video delay, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>333</p>
             */
            public Builder videoDelay(Long videoDelay) {
                this.videoDelay = videoDelay;
                return this;
            }

            /**
             * <p>The first video frame rendering time, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5643</p>
             */
            public Builder videoFirstPicDuration(Long videoFirstPicDuration) {
                this.videoFirstPicDuration = videoFirstPicDuration;
                return this;
            }

            /**
             * <p>The video high-quality transmission rate, represented by four decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9997</p>
             */
            public Builder videoHighQualityTransmissionRate(String videoHighQualityTransmissionRate) {
                this.videoHighQualityTransmissionRate = videoHighQualityTransmissionRate;
                return this;
            }

            /**
             * <p>The video stuttering rate, represented by four decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0054</p>
             */
            public Builder videoStuckRate(String videoStuckRate) {
                this.videoStuckRate = videoStuckRate;
                return this;
            }

            public QualityOsSdkVersionStatDataList build() {
                return new QualityOsSdkVersionStatDataList(this);
            } 

        } 

    }
}
