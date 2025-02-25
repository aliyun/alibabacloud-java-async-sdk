// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssIncrementOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOssIncrementOverviewResponseBody</p>
 */
public class DescribeOssIncrementOverviewResponseBody extends TeaModel {
    @NameInMap("AdUnhandleCount")
    private Integer adUnhandleCount;

    @NameInMap("AudioCount")
    private Integer audioCount;

    @NameInMap("ImageCount")
    private Integer imageCount;

    @NameInMap("LiveUnhandleCount")
    private Integer liveUnhandleCount;

    @NameInMap("PornUnhandleCount")
    private Integer pornUnhandleCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TerrorismUnhandleCount")
    private Integer terrorismUnhandleCount;

    @NameInMap("VideoCount")
    private Integer videoCount;

    @NameInMap("VideoFrameCount")
    private Integer videoFrameCount;

    @NameInMap("VoiceAntispamUnhandleCount")
    private Integer voiceAntispamUnhandleCount;

    private DescribeOssIncrementOverviewResponseBody(Builder builder) {
        this.adUnhandleCount = builder.adUnhandleCount;
        this.audioCount = builder.audioCount;
        this.imageCount = builder.imageCount;
        this.liveUnhandleCount = builder.liveUnhandleCount;
        this.pornUnhandleCount = builder.pornUnhandleCount;
        this.requestId = builder.requestId;
        this.terrorismUnhandleCount = builder.terrorismUnhandleCount;
        this.videoCount = builder.videoCount;
        this.videoFrameCount = builder.videoFrameCount;
        this.voiceAntispamUnhandleCount = builder.voiceAntispamUnhandleCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssIncrementOverviewResponseBody create() {
        return builder().build();
    }

    /**
     * @return adUnhandleCount
     */
    public Integer getAdUnhandleCount() {
        return this.adUnhandleCount;
    }

    /**
     * @return audioCount
     */
    public Integer getAudioCount() {
        return this.audioCount;
    }

    /**
     * @return imageCount
     */
    public Integer getImageCount() {
        return this.imageCount;
    }

    /**
     * @return liveUnhandleCount
     */
    public Integer getLiveUnhandleCount() {
        return this.liveUnhandleCount;
    }

    /**
     * @return pornUnhandleCount
     */
    public Integer getPornUnhandleCount() {
        return this.pornUnhandleCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return terrorismUnhandleCount
     */
    public Integer getTerrorismUnhandleCount() {
        return this.terrorismUnhandleCount;
    }

    /**
     * @return videoCount
     */
    public Integer getVideoCount() {
        return this.videoCount;
    }

    /**
     * @return videoFrameCount
     */
    public Integer getVideoFrameCount() {
        return this.videoFrameCount;
    }

    /**
     * @return voiceAntispamUnhandleCount
     */
    public Integer getVoiceAntispamUnhandleCount() {
        return this.voiceAntispamUnhandleCount;
    }

    public static final class Builder {
        private Integer adUnhandleCount; 
        private Integer audioCount; 
        private Integer imageCount; 
        private Integer liveUnhandleCount; 
        private Integer pornUnhandleCount; 
        private String requestId; 
        private Integer terrorismUnhandleCount; 
        private Integer videoCount; 
        private Integer videoFrameCount; 
        private Integer voiceAntispamUnhandleCount; 

        /**
         * AdUnhandleCount.
         */
        public Builder adUnhandleCount(Integer adUnhandleCount) {
            this.adUnhandleCount = adUnhandleCount;
            return this;
        }

        /**
         * AudioCount.
         */
        public Builder audioCount(Integer audioCount) {
            this.audioCount = audioCount;
            return this;
        }

        /**
         * ImageCount.
         */
        public Builder imageCount(Integer imageCount) {
            this.imageCount = imageCount;
            return this;
        }

        /**
         * LiveUnhandleCount.
         */
        public Builder liveUnhandleCount(Integer liveUnhandleCount) {
            this.liveUnhandleCount = liveUnhandleCount;
            return this;
        }

        /**
         * PornUnhandleCount.
         */
        public Builder pornUnhandleCount(Integer pornUnhandleCount) {
            this.pornUnhandleCount = pornUnhandleCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TerrorismUnhandleCount.
         */
        public Builder terrorismUnhandleCount(Integer terrorismUnhandleCount) {
            this.terrorismUnhandleCount = terrorismUnhandleCount;
            return this;
        }

        /**
         * VideoCount.
         */
        public Builder videoCount(Integer videoCount) {
            this.videoCount = videoCount;
            return this;
        }

        /**
         * VideoFrameCount.
         */
        public Builder videoFrameCount(Integer videoFrameCount) {
            this.videoFrameCount = videoFrameCount;
            return this;
        }

        /**
         * VoiceAntispamUnhandleCount.
         */
        public Builder voiceAntispamUnhandleCount(Integer voiceAntispamUnhandleCount) {
            this.voiceAntispamUnhandleCount = voiceAntispamUnhandleCount;
            return this;
        }

        public DescribeOssIncrementOverviewResponseBody build() {
            return new DescribeOssIncrementOverviewResponseBody(this);
        } 

    } 

}
