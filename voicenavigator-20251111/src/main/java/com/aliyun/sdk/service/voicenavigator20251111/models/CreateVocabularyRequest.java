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
 * {@link CreateVocabularyRequest} extends {@link RequestModel}
 *
 * <p>CreateVocabularyRequest</p>
 */
public class CreateVocabularyRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Words")
    private java.util.Map<String, String> words;

    private CreateVocabularyRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.words = builder.words;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVocabularyRequest create() {
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
     * @return words
     */
    public java.util.Map<String, String> getWords() {
        return this.words;
    }

    public static final class Builder extends Request.Builder<CreateVocabularyRequest, Builder> {
        private String description; 
        private String instanceId; 
        private String name; 
        private java.util.Map<String, String> words; 

        private Builder() {
            super();
        } 

        private Builder(CreateVocabularyRequest request) {
            super(request);
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.name = request.name;
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
         * Words.
         */
        public Builder words(java.util.Map<String, String> words) {
            String wordsShrink = shrink(words, "Words", "json");
            this.putBodyParameter("Words", wordsShrink);
            this.words = words;
            return this;
        }

        @Override
        public CreateVocabularyRequest build() {
            return new CreateVocabularyRequest(this);
        } 

    } 

}
