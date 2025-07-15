// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link UpdateRtsLiveStreamTranscodeRequest} extends {@link RequestModel}
 *
 * <p>UpdateRtsLiveStreamTranscodeRequest</p>
 */
public class UpdateRtsLiveStreamTranscodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("App")
    @com.aliyun.core.annotation.Validation(required = true)
    private String app;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AudioBitrate")
    private Integer audioBitrate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AudioChannelNum")
    private Integer audioChannelNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AudioCodec")
    private String audioCodec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AudioProfile")
    private String audioProfile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AudioRate")
    private Integer audioRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteBframes")
    private Boolean deleteBframes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FPS")
    private Integer FPS;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Gop")
    private String gop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Height")
    private Integer height;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lazy")
    private String lazy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Opus")
    private Boolean opus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Profile")
    private Integer profile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Template")
    @com.aliyun.core.annotation.Validation(required = true)
    private String template;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoBitrate")
    private Integer videoBitrate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Width")
    private Integer width;

    private UpdateRtsLiveStreamTranscodeRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.audioBitrate = builder.audioBitrate;
        this.audioChannelNum = builder.audioChannelNum;
        this.audioCodec = builder.audioCodec;
        this.audioProfile = builder.audioProfile;
        this.audioRate = builder.audioRate;
        this.deleteBframes = builder.deleteBframes;
        this.domain = builder.domain;
        this.FPS = builder.FPS;
        this.gop = builder.gop;
        this.height = builder.height;
        this.lazy = builder.lazy;
        this.opus = builder.opus;
        this.ownerId = builder.ownerId;
        this.profile = builder.profile;
        this.regionId = builder.regionId;
        this.template = builder.template;
        this.templateType = builder.templateType;
        this.videoBitrate = builder.videoBitrate;
        this.width = builder.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRtsLiveStreamTranscodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return app
     */
    public String getApp() {
        return this.app;
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
     * @return deleteBframes
     */
    public Boolean getDeleteBframes() {
        return this.deleteBframes;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return FPS
     */
    public Integer getFPS() {
        return this.FPS;
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
     * @return lazy
     */
    public String getLazy() {
        return this.lazy;
    }

    /**
     * @return opus
     */
    public Boolean getOpus() {
        return this.opus;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return profile
     */
    public Integer getProfile() {
        return this.profile;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<UpdateRtsLiveStreamTranscodeRequest, Builder> {
        private String app; 
        private Integer audioBitrate; 
        private Integer audioChannelNum; 
        private String audioCodec; 
        private String audioProfile; 
        private Integer audioRate; 
        private Boolean deleteBframes; 
        private String domain; 
        private Integer FPS; 
        private String gop; 
        private Integer height; 
        private String lazy; 
        private Boolean opus; 
        private Long ownerId; 
        private Integer profile; 
        private String regionId; 
        private String template; 
        private String templateType; 
        private Integer videoBitrate; 
        private Integer width; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRtsLiveStreamTranscodeRequest request) {
            super(request);
            this.app = request.app;
            this.audioBitrate = request.audioBitrate;
            this.audioChannelNum = request.audioChannelNum;
            this.audioCodec = request.audioCodec;
            this.audioProfile = request.audioProfile;
            this.audioRate = request.audioRate;
            this.deleteBframes = request.deleteBframes;
            this.domain = request.domain;
            this.FPS = request.FPS;
            this.gop = request.gop;
            this.height = request.height;
            this.lazy = request.lazy;
            this.opus = request.opus;
            this.ownerId = request.ownerId;
            this.profile = request.profile;
            this.regionId = request.regionId;
            this.template = request.template;
            this.templateType = request.templateType;
            this.videoBitrate = request.videoBitrate;
            this.width = request.width;
        } 

        /**
         * <p>The name of the application to which the live stream belongs, which cannot be modified.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-test</p>
         */
        public Builder app(String app) {
            this.putQueryParameter("App", app);
            this.app = app;
            return this;
        }

        /**
         * <p>The bitrate of the output audio. Unit: Kbit/s. Valid values: 1 to 1000.</p>
         * <blockquote>
         * <p> This parameter is required if you set the TemplateType parameter to audio.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        public Builder audioBitrate(Integer audioBitrate) {
            this.putQueryParameter("AudioBitrate", audioBitrate);
            this.audioBitrate = audioBitrate;
            return this;
        }

        /**
         * <p>The number of sound channels. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: mono</li>
         * <li><strong>2</strong>: stereo</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder audioChannelNum(Integer audioChannelNum) {
            this.putQueryParameter("AudioChannelNum", audioChannelNum);
            this.audioChannelNum = audioChannelNum;
            return this;
        }

        /**
         * <p>The audio encoder. Valid values:</p>
         * <ul>
         * <li>aac</li>
         * <li>mp3</li>
         * </ul>
         * <blockquote>
         * <p> To use the Opus encoder, you need only to set the Opus parameter to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aac</p>
         */
        public Builder audioCodec(String audioCodec) {
            this.putQueryParameter("AudioCodec", audioCodec);
            this.audioCodec = audioCodec;
            return this;
        }

        /**
         * <p>The audio codec profile. Valid values:</p>
         * <ul>
         * <li>aac_low</li>
         * <li>aac_he</li>
         * <li>aac_he_v2</li>
         * <li>aac_ld</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aac_low</p>
         */
        public Builder audioProfile(String audioProfile) {
            this.putQueryParameter("AudioProfile", audioProfile);
            this.audioProfile = audioProfile;
            return this;
        }

        /**
         * <p>The audio sampling rate. Valid values: 22050, 32000, 44100, 48000, and 96000. 44100 is commonly used. Unit: Hz.</p>
         * <blockquote>
         * <p> If the value of the AudioProfile parameter is aac_ld, the audio sampling rate cannot exceed 44,100.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>44100</p>
         */
        public Builder audioRate(Integer audioRate) {
            this.putQueryParameter("AudioRate", audioRate);
            this.audioRate = audioRate;
            return this;
        }

        /**
         * <p>Specifies whether to remove B frames during transcoding. Valid values:</p>
         * <ul>
         * <li>true: Remove B frames.</li>
         * <li>false (default): Retain B frames.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is required when the TemplateType parameter is set to h264, h264-nbhd, or h264-origin.</p>
         * </li>
         * <li><p>If this parameter is not specified, the default value false is used.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deleteBframes(Boolean deleteBframes) {
            this.putQueryParameter("DeleteBframes", deleteBframes);
            this.deleteBframes = deleteBframes;
            return this;
        }

        /**
         * <p>The main streaming domain, which cannot be modified.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The frame rate of the output video. Unit: frames per second (FPS). Valid values: 1 to 60.</p>
         * <blockquote>
         * <p> This parameter is required when the TemplateType parameter is set to h264, h264-nbhd, or h264-origin.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder FPS(Integer FPS) {
            this.putQueryParameter("FPS", FPS);
            this.FPS = FPS;
            return this;
        }

        /**
         * <p>The group of pictures (GOP) of the output video. This parameter is used to specify the keyframe interval. Unit: seconds. Valid values: 1 to 3.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder gop(String gop) {
            this.putQueryParameter("Gop", gop);
            this.gop = gop;
            return this;
        }

        /**
         * <p>The height of the output video. Unit: pixel.</p>
         * <p>The value must comply with the following rules:</p>
         * <ul>
         * <li>Height ≥ 100: The height of the video is at least 100 pixels.</li>
         * <li>max(Height,Width) ≤ 2560: The larger of the width and height of the video cannot exceed 2,560 pixels.</li>
         * <li>min(Height,Width) ≤ 1440: The smaller of the width and height of the video cannot exceed 1,440 pixels. For example, a resolution of 1560 × 1560 pixels is invalid.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is required when the TemplateType parameter is set to h264, h264-nbhd, or h264-origin.</p>
         * </li>
         * <li><p>If the TemplateType parameter is set to h264-origin, the highest resolution supported is 4K.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        public Builder height(Integer height) {
            this.putQueryParameter("Height", height);
            this.height = height;
            return this;
        }

        /**
         * <p>Specifies whether to enable triggered transcoding. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong>: enables triggered transcoding.</li>
         * <li><strong>no</strong>: disables triggered transcoding.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        public Builder lazy(String lazy) {
            this.putQueryParameter("Lazy", lazy);
            this.lazy = lazy;
            return this;
        }

        /**
         * <p>Specifies whether to transcode streams to the Opus format to be compatible with native WebRTC. Valid values:</p>
         * <ul>
         * <li>true: Transcode streams to the Opus format.</li>
         * <li>false: Do not transcode streams to the Opus format.</li>
         * </ul>
         * <blockquote>
         * <p> If this parameter is not specified, the default value false is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder opus(Boolean opus) {
            this.putQueryParameter("Opus", opus);
            this.opus = opus;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The video encoding profile. The profile defines a set of parameters that are used to encode a video. In most cases, a greater value indicates better image quality and higher resource consumption. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: baseline. This value is suitable for mobile devices.</li>
         * <li><strong>2</strong>: main. This value is suitable for standard-definition devices.</li>
         * <li><strong>3</strong>: high. This value is suitable for high-definition devices.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder profile(Integer profile) {
            this.putQueryParameter("Profile", profile);
            this.profile = profile;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the custom transcoding template, which cannot be modified.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ld</p>
         */
        public Builder template(String template) {
            this.putQueryParameter("Template", template);
            this.template = template;
            return this;
        }

        /**
         * <p>The type of the custom transcoding template, which cannot be modified.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>h264</p>
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        /**
         * <p>The bitrate of the output video. Unit: Kbit/s. Valid values: 1 to 6000.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is required when the TemplateType parameter is set to h264, h264-nbhd, or h264-origin.</p>
         * </li>
         * <li><p>The bitrate of the output video is as close to the value that you specify as possible, but not the same as the value, especially when the value is excessively large or small.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder videoBitrate(Integer videoBitrate) {
            this.putQueryParameter("VideoBitrate", videoBitrate);
            this.videoBitrate = videoBitrate;
            return this;
        }

        /**
         * <p>The width of the output video. Unit: pixel.</p>
         * <p>The value must comply with the following rules:</p>
         * <ul>
         * <li>Width ≥ 100: The width of the video is at least 100 pixels.</li>
         * <li>max(Height,Width) ≤ 2560: The larger of the width and height of the video cannot exceed 2,560 pixels.</li>
         * <li>min(Height,Width) ≤ 1440: The smaller of the width and height of the video cannot exceed 1,440 pixels. For example, a resolution of 1560 × 1560 pixels is invalid.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is required when the TemplateType parameter is set to h264, h264-nbhd, or h264-origin.</p>
         * </li>
         * <li><p>If the TemplateType parameter is set to h264-origin, the highest resolution supported is 4K.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        public Builder width(Integer width) {
            this.putQueryParameter("Width", width);
            this.width = width;
            return this;
        }

        @Override
        public UpdateRtsLiveStreamTranscodeRequest build() {
            return new UpdateRtsLiveStreamTranscodeRequest(this);
        } 

    } 

}
