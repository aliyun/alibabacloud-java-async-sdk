// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianvoicebot20250101.models;

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
    @com.aliyun.core.annotation.NameInMap("BusinessUnitId")
    private String businessUnitId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Words")
    private java.util.Map<String, String> words;

    private CreateVocabularyRequest(Builder builder) {
        super(builder);
        this.businessUnitId = builder.businessUnitId;
        this.description = builder.description;
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
     * @return businessUnitId
     */
    public String getBusinessUnitId() {
        return this.businessUnitId;
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
     * @return words
     */
    public java.util.Map<String, String> getWords() {
        return this.words;
    }

    public static final class Builder extends Request.Builder<CreateVocabularyRequest, Builder> {
        private String businessUnitId; 
        private String description; 
        private String name; 
        private java.util.Map<String, String> words; 

        private Builder() {
            super();
        } 

        private Builder(CreateVocabularyRequest request) {
            super(request);
            this.businessUnitId = request.businessUnitId;
            this.description = request.description;
            this.name = request.name;
            this.words = request.words;
        } 

        /**
         * BusinessUnitId.
         */
        public Builder businessUnitId(String businessUnitId) {
            this.putBodyParameter("BusinessUnitId", businessUnitId);
            this.businessUnitId = businessUnitId;
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
