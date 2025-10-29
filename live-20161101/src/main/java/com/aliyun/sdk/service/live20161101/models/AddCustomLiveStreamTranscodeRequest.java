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
 * {@link AddCustomLiveStreamTranscodeRequest} extends {@link RequestModel}
 *
 * <p>AddCustomLiveStreamTranscodeRequest</p>
 */
public class AddCustomLiveStreamTranscodeRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("KmsKeyExpireInterval")
    private String kmsKeyExpireInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KmsKeyID")
    private String kmsKeyID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KmsUID")
    private String kmsUID;

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

    private AddCustomLiveStreamTranscodeRequest(Builder builder) {
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
        this.kmsKeyExpireInterval = builder.kmsKeyExpireInterval;
        this.kmsKeyID = builder.kmsKeyID;
        this.kmsUID = builder.kmsUID;
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

    public static AddCustomLiveStreamTranscodeRequest create() {
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
     * @return kmsKeyExpireInterval
     */
    public String getKmsKeyExpireInterval() {
        return this.kmsKeyExpireInterval;
    }

    /**
     * @return kmsKeyID
     */
    public String getKmsKeyID() {
        return this.kmsKeyID;
    }

    /**
     * @return kmsUID
     */
    public String getKmsUID() {
        return this.kmsUID;
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

    public static final class Builder extends Request.Builder<AddCustomLiveStreamTranscodeRequest, Builder> {
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
        private String kmsKeyExpireInterval; 
        private String kmsKeyID; 
        private String kmsUID; 
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

        private Builder(AddCustomLiveStreamTranscodeRequest request) {
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
            this.kmsKeyExpireInterval = request.kmsKeyExpireInterval;
            this.kmsKeyID = request.kmsKeyID;
            this.kmsUID = request.kmsUID;
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
         * <p>The name of the application to which the live stream belongs.</p>
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
         * <p>The bitrate of the output audio. Unit: Kbit/s. Valid values: <strong>1 to 1000</strong>.</p>
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
         * <p>The number of sound channels. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: mono.</li>
         * <li><strong>2</strong>: binaural.</li>
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
         * <p>The audio encoding format. Valid values:</p>
         * <ul>
         * <li><strong>AAC</strong></li>
         * <li><strong>MP3</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AAC</p>
         */
        public Builder audioCodec(String audioCodec) {
            this.putQueryParameter("AudioCodec", audioCodec);
            this.audioCodec = audioCodec;
            return this;
        }

        /**
         * <p>The audio encoding profile. Valid values:</p>
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
         * <p>The audio sampling rate. Valid values: <strong>22050 to 96000</strong>.</p>
         * <blockquote>
         * <p>Notice: If you set AudioProfile to <strong>aac_ld</strong>, the audio sampling rate cannot exceed 44100.</p>
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
         * <li><strong>UpLimit</strong>: the maximum bitrate limit. Valid values: an integer from 128 to 10000. The value must be greater than the minimum bitrate.</li>
         * <li><strong>LowerLimit int</strong> : the minimum bitrate rate. Valid values: an integer from 128 to 10000. The value must be smaller than the maximum bitrate.</li>
         * <li><strong>Factor</strong>: The ratio of the output bitrate to the source bitrate. Valid values: 0.1 to 1. The value is accurate to one decimal place. A value of 1 indicates that the output video has the same bitrate as the source video.</li>
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
         * <p>Encryption configuration. In JSON format, the fields are explained as follows:</p>
         * <ul>
         * <li><strong>EncryptType</strong>: Encryption type. Fixed value is aliyun.</li>
         * <li><strong>KmsKeyID</strong>: User KMS master key ID.</li>
         * <li><strong>KmsKeyExpireInterval</strong>: Key rotation period. Range: 60~3600, unit: seconds.<blockquote>
         * <p>If the EncryptParameters is configured, the KmsKeyID, KmsUID, and KmsKeyExpireInterval parameters cannot be empty</p>
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
         * <p>Other source-based settings, including the following fields:</p>
         * <ul>
         * <li><strong>KeyFrameOpen</strong>: specifies whether to use the key frames of the source video. Valid values: yes or no.</li>
         * <li><strong>Copyts</strong>: specifies whether to use the presentation time stamp (PTS) of the source video. Valid values: yes or no.</li>
         * <li><strong>SeiMode</strong>: specifies whether to pass through supplemental enhancement information (SEI) messages. Valid values: 0, 1, and 2, where 0 specifies that no SEI messages are passed through, 1 specifies that part of SEI messages are passed through, and 2 specifies that all SEI messages are passed through.</li>
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
         * <p>The frame rate of the output video. Unit: frames per second (FPS). Valid values: <strong>1 to 60</strong>.</p>
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
         * <li><strong>UpLimit</strong>: the maximum frame rate. Valid values: an integer from 1 to 60. The value must be greater than the minimum frame rate.</li>
         * <li><strong>LowerLimit</strong>: the minimum frame rate. Valid values: an integer from 1 to 60. The value must be smaller than the maximum frame rate.</li>
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
         * <p>The Group of Picture (GOP) size of the video. Unit: frames or seconds.</p>
         * <ul>
         * <li>Unit: frames. Valid values: <strong>1 to 3000</strong>.</li>
         * <li>Unit: seconds. Valid value: <strong>1 to 20</strong>.</li>
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
         * <p>The height of the output video. Unit: pixel. Valid values:</p>
         * <p>The value must comply with all the following rules:</p>
         * <ul>
         * <li><strong>Height ≥ 100</strong>: The height of the video is greater than or equal to 100 pixels.</li>
         * <li><strong>max(Height,Width) ≤ 2560</strong>: The width or height of the video, whichever is greater, cannot exceed 2,560 pixels.</li>
         * <li><strong>min(Height,Width) ≤ 1440</strong>: The width or height of the video, whichever is smaller, cannot exceed 1,440 pixels.</li>
         * </ul>
         * <blockquote>
         * <p>The resolution of the output video that is transcoded by using the H.265 Narrowband HD™ transcoding template cannot exceed 1280 × 720 pixels.</p>
         * </blockquote>
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
         * <p>The rotation period of the CMK. Valid values: 60 to 3600. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder kmsKeyExpireInterval(String kmsKeyExpireInterval) {
            this.putQueryParameter("KmsKeyExpireInterval", kmsKeyExpireInterval);
            this.kmsKeyExpireInterval = kmsKeyExpireInterval;
            return this;
        }

        /**
         * <p>The ID of the customer master key (CMK) that you created in Key Management Service (KMS).</p>
         * 
         * <strong>example:</strong>
         * <p>afce5722-81d2-43c3-9930-7601da11****</p>
         */
        public Builder kmsKeyID(String kmsKeyID) {
            this.putQueryParameter("KmsKeyID", kmsKeyID);
            this.kmsKeyID = kmsKeyID;
            return this;
        }

        /**
         * <p>The ID of your KMS account.</p>
         * 
         * <strong>example:</strong>
         * <p>25346073170691****</p>
         */
        public Builder kmsUID(String kmsUID) {
            this.putQueryParameter("KmsUID", kmsUID);
            this.kmsUID = kmsUID;
            return this;
        }

        /**
         * <p>Specifies whether to use the load-on-demand mechanism for transcoding. Valid values: yes and no. Default value: <strong>yes</strong>.</p>
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
         * <p>The name of the custom transcoding template.</p>
         * <blockquote>
         * <p>The name can contain digits, letters, and hyphens (-), and must start with a letter or digit. The name must be different from the names of any default transcoding templates.</p>
         * </blockquote>
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
         * <p>The type of the custom transcoding template. Valid values:</p>
         * <ul>
         * <li><strong>h264</strong>: custom H.264 standard transcoding.</li>
         * <li><strong>h264-nbhd</strong>: custom H.264 Narrowband HD™ transcoding.</li>
         * <li><strong>h265</strong>: custom H.265 standard transcoding.</li>
         * <li><strong>h265-nbhd</strong>: custom H.265 Narrowband HD™ transcoding.</li>
         * <li><strong>audio</strong>: audio-only transcoding.</li>
         * </ul>
         * <blockquote>
         * <p>If you set <strong>TemplateType</strong> to <strong>h264</strong>, <strong>h264-nbhd</strong>, <strong>h265</strong>, or <strong>h265-nbhd</strong>, the <strong>Height</strong>, <strong>Width</strong>, <strong>FPS</strong>, and <strong>VideoBitrate</strong> parameters are required.</p>
         * </blockquote>
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
         * <p>The bitrate of the output video. Unit: Kbit/s. Valid values: <strong>1 to 6000</strong>.</p>
         * <blockquote>
         * <p>The bitrate of the output video may not be the same as the value that you specify, but is as close to the value as possible, especially when the value is excessively large or small.</p>
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
         * <p>The width of the output video. Unit: pixel. Valid values:</p>
         * <p>The value must comply with all the following rules:</p>
         * <ul>
         * <li><strong>Width ≥ 100</strong>: The width of the video is greater than or equal to 100 pixels.</li>
         * <li><strong>max(Height,Width) ≤ 2560</strong>: The width or height of the video, whichever is greater, cannot exceed 2,560 pixels.</li>
         * <li><strong>min(Height,Width) ≤ 1440</strong>: The width or height of the video, whichever is smaller, cannot exceed 1,440 pixels.</li>
         * </ul>
         * <blockquote>
         * <p>The resolution of the output video that is transcoded by using the H.265 Narrowband HD™ transcoding template cannot exceed 1280 × 720 pixels.</p>
         * </blockquote>
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
        public AddCustomLiveStreamTranscodeRequest build() {
            return new AddCustomLiveStreamTranscodeRequest(this);
        } 

    } 

}
