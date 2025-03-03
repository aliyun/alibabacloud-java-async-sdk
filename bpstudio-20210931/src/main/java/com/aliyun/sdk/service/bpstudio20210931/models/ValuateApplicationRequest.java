// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

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
 * {@link ValuateApplicationRequest} extends {@link RequestModel}
 *
 * <p>ValuateApplicationRequest</p>
 */
public class ValuateApplicationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ValuateApplicationRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.clientToken = builder.clientToken;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValuateApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ValuateApplicationRequest, Builder> {
        private String applicationId; 
        private String clientToken; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ValuateApplicationRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.clientToken = request.clientToken;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The operation that you want to perform. Set the value to ValuateApplication.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>02S7UU41WKJL7ERR</p>
         */
        public Builder applicationId(String applicationId) {
            this.putBodyParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the application you want to query belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1600765710019</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyjt3c5om3hi</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ValuateApplicationRequest build() {
            return new ValuateApplicationRequest(this);
        } 

    } 

}
