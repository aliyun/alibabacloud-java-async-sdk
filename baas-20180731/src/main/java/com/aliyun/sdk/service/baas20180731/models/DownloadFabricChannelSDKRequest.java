// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadFabricChannelSDKRequest} extends {@link RequestModel}
 *
 * <p>DownloadFabricChannelSDKRequest</p>
 */
public class DownloadFabricChannelSDKRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ChannelId")
    private String channelId;

    @Body
    @NameInMap("Location")
    private String location;

    @Query
    @NameInMap("OrganizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("Username")
    @Validation(required = true)
    private String username;

    private DownloadFabricChannelSDKRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.channelId = builder.channelId;
        this.location = builder.location;
        this.organizationId = builder.organizationId;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadFabricChannelSDKRequest create() {
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
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<DownloadFabricChannelSDKRequest, Builder> {
        private String regionId; 
        private String channelId; 
        private String location; 
        private String organizationId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(DownloadFabricChannelSDKRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.channelId = request.channelId;
            this.location = request.location;
            this.organizationId = request.organizationId;
            this.username = request.username;
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
         * Location.
         */
        public Builder location(String location) {
            this.putBodyParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * OrganizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("OrganizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public DownloadFabricChannelSDKRequest build() {
            return new DownloadFabricChannelSDKRequest(this);
        } 

    } 

}
