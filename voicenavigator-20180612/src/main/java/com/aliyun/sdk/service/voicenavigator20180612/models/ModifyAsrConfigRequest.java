// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
 * {@link ModifyAsrConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyAsrConfigRequest</p>
 */
public class ModifyAsrConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    private String appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsrAcousticModelId")
    private String asrAcousticModelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsrClassVocabularyId")
    private String asrClassVocabularyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsrCustomizationId")
    private String asrCustomizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsrOverrides")
    private String asrOverrides;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsrOverridesUuid")
    private String asrOverridesUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsrVocabularyId")
    private String asrVocabularyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigLevel")
    private Integer configLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineXunfei")
    private String engineXunfei;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntryId")
    private String entryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NlsServiceType")
    private String nlsServiceType;

    private ModifyAsrConfigRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.asrAcousticModelId = builder.asrAcousticModelId;
        this.asrClassVocabularyId = builder.asrClassVocabularyId;
        this.asrCustomizationId = builder.asrCustomizationId;
        this.asrOverrides = builder.asrOverrides;
        this.asrOverridesUuid = builder.asrOverridesUuid;
        this.asrVocabularyId = builder.asrVocabularyId;
        this.configLevel = builder.configLevel;
        this.engine = builder.engine;
        this.engineXunfei = builder.engineXunfei;
        this.entryId = builder.entryId;
        this.nlsServiceType = builder.nlsServiceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAsrConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return asrAcousticModelId
     */
    public String getAsrAcousticModelId() {
        return this.asrAcousticModelId;
    }

    /**
     * @return asrClassVocabularyId
     */
    public String getAsrClassVocabularyId() {
        return this.asrClassVocabularyId;
    }

    /**
     * @return asrCustomizationId
     */
    public String getAsrCustomizationId() {
        return this.asrCustomizationId;
    }

    /**
     * @return asrOverrides
     */
    public String getAsrOverrides() {
        return this.asrOverrides;
    }

    /**
     * @return asrOverridesUuid
     */
    public String getAsrOverridesUuid() {
        return this.asrOverridesUuid;
    }

    /**
     * @return asrVocabularyId
     */
    public String getAsrVocabularyId() {
        return this.asrVocabularyId;
    }

    /**
     * @return configLevel
     */
    public Integer getConfigLevel() {
        return this.configLevel;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return engineXunfei
     */
    public String getEngineXunfei() {
        return this.engineXunfei;
    }

    /**
     * @return entryId
     */
    public String getEntryId() {
        return this.entryId;
    }

    /**
     * @return nlsServiceType
     */
    public String getNlsServiceType() {
        return this.nlsServiceType;
    }

    public static final class Builder extends Request.Builder<ModifyAsrConfigRequest, Builder> {
        private String appKey; 
        private String asrAcousticModelId; 
        private String asrClassVocabularyId; 
        private String asrCustomizationId; 
        private String asrOverrides; 
        private String asrOverridesUuid; 
        private String asrVocabularyId; 
        private Integer configLevel; 
        private String engine; 
        private String engineXunfei; 
        private String entryId; 
        private String nlsServiceType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAsrConfigRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.asrAcousticModelId = request.asrAcousticModelId;
            this.asrClassVocabularyId = request.asrClassVocabularyId;
            this.asrCustomizationId = request.asrCustomizationId;
            this.asrOverrides = request.asrOverrides;
            this.asrOverridesUuid = request.asrOverridesUuid;
            this.asrVocabularyId = request.asrVocabularyId;
            this.configLevel = request.configLevel;
            this.engine = request.engine;
            this.engineXunfei = request.engineXunfei;
            this.entryId = request.entryId;
            this.nlsServiceType = request.nlsServiceType;
        } 

        /**
         * AppKey.
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * AsrAcousticModelId.
         */
        public Builder asrAcousticModelId(String asrAcousticModelId) {
            this.putQueryParameter("AsrAcousticModelId", asrAcousticModelId);
            this.asrAcousticModelId = asrAcousticModelId;
            return this;
        }

        /**
         * AsrClassVocabularyId.
         */
        public Builder asrClassVocabularyId(String asrClassVocabularyId) {
            this.putQueryParameter("AsrClassVocabularyId", asrClassVocabularyId);
            this.asrClassVocabularyId = asrClassVocabularyId;
            return this;
        }

        /**
         * AsrCustomizationId.
         */
        public Builder asrCustomizationId(String asrCustomizationId) {
            this.putQueryParameter("AsrCustomizationId", asrCustomizationId);
            this.asrCustomizationId = asrCustomizationId;
            return this;
        }

        /**
         * AsrOverrides.
         */
        public Builder asrOverrides(String asrOverrides) {
            this.putQueryParameter("AsrOverrides", asrOverrides);
            this.asrOverrides = asrOverrides;
            return this;
        }

        /**
         * AsrOverridesUuid.
         */
        public Builder asrOverridesUuid(String asrOverridesUuid) {
            this.putQueryParameter("AsrOverridesUuid", asrOverridesUuid);
            this.asrOverridesUuid = asrOverridesUuid;
            return this;
        }

        /**
         * AsrVocabularyId.
         */
        public Builder asrVocabularyId(String asrVocabularyId) {
            this.putQueryParameter("AsrVocabularyId", asrVocabularyId);
            this.asrVocabularyId = asrVocabularyId;
            return this;
        }

        /**
         * ConfigLevel.
         */
        public Builder configLevel(Integer configLevel) {
            this.putQueryParameter("ConfigLevel", configLevel);
            this.configLevel = configLevel;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * EngineXunfei.
         */
        public Builder engineXunfei(String engineXunfei) {
            this.putQueryParameter("EngineXunfei", engineXunfei);
            this.engineXunfei = engineXunfei;
            return this;
        }

        /**
         * EntryId.
         */
        public Builder entryId(String entryId) {
            this.putQueryParameter("EntryId", entryId);
            this.entryId = entryId;
            return this;
        }

        /**
         * NlsServiceType.
         */
        public Builder nlsServiceType(String nlsServiceType) {
            this.putQueryParameter("NlsServiceType", nlsServiceType);
            this.nlsServiceType = nlsServiceType;
            return this;
        }

        @Override
        public ModifyAsrConfigRequest build() {
            return new ModifyAsrConfigRequest(this);
        } 

    } 

}
