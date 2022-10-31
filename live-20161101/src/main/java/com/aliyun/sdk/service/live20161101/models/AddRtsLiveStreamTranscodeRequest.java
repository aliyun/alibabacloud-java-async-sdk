// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddRtsLiveStreamTranscodeRequest} extends {@link RequestModel}
 *
 * <p>AddRtsLiveStreamTranscodeRequest</p>
 */
public class AddRtsLiveStreamTranscodeRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

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
    @NameInMap("DeleteBframes")
    private Boolean deleteBframes;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

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
    @NameInMap("Lazy")
    private String lazy;

    @Query
    @NameInMap("Opus")
    private Boolean opus;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Profile")
    private Integer profile;

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

    private AddRtsLiveStreamTranscodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String regionId; 
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
        private String template; 
        private String templateType; 
        private Integer videoBitrate; 
        private Integer width; 

        private Builder() {
            super();
        } 

        private Builder(AddRtsLiveStreamTranscodeRequest request) {
            super(request);
            this.regionId = request.regionId;
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
            this.template = request.template;
            this.templateType = request.templateType;
            this.videoBitrate = request.videoBitrate;
            this.width = request.width;
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
         * DeleteBframes.
         */
        public Builder deleteBframes(Boolean deleteBframes) {
            this.putQueryParameter("DeleteBframes", deleteBframes);
            this.deleteBframes = deleteBframes;
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
         * Lazy.
         */
        public Builder lazy(String lazy) {
            this.putQueryParameter("Lazy", lazy);
            this.lazy = lazy;
            return this;
        }

        /**
         * Opus.
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
         * Profile.
         */
        public Builder profile(Integer profile) {
            this.putQueryParameter("Profile", profile);
            this.profile = profile;
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
        public AddRtsLiveStreamTranscodeRequest build() {
            return new AddRtsLiveStreamTranscodeRequest(this);
        } 

    } 

}
