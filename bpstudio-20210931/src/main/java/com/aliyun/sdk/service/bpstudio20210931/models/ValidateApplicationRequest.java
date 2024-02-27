// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateApplicationRequest} extends {@link RequestModel}
 *
 * <p>ValidateApplicationRequest</p>
 */
public class ValidateApplicationRequest extends Request {
    @Query
    @NameInMap("ApplicationId")
    @Validation(required = true)
    private String applicationId;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ValidateApplicationRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.clientToken = builder.clientToken;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateApplicationRequest create() {
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

    public static final class Builder extends Request.Builder<ValidateApplicationRequest, Builder> {
        private String applicationId; 
        private String clientToken; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ValidateApplicationRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.clientToken = request.clientToken;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The ID of the application.
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ValidateApplicationRequest build() {
            return new ValidateApplicationRequest(this);
        } 

    } 

}
