// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCustomLiveStreamTranscodeRequest} extends {@link RequestModel}
 *
 * <p>AddCustomLiveStreamTranscodeRequest</p>
 */
public class AddCustomLiveStreamTranscodeRequest extends Request {
    @Query
    @NameInMap("App")
    @Validation(required = true)
    private String app;

    @Query
    @NameInMap("AudioBitrate")
    private Integer audioBitrate;

    @Query
    @NameInMap("AudioChannelNum")
    private Integer audioChannelNum;

    @Query
    @NameInMap("AudioCodec")
    private String audioCodec;

    @Query
    @NameInMap("AudioProfile")
    private String audioProfile;

    @Query
    @NameInMap("AudioRate")
    private Integer audioRate;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("EncryptParameters")
    private String encryptParameters;

    @Query
    @NameInMap("FPS")
    private Integer FPS;

    @Query
    @NameInMap("Gop")
    private String gop;

    @Query
    @NameInMap("Height")
    private Integer height;

    @Query
    @NameInMap("KmsKeyExpireInterval")
    private String kmsKeyExpireInterval;

    @Query
    @NameInMap("KmsKeyID")
    private String kmsKeyID;

    @Query
    @NameInMap("KmsUID")
    private String kmsUID;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Profile")
    private Integer profile;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Template")
    @Validation(required = true)
    private String template;

    @Query
    @NameInMap("TemplateType")
    @Validation(required = true)
    private String templateType;

    @Query
    @NameInMap("VideoBitrate")
    private Integer videoBitrate;

    @Query
    @NameInMap("Width")
    private Integer width;

    private AddCustomLiveStreamTranscodeRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.audioBitrate = builder.audioBitrate;
        this.audioChannelNum = builder.audioChannelNum;
        this.audioCodec = builder.audioCodec;
        this.audioProfile = builder.audioProfile;
        this.audioRate = builder.audioRate;
        this.domain = builder.domain;
        this.encryptParameters = builder.encryptParameters;
        this.FPS = builder.FPS;
        this.gop = builder.gop;
        this.height = builder.height;
        this.kmsKeyExpireInterval = builder.kmsKeyExpireInterval;
        this.kmsKeyID = builder.kmsKeyID;
        this.kmsUID = builder.kmsUID;
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

    public static final class Builder extends Request.Builder<AddCustomLiveStreamTranscodeRequest, Builder> {
        private String app; 
        private Integer audioBitrate; 
        private Integer audioChannelNum; 
        private String audioCodec; 
        private String audioProfile; 
        private Integer audioRate; 
        private String domain; 
        private String encryptParameters; 
        private Integer FPS; 
        private String gop; 
        private Integer height; 
        private String kmsKeyExpireInterval; 
        private String kmsKeyID; 
        private String kmsUID; 
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

        private Builder(AddCustomLiveStreamTranscodeRequest response) {
            super(response);
            this.app = response.app;
            this.audioBitrate = response.audioBitrate;
            this.audioChannelNum = response.audioChannelNum;
            this.audioCodec = response.audioCodec;
            this.audioProfile = response.audioProfile;
            this.audioRate = response.audioRate;
            this.domain = response.domain;
            this.encryptParameters = response.encryptParameters;
            this.FPS = response.FPS;
            this.gop = response.gop;
            this.height = response.height;
            this.kmsKeyExpireInterval = response.kmsKeyExpireInterval;
            this.kmsKeyID = response.kmsKeyID;
            this.kmsUID = response.kmsUID;
            this.ownerId = response.ownerId;
            this.profile = response.profile;
            this.regionId = response.regionId;
            this.template = response.template;
            this.templateType = response.templateType;
            this.videoBitrate = response.videoBitrate;
            this.width = response.width;
        } 

        /**
         * App.
         */
        public Builder app(String app) {
            this.putQueryParameter("App", app);
            this.app = app;
            return this;
        }

        /**
         * AudioBitrate.
         */
        public Builder audioBitrate(Integer audioBitrate) {
            this.putQueryParameter("AudioBitrate", audioBitrate);
            this.audioBitrate = audioBitrate;
            return this;
        }

        /**
         * AudioChannelNum.
         */
        public Builder audioChannelNum(Integer audioChannelNum) {
            this.putQueryParameter("AudioChannelNum", audioChannelNum);
            this.audioChannelNum = audioChannelNum;
            return this;
        }

        /**
         * AudioCodec.
         */
        public Builder audioCodec(String audioCodec) {
            this.putQueryParameter("AudioCodec", audioCodec);
            this.audioCodec = audioCodec;
            return this;
        }

        /**
         * AudioProfile.
         */
        public Builder audioProfile(String audioProfile) {
            this.putQueryParameter("AudioProfile", audioProfile);
            this.audioProfile = audioProfile;
            return this;
        }

        /**
         * AudioRate.
         */
        public Builder audioRate(Integer audioRate) {
            this.putQueryParameter("AudioRate", audioRate);
            this.audioRate = audioRate;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * EncryptParameters.
         */
        public Builder encryptParameters(String encryptParameters) {
            this.putQueryParameter("EncryptParameters", encryptParameters);
            this.encryptParameters = encryptParameters;
            return this;
        }

        /**
         * FPS.
         */
        public Builder FPS(Integer FPS) {
            this.putQueryParameter("FPS", FPS);
            this.FPS = FPS;
            return this;
        }

        /**
         * Gop.
         */
        public Builder gop(String gop) {
            this.putQueryParameter("Gop", gop);
            this.gop = gop;
            return this;
        }

        /**
         * Height.
         */
        public Builder height(Integer height) {
            this.putQueryParameter("Height", height);
            this.height = height;
            return this;
        }

        /**
         * KmsKeyExpireInterval.
         */
        public Builder kmsKeyExpireInterval(String kmsKeyExpireInterval) {
            this.putQueryParameter("KmsKeyExpireInterval", kmsKeyExpireInterval);
            this.kmsKeyExpireInterval = kmsKeyExpireInterval;
            return this;
        }

        /**
         * KmsKeyID.
         */
        public Builder kmsKeyID(String kmsKeyID) {
            this.putQueryParameter("KmsKeyID", kmsKeyID);
            this.kmsKeyID = kmsKeyID;
            return this;
        }

        /**
         * KmsUID.
         */
        public Builder kmsUID(String kmsUID) {
            this.putQueryParameter("KmsUID", kmsUID);
            this.kmsUID = kmsUID;
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
         * Profile.
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
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Template.
         */
        public Builder template(String template) {
            this.putQueryParameter("Template", template);
            this.template = template;
            return this;
        }

        /**
         * TemplateType.
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        /**
         * VideoBitrate.
         */
        public Builder videoBitrate(Integer videoBitrate) {
            this.putQueryParameter("VideoBitrate", videoBitrate);
            this.videoBitrate = videoBitrate;
            return this;
        }

        /**
         * Width.
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
