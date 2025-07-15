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
 * {@link AddRtsLiveStreamTranscodeRequest} extends {@link RequestModel}
 *
 * <p>AddRtsLiveStreamTranscodeRequest</p>
 */
public class AddRtsLiveStreamTranscodeRequest extends Request {
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

    private AddRtsLiveStreamTranscodeRequest(Builder builder) {
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

    public static AddRtsLiveStreamTranscodeRequest create() {
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

    public static final class Builder extends Request.Builder<AddRtsLiveStreamTranscodeRequest, Builder> {
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

        private Builder(AddRtsLiveStreamTranscodeRequest request) {
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
         * <p>The name of the application to which the live stream belongs. Value requirements:</p>
         * <ul>
         * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
         * <li>We recommend that you specify a name that is more than three characters in length. The name must start with a letter or digit.</li>
         * </ul>
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
         * <p>The bitrate of the output audio. Unit: Kbit/s. Valid values: <strong>1</strong> to <strong>1000</strong>.</p>
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
         * <li><strong>aac</strong></li>
         * <li><strong>mp3</strong></li>
         * </ul>
         * <blockquote>
         * <p>If you want to use the Opus encoding format, set the Opus parameter to true.</p>
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
         * <li><strong>aac_low</strong></li>
         * <li><strong>aac_he</strong></li>
         * <li><strong>aac_he_v2</strong></li>
         * <li><strong>aac_ld</strong></li>
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
         * <p>The audio sampling rate. Valid values: <strong>22050 to 96000</strong>. The value 44100 is commonly used. Unit: Hz.</p>
         * <blockquote>
         * <p>If you set the AudioProfile parameter to aac_ld, the audio sampling rate cannot exceed 44,100 Hz.</p>
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
         * <p>Specifies whether to remove B-frames during transcoding. Valid values:</p>
         * <blockquote>
         * <p> This parameter is required if you set the TemplateType parameter to h264, h264-nbhd, or h264-origin.</p>
         * </blockquote>
         * <ul>
         * <li><strong>true</strong>: removes B-frames.</li>
         * <li><strong>false</strong>: retains B-frames. This is the default value.</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the default value <strong>false</strong> is used.</p>
         * </blockquote>
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
         * <p>The main streaming domain.</p>
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
         * <p>The frame rate of the output video. Unit: FPS. Valid values: <strong>1</strong> to <strong>60</strong>.</p>
         * <blockquote>
         * <p> This parameter is required if you set the TemplateType parameter to h264, h264-nbhd, or h264-origin.</p>
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
         * <p>The group of pictures (GOP) size of the output video. This parameter is used to specify the keyframe interval. Unit: seconds. Valid values: <strong>1</strong> to <strong>3</strong>.</p>
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
         * <p>The height of the output video. Unit: pixels.</p>
         * <blockquote>
         * <p> This parameter is required if you set the TemplateType parameter to h264, h264-nbhd, or h264-origin.</p>
         * </blockquote>
         * <p>The value must comply with the following rules:****</p>
         * <ul>
         * <li><strong>Height ≥ 100</strong>: The height of the video is no less than 100 pixels.</li>
         * <li><strong>max(Height,Width) ≤ 2560</strong>: The width or height of the video, whichever is greater, cannot exceed 2,560 pixels.</li>
         * <li><strong>min(Height,Width) ≤ 1440</strong>: The width or height of the video, whichever is smaller, cannot exceed 1,440 pixels.</li>
         * </ul>
         * <p>For example, a resolution of 1560 × 1560 pixels is invalid.</p>
         * <blockquote>
         * <p>An original quality template needs to retain the source information. Therefore, the video resolution cannot exceed 4K.</p>
         * </blockquote>
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
         * <p>Specifies whether to trigger transcoding only when a stream is pulled. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong>: triggers transcoding only when a stream is pulled.</li>
         * <li><strong>no</strong>: triggers transcoding whenever a stream is ingested, no matter whether the stream is pulled.</li>
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
         * <p>Specifies whether to transcode audio to the Opus format to be compatible with native WebRTC. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: transcodes audio to the Opus format.</li>
         * <li><strong>false</strong>: does not transcode audio to the Opus format.</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the default value <strong>false</strong> is used.</p>
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
         * <p>The codec profile. The video codec profile determines how ApsaraVideo Live performs codec on the video. In normal cases, a greater value indicates a higher image quality and requires more codec resources. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: baseline, which is suitable for mobile devices.</li>
         * <li><strong>2</strong>: main, which is suitable for standard-definition devices.</li>
         * <li><strong>3</strong>: high, which is suitable for high-definition devices.</li>
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
         * <p>The name of the transcoding template. Value requirements:</p>
         * <ul>
         * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
         * <li>We recommend that you specify a name that is more than three characters in length. The name must start with a letter or digit.</li>
         * </ul>
         * <blockquote>
         * <p>The name cannot be the same as that of a default transcoding template.</p>
         * </blockquote>
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
         * <p>The type of the transcoding template.</p>
         * <p>If you set this parameter to h264, h264-nbhd, or h264-origin, you must also specify the Height, Width, FPS, VideoBitrate, and DeleteBframes parameters. Valid values:</p>
         * <ul>
         * <li><strong>h264</strong>: H.264 standard transcoding template.</li>
         * <li><strong>h264-nbhd</strong>: H.264 Narrowband HD™ transcoding template.</li>
         * <li><strong>h264-origin</strong>: H.264 original quality template. If you use this type of template, the same transcoding parameters of the video source are retained by default.</li>
         * <li><strong>audio</strong>: audio-only transcoding template. If you use this type of template, images are removed from the video source and an audio-only stream is generated. In addition, you must also specify the AudioBitrate parameter.</li>
         * </ul>
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
         * <p>The bitrate of the output video. Unit: Kbit/s. Valid values: <strong>1</strong> to <strong>6000</strong>.</p>
         * <blockquote>
         * <p> This parameter is required if you set the TemplateType parameter to h264, h264-nbhd, or h264-origin.</p>
         * </blockquote>
         * <blockquote>
         * <p>The bitrate of the output video is as close to the value that you specify as possible, but not exactly the same as the value, especially when the value is excessively large or small.</p>
         * </blockquote>
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
         * <p>The width of the output video. Unit: pixels.</p>
         * <blockquote>
         * <p> This parameter is required if you set the TemplateType parameter to h264, h264-nbhd, or h264-origin.</p>
         * </blockquote>
         * <p>The value must comply with the following rules:</p>
         * <ul>
         * <li><strong>Width ≥ 100</strong>: The width of the video is no less than 100 pixels.</li>
         * <li><strong>max(Height,Width) ≤ 2560</strong>: The width or height of the video, whichever is greater, cannot exceed 2,560 pixels.</li>
         * <li><strong>min(Height,Width) ≤ 1440</strong>: The width or height of the video, whichever is smaller, cannot exceed 1,440 pixels.</li>
         * </ul>
         * <p>For example, a resolution of 1560 × 1560 pixels is invalid.</p>
         * <blockquote>
         * <p>An original quality template needs to retain the source information. Therefore, the video resolution cannot exceed 4K.</p>
         * </blockquote>
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
        public AddRtsLiveStreamTranscodeRequest build() {
            return new AddRtsLiveStreamTranscodeRequest(this);
        } 

    } 

}
