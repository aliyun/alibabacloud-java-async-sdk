// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFabricExternalOrganizationToChannelRequest} extends {@link RequestModel}
 *
 * <p>AddFabricExternalOrganizationToChannelRequest</p>
 */
public class AddFabricExternalOrganizationToChannelRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ChannelId")
    @Validation(required = true)
    private String channelId;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("JoinRequest")
    @Validation(required = true)
    private String joinRequest;

    @Body
    @NameInMap("OrganizationId")
    @Validation(required = true)
    private String organizationId;

    private AddFabricExternalOrganizationToChannelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.channelId = builder.channelId;
        this.description = builder.description;
        this.joinRequest = builder.joinRequest;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFabricExternalOrganizationToChannelRequest create() {
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
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return joinRequest
     */
    public String getJoinRequest() {
        return this.joinRequest;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<AddFabricExternalOrganizationToChannelRequest, Builder> {
        private String regionId; 
        private String channelId; 
        private String description; 
        private String joinRequest; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(AddFabricExternalOrganizationToChannelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.channelId = request.channelId;
            this.description = request.description;
            this.joinRequest = request.joinRequest;
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
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putBodyParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * JoinRequest.
         */
        public Builder joinRequest(String joinRequest) {
            this.putBodyParameter("JoinRequest", joinRequest);
            this.joinRequest = joinRequest;
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
        public AddFabricExternalOrganizationToChannelRequest build() {
            return new AddFabricExternalOrganizationToChannelRequest(this);
        } 

    } 

}
