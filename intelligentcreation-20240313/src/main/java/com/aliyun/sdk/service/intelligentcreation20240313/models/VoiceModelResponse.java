// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link VoiceModelResponse} extends {@link TeaModel}
 *
 * <p>VoiceModelResponse</p>
 */
public class VoiceModelResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("resourceTypeDesc")
    private String resourceTypeDesc;

    @com.aliyun.core.annotation.NameInMap("ttsVersion")
    private Integer ttsVersion;

    @com.aliyun.core.annotation.NameInMap("useScene")
    private String useScene;

    @com.aliyun.core.annotation.NameInMap("voiceDesc")
    private String voiceDesc;

    @com.aliyun.core.annotation.NameInMap("voiceGender")
    private String voiceGender;

    @com.aliyun.core.annotation.NameInMap("voiceId")
    private Long voiceId;

    @com.aliyun.core.annotation.NameInMap("voiceLanguage")
    private String voiceLanguage;

    @com.aliyun.core.annotation.NameInMap("voiceModel")
    private String voiceModel;

    @com.aliyun.core.annotation.NameInMap("voiceName")
    private String voiceName;

    @com.aliyun.core.annotation.NameInMap("voiceType")
    private String voiceType;

    @com.aliyun.core.annotation.NameInMap("voiceUrl")
    private String voiceUrl;

    private VoiceModelResponse(BuilderImpl builder) {
        super(builder);
        this.resourceTypeDesc = builder.resourceTypeDesc;
        this.ttsVersion = builder.ttsVersion;
        this.useScene = builder.useScene;
        this.voiceDesc = builder.voiceDesc;
        this.voiceGender = builder.voiceGender;
        this.voiceId = builder.voiceId;
        this.voiceLanguage = builder.voiceLanguage;
        this.voiceModel = builder.voiceModel;
        this.voiceName = builder.voiceName;
        this.voiceType = builder.voiceType;
        this.voiceUrl = builder.voiceUrl;
    }

    public static VoiceModelResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return resourceTypeDesc
     */
    public String getResourceTypeDesc() {
        return this.resourceTypeDesc;
    }

    /**
     * @return ttsVersion
     */
    public Integer getTtsVersion() {
        return this.ttsVersion;
    }

    /**
     * @return useScene
     */
    public String getUseScene() {
        return this.useScene;
    }

    /**
     * @return voiceDesc
     */
    public String getVoiceDesc() {
        return this.voiceDesc;
    }

    /**
     * @return voiceGender
     */
    public String getVoiceGender() {
        return this.voiceGender;
    }

    /**
     * @return voiceId
     */
    public Long getVoiceId() {
        return this.voiceId;
    }

    /**
     * @return voiceLanguage
     */
    public String getVoiceLanguage() {
        return this.voiceLanguage;
    }

    /**
     * @return voiceModel
     */
    public String getVoiceModel() {
        return this.voiceModel;
    }

    /**
     * @return voiceName
     */
    public String getVoiceName() {
        return this.voiceName;
    }

    /**
     * @return voiceType
     */
    public String getVoiceType() {
        return this.voiceType;
    }

    /**
     * @return voiceUrl
     */
    public String getVoiceUrl() {
        return this.voiceUrl;
    }

    public interface Builder extends Response.Builder<VoiceModelResponse, Builder> {

        Builder resourceTypeDesc(String resourceTypeDesc);

        Builder ttsVersion(Integer ttsVersion);

        Builder useScene(String useScene);

        Builder voiceDesc(String voiceDesc);

        Builder voiceGender(String voiceGender);

        Builder voiceId(Long voiceId);

        Builder voiceLanguage(String voiceLanguage);

        Builder voiceModel(String voiceModel);

        Builder voiceName(String voiceName);

        Builder voiceType(String voiceType);

        Builder voiceUrl(String voiceUrl);

        @Override
        VoiceModelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VoiceModelResponse, Builder>
            implements Builder {
        private String resourceTypeDesc; 
        private Integer ttsVersion; 
        private String useScene; 
        private String voiceDesc; 
        private String voiceGender; 
        private Long voiceId; 
        private String voiceLanguage; 
        private String voiceModel; 
        private String voiceName; 
        private String voiceType; 
        private String voiceUrl; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VoiceModelResponse response) {
            super(response);
            this.resourceTypeDesc = response.resourceTypeDesc;
            this.ttsVersion = response.ttsVersion;
            this.useScene = response.useScene;
            this.voiceDesc = response.voiceDesc;
            this.voiceGender = response.voiceGender;
            this.voiceId = response.voiceId;
            this.voiceLanguage = response.voiceLanguage;
            this.voiceModel = response.voiceModel;
            this.voiceName = response.voiceName;
            this.voiceType = response.voiceType;
            this.voiceUrl = response.voiceUrl;
        } 

        /**
         * resourceTypeDesc.
         */
        @Override
        public Builder resourceTypeDesc(String resourceTypeDesc) {
            this.resourceTypeDesc = resourceTypeDesc;
            return this;
        }

        /**
         * ttsVersion.
         */
        @Override
        public Builder ttsVersion(Integer ttsVersion) {
            this.ttsVersion = ttsVersion;
            return this;
        }

        /**
         * useScene.
         */
        @Override
        public Builder useScene(String useScene) {
            this.useScene = useScene;
            return this;
        }

        /**
         * voiceDesc.
         */
        @Override
        public Builder voiceDesc(String voiceDesc) {
            this.voiceDesc = voiceDesc;
            return this;
        }

        /**
         * voiceGender.
         */
        @Override
        public Builder voiceGender(String voiceGender) {
            this.voiceGender = voiceGender;
            return this;
        }

        /**
         * voiceId.
         */
        @Override
        public Builder voiceId(Long voiceId) {
            this.voiceId = voiceId;
            return this;
        }

        /**
         * voiceLanguage.
         */
        @Override
        public Builder voiceLanguage(String voiceLanguage) {
            this.voiceLanguage = voiceLanguage;
            return this;
        }

        /**
         * voiceModel.
         */
        @Override
        public Builder voiceModel(String voiceModel) {
            this.voiceModel = voiceModel;
            return this;
        }

        /**
         * voiceName.
         */
        @Override
        public Builder voiceName(String voiceName) {
            this.voiceName = voiceName;
            return this;
        }

        /**
         * voiceType.
         */
        @Override
        public Builder voiceType(String voiceType) {
            this.voiceType = voiceType;
            return this;
        }

        /**
         * voiceUrl.
         */
        @Override
        public Builder voiceUrl(String voiceUrl) {
            this.voiceUrl = voiceUrl;
            return this;
        }

        @Override
        public VoiceModelResponse build() {
            return new VoiceModelResponse(this);
        } 

    } 

}
