// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRemediationRequest} extends {@link RequestModel}
 *
 * <p>UpdateRemediationRequest</p>
 */
public class UpdateRemediationRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("InvokeType")
    private String invokeType;

    @Body
    @NameInMap("Params")
    private String params;

    @Body
    @NameInMap("RemediationId")
    @Validation(required = true)
    private String remediationId;

    @Body
    @NameInMap("RemediationTemplateId")
    private String remediationTemplateId;

    @Body
    @NameInMap("RemediationType")
    private String remediationType;

    @Body
    @NameInMap("SourceType")
    private String sourceType;

    private UpdateRemediationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
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

    public static UpdateRemediationRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateRemediationRequest, Builder> {
        private String clientToken; 
        private String invokeType; 
        private String params; 
        private String remediationId; 
        private String remediationTemplateId; 
        private String remediationType; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRemediationRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.invokeType = request.invokeType;
            this.params = request.params;
            this.remediationId = request.remediationId;
            this.remediationTemplateId = request.remediationTemplateId;
            this.remediationType = request.remediationType;
            this.sourceType = request.sourceType;
        } 

        /**
         * The client token that is used to ensure the idempotency of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * You can call the [ListRemediations](~~270772~~) operation to obtain the ID of the remediation setting.
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
         * The source of the remediation setting. Valid values:
         * <p>
         * 
         * *   ALIYUN: the default remediation setting of Alibaba Cloud.
         * *   CUSTOM: a custom remediation setting.
         * *   NONE: The source is not specified.
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public UpdateRemediationRequest build() {
            return new UpdateRemediationRequest(this);
        } 

    } 

}
