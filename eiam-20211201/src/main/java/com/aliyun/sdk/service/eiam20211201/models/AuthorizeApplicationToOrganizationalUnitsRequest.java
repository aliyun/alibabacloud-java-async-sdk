// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeApplicationToOrganizationalUnitsRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeApplicationToOrganizationalUnitsRequest</p>
 */
public class AuthorizeApplicationToOrganizationalUnitsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ApplicationId")
    @Validation(required = true, maxLength = 64)
    private String applicationId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    @Query
    @NameInMap("OrganizationalUnitIds")
    @Validation(required = true)
    private java.util.List < String > organizationalUnitIds;

    private AuthorizeApplicationToOrganizationalUnitsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationId = builder.applicationId;
        this.instanceId = builder.instanceId;
        this.organizationalUnitIds = builder.organizationalUnitIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeApplicationToOrganizationalUnitsRequest create() {
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
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return organizationalUnitIds
     */
    public java.util.List < String > getOrganizationalUnitIds() {
        return this.organizationalUnitIds;
    }

    public static final class Builder extends Request.Builder<AuthorizeApplicationToOrganizationalUnitsRequest, Builder> {
        private String regionId; 
        private String applicationId; 
        private String instanceId; 
        private java.util.List < String > organizationalUnitIds; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeApplicationToOrganizationalUnitsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationId = request.applicationId;
            this.instanceId = request.instanceId;
            this.organizationalUnitIds = request.organizationalUnitIds;
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
         * The ID of the application on which you want to grant permissions.
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The IDs of the organizations to which you want to grant permissions. You can grant permissions to a maximum of 100 organizations at a time.
         */
        public Builder organizationalUnitIds(java.util.List < String > organizationalUnitIds) {
            this.putQueryParameter("OrganizationalUnitIds", organizationalUnitIds);
            this.organizationalUnitIds = organizationalUnitIds;
            return this;
        }

        @Override
        public AuthorizeApplicationToOrganizationalUnitsRequest build() {
            return new AuthorizeApplicationToOrganizationalUnitsRequest(this);
        } 

    } 

}
