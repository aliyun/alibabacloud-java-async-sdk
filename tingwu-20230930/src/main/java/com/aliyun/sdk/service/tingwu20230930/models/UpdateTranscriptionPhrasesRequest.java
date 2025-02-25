// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20230930.models;

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
 * {@link UpdateTranscriptionPhrasesRequest} extends {@link RequestModel}
 *
 * <p>UpdateTranscriptionPhrasesRequest</p>
 */
public class UpdateTranscriptionPhrasesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("PhraseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phraseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 250, minLength = 1)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 50, minLength = 1)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WordWeights")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wordWeights;

    private UpdateTranscriptionPhrasesRequest(Builder builder) {
        super(builder);
        this.phraseId = builder.phraseId;
        this.description = builder.description;
        this.name = builder.name;
        this.wordWeights = builder.wordWeights;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTranscriptionPhrasesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return phraseId
     */
    public String getPhraseId() {
        return this.phraseId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return wordWeights
     */
    public String getWordWeights() {
        return this.wordWeights;
    }

    public static final class Builder extends Request.Builder<UpdateTranscriptionPhrasesRequest, Builder> {
        private String phraseId; 
        private String description; 
        private String name; 
        private String wordWeights; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTranscriptionPhrasesRequest request) {
            super(request);
            this.phraseId = request.phraseId;
            this.description = request.description;
            this.name = request.name;
            this.wordWeights = request.wordWeights;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a93b91141c0f422fa114af203f8b****</p>
         */
        public Builder phraseId(String phraseId) {
            this.putPathParameter("PhraseId", phraseId);
            this.phraseId = phraseId;
            return this;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fruit_phrase</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;苹果&quot;:3,&quot;西瓜&quot;:3}</p>
         */
        public Builder wordWeights(String wordWeights) {
            this.putBodyParameter("WordWeights", wordWeights);
            this.wordWeights = wordWeights;
            return this;
        }

        @Override
        public UpdateTranscriptionPhrasesRequest build() {
            return new UpdateTranscriptionPhrasesRequest(this);
        } 

    } 

}
