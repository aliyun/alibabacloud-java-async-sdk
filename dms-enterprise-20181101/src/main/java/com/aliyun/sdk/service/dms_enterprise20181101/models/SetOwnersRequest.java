// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetOwnersRequest} extends {@link RequestModel}
 *
 * <p>SetOwnersRequest</p>
 */
public class SetOwnersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ownerIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ownerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    private SetOwnersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ownerIds = builder.ownerIds;
        this.ownerType = builder.ownerType;
        this.resourceId = builder.resourceId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetOwnersRequest create() {
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
     * @return ownerIds
     */
    public String getOwnerIds() {
        return this.ownerIds;
    }

    /**
     * @return ownerType
     */
    public String getOwnerType() {
        return this.ownerType;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<SetOwnersRequest, Builder> {
        private String regionId; 
        private String ownerIds; 
        private String ownerType; 
        private String resourceId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(SetOwnersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ownerIds = request.ownerIds;
            this.ownerType = request.ownerType;
            this.resourceId = request.resourceId;
            this.tid = request.tid;
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
         * The ID of the user whom you want to specify as an owner. Separate multiple IDs with commas (,). You can call the [GetUser](~~147098~~) or [ListUsers](~~141938~~) operation to query the ID of the user.
         * <p>
         * 
         * >  The value of the OwnerIds parameter is that of the UserId parameter.
         */
        public Builder ownerIds(String ownerIds) {
            this.putQueryParameter("OwnerIds", ownerIds);
            this.ownerIds = ownerIds;
            return this;
        }

        /**
         * The type of the owner. Valid values:
         * <p>
         * 
         * *   INSTANCE: an owner of an instance.
         * *   DATABASE: an owner of a physical database.
         * *   LOGIC_DATABASE: an owner of a logical database.
         * *   TABLE: an owner of a physical table.
         * *   LOGIC_TABLE: an owner of a logical table.
         */
        public Builder ownerType(String ownerType) {
            this.putQueryParameter("OwnerType", ownerType);
            this.ownerType = ownerType;
            return this;
        }

        /**
         * The ID of the resource. The ID of the resource varies with the owner type. The owner types and resource IDs have the following mappings:
         * <p>
         * 
         * *   INSTANCE: the ID of an instance. You can call the [ListInstances](~~141936~~) operation to query the ID of the instance.
         * *   DATABASE: the ID of a physical database. You can call the [ListDatabases](~~141873~~) operation to query the ID of the physical database.
         * *   LOGIC_DATABASE: the ID of a logical database. You can call the [ListLogicDatabases](~~141874~~) operation to query the ID of the logical database.
         * *   TABLE: the ID of a physical table. You can call the [ListTables](~~141878~~) operation to query the ID of the physical table.
         * *   LOGIC_DATABASE: the ID of a logical table. You can call the [ListLogicTables](~~141875~~) operation to query the ID of the logical table.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * >  To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](~~181330~~) topic.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public SetOwnersRequest build() {
            return new SetOwnersRequest(this);
        } 

    } 

}
