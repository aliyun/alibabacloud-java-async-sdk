// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link CreatePolicyAttachmentRequest} extends {@link RequestModel}
 *
 * <p>CreatePolicyAttachmentRequest</p>
 */
public class CreatePolicyAttachmentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("attachResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String attachResourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("attachResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String attachResourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("environmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("policyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    private CreatePolicyAttachmentRequest(Builder builder) {
        super(builder);
        this.attachResourceId = builder.attachResourceId;
        this.attachResourceType = builder.attachResourceType;
        this.environmentId = builder.environmentId;
        this.gatewayId = builder.gatewayId;
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolicyAttachmentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachResourceId
     */
    public String getAttachResourceId() {
        return this.attachResourceId;
    }

    /**
     * @return attachResourceType
     */
    public String getAttachResourceType() {
        return this.attachResourceType;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    public static final class Builder extends Request.Builder<CreatePolicyAttachmentRequest, Builder> {
        private String attachResourceId; 
        private String attachResourceType; 
        private String environmentId; 
        private String gatewayId; 
        private String policyId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePolicyAttachmentRequest request) {
            super(request);
            this.attachResourceId = request.attachResourceId;
            this.attachResourceType = request.attachResourceType;
            this.environmentId = request.environmentId;
            this.gatewayId = request.gatewayId;
            this.policyId = request.policyId;
        } 

        /**
         * <p>Attached resource ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api-cu07jj6m1hkokaus***</p>
         */
        public Builder attachResourceId(String attachResourceId) {
            this.putBodyParameter("attachResourceId", attachResourceId);
            this.attachResourceId = attachResourceId;
            return this;
        }

        /**
         * <p>Attached resource type, such as HttpApi, GatewayRoute, Operation, GatewayService, GatewayServicePort, Gateway, Domain</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HttpApi</p>
         */
        public Builder attachResourceType(String attachResourceType) {
            this.putBodyParameter("attachResourceType", attachResourceType);
            this.attachResourceType = attachResourceType;
            return this;
        }

        /**
         * <p>Environment ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>env-cquqsollhtgid***</p>
         */
        public Builder environmentId(String environmentId) {
            this.putBodyParameter("environmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * <p>Gateway instance ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cq7l5s5lhtgi6qas***</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putBodyParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>Policy ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>p-cq787etlhtghrptjg***</p>
         */
        public Builder policyId(String policyId) {
            this.putBodyParameter("policyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public CreatePolicyAttachmentRequest build() {
            return new CreatePolicyAttachmentRequest(this);
        } 

    } 

}
