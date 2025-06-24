// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link CreateLogoTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateLogoTaskRequest</p>
 */
public class CreateLogoTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NegativePrompt")
    private String negativePrompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private String parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private CreateLogoTaskRequest(Builder builder) {
        super(builder);
        this.negativePrompt = builder.negativePrompt;
        this.parameters = builder.parameters;
        this.prompt = builder.prompt;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLogoTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return negativePrompt
     */
    public String getNegativePrompt() {
        return this.negativePrompt;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<CreateLogoTaskRequest, Builder> {
        private String negativePrompt; 
        private String parameters; 
        private String prompt; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(CreateLogoTaskRequest request) {
            super(request);
            this.negativePrompt = request.negativePrompt;
            this.parameters = request.parameters;
            this.prompt = request.prompt;
            this.version = request.version;
        } 

        /**
         * NegativePrompt.
         */
        public Builder negativePrompt(String negativePrompt) {
            this.putQueryParameter("NegativePrompt", negativePrompt);
            this.negativePrompt = negativePrompt;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * Prompt.
         */
        public Builder prompt(String prompt) {
            this.putQueryParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public CreateLogoTaskRequest build() {
            return new CreateLogoTaskRequest(this);
        } 

    } 

}
