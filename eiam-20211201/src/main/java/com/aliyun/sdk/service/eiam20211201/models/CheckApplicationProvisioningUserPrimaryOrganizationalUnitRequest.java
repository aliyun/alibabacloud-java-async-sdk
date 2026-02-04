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
 * {@link CheckApplicationProvisioningUserPrimaryOrganizationalUnitRequest} extends {@link RequestModel}
 *
 * <p>CheckApplicationProvisioningUserPrimaryOrganizationalUnitRequest</p>
 */
public class CheckApplicationProvisioningUserPrimaryOrganizationalUnitRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("UserPrimaryOrganizationalUnitId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String userPrimaryOrganizationalUnitId;

    private CheckApplicationProvisioningUserPrimaryOrganizationalUnitRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationId = builder.applicationId;
        this.instanceId = builder.instanceId;
        this.userPrimaryOrganizationalUnitId = builder.userPrimaryOrganizationalUnitId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckApplicationProvisioningUserPrimaryOrganizationalUnitRequest create() {
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
     * @return userPrimaryOrganizationalUnitId
     */
    public String getUserPrimaryOrganizationalUnitId() {
        return this.userPrimaryOrganizationalUnitId;
    }

    public static final class Builder extends Request.Builder<CheckApplicationProvisioningUserPrimaryOrganizationalUnitRequest, Builder> {
        private String regionId; 
        private String applicationId; 
        private String instanceId; 
        private String userPrimaryOrganizationalUnitId; 

        private Builder() {
            super();
        } 

        private Builder(CheckApplicationProvisioningUserPrimaryOrganizationalUnitRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationId = request.applicationId;
            this.instanceId = request.instanceId;
            this.userPrimaryOrganizationalUnitId = request.userPrimaryOrganizationalUnitId;
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
         * <p>IDaaS的应用资源ID。</p>
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
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>组织ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
         */
        public Builder userPrimaryOrganizationalUnitId(String userPrimaryOrganizationalUnitId) {
            this.putQueryParameter("UserPrimaryOrganizationalUnitId", userPrimaryOrganizationalUnitId);
            this.userPrimaryOrganizationalUnitId = userPrimaryOrganizationalUnitId;
            return this;
        }

        @Override
        public CheckApplicationProvisioningUserPrimaryOrganizationalUnitRequest build() {
            return new CheckApplicationProvisioningUserPrimaryOrganizationalUnitRequest(this);
        } 

    } 

}
