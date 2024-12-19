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
 * {@link ListLiveTranscodeTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListLiveTranscodeTemplatesResponseBody</p>
 */
public class ListLiveTranscodeTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateContentList")
    private java.util.List<TemplateContentList> templateContentList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListLiveTranscodeTemplatesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateContentList = builder.templateContentList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveTranscodeTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateContentList
     */
    public java.util.List<TemplateContentList> getTemplateContentList() {
        return this.templateContentList;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TemplateContentList> templateContentList; 
        private Integer totalCount; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of transcoding templates.</p>
         */
        public Builder templateContentList(java.util.List<TemplateContentList> templateContentList) {
            this.templateContentList = templateContentList;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListLiveTranscodeTemplatesResponseBody build() {
            return new ListLiveTranscodeTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLiveTranscodeTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListLiveTranscodeTemplatesResponseBody</p>
     */
    public static class AudioParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("Channels")
        private String channels;

        @com.aliyun.core.annotation.NameInMap("Codec")
        private String codec;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("Samplerate")
        private String samplerate;

        private AudioParams(Builder builder) {
            this.bitrate = builder.bitrate;
            this.channels = builder.channels;
            this.codec = builder.codec;
            this.profile = builder.profile;
            this.samplerate = builder.samplerate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioParams create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return channels
         */
        public String getChannels() {
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
         * @return samplerate
         */
        public String getSamplerate() {
            return this.samplerate;
        }

        public static final class Builder {
            private String bitrate; 
            private String channels; 
            private String codec; 
            private String profile; 
            private String samplerate; 

            /**
             * <p>The audio bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The number of sound channels.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder channels(String channels) {
                this.channels = channels;
                return this;
            }

            /**
             * <p>The audio codec.</p>
             * 
             * <strong>example:</strong>
             * <p>AAC</p>
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * <p>The encoding profile.</p>
             * 
             * <strong>example:</strong>
             * <p>aac_low</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>The audio sampling rate.</p>
             * 
             * <strong>example:</strong>
             * <p>44100</p>
             */
            public Builder samplerate(String samplerate) {
                this.samplerate = samplerate;
                return this;
            }

            public AudioParams build() {
                return new AudioParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLiveTranscodeTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListLiveTranscodeTemplatesResponseBody</p>
     */
    public static class VideoParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("Codec")
        private String codec;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("Gop")
        private String gop;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private VideoParams(Builder builder) {
            this.bitrate = builder.bitrate;
            this.codec = builder.codec;
            this.fps = builder.fps;
            this.gop = builder.gop;
            this.height = builder.height;
            this.profile = builder.profile;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoParams create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return codec
         */
        public String getCodec() {
            return this.codec;
        }

        /**
         * @return fps
         */
        public String getFps() {
            return this.fps;
        }

        /**
         * @return gop
         */
        public String getGop() {
            return this.gop;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String bitrate; 
            private String codec; 
            private String fps; 
            private String gop; 
            private String height; 
            private String profile; 
            private String width; 

            /**
             * <p>The video bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>2500</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>264</p>
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * <p>The video frame rate.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The group of pictures (GOP) of the output video. Unit: frame.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder gop(String gop) {
                this.gop = gop;
                return this;
            }

            /**
             * <p>The vertical resolution of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>1280</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The encoding profile.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>The horizontal resolution of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>720</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public VideoParams build() {
                return new VideoParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLiveTranscodeTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListLiveTranscodeTemplatesResponseBody</p>
     */
    public static class TemplateConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioParams")
        private AudioParams audioParams;

        @com.aliyun.core.annotation.NameInMap("VideoParams")
        private VideoParams videoParams;

        private TemplateConfig(Builder builder) {
            this.audioParams = builder.audioParams;
            this.videoParams = builder.videoParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateConfig create() {
            return builder().build();
        }

        /**
         * @return audioParams
         */
        public AudioParams getAudioParams() {
            return this.audioParams;
        }

        /**
         * @return videoParams
         */
        public VideoParams getVideoParams() {
            return this.videoParams;
        }

        public static final class Builder {
            private AudioParams audioParams; 
            private VideoParams videoParams; 

            /**
             * <p>The audio parameters.</p>
             */
            public Builder audioParams(AudioParams audioParams) {
                this.audioParams = audioParams;
                return this;
            }

            /**
             * <p>The video parameters.</p>
             */
            public Builder videoParams(VideoParams videoParams) {
                this.videoParams = videoParams;
                return this;
            }

            public TemplateConfig build() {
                return new TemplateConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLiveTranscodeTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListLiveTranscodeTemplatesResponseBody</p>
     */
    public static class TemplateContentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TemplateConfig")
        private TemplateConfig templateConfig;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private TemplateContentList(Builder builder) {
            this.category = builder.category;
            this.createTime = builder.createTime;
            this.name = builder.name;
            this.templateConfig = builder.templateConfig;
            this.templateId = builder.templateId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateContentList create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return templateConfig
         */
        public TemplateConfig getTemplateConfig() {
            return this.templateConfig;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String category; 
            private String createTime; 
            private String name; 
            private TemplateConfig templateConfig; 
            private String templateId; 
            private String type; 

            /**
             * <p>The category of the template. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The time when the job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-20T03:26:36Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>my_template</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The configuration of the template.</p>
             */
            public Builder templateConfig(TemplateConfig templateConfig) {
                this.templateConfig = templateConfig;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9b1571b513cb44f7a1ba6ae561ff46f7</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The type of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TemplateContentList build() {
                return new TemplateContentList(this);
            } 

        } 

    }
}
