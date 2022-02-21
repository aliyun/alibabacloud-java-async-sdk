// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMultiRateConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetMultiRateConfigResponseBody</p>
 */
public class GetMultiRateConfigResponseBody extends TeaModel {
    @NameInMap("App")
    private String app;

    @NameInMap("AvFormat")
    private String avFormat;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Domain")
    private String domain;

    @NameInMap("GroupId")
    private String groupId;

    @NameInMap("IsLazy")
    private String isLazy;

    @NameInMap("IsTimeAlign")
    private String isTimeAlign;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Stream")
    private String stream;

    @NameInMap("TemplatesInfo")
    private TemplatesInfo templatesInfo;

    private GetMultiRateConfigResponseBody(Builder builder) {
        this.app = builder.app;
        this.avFormat = builder.avFormat;
        this.code = builder.code;
        this.domain = builder.domain;
        this.groupId = builder.groupId;
        this.isLazy = builder.isLazy;
        this.isTimeAlign = builder.isTimeAlign;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.stream = builder.stream;
        this.templatesInfo = builder.templatesInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMultiRateConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return app
     */
    public String getApp() {
        return this.app;
    }

    /**
     * @return avFormat
     */
    public String getAvFormat() {
        return this.avFormat;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return isLazy
     */
    public String getIsLazy() {
        return this.isLazy;
    }

    /**
     * @return isTimeAlign
     */
    public String getIsTimeAlign() {
        return this.isTimeAlign;
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

    /**
     * @return stream
     */
    public String getStream() {
        return this.stream;
    }

    /**
     * @return templatesInfo
     */
    public TemplatesInfo getTemplatesInfo() {
        return this.templatesInfo;
    }

    public static final class Builder {
        private String app; 
        private String avFormat; 
        private Integer code; 
        private String domain; 
        private String groupId; 
        private String isLazy; 
        private String isTimeAlign; 
        private String message; 
        private String requestId; 
        private String stream; 
        private TemplatesInfo templatesInfo; 

        /**
         * App.
         */
        public Builder app(String app) {
            this.app = app;
            return this;
        }

        /**
         * AvFormat.
         */
        public Builder avFormat(String avFormat) {
            this.avFormat = avFormat;
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
         * Domain.
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * IsLazy.
         */
        public Builder isLazy(String isLazy) {
            this.isLazy = isLazy;
            return this;
        }

        /**
         * IsTimeAlign.
         */
        public Builder isTimeAlign(String isTimeAlign) {
            this.isTimeAlign = isTimeAlign;
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

        /**
         * Stream.
         */
        public Builder stream(String stream) {
            this.stream = stream;
            return this;
        }

        /**
         * TemplatesInfo.
         */
        public Builder templatesInfo(TemplatesInfo templatesInfo) {
            this.templatesInfo = templatesInfo;
            return this;
        }

        public GetMultiRateConfigResponseBody build() {
            return new GetMultiRateConfigResponseBody(this);
        } 

    } 

    public static class Detail extends TeaModel {
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

        private Detail(Builder builder) {
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

        public static Detail create() {
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

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    public static class TemplatesInfo extends TeaModel {
        @NameInMap("Detail")
        private java.util.List < Detail> detail;

        private TemplatesInfo(Builder builder) {
            this.detail = builder.detail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplatesInfo create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List < Detail> getDetail() {
            return this.detail;
        }

        public static final class Builder {
            private java.util.List < Detail> detail; 

            /**
             * Detail.
             */
            public Builder detail(java.util.List < Detail> detail) {
                this.detail = detail;
                return this;
            }

            public TemplatesInfo build() {
                return new TemplatesInfo(this);
            } 

        } 

    }
}
