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
 * {@link AddUserToOrganizationalUnitsRequest} extends {@link RequestModel}
 *
 * <p>AddUserToOrganizationalUnitsRequest</p>
 */
public class AddUserToOrganizationalUnitsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationalUnitIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> organizationalUnitIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String userId;

    private AddUserToOrganizationalUnitsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.organizationalUnitIds = builder.organizationalUnitIds;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUserToOrganizationalUnitsRequest create() {
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

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<AddUserToOrganizationalUnitsRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private java.util.List<String> organizationalUnitIds; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(AddUserToOrganizationalUnitsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.organizationalUnitIds = request.organizationalUnitIds;
            this.userId = request.userId;
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
         * <p>The instance ID.</p>
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
         * <p>The organization IDs. You can add an account to a maximum of 100 organizations.</p>
         * <p>This parameter is required.</p>
         */
        public Builder organizationalUnitIds(java.util.List<String> organizationalUnitIds) {
            this.putQueryParameter("OrganizationalUnitIds", organizationalUnitIds);
            this.organizationalUnitIds = organizationalUnitIds;
            return this;
        }

        /**
         * <p>The account ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public AddUserToOrganizationalUnitsRequest build() {
            return new AddUserToOrganizationalUnitsRequest(this);
        } 

    } 

}
