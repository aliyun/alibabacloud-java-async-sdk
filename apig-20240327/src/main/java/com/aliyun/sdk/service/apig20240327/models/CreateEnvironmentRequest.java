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
 * {@link CreateEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>CreateEnvironmentRequest</p>
 */
public class CreateEnvironmentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("alias")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alias;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    private CreateEnvironmentRequest(Builder builder) {
        super(builder);
        this.alias = builder.alias;
        this.description = builder.description;
        this.gatewayId = builder.gatewayId;
        this.name = builder.name;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEnvironmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<CreateEnvironmentRequest, Builder> {
        private String alias; 
        private String description; 
        private String gatewayId; 
        private String name; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateEnvironmentRequest request) {
            super(request);
            this.alias = request.alias;
            this.description = request.description;
            this.gatewayId = request.gatewayId;
            this.name = request.name;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>Environment alias.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>测试环境</p>
         */
        public Builder alias(String alias) {
            this.putBodyParameter("alias", alias);
            this.alias = alias;
            return this;
        }

        /**
         * <p>Description of the environment, which can include information such as the purpose of the environment and its owner.</p>
         * 
         * <strong>example:</strong>
         * <p>这是xxx的xx项目测试环境</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Gateway ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cq7l5s5lhtgi6qasrdc0</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putBodyParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>Environment name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmycs5expl7oq</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public CreateEnvironmentRequest build() {
            return new CreateEnvironmentRequest(this);
        } 

    } 

}
