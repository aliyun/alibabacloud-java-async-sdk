// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveDatabasesFromGroupRequest} extends {@link RequestModel}
 *
 * <p>RemoveDatabasesFromGroupRequest</p>
 */
public class RemoveDatabasesFromGroupRequest extends Request {
    @Query
    @NameInMap("DatabaseIds")
    @Validation(required = true)
    private java.util.List < String > databaseIds;

    @Query
    @NameInMap("HostGroupId")
    @Validation(required = true)
    private String hostGroupId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private RemoveDatabasesFromGroupRequest(Builder builder) {
        super(builder);
        this.databaseIds = builder.databaseIds;
        this.hostGroupId = builder.hostGroupId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveDatabasesFromGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseIds
     */
    public java.util.List < String > getDatabaseIds() {
        return this.databaseIds;
    }

    /**
     * @return hostGroupId
     */
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RemoveDatabasesFromGroupRequest, Builder> {
        private java.util.List < String > databaseIds; 
        private String hostGroupId; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveDatabasesFromGroupRequest request) {
            super(request);
            this.databaseIds = request.databaseIds;
            this.hostGroupId = request.hostGroupId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * DatabaseIds.
         */
        public Builder databaseIds(java.util.List < String > databaseIds) {
            this.putQueryParameter("DatabaseIds", databaseIds);
            this.databaseIds = databaseIds;
            return this;
        }

        /**
         * HostGroupId.
         */
        public Builder hostGroupId(String hostGroupId) {
            this.putQueryParameter("HostGroupId", hostGroupId);
            this.hostGroupId = hostGroupId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RemoveDatabasesFromGroupRequest build() {
            return new RemoveDatabasesFromGroupRequest(this);
        } 

    } 

}
