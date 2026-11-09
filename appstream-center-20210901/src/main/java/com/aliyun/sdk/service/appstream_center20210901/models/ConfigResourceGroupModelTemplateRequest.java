// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ConfigResourceGroupModelTemplateRequest} extends {@link RequestModel}
 *
 * <p>ConfigResourceGroupModelTemplateRequest</p>
 */
public class ConfigResourceGroupModelTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModelTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroupId;

    private ConfigResourceGroupModelTemplateRequest(Builder builder) {
        super(builder);
        this.modelTemplateId = builder.modelTemplateId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigResourceGroupModelTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelTemplateId
     */
    public String getModelTemplateId() {
        return this.modelTemplateId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ConfigResourceGroupModelTemplateRequest, Builder> {
        private String modelTemplateId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigResourceGroupModelTemplateRequest request) {
            super(request);
            this.modelTemplateId = request.modelTemplateId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The model group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mt-xxxx</p>
         */
        public Builder modelTemplateId(String modelTemplateId) {
            this.putBodyParameter("ModelTemplateId", modelTemplateId);
            this.modelTemplateId = modelTemplateId;
            return this;
        }

        /**
         * <p>The WUYING resource group ID, which starts with rg-. This resource group is managed by the WUYING Enterprise Edition management and control service, and its automatic creation is performed by the system after the deployment of agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent. You can obtain it from the ResourceGroup[].ResourceGroupId field in the response of the DescribeResourceGroups operation of WUYING Workspace eds-user (API version 2021-03-08), or from the Data.ResourceGroupId field in the response of the GetRuntimeModelConfig operation of this service.</p>
         * <blockquote>
         * <p>Other IDs such as the account-level resource group ID and node pool ID in Alibaba Cloud Resource Manager cannot be passed as this parameter. Only WUYING resource group IDs are valid.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-xxxxx</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ConfigResourceGroupModelTemplateRequest build() {
            return new ConfigResourceGroupModelTemplateRequest(this);
        } 

    } 

}
