// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMultiAccountResourceConfigurationRequest} extends {@link RequestModel}
 *
 * <p>GetMultiAccountResourceConfigurationRequest</p>
 */
public class GetMultiAccountResourceConfigurationRequest extends Request {
    @Query
    @NameInMap("AccountId")
    @Validation(required = true)
    private String accountId;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("ResourceRegionId")
    @Validation(required = true)
    private String resourceRegionId;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    private GetMultiAccountResourceConfigurationRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.resourceId = builder.resourceId;
        this.resourceRegionId = builder.resourceRegionId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMultiAccountResourceConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceRegionId
     */
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<GetMultiAccountResourceConfigurationRequest, Builder> {
        private String accountId; 
        private String resourceId; 
        private String resourceRegionId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetMultiAccountResourceConfigurationRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.resourceId = request.resourceId;
            this.resourceRegionId = request.resourceRegionId;
            this.resourceType = request.resourceType;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceRegionId.
         */
        public Builder resourceRegionId(String resourceRegionId) {
            this.putQueryParameter("ResourceRegionId", resourceRegionId);
            this.resourceRegionId = resourceRegionId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public GetMultiAccountResourceConfigurationRequest build() {
            return new GetMultiAccountResourceConfigurationRequest(this);
        } 

    } 

}
