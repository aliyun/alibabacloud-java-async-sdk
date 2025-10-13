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
 * {@link UpdateAndAttachPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateAndAttachPolicyRequest</p>
 */
public class UpdateAndAttachPolicyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("policyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("attachResourceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> attachResourceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("attachResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String attachResourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("environmentId")
    private String environmentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private UpdateAndAttachPolicyRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.attachResourceIds = builder.attachResourceIds;
        this.attachResourceType = builder.attachResourceType;
        this.config = builder.config;
        this.description = builder.description;
        this.environmentId = builder.environmentId;
        this.gatewayId = builder.gatewayId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAndAttachPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return attachResourceIds
     */
    public java.util.List<String> getAttachResourceIds() {
        return this.attachResourceIds;
    }

    /**
     * @return attachResourceType
     */
    public String getAttachResourceType() {
        return this.attachResourceType;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateAndAttachPolicyRequest, Builder> {
        private String policyId; 
        private java.util.List<String> attachResourceIds; 
        private String attachResourceType; 
        private String config; 
        private String description; 
        private String environmentId; 
        private String gatewayId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAndAttachPolicyRequest request) {
            super(request);
            this.policyId = request.policyId;
            this.attachResourceIds = request.attachResourceIds;
            this.attachResourceType = request.attachResourceType;
            this.config = request.config;
            this.description = request.description;
            this.environmentId = request.environmentId;
            this.gatewayId = request.gatewayId;
            this.name = request.name;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>p-cq7l5s5lhtgi6qasrdc0</p>
         */
        public Builder policyId(String policyId) {
            this.putPathParameter("policyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder attachResourceIds(java.util.List<String> attachResourceIds) {
            this.putBodyParameter("attachResourceIds", attachResourceIds);
            this.attachResourceIds = attachResourceIds;
            return this;
        }

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enable&quot;:false}</p>
         */
        public Builder config(String config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * environmentId.
         */
        public Builder environmentId(String environmentId) {
            this.putBodyParameter("environmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putBodyParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateAndAttachPolicyRequest build() {
            return new UpdateAndAttachPolicyRequest(this);
        } 

    } 

}
