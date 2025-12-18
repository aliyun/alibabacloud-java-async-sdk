// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link GetResourceConfigurationSampleRequest} extends {@link RequestModel}
 *
 * <p>GetResourceConfigurationSampleRequest</p>
 */
public class GetResourceConfigurationSampleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MockOnly")
    private String mockOnly;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    private GetResourceConfigurationSampleRequest(Builder builder) {
        super(builder);
        this.mockOnly = builder.mockOnly;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceConfigurationSampleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mockOnly
     */
    public String getMockOnly() {
        return this.mockOnly;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<GetResourceConfigurationSampleRequest, Builder> {
        private String mockOnly; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceConfigurationSampleRequest request) {
            super(request);
            this.mockOnly = request.mockOnly;
            this.resourceType = request.resourceType;
        } 

        /**
         * MockOnly.
         */
        public Builder mockOnly(String mockOnly) {
            this.putQueryParameter("MockOnly", mockOnly);
            this.mockOnly = mockOnly;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public GetResourceConfigurationSampleRequest build() {
            return new GetResourceConfigurationSampleRequest(this);
        } 

    } 

}
