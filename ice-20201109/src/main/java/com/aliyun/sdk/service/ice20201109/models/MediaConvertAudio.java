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
 * {@link MediaConvertAudio} extends {@link TeaModel}
 *
 * <p>MediaConvertAudio</p>
 */
public class MediaConvertAudio extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bitrate")
    private Long bitrate;

    @com.aliyun.core.annotation.NameInMap("Channels")
    private Long channels;

    @com.aliyun.core.annotation.NameInMap("Codec")
    private String codec;

    @com.aliyun.core.annotation.NameInMap("Profile")
    private String profile;

    @com.aliyun.core.annotation.NameInMap("Remove")
    private Boolean remove;

    @com.aliyun.core.annotation.NameInMap("Samplerate")
    private String samplerate;

    private MediaConvertAudio(Builder builder) {
        this.bitrate = builder.bitrate;
        this.channels = builder.channels;
        this.codec = builder.codec;
        this.profile = builder.profile;
        this.remove = builder.remove;
        this.samplerate = builder.samplerate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MediaConvertAudio create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bitrate
     */
    public Long getBitrate() {
        return this.bitrate;
    }

    /**
     * @return channels
     */
    public Long getChannels() {
        return this.channels;
    }

    /**
     * @return codec
     */
    public String getCodec() {
        return this.codec;
    }

    /**
     * @return profile
     */
    public String getProfile() {
        return this.profile;
    }

    /**
     * @return remove
     */
    public Boolean getRemove() {
        return this.remove;
    }

    /**
     * @return samplerate
     */
    public String getSamplerate() {
        return this.samplerate;
    }

    public static final class Builder {
        private Long bitrate; 
        private Long channels; 
        private String codec; 
        private String profile; 
        private Boolean remove; 
        private String samplerate; 

        private Builder() {
        } 

        private Builder(MediaConvertAudio model) {
            this.bitrate = model.bitrate;
            this.channels = model.channels;
            this.codec = model.codec;
            this.profile = model.profile;
            this.remove = model.remove;
            this.samplerate = model.samplerate;
        } 

        /**
         * <p>The audio bitrate of the output file.</p>
         * <ul>
         * <li>Unit: Kbps.</li>
         * <li>Valid values: [8,1000].</li>
         * <li>Default value: 128.</li>
         * <li>Common values: 64, 128, and 256.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        public Builder bitrate(Long bitrate) {
            this.bitrate = bitrate;
            return this;
        }

        /**
         * <p>The number of audio channels.</p>
         * <ul>
         * <li><p>Valid values: 0, 1, 2, 4, 5, 6, and 8.</p>
         * <ul>
         * <li>If the Codec parameter is set to MP3 or OPUS, you can set this parameter to 0, 1, or 2.</li>
         * <li>If the Codec parameter is set to AAC or FLAC, you can set this parameter to 0, 1, 2, 4, 5, 6, or 8.</li>
         * <li>If the Codec parameter is set to VORBIS, you can set this parameter to 2.</li>
         * <li>If the Format parameter is set to MPD, you cannot set this parameter to 8.</li>
         * </ul>
         * </li>
         * <li><p>Default value: 2.</p>
         * </li>
         * <li><p>Set the value to 0 to preserve the original number of channels from the source file.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder channels(Long channels) {
            this.channels = channels;
            return this;
        }

        /**
         * <p>The audio codec.</p>
         * <ul>
         * <li>Valid values: AAC, AC3, EAC3, MP2, MP3, FLAC, OPUS, VORBIS, WMA-V1, WMA-V2, and pcm_s16le.</li>
         * <li>Default value: AAC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AAC</p>
         */
        public Builder codec(String codec) {
            this.codec = codec;
            return this;
        }

        /**
         * <p>The audio codec profile.</p>
         * <ul>
         * <li>This parameter takes effect only if the Codec parameter is set to AAC.</li>
         * <li>Valid values: aac_low, aac_he, aac_he_v2, aac_ld, and aac_eld.</li>
         * <li>Default value: aac_low.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aac_low</p>
         */
        public Builder profile(String profile) {
            this.profile = profile;
            return this;
        }

        /**
         * <p>Specifies whether to remove the audio stream from the output.</p>
         * <ul>
         * <li>true: deletes the audio stream. All other parameters in the Audio object are ignored.</li>
         * <li>false: retains the audio stream.</li>
         * <li>Default value: false.</li>
         * </ul>
         */
        public Builder remove(Boolean remove) {
            this.remove = remove;
            return this;
        }

        /**
         * <p>The sample rate.</p>
         * <ul>
         * <li>Unit: Hz</li>
         * <li>Valid values: 22050, 32000, 44100, 48000, and 96000.</li>
         * <li>Default value: 44100.</li>
         * </ul>
         * <p>The supported sample rates vary depending on the container and codec format. For example, when the audio codec is MP3, a sample rate of 96000 is not supported. If the container format is FLV, only sample rates of 22050 and 44100 are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>44100</p>
         */
        public Builder samplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }

        public MediaConvertAudio build() {
            return new MediaConvertAudio(this);
        } 

    } 

}
