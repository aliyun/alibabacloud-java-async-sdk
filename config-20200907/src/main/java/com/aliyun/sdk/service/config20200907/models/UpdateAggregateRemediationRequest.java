// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAggregateRemediationRequest} extends {@link RequestModel}
 *
 * <p>UpdateAggregateRemediationRequest</p>
 */
public class UpdateAggregateRemediationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InvokeType")
    private String invokeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemediationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String remediationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemediationTemplateId")
    private String remediationTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemediationType")
    private String remediationType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private UpdateAggregateRemediationRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.invokeType = builder.invokeType;
        this.params = builder.params;
        this.remediationId = builder.remediationId;
        this.remediationTemplateId = builder.remediationTemplateId;
        this.remediationType = builder.remediationType;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAggregateRemediationRequest create() {
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
     * @return remediationId
     */
    public String getRemediationId() {
        return this.remediationId;
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

    public static final class Builder extends Request.Builder<UpdateAggregateRemediationRequest, Builder> {
        private String aggregatorId; 
        private String invokeType; 
        private String params; 
        private String remediationId; 
        private String remediationTemplateId; 
        private String remediationType; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAggregateRemediationRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.invokeType = request.invokeType;
            this.params = request.params;
            this.remediationId = request.remediationId;
            this.remediationTemplateId = request.remediationTemplateId;
            this.remediationType = request.remediationType;
            this.sourceType = request.sourceType;
        } 

        /**
         * The ID of the account group.
         * <p>
         * 
         * You can the [ListAggregators](~~255797~~) operation to obtain the ID of the account group.
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putBodyParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The execution mode of the remediation. Valid values:
         * <p>
         * 
         * *   NON_EXECUTION: The remediation is not executed.
         * *   AUTO_EXECUTION: The remediation is automatically executed.
         * *   MANUAL_EXECUTION: The remediation is manually executed.
         * *   NOT_CONFIG: The execution mode is not specified.
         */
        public Builder invokeType(String invokeType) {
            this.putBodyParameter("InvokeType", invokeType);
            this.invokeType = invokeType;
            return this;
        }

        /**
         * The desired parameter values of the remediation setting.
         */
        public Builder params(String params) {
            this.putBodyParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * The ID of the remediation setting.
         * <p>
         * 
         * You can call the [ListAggregateRemediations](~~270036~~) operation to obtain the ID of the remediation setting.
         */
        public Builder remediationId(String remediationId) {
            this.putBodyParameter("RemediationId", remediationId);
            this.remediationId = remediationId;
            return this;
        }

        /**
         * The ID of the remediation template.
         * <p>
         * 
         * You can call the [ListRemediationTemplates](~~270066~~) operation to obtain the ID of the remediation template.
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
         * *   OOS: Operation Orchestration Service (OOS)
         * *   FC: Function Compute. You can use Function Compute to configure custom remediation settings.
         */
        public Builder remediationType(String remediationType) {
            this.putBodyParameter("RemediationType", remediationType);
            this.remediationType = remediationType;
            return this;
        }

        /**
         * The type of the rule for which the remediation template is configured. Valid values:
         * <p>
         * 
         * *   ALIYUN: managed rule.
         * *   CUSTOM: custom rule.
         * *   NONE: The rule is not specified.
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public UpdateAggregateRemediationRequest build() {
            return new UpdateAggregateRemediationRequest(this);
        } 

    } 

}
