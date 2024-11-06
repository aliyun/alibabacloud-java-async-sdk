// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
    private java.util.List < QualityOsSdkVersionStatDataList> qualityOsSdkVersionStatDataList;

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

    /**
     * @return qualityOsSdkVersionStatDataList
     */
    public java.util.List < QualityOsSdkVersionStatDataList> getQualityOsSdkVersionStatDataList() {
        return this.qualityOsSdkVersionStatDataList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < QualityOsSdkVersionStatDataList> qualityOsSdkVersionStatDataList; 
        private String requestId; 

        /**
         * QualityOsSdkVersionStatDataList.
         */
        public Builder qualityOsSdkVersionStatDataList(java.util.List < QualityOsSdkVersionStatDataList> qualityOsSdkVersionStatDataList) {
            this.qualityOsSdkVersionStatDataList = qualityOsSdkVersionStatDataList;
            return this;
        }

        /**
         * RequestId.
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

            /**
             * AudioDelay.
             */
            public Builder audioDelay(Long audioDelay) {
                this.audioDelay = audioDelay;
                return this;
            }

            /**
             * AudioHighQualityTransmissionRate.
             */
            public Builder audioHighQualityTransmissionRate(String audioHighQualityTransmissionRate) {
                this.audioHighQualityTransmissionRate = audioHighQualityTransmissionRate;
                return this;
            }

            /**
             * AudioStuckRate.
             */
            public Builder audioStuckRate(String audioStuckRate) {
                this.audioStuckRate = audioStuckRate;
                return this;
            }

            /**
             * CallDurationRatio.
             */
            public Builder callDurationRatio(String callDurationRatio) {
                this.callDurationRatio = callDurationRatio;
                return this;
            }

            /**
             * JoinChannelSucFiveSecRate.
             */
            public Builder joinChannelSucFiveSecRate(String joinChannelSucFiveSecRate) {
                this.joinChannelSucFiveSecRate = joinChannelSucFiveSecRate;
                return this;
            }

            /**
             * JoinChannelSucRate.
             */
            public Builder joinChannelSucRate(String joinChannelSucRate) {
                this.joinChannelSucRate = joinChannelSucRate;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Os.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * VideoDelay.
             */
            public Builder videoDelay(Long videoDelay) {
                this.videoDelay = videoDelay;
                return this;
            }

            /**
             * VideoFirstPicDuration.
             */
            public Builder videoFirstPicDuration(Long videoFirstPicDuration) {
                this.videoFirstPicDuration = videoFirstPicDuration;
                return this;
            }

            /**
             * VideoHighQualityTransmissionRate.
             */
            public Builder videoHighQualityTransmissionRate(String videoHighQualityTransmissionRate) {
                this.videoHighQualityTransmissionRate = videoHighQualityTransmissionRate;
                return this;
            }

            /**
             * VideoStuckRate.
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
