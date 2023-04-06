// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOrganizationalUnitParentIdRequest} extends {@link RequestModel}
 *
 * <p>UpdateOrganizationalUnitParentIdRequest</p>
 */
public class UpdateOrganizationalUnitParentIdRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    @Query
    @NameInMap("OrganizationalUnitId")
    @Validation(required = true, maxLength = 64)
    private String organizationalUnitId;

    @Query
    @NameInMap("ParentId")
    @Validation(required = true, maxLength = 64)
    private String parentId;

    private UpdateOrganizationalUnitParentIdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.organizationalUnitId = builder.organizationalUnitId;
        this.parentId = builder.parentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOrganizationalUnitParentIdRequest create() {
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
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    public static final class Builder extends Request.Builder<UpdateOrganizationalUnitParentIdRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String organizationalUnitId; 
        private String parentId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOrganizationalUnitParentIdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.organizationalUnitId = request.organizationalUnitId;
            this.parentId = request.parentId;
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
         * IDaaS EIAM实例的ID。
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 组织ID。
         */
        public Builder organizationalUnitId(String organizationalUnitId) {
            this.putQueryParameter("OrganizationalUnitId", organizationalUnitId);
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }

        /**
         * 父组织ID。
         */
        public Builder parentId(String parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        @Override
        public UpdateOrganizationalUnitParentIdRequest build() {
            return new UpdateOrganizationalUnitParentIdRequest(this);
        } 

    } 

}
