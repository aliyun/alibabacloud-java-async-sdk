// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link CreateRemediationRequest} extends {@link RequestModel}
 *
 * <p>CreateRemediationRequest</p>
 */
public class CreateRemediationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InvokeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String invokeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Params")
    @com.aliyun.core.annotation.Validation(required = true)
    private String params;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemediationTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String remediationTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemediationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String remediationType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private CreateRemediationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.configRuleId = builder.configRuleId;
        this.invokeType = builder.invokeType;
        this.params = builder.params;
        this.remediationTemplateId = builder.remediationTemplateId;
        this.remediationType = builder.remediationType;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRemediationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return configRuleId
     */
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    /**
     * @return invokeType
     */
    public String getInvokeType() {
        return this.invokeType;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return remediationTemplateId
     */
    public String getRemediationTemplateId() {
        return this.remediationTemplateId;
    }

    /**
     * @return remediationType
     */
    public String getRemediationType() {
        return this.remediationType;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<CreateRemediationRequest, Builder> {
        private String clientToken; 
        private String configRuleId; 
        private String invokeType; 
        private String params; 
        private String remediationTemplateId; 
        private String remediationType; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(CreateRemediationRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.configRuleId = request.configRuleId;
            this.invokeType = request.invokeType;
            this.params = request.params;
            this.remediationTemplateId = request.remediationTemplateId;
            this.remediationType = request.remediationType;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <code>token</code> can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The rule ID.</p>
         * <p>For more information about how to obtain the ID of a rule, see <a href="https://help.aliyun.com/document_detail/169607.html">ListConfigRules</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-8a973ac2e2be00a2****</p>
         */
        public Builder configRuleId(String configRuleId) {
            this.putBodyParameter("ConfigRuleId", configRuleId);
            this.configRuleId = configRuleId;
            return this;
        }

        /**
         * <p>The execution mode of the remediation template. Valid values:</p>
         * <ul>
         * <li>NON_EXECUTION: The remediation template is not executed.</li>
         * <li>AUTO_EXECUTION: The remediation template is automatically executed.</li>
         * <li>MANUAL_EXECUTION: The remediation template is manually executed.</li>
         * <li>NOT_CONFIG: The execution mode is not specified.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MANUAL_EXECUTION</p>
         */
        public Builder invokeType(String invokeType) {
            this.putBodyParameter("InvokeType", invokeType);
            this.invokeType = invokeType;
            return this;
        }

        /**
         * <p>The configuration of the remediation template.</p>
         * <p>For more information about how to obtain the remediation template configuration, see the <code>TemplateDefinition</code> response parameter provided in <a href="https://help.aliyun.com/document_detail/416781.html">ListRemediationTemplates</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;bucketName&quot;: &quot;{resourceId}&quot;, &quot;regionId&quot;: &quot;{regionId}&quot;, &quot;permissionName&quot;: &quot;private&quot;}</p>
         */
        public Builder params(String params) {
            this.putBodyParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>The ID of the remediation template.</p>
         * <ul>
         * <li>If you set the <code>RemediationType</code> parameter to <code>OOS</code>, set this parameter to the identifier of the relevant official remediation template, such as <code>ACS-OSS-PutBucketAcl</code>. For more information about how to obtain the remediation template identifier, see <a href="https://help.aliyun.com/document_detail/416781.html">ListRemediationTemplates</a>.</li>
         * <li>If you set the <code>RemediationType</code> parameter to <code>FC</code>, set this parameter to the Alibaba Cloud Resource Name (ARN) of the relevant Function Compute resource, such as <code>acs:fc:cn-hangzhou:100931896542****:services/ConfigService.LATEST/functions/test-php</code>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS-OSS-PutBucketAcl</p>
         */
        public Builder remediationTemplateId(String remediationTemplateId) {
            this.putBodyParameter("RemediationTemplateId", remediationTemplateId);
            this.remediationTemplateId = remediationTemplateId;
            return this;
        }

        /**
         * <p>The type of the remediation template. Valid values:</p>
         * <ul>
         * <li>OOS: Operation Orchestration Service (official remediation)</li>
         * <li>FC: Function Compute (custom remediation)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OOS</p>
         */
        public Builder remediationType(String remediationType) {
            this.putBodyParameter("RemediationType", remediationType);
            this.remediationType = remediationType;
            return this;
        }

        /**
         * <p>The source of remediation. Valid values:</p>
         * <ul>
         * <li>ALIYUN (default): official template.</li>
         * <li>CUSTOM: custom template.</li>
         * <li>NONE: none.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public CreateRemediationRequest build() {
            return new CreateRemediationRequest(this);
        } 

    } 

}
