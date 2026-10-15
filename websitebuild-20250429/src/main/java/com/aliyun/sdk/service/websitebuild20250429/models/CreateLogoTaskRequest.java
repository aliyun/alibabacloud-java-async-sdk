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
         * LogoVersion.
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
         * <p>不生成政治相关图片内容</p>
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
         * <p>请严格遵照原文提取稿件的摘要，不要随意捏造和修改文中出现的新闻数据，不要改变原文的意思和新闻事实，不要在摘要中添加自己的观点。生成的摘要不要出现语法和标点的错误。在生成摘要时请去掉里面的记者、通讯员、稿件来源等信息。</p>
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
