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
    @com.aliyun.core.annotation.NameInMap("LogoVersion")
    private String logoVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NegativePrompt")
    private String negativePrompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private String parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    private CreateLogoTaskRequest(Builder builder) {
        super(builder);
        this.logoVersion = builder.logoVersion;
        this.negativePrompt = builder.negativePrompt;
        this.parameters = builder.parameters;
        this.prompt = builder.prompt;
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
     * @return logoVersion
     */
    public String getLogoVersion() {
        return this.logoVersion;
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

    public static final class Builder extends Request.Builder<CreateLogoTaskRequest, Builder> {
        private String logoVersion; 
        private String negativePrompt; 
        private String parameters; 
        private String prompt; 

        private Builder() {
            super();
        } 

        private Builder(CreateLogoTaskRequest request) {
            super(request);
            this.logoVersion = request.logoVersion;
            this.negativePrompt = request.negativePrompt;
            this.parameters = request.parameters;
            this.prompt = request.prompt;
        } 

        /**
         * <p>The logo generation version number. Different versions use different parameter parsing methods.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder logoVersion(String logoVersion) {
            this.putQueryParameter("LogoVersion", logoVersion);
            this.logoVersion = logoVersion;
            return this;
        }

        /**
         * <p>The negative prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>Do not generate politically related image content</p>
         */
        public Builder negativePrompt(String negativePrompt) {
            this.putQueryParameter("NegativePrompt", negativePrompt);
            this.negativePrompt = negativePrompt;
            return this;
        }

        /**
         * <p>The task parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;ehpcutilParam\&quot;:\&quot;sched job_submit --commandline \\\&quot;/ehpcdata/data/usersTest/huangqiaoyi-1725933699384/huangqiaoyi-1725933699384.slurm\\\&quot; --runasuser TestGfjnSimworks\&quot;}</p>
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The positive prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>Strictly extract the summary of the article based on the original text. Do not fabricate or modify the news data in the text, change the original meaning or news facts, or add your own opinions to the summary. Ensure that the generated summary is free of grammatical and punctuation errors. Remove information such as the reporter, correspondent, and source when generating the summary</p>
         */
        public Builder prompt(String prompt) {
            this.putQueryParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        @Override
        public CreateLogoTaskRequest build() {
            return new CreateLogoTaskRequest(this);
        } 

    } 

}
