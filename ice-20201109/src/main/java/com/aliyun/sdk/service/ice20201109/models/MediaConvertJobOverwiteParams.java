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
 * {@link MediaConvertJobOverwiteParams} extends {@link TeaModel}
 *
 * <p>MediaConvertJobOverwiteParams</p>
 */
public class MediaConvertJobOverwiteParams extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Subtitles")
    private java.util.List<Subtitles> subtitles;

    private MediaConvertJobOverwiteParams(Builder builder) {
        this.subtitles = builder.subtitles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MediaConvertJobOverwiteParams create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return subtitles
     */
    public java.util.List<Subtitles> getSubtitles() {
        return this.subtitles;
    }

    public static final class Builder {
        private java.util.List<Subtitles> subtitles; 

        private Builder() {
        } 

        private Builder(MediaConvertJobOverwiteParams model) {
            this.subtitles = model.subtitles;
        } 

        /**
         * Subtitles.
         */
        public Builder subtitles(java.util.List<Subtitles> subtitles) {
            this.subtitles = subtitles;
            return this;
        }

        public MediaConvertJobOverwiteParams build() {
            return new MediaConvertJobOverwiteParams(this);
        } 

    } 

    /**
     * 
     * {@link MediaConvertJobOverwiteParams} extends {@link TeaModel}
     *
     * <p>MediaConvertJobOverwiteParams</p>
     */
    public static class Subtitles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Codec")
        private String codec;

        private Subtitles(Builder builder) {
            this.codec = builder.codec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subtitles create() {
            return builder().build();
        }

        /**
         * @return codec
         */
        public String getCodec() {
            return this.codec;
        }

        public static final class Builder {
            private String codec; 

            private Builder() {
            } 

            private Builder(Subtitles model) {
                this.codec = model.codec;
            } 

            /**
             * Codec.
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            public Subtitles build() {
                return new Subtitles(this);
            } 

        } 

    }
}
