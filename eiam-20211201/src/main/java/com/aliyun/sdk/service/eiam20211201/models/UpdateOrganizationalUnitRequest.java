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
 * {@link UpdateOrganizationalUnitRequest} extends {@link RequestModel}
 *
 * <p>UpdateOrganizationalUnitRequest</p>
 */
public class UpdateOrganizationalUnitRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationalUnitId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String organizationalUnitId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationalUnitName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String organizationalUnitName;

    private UpdateOrganizationalUnitRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.organizationalUnitId = builder.organizationalUnitId;
        this.organizationalUnitName = builder.organizationalUnitName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOrganizationalUnitRequest create() {
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
     * @return organizationalUnitId
     */
    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

    /**
     * @return organizationalUnitName
     */
    public String getOrganizationalUnitName() {
        return this.organizationalUnitName;
    }

    public static final class Builder extends Request.Builder<UpdateOrganizationalUnitRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String organizationalUnitId; 
        private String organizationalUnitName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOrganizationalUnitRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.organizationalUnitId = request.organizationalUnitId;
            this.organizationalUnitName = request.organizationalUnitName;
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
         * <p>The organization ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
         */
        public Builder organizationalUnitId(String organizationalUnitId) {
            this.putQueryParameter("OrganizationalUnitId", organizationalUnitId);
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }

        /**
         * <p>The name of the organization. The name can be up to 128 characters in length and must be unique in the same parent organization.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_name</p>
         */
        public Builder organizationalUnitName(String organizationalUnitName) {
            this.putQueryParameter("OrganizationalUnitName", organizationalUnitName);
            this.organizationalUnitName = organizationalUnitName;
            return this;
        }

        @Override
        public UpdateOrganizationalUnitRequest build() {
            return new UpdateOrganizationalUnitRequest(this);
        } 

    } 

}
