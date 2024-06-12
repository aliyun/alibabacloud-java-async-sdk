// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAggregateRemediationRequest} extends {@link RequestModel}
 *
 * <p>CreateAggregateRemediationRequest</p>
 */
public class CreateAggregateRemediationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

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

    private CreateAggregateRemediationRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
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

    public static CreateAggregateRemediationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
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

    public static final class Builder extends Request.Builder<CreateAggregateRemediationRequest, Builder> {
        private String aggregatorId; 
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

        private Builder(CreateAggregateRemediationRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.clientToken = request.clientToken;
            this.configRuleId = request.configRuleId;
            this.invokeType = request.invokeType;
            this.params = request.params;
            this.remediationTemplateId = request.remediationTemplateId;
            this.remediationType = request.remediationType;
            this.sourceType = request.sourceType;
        } 

        /**
         * The ID of the account group.
         * <p>
         * 
         * For more information about how to obtain the ID of the account group, see [ListAggregators](~~255797~~).
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putBodyParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The `token` can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The rule ID.
         * <p>
         * 
         * For more information about how to obtain the ID of a rule, see [ListAggregateConfigRules](~~264148~~).
         */
        public Builder configRuleId(String configRuleId) {
            this.putBodyParameter("ConfigRuleId", configRuleId);
            this.configRuleId = configRuleId;
            return this;
        }

        /**
         * The execution mode of the remediation template. Valid values:
         * <p>
         * 
         * *   NON_EXECUTION: The remediation template is not executed.
         * *   AUTO_EXECUTION: The remediation template is automatically executed.
         * *   MANUAL_EXECUTION: The remediation template is manually executed.
         * *   NOT_CONFIG: The execution mode is not specified.
         */
        public Builder invokeType(String invokeType) {
            this.putBodyParameter("InvokeType", invokeType);
            this.invokeType = invokeType;
            return this;
        }

        /**
         * The configuration of the remediation template.
         * <p>
         * 
         * For more information about how to obtain the configuration of the remediation template, see [ListRemediationTemplates](~~416781~~). You can view the `TemplateDefinition` response parameter to obtain the configuration of the remediation template.
         */
        public Builder params(String params) {
            this.putBodyParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * The ID of the remediation template.
         * <p>
         * 
         * *   If you set the `RemediationType` parameter to `OOS`, set this parameter to the identifier of the relevant official remediation template, such as `ACS-OSS-PutBucketAcl`. For more information about how to obtain the remediation template identifier, see [ListRemediationTemplates](~~416781~~).
         * *   If you set the `RemediationType` parameter to `FC`, set this parameter to the Alibaba Cloud Resource Name (ARN) of the relevant Function Compute resource, such as `acs:fc:cn-hangzhou:100931896542****:services/ConfigService.LATEST/functions/test-php`.
         */
        public Builder remediationTemplateId(String remediationTemplateId) {
            this.putBodyParameter("RemediationTemplateId", remediationTemplateId);
            this.remediationTemplateId = remediationTemplateId;
            return this;
        }

        /**
         * The type of the remediation template. Valid values:
         * <p>
         * 
         * *   OOS: stands for Operation Orchestration Service and indicates official remediation.
         * *   FC: stands for Function Compute and indicates custom remediation.
         */
        public Builder remediationType(String remediationType) {
            this.putBodyParameter("RemediationType", remediationType);
            this.remediationType = remediationType;
            return this;
        }

        /**
         * The source of remediation template. Valid values:
         * <p>
         * 
         * *   ALIYUN (default): official template.
         * *   CUSTOM: custom template.
         * *   NONE: none.
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public CreateAggregateRemediationRequest build() {
            return new CreateAggregateRemediationRequest(this);
        } 

    } 

}
