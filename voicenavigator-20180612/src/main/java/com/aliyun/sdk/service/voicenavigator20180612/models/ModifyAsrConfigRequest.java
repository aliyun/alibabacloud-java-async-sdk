// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAsrConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyAsrConfigRequest</p>
 */
public class ModifyAsrConfigRequest extends Request {
    @Query
    @NameInMap("AsrAcousticModelId")
    private String asrAcousticModelId;

    @Query
    @NameInMap("AsrClassVocabularyId")
    private String asrClassVocabularyId;

    @Query
    @NameInMap("AsrCustomizationId")
    private String asrCustomizationId;

    @Query
    @NameInMap("AsrVocabularyId")
    private String asrVocabularyId;

    @Query
    @NameInMap("ConfigLevel")
    private Integer configLevel;

    @Query
    @NameInMap("EntryId")
    private String entryId;

    private ModifyAsrConfigRequest(Builder builder) {
        super(builder);
        this.asrAcousticModelId = builder.asrAcousticModelId;
        this.asrClassVocabularyId = builder.asrClassVocabularyId;
        this.asrCustomizationId = builder.asrCustomizationId;
        this.asrVocabularyId = builder.asrVocabularyId;
        this.configLevel = builder.configLevel;
        this.entryId = builder.entryId;
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
     * @return entryId
     */
    public String getEntryId() {
        return this.entryId;
    }

    public static final class Builder extends Request.Builder<ModifyAsrConfigRequest, Builder> {
        private String asrAcousticModelId; 
        private String asrClassVocabularyId; 
        private String asrCustomizationId; 
        private String asrVocabularyId; 
        private Integer configLevel; 
        private String entryId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAsrConfigRequest request) {
            super(request);
            this.asrAcousticModelId = request.asrAcousticModelId;
            this.asrClassVocabularyId = request.asrClassVocabularyId;
            this.asrCustomizationId = request.asrCustomizationId;
            this.asrVocabularyId = request.asrVocabularyId;
            this.configLevel = request.configLevel;
            this.entryId = request.entryId;
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
         * EntryId.
         */
        public Builder entryId(String entryId) {
            this.putQueryParameter("EntryId", entryId);
            this.entryId = entryId;
            return this;
        }

        @Override
        public ModifyAsrConfigRequest build() {
            return new ModifyAsrConfigRequest(this);
        } 

    } 

}
