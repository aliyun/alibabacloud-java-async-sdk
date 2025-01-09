// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link AuthorizeApplicationToOrganizationalUnitsRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeApplicationToOrganizationalUnitsRequest</p>
 */
public class AuthorizeApplicationToOrganizationalUnitsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationalUnitIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> organizationalUnitIds;

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
    public java.util.List<String> getOrganizationalUnitIds() {
        return this.organizationalUnitIds;
    }

    public static final class Builder extends Request.Builder<AuthorizeApplicationToOrganizationalUnitsRequest, Builder> {
        private String regionId; 
        private String applicationId; 
        private String instanceId; 
        private java.util.List<String> organizationalUnitIds; 

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
         * <p>The ID of the application on which you want to grant permissions.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk2676xxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The IDs of the organizations to which you want to grant permissions. You can grant permissions to a maximum of 100 organizations at a time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
         */
        public Builder organizationalUnitIds(java.util.List<String> organizationalUnitIds) {
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
