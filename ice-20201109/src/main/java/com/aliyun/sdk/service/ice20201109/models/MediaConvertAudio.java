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

        /**
         * Bitrate.
         */
        public Builder bitrate(Long bitrate) {
            this.bitrate = bitrate;
            return this;
        }

        /**
         * Channels.
         */
        public Builder channels(Long channels) {
            this.channels = channels;
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
         * Profile.
         */
        public Builder profile(String profile) {
            this.profile = profile;
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
         * Samplerate.
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
