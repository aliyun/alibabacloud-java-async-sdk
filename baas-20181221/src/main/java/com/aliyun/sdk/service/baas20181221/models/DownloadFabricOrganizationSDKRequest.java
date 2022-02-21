// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadFabricOrganizationSDKRequest} extends {@link RequestModel}
 *
 * <p>DownloadFabricOrganizationSDKRequest</p>
 */
public class DownloadFabricOrganizationSDKRequest extends Request {
    @Body
    @NameInMap("Location")
    private String location;

    @Query
    @NameInMap("OrganizationId")
    @Validation(required = true)
    private String organizationId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Username")
    @Validation(required = true)
    private String username;

    private DownloadFabricOrganizationSDKRequest(Builder builder) {
        super(builder);
        this.location = builder.location;
        this.organizationId = builder.organizationId;
        this.regionId = builder.regionId;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadFabricOrganizationSDKRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<DownloadFabricOrganizationSDKRequest, Builder> {
        private String location; 
        private String organizationId; 
        private String regionId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(DownloadFabricOrganizationSDKRequest response) {
            super(response);
            this.location = response.location;
            this.organizationId = response.organizationId;
            this.regionId = response.regionId;
            this.username = response.username;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public DownloadFabricOrganizationSDKRequest build() {
            return new DownloadFabricOrganizationSDKRequest(this);
        } 

    } 

}
