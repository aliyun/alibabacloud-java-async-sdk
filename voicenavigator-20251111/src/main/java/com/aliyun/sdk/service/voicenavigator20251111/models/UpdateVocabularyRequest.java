// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link UpdateVocabularyRequest} extends {@link RequestModel}
 *
 * <p>UpdateVocabularyRequest</p>
 */
public class UpdateVocabularyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VocabularyId")
    private String vocabularyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Words")
    private java.util.Map<String, String> words;

    private UpdateVocabularyRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.vocabularyId = builder.vocabularyId;
        this.words = builder.words;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVocabularyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return vocabularyId
     */
    public String getVocabularyId() {
        return this.vocabularyId;
    }

    /**
     * @return words
     */
    public java.util.Map<String, String> getWords() {
        return this.words;
    }

    public static final class Builder extends Request.Builder<UpdateVocabularyRequest, Builder> {
        private String description; 
        private String instanceId; 
        private String name; 
        private String vocabularyId; 
        private java.util.Map<String, String> words; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVocabularyRequest request) {
            super(request);
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.vocabularyId = request.vocabularyId;
            this.words = request.words;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * VocabularyId.
         */
        public Builder vocabularyId(String vocabularyId) {
            this.putBodyParameter("VocabularyId", vocabularyId);
            this.vocabularyId = vocabularyId;
            return this;
        }

        /**
         * Words.
         */
        public Builder words(java.util.Map<String, String> words) {
            String wordsShrink = shrink(words, "Words", "json");
            this.putBodyParameter("Words", wordsShrink);
            this.words = words;
            return this;
        }

        @Override
        public UpdateVocabularyRequest build() {
            return new UpdateVocabularyRequest(this);
        } 

    } 

}
