// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValuateApplicationRequest} extends {@link RequestModel}
 *
 * <p>ValuateApplicationRequest</p>
 */
public class ValuateApplicationRequest extends Request {
    @Body
    @NameInMap("ApplicationId")
    @Validation(required = true)
    private String applicationId;

    @Body
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ValuateApplicationRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ValuateApplicationRequest, Builder> {
        private String applicationId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ValuateApplicationRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The ID of the application.
         */
        public Builder applicationId(String applicationId) {
            this.putBodyParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
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
        public ValuateApplicationRequest build() {
            return new ValuateApplicationRequest(this);
        } 

    } 

}
