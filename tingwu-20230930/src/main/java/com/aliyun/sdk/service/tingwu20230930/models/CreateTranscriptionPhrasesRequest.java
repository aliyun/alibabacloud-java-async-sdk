// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTranscriptionPhrasesRequest} extends {@link RequestModel}
 *
 * <p>CreateTranscriptionPhrasesRequest</p>
 */
public class CreateTranscriptionPhrasesRequest extends Request {
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

    private CreateTranscriptionPhrasesRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.wordWeights = builder.wordWeights;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTranscriptionPhrasesRequest create() {
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

    public static final class Builder extends Request.Builder<CreateTranscriptionPhrasesRequest, Builder> {
        private String description; 
        private String name; 
        private String wordWeights; 

        private Builder() {
            super();
        } 

        private Builder(CreateTranscriptionPhrasesRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.wordWeights = request.wordWeights;
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
         * WordWeights.
         */
        public Builder wordWeights(String wordWeights) {
            this.putBodyParameter("WordWeights", wordWeights);
            this.wordWeights = wordWeights;
            return this;
        }

        @Override
        public CreateTranscriptionPhrasesRequest build() {
            return new CreateTranscriptionPhrasesRequest(this);
        } 

    } 

}
