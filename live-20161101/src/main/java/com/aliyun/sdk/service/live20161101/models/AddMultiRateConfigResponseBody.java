// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMultiRateConfigResponseBody} extends {@link TeaModel}
 *
 * <p>AddMultiRateConfigResponseBody</p>
 */
public class AddMultiRateConfigResponseBody extends TeaModel {
    @NameInMap("Body")
    private AddMultiRateConfigResponseBodyBody body;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private AddMultiRateConfigResponseBody(Builder builder) {
        this.body = builder.body;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMultiRateConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return body
     */
    public AddMultiRateConfigResponseBodyBody getBody() {
        return this.body;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AddMultiRateConfigResponseBodyBody body; 
        private Integer code; 
        private String message; 
        private String requestId; 

        /**
         * Body.
         */
        public Builder body(AddMultiRateConfigResponseBodyBody body) {
            this.body = body;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddMultiRateConfigResponseBody build() {
            return new AddMultiRateConfigResponseBody(this);
        } 

    } 

    public static class FailedTemplates extends TeaModel {
        @NameInMap("AudioBitrate")
        private Integer audioBitrate;

        @NameInMap("AudioChannelNum")
        private Integer audioChannelNum;

        @NameInMap("AudioCodec")
        private String audioCodec;

        @NameInMap("AudioProfile")
        private String audioProfile;

        @NameInMap("AudioRate")
        private Integer audioRate;

        @NameInMap("BandWidth")
        private Integer bandWidth;

        @NameInMap("Fps")
        private Integer fps;

        @NameInMap("Gop")
        private String gop;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Profile")
        private Integer profile;

        @NameInMap("Template")
        private String template;

        @NameInMap("TemplateType")
        private String templateType;

        @NameInMap("VideoBitrate")
        private Integer videoBitrate;

        @NameInMap("Width")
        private Integer width;

        private FailedTemplates(Builder builder) {
            this.audioBitrate = builder.audioBitrate;
            this.audioChannelNum = builder.audioChannelNum;
            this.audioCodec = builder.audioCodec;
            this.audioProfile = builder.audioProfile;
            this.audioRate = builder.audioRate;
            this.bandWidth = builder.bandWidth;
            this.fps = builder.fps;
            this.gop = builder.gop;
            this.height = builder.height;
            this.profile = builder.profile;
            this.template = builder.template;
            this.templateType = builder.templateType;
            this.videoBitrate = builder.videoBitrate;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedTemplates create() {
            return builder().build();
        }

        /**
         * @return audioBitrate
         */
        public Integer getAudioBitrate() {
            return this.audioBitrate;
        }

        /**
         * @return audioChannelNum
         */
        public Integer getAudioChannelNum() {
            return this.audioChannelNum;
        }

        /**
         * @return audioCodec
         */
        public String getAudioCodec() {
            return this.audioCodec;
        }

        /**
         * @return audioProfile
         */
        public String getAudioProfile() {
            return this.audioProfile;
        }

        /**
         * @return audioRate
         */
        public Integer getAudioRate() {
            return this.audioRate;
        }

        /**
         * @return bandWidth
         */
        public Integer getBandWidth() {
            return this.bandWidth;
        }

        /**
         * @return fps
         */
        public Integer getFps() {
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
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return profile
         */
        public Integer getProfile() {
            return this.profile;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        /**
         * @return videoBitrate
         */
        public Integer getVideoBitrate() {
            return this.videoBitrate;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer audioBitrate; 
            private Integer audioChannelNum; 
            private String audioCodec; 
            private String audioProfile; 
            private Integer audioRate; 
            private Integer bandWidth; 
            private Integer fps; 
            private String gop; 
            private Integer height; 
            private Integer profile; 
            private String template; 
            private String templateType; 
            private Integer videoBitrate; 
            private Integer width; 

            /**
             * AudioBitrate.
             */
            public Builder audioBitrate(Integer audioBitrate) {
                this.audioBitrate = audioBitrate;
                return this;
            }

            /**
             * AudioChannelNum.
             */
            public Builder audioChannelNum(Integer audioChannelNum) {
                this.audioChannelNum = audioChannelNum;
                return this;
            }

            /**
             * AudioCodec.
             */
            public Builder audioCodec(String audioCodec) {
                this.audioCodec = audioCodec;
                return this;
            }

            /**
             * AudioProfile.
             */
            public Builder audioProfile(String audioProfile) {
                this.audioProfile = audioProfile;
                return this;
            }

            /**
             * AudioRate.
             */
            public Builder audioRate(Integer audioRate) {
                this.audioRate = audioRate;
                return this;
            }

            /**
             * BandWidth.
             */
            public Builder bandWidth(Integer bandWidth) {
                this.bandWidth = bandWidth;
                return this;
            }

            /**
             * Fps.
             */
            public Builder fps(Integer fps) {
                this.fps = fps;
                return this;
            }

            /**
             * Gop.
             */
            public Builder gop(String gop) {
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
             * Profile.
             */
            public Builder profile(Integer profile) {
                this.profile = profile;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * TemplateType.
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * VideoBitrate.
             */
            public Builder videoBitrate(Integer videoBitrate) {
                this.videoBitrate = videoBitrate;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public FailedTemplates build() {
                return new FailedTemplates(this);
            } 

        } 

    }
    public static class AddMultiRateConfigResponseBodyBody extends TeaModel {
        @NameInMap("FailedTemplates")
        private java.util.List < FailedTemplates> failedTemplates;

        private AddMultiRateConfigResponseBodyBody(Builder builder) {
            this.failedTemplates = builder.failedTemplates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddMultiRateConfigResponseBodyBody create() {
            return builder().build();
        }

        /**
         * @return failedTemplates
         */
        public java.util.List < FailedTemplates> getFailedTemplates() {
            return this.failedTemplates;
        }

        public static final class Builder {
            private java.util.List < FailedTemplates> failedTemplates; 

            /**
             * FailedTemplates.
             */
            public Builder failedTemplates(java.util.List < FailedTemplates> failedTemplates) {
                this.failedTemplates = failedTemplates;
                return this;
            }

            public AddMultiRateConfigResponseBodyBody build() {
                return new AddMultiRateConfigResponseBodyBody(this);
            } 

        } 

    }
}
