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
 * {@link UpdateCustomLiveStreamTranscodeRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomLiveStreamTranscodeRequest</p>
 */
public class UpdateCustomLiveStreamTranscodeRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("BitrateWithSource")
    private String bitrateWithSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeInterlaced")
    private Boolean deInterlaced;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptParameters")
    private String encryptParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtWithSource")
    private String extWithSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FPS")
    private Integer FPS;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FpsWithSource")
    private String fpsWithSource;

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
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Profile")
    private Integer profile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResWithSource")
    private String resWithSource;

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

    private UpdateCustomLiveStreamTranscodeRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.audioBitrate = builder.audioBitrate;
        this.audioChannelNum = builder.audioChannelNum;
        this.audioCodec = builder.audioCodec;
        this.audioProfile = builder.audioProfile;
        this.audioRate = builder.audioRate;
        this.bitrateWithSource = builder.bitrateWithSource;
        this.deInterlaced = builder.deInterlaced;
        this.domain = builder.domain;
        this.encryptParameters = builder.encryptParameters;
        this.extWithSource = builder.extWithSource;
        this.FPS = builder.FPS;
        this.fpsWithSource = builder.fpsWithSource;
        this.gop = builder.gop;
        this.height = builder.height;
        this.lazy = builder.lazy;
        this.ownerId = builder.ownerId;
        this.profile = builder.profile;
        this.regionId = builder.regionId;
        this.resWithSource = builder.resWithSource;
        this.template = builder.template;
        this.templateType = builder.templateType;
        this.videoBitrate = builder.videoBitrate;
        this.width = builder.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomLiveStreamTranscodeRequest create() {
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
     * @return bitrateWithSource
     */
    public String getBitrateWithSource() {
        return this.bitrateWithSource;
    }

    /**
     * @return deInterlaced
     */
    public Boolean getDeInterlaced() {
        return this.deInterlaced;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return encryptParameters
     */
    public String getEncryptParameters() {
        return this.encryptParameters;
    }

    /**
     * @return extWithSource
     */
    public String getExtWithSource() {
        return this.extWithSource;
    }

    /**
     * @return FPS
     */
    public Integer getFPS() {
        return this.FPS;
    }

    /**
     * @return fpsWithSource
     */
    public String getFpsWithSource() {
        return this.fpsWithSource;
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
     * @return resWithSource
     */
    public String getResWithSource() {
        return this.resWithSource;
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

    public static final class Builder extends Request.Builder<UpdateCustomLiveStreamTranscodeRequest, Builder> {
        private String app; 
        private Integer audioBitrate; 
        private Integer audioChannelNum; 
        private String audioCodec; 
        private String audioProfile; 
        private Integer audioRate; 
        private String bitrateWithSource; 
        private Boolean deInterlaced; 
        private String domain; 
        private String encryptParameters; 
        private String extWithSource; 
        private Integer FPS; 
        private String fpsWithSource; 
        private String gop; 
        private Integer height; 
        private String lazy; 
        private Long ownerId; 
        private Integer profile; 
        private String regionId; 
        private String resWithSource; 
        private String template; 
        private String templateType; 
        private Integer videoBitrate; 
        private Integer width; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCustomLiveStreamTranscodeRequest request) {
            super(request);
            this.app = request.app;
            this.audioBitrate = request.audioBitrate;
            this.audioChannelNum = request.audioChannelNum;
            this.audioCodec = request.audioCodec;
            this.audioProfile = request.audioProfile;
            this.audioRate = request.audioRate;
            this.bitrateWithSource = request.bitrateWithSource;
            this.deInterlaced = request.deInterlaced;
            this.domain = request.domain;
            this.encryptParameters = request.encryptParameters;
            this.extWithSource = request.extWithSource;
            this.FPS = request.FPS;
            this.fpsWithSource = request.fpsWithSource;
            this.gop = request.gop;
            this.height = request.height;
            this.lazy = request.lazy;
            this.ownerId = request.ownerId;
            this.profile = request.profile;
            this.regionId = request.regionId;
            this.resWithSource = request.resWithSource;
            this.template = request.template;
            this.templateType = request.templateType;
            this.videoBitrate = request.videoBitrate;
            this.width = request.width;
        } 

        /**
         * <p>The name of the application to which the stream belongs, and it cannot be modified.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        public Builder app(String app) {
            this.putQueryParameter("App", app);
            this.app = app;
            return this;
        }

        /**
         * <p>Audio transcoding bitrate. Unit: kbps, value range: 1 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        public Builder audioBitrate(Integer audioBitrate) {
            this.putQueryParameter("AudioBitrate", audioBitrate);
            this.audioBitrate = audioBitrate;
            return this;
        }

        /**
         * <p>Number of audio channels. Values: </p>
         * <ul>
         * <li>1: Mono. </li>
         * <li>2: Stereo.</li>
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
         * <p>Audio encoding format. Values: </p>
         * <ul>
         * <li>aac </li>
         * <li>mp3</li>
         * </ul>
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
         * <p>Audio encoding. Values: </p>
         * <ul>
         * <li>aac_low</li>
         * <li>aac_he</li>
         * <li>aac_he_v2 </li>
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
         * <p>Audio sampling rate. Values: 22050, 32000, 44100, 48000, 96000. Unit: Hz.</p>
         * <blockquote>
         * <p>If <strong>AudioProfile</strong> is set to <strong>aac_ld</strong>, the sampling rate must not exceed 44100.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>96000</p>
         */
        public Builder audioRate(Integer audioRate) {
            this.putQueryParameter("AudioRate", audioRate);
            this.audioRate = audioRate;
            return this;
        }

        /**
         * <p>The source-based bitrate settings. This parameter takes precedence over other bitrate settings. The following fields must be included:</p>
         * <ul>
         * <li><strong>UpLimit</strong>: the maximum bitrate. Set this field to an integer from 128 to 10000. The value must be greater than the minimum bitrate.</li>
         * <li><strong>LowerLimit</strong>: the minimum bitrate. Set this field to an integer from 128 to 10000. The value must be smaller than the maximum bitrate.</li>
         * <li><strong>Factor</strong>: the ratio of the output bitrate to the source bitrate. Valid values: 0.1 to 1. The value is accurate to one decimal place. A value of 1 indicates that the output video has the same bitrate as the source video.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;UpLimit&quot;:2500,&quot;LowerLimit&quot;:800,&quot;Factor&quot;:1}</p>
         */
        public Builder bitrateWithSource(String bitrateWithSource) {
            this.putQueryParameter("BitrateWithSource", bitrateWithSource);
            this.bitrateWithSource = bitrateWithSource;
            return this;
        }

        /**
         * DeInterlaced.
         */
        public Builder deInterlaced(Boolean deInterlaced) {
            this.putQueryParameter("DeInterlaced", deInterlaced);
            this.deInterlaced = deInterlaced;
            return this;
        }

        /**
         * <p>Streamer domain name, unmodifiable.</p>
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
         * <p>Encryption configuration. JSON format, with the following fields: </p>
         * <ul>
         * <li>EncryptType: Type of encryption. Fixed value is aliyun.</li>
         * <li>KmsKeyID: User&quot;s KMS master key ID. </li>
         * <li>KmsKeyExpireInterval: Key rotation period. Value range: 60~3600, unit: seconds.<blockquote>
         * <p>When using DRM encryption, KmsKeyID cannot be modified.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;EncryptType&quot;: &quot;aliyun&quot;, &quot;KmsKeyID&quot;:&quot;afce5722-81d2-43c3-9930-7601da11****&quot;,&quot;KmsKeyExpireInterval&quot;:&quot;3600&quot;}</p>
         */
        public Builder encryptParameters(String encryptParameters) {
            this.putQueryParameter("EncryptParameters", encryptParameters);
            this.encryptParameters = encryptParameters;
            return this;
        }

        /**
         * <p>Other source-based settings. The following fields are included:</p>
         * <ul>
         * <li><strong>KeyFrameOpen</strong>: Valid values: yes and no.</li>
         * <li><strong>Copyts</strong>: Valid values: yes and no.</li>
         * <li><strong>SeiMode</strong>: Valid values: 0, 1, and 2. 0 specifies that no supplemental enhancement information (SEI) messages are passed through, 1 specifies that part of SEI messages are passed through, and 2 specifies that all SEI messages are passed through.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;KeyFrameOpen&quot;:&quot;yes&quot;,&quot;Copyts&quot;:&quot;yes&quot;,&quot;SeiMode&quot;:1}</p>
         */
        public Builder extWithSource(String extWithSource) {
            this.putQueryParameter("ExtWithSource", extWithSource);
            this.extWithSource = extWithSource;
            return this;
        }

        /**
         * <p>Transcode video frame rate. Unit: FPS, value range: 1 to 60.</p>
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
         * <p>The source-based frame rate settings. This parameter takes precedence over other frame rate settings. The following fields must be included:</p>
         * <ul>
         * <li><strong>UpLimit</strong>: the maximum frame rate. Set this field to an integer from 1 to 60. The value must be greater than the minimum frame rate.</li>
         * <li><strong>LowerLimit</strong>: the minimum frame rate. Set this field to an integer from 1 to 60. The value must be smaller than the maximum frame rate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;UpLimit&quot;:60,&quot;LowerLimit&quot;:1}</p>
         */
        public Builder fpsWithSource(String fpsWithSource) {
            this.putQueryParameter("FpsWithSource", fpsWithSource);
            this.fpsWithSource = fpsWithSource;
            return this;
        }

        /**
         * <p>Video GOP (Group of Pictures), supports units in frames or seconds. When the unit is frames, the value should be {number}; when the unit is seconds, the value should be {number}s. </p>
         * <ul>
         * <li>For frames, the range is 1 to 3000. </li>
         * <li>For seconds, the range is 1 to 20s.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder gop(String gop) {
            this.putQueryParameter("Gop", gop);
            this.gop = gop;
            return this;
        }

        /**
         * <p>Video transcoding height. Unit: pixels. The value must meet the following three conditions:</p>
         * <ul>
         * <li>Height ≥ 100: The height of the video must be no less than 100 pixels.</li>
         * <li>max(Height, Width) ≤ 2560: The larger of the video&quot;s width and height cannot exceed 2560.</li>
         * <li>min(Height, Width) ≤ 1440: The smaller of the video&quot;s width and height cannot exceed 1440.<blockquote>
         * <p>For 265 narrowband HD templates, the maximum resolution is 1280×720.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>720</p>
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
         * <p>yes</p>
         */
        public Builder lazy(String lazy) {
            this.putQueryParameter("Lazy", lazy);
            this.lazy = lazy;
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
         * <p>Encoding level. A set of specific encoding features supported by the video, generally, the higher the value, the better the picture quality, but also the higher the resources consumed for encoding and decoding. Values: </p>
         * <ul>
         * <li>1: baseline (suitable for mobile devices).</li>
         * <li>2: main (suitable for standard resolution devices). </li>
         * <li>3: high (suitable for high-resolution devices).</li>
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
         * <p>The source-based resolution settings. This parameter takes precedence over other resolution settings. The following fields must be included:</p>
         * <ul>
         * <li><p><strong>Type</strong>: You can set this field to short, long, or screen. short specifies that the resolution of the output video is adapted to the shorter side, long specifies that the resolution of the output video is adapted to the longer side, and screen specifies that the output video has an adaptive resolution.</p>
         * </li>
         * <li><p><strong>Value</strong>:</p>
         * <ul>
         * <li>Set this field to 360, 480, 540, 720, or 1080 if the Type field is set to short.</li>
         * <li>Set this field to 640, 848, 960, 1280, or 1920 if the Type field is set to long.</li>
         * <li>Set this field to 640*360, 848*480, 960*540, 1280*720, or 1920*1080 if the Type field is set to screen.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Type&quot;:&quot;short&quot;,&quot;Value&quot;:&quot;1080&quot;}</p>
         */
        public Builder resWithSource(String resWithSource) {
            this.putQueryParameter("ResWithSource", resWithSource);
            this.resWithSource = resWithSource;
            return this;
        }

        /**
         * <p>Custom name of the transcoding template, not modifiable.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LiveCusTranscode****</p>
         */
        public Builder template(String template) {
            this.putQueryParameter("Template", template);
            this.template = template;
            return this;
        }

        /**
         * <p>Custom transcoding template type, unmodifiable.</p>
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
         * <p>Video transcoding bitrate. Unit: kbps, value range: 1 to 6000.</p>
         * <blockquote>
         * <p>The actual bitrate of the transcoded video will try to be as close as possible to the one you set, but it cannot be guaranteed to be exactly the same, especially when the set bitrate is too high or too low.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        public Builder videoBitrate(Integer videoBitrate) {
            this.putQueryParameter("VideoBitrate", videoBitrate);
            this.videoBitrate = videoBitrate;
            return this;
        }

        /**
         * <p>Video transcoding width. Unit: pixels. The value must meet the following three conditions: </p>
         * <ul>
         * <li>Width ≥ 100: The video width must be no less than 100 pixels. </li>
         * <li>max(Height, Width) ≤ 2560: The larger of the video&quot;s height and width cannot exceed 2560. </li>
         * <li>min(Height, Width) ≤ 1440: The smaller of the video&quot;s height and width cannot exceed 1440.<blockquote>
         * <p>For 265 narrowband HD templates, the maximum resolution is 1280×720.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>576</p>
         */
        public Builder width(Integer width) {
            this.putQueryParameter("Width", width);
            this.width = width;
            return this;
        }

        @Override
        public UpdateCustomLiveStreamTranscodeRequest build() {
            return new UpdateCustomLiveStreamTranscodeRequest(this);
        } 

    } 

}
