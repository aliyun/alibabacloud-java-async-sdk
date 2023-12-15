// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFabricOrganizationToExternalChannelRequest} extends {@link RequestModel}
 *
 * <p>AddFabricOrganizationToExternalChannelRequest</p>
 */
public class AddFabricOrganizationToExternalChannelRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("JoinResponse")
    @Validation(required = true)
    private String joinResponse;

    @Body
    @NameInMap("OrganizationId")
    @Validation(required = true)
    private String organizationId;

    private AddFabricOrganizationToExternalChannelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.joinResponse = builder.joinResponse;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFabricOrganizationToExternalChannelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return joinResponse
     */
    public String getJoinResponse() {
        return this.joinResponse;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<AddFabricOrganizationToExternalChannelRequest, Builder> {
        private String regionId; 
        private String joinResponse; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(AddFabricOrganizationToExternalChannelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.joinResponse = request.joinResponse;
            this.organizationId = request.organizationId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * JoinResponse.
         */
        public Builder joinResponse(String joinResponse) {
            this.putBodyParameter("JoinResponse", joinResponse);
            this.joinResponse = joinResponse;
            return this;
        }

        /**
         * OrganizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putBodyParameter("OrganizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public AddFabricOrganizationToExternalChannelRequest build() {
            return new AddFabricOrganizationToExternalChannelRequest(this);
        } 

    } 

}
