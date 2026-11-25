// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link CreateMultiModalTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateMultiModalTaskRequest</p>
 */
public class CreateMultiModalTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentSpace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("args")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> args;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("arn")
    private String arn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("evaluatorRef")
    @com.aliyun.core.annotation.Validation(required = true)
    private String evaluatorRef;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ossRegion")
    private String ossRegion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("prompt")
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskName")
    private String taskName;

    private CreateMultiModalTaskRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.args = builder.args;
        this.arn = builder.arn;
        this.evaluatorRef = builder.evaluatorRef;
        this.ossRegion = builder.ossRegion;
        this.prompt = builder.prompt;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMultiModalTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return args
     */
    public java.util.Map<String, ?> getArgs() {
        return this.args;
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * @return evaluatorRef
     */
    public String getEvaluatorRef() {
        return this.evaluatorRef;
    }

    /**
     * @return ossRegion
     */
    public String getOssRegion() {
        return this.ossRegion;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<CreateMultiModalTaskRequest, Builder> {
        private String agentSpace; 
        private java.util.Map<String, ?> args; 
        private String arn; 
        private String evaluatorRef; 
        private String ossRegion; 
        private String prompt; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(CreateMultiModalTaskRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.args = request.args;
            this.arn = request.arn;
            this.evaluatorRef = request.evaluatorRef;
            this.ossRegion = request.ossRegion;
            this.prompt = request.prompt;
            this.taskName = request.taskName;
        } 

        /**
         * <p>The AgentSpace name. It must be 3 to 63 characters in length and can contain only lowercase letters, digits, and hyphens. It must start and end with a letter or a digit.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-space</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putBodyParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The input parameters for the evaluator. The keys are defined by the evaluator specified by evaluatorRef. Example for national subsidy image inspection: {&quot;imageUrl&quot;:&quot;<a href="https://example.com/label.jpg%22%7D">https://example.com/label.jpg&quot;}</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;imageUrl&quot;:&quot;<a href="https://example-bucket.oss-cn-hangzhou.aliyuncs.com/label.jpg%22%7D">https://example-bucket.oss-cn-hangzhou.aliyuncs.com/label.jpg&quot;}</a></p>
         */
        public Builder args(java.util.Map<String, ?> args) {
            this.putBodyParameter("args", args);
            this.args = args;
            return this;
        }

        /**
         * <p>The ARN of the role used to access OSS or SLS, such as acs:ram::<accountId>:role/<roleName>. It is used to derive the signature region.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1234567890123456:role/media-reader</p>
         */
        public Builder arn(String arn) {
            this.putBodyParameter("arn", arn);
            this.arn = arn;
            return this;
        }

        /**
         * <p>The name of the evaluator registered as a public API. If the evaluator is not registered, not exposed as a public API, or the current version is invalid, a 400 error is returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Builtin.subsidy_api</p>
         */
        public Builder evaluatorRef(String evaluatorRef) {
            this.putBodyParameter("evaluatorRef", evaluatorRef);
            this.evaluatorRef = evaluatorRef;
            return this;
        }

        /**
         * <p>The signature region when the media is stored in OSS or SLS, such as cn-hangzhou. This parameter is used only when the region cannot be determined from the URL itself.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder ossRegion(String ossRegion) {
            this.putBodyParameter("ossRegion", ossRegion);
            this.ossRegion = ossRegion;
            return this;
        }

        /**
         * <p>The evaluation prompt. If omitted, it is processed as an empty string. The maximum length is 2,000 characters, counted by Unicode code points.</p>
         * 
         * <strong>example:</strong>
         * <p>Verify whether the image is complete</p>
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>The task name, used to group multiple calls of the same business line in the console. If omitted or empty, agentloop-media-process is used. The maximum length is 128 characters. Control characters are not allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>agentloop-media-process</p>
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("taskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public CreateMultiModalTaskRequest build() {
            return new CreateMultiModalTaskRequest(this);
        } 

    } 

}
