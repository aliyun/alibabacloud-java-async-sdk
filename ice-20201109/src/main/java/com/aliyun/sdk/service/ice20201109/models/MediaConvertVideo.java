// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link MediaConvertVideo} extends {@link TeaModel}
 *
 * <p>MediaConvertVideo</p>
 */
public class MediaConvertVideo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bitrate")
    private Integer bitrate;

    @com.aliyun.core.annotation.NameInMap("Bufsize")
    private Integer bufsize;

    @com.aliyun.core.annotation.NameInMap("Codec")
    private String codec;

    @com.aliyun.core.annotation.NameInMap("Crf")
    private Object crf;

    @com.aliyun.core.annotation.NameInMap("Crop")
    private String crop;

    @com.aliyun.core.annotation.NameInMap("Fps")
    private Object fps;

    @com.aliyun.core.annotation.NameInMap("Gop")
    private Object gop;

    @com.aliyun.core.annotation.NameInMap("Height")
    private Integer height;

    @com.aliyun.core.annotation.NameInMap("LongShortMode")
    private Boolean longShortMode;

    @com.aliyun.core.annotation.NameInMap("MaxFps")
    private Object maxFps;

    @com.aliyun.core.annotation.NameInMap("Maxrate")
    private Integer maxrate;

    @com.aliyun.core.annotation.NameInMap("Pad")
    private String pad;

    @com.aliyun.core.annotation.NameInMap("Profile")
    private String profile;

    @com.aliyun.core.annotation.NameInMap("Qscale")
    private Integer qscale;

    @com.aliyun.core.annotation.NameInMap("Remove")
    private Boolean remove;

    @com.aliyun.core.annotation.NameInMap("ScanMode")
    private String scanMode;

    @com.aliyun.core.annotation.NameInMap("Width")
    private Integer width;

    private MediaConvertVideo(Builder builder) {
        this.bitrate = builder.bitrate;
        this.bufsize = builder.bufsize;
        this.codec = builder.codec;
        this.crf = builder.crf;
        this.crop = builder.crop;
        this.fps = builder.fps;
        this.gop = builder.gop;
        this.height = builder.height;
        this.longShortMode = builder.longShortMode;
        this.maxFps = builder.maxFps;
        this.maxrate = builder.maxrate;
        this.pad = builder.pad;
        this.profile = builder.profile;
        this.qscale = builder.qscale;
        this.remove = builder.remove;
        this.scanMode = builder.scanMode;
        this.width = builder.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MediaConvertVideo create() {
        return builder().build();
    }

    /**
     * @return bitrate
     */
    public Integer getBitrate() {
        return this.bitrate;
    }

    /**
     * @return bufsize
     */
    public Integer getBufsize() {
        return this.bufsize;
    }

    /**
     * @return codec
     */
    public String getCodec() {
        return this.codec;
    }

    /**
     * @return crf
     */
    public Object getCrf() {
        return this.crf;
    }

    /**
     * @return crop
     */
    public String getCrop() {
        return this.crop;
    }

    /**
     * @return fps
     */
    public Object getFps() {
        return this.fps;
    }

    /**
     * @return gop
     */
    public Object getGop() {
        return this.gop;
    }

    /**
     * @return height
     */
    public Integer getHeight() {
        return this.height;
    }

    /**
     * @return longShortMode
     */
    public Boolean getLongShortMode() {
        return this.longShortMode;
    }

    /**
     * @return maxFps
     */
    public Object getMaxFps() {
        return this.maxFps;
    }

    /**
     * @return maxrate
     */
    public Integer getMaxrate() {
        return this.maxrate;
    }

    /**
     * @return pad
     */
    public String getPad() {
        return this.pad;
    }

    /**
     * @return profile
     */
    public String getProfile() {
        return this.profile;
    }

    /**
     * @return qscale
     */
    public Integer getQscale() {
        return this.qscale;
    }

    /**
     * @return remove
     */
    public Boolean getRemove() {
        return this.remove;
    }

    /**
     * @return scanMode
     */
    public String getScanMode() {
        return this.scanMode;
    }

    /**
     * @return width
     */
    public Integer getWidth() {
        return this.width;
    }

    public static final class Builder {
        private Integer bitrate; 
        private Integer bufsize; 
        private String codec; 
        private Object crf; 
        private String crop; 
        private Object fps; 
        private Object gop; 
        private Integer height; 
        private Boolean longShortMode; 
        private Object maxFps; 
        private Integer maxrate; 
        private String pad; 
        private String profile; 
        private Integer qscale; 
        private Boolean remove; 
        private String scanMode; 
        private Integer width; 

        /**
         * Bitrate.
         */
        public Builder bitrate(Integer bitrate) {
            this.bitrate = bitrate;
            return this;
        }

        /**
         * Bufsize.
         */
        public Builder bufsize(Integer bufsize) {
            this.bufsize = bufsize;
            return this;
        }

        /**
         * Codec.
         */
        public Builder codec(String codec) {
            this.codec = codec;
            return this;
        }

        /**
         * Crf.
         */
        public Builder crf(Object crf) {
            this.crf = crf;
            return this;
        }

        /**
         * Crop.
         */
        public Builder crop(String crop) {
            this.crop = crop;
            return this;
        }

        /**
         * Fps.
         */
        public Builder fps(Object fps) {
            this.fps = fps;
            return this;
        }

        /**
         * Gop.
         */
        public Builder gop(Object gop) {
            this.gop = gop;
            return this;
        }

        /**
         * Height.
         */
        public Builder height(Integer height) {
            this.height = height;
            return this;
        }

        /**
         * LongShortMode.
         */
        public Builder longShortMode(Boolean longShortMode) {
            this.longShortMode = longShortMode;
            return this;
        }

        /**
         * MaxFps.
         */
        public Builder maxFps(Object maxFps) {
            this.maxFps = maxFps;
            return this;
        }

        /**
         * Maxrate.
         */
        public Builder maxrate(Integer maxrate) {
            this.maxrate = maxrate;
            return this;
        }

        /**
         * Pad.
         */
        public Builder pad(String pad) {
            this.pad = pad;
            return this;
        }

        /**
         * Profile.
         */
        public Builder profile(String profile) {
            this.profile = profile;
            return this;
        }

        /**
         * Qscale.
         */
        public Builder qscale(Integer qscale) {
            this.qscale = qscale;
            return this;
        }

        /**
         * Remove.
         */
        public Builder remove(Boolean remove) {
            this.remove = remove;
            return this;
        }

        /**
         * ScanMode.
         */
        public Builder scanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }

        /**
         * Width.
         */
        public Builder width(Integer width) {
            this.width = width;
            return this;
        }

        public MediaConvertVideo build() {
            return new MediaConvertVideo(this);
        } 

    } 

}
