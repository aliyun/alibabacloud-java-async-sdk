// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MoveDatabasesToNetworkDomainRequest} extends {@link RequestModel}
 *
 * <p>MoveDatabasesToNetworkDomainRequest</p>
 */
public class MoveDatabasesToNetworkDomainRequest extends Request {
    @Query
    @NameInMap("DatabaseIds")
    @Validation(required = true)
    private java.util.List < String > databaseIds;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NetworkDomainId")
    @Validation(required = true)
    private String networkDomainId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private MoveDatabasesToNetworkDomainRequest(Builder builder) {
        super(builder);
        this.databaseIds = builder.databaseIds;
        this.instanceId = builder.instanceId;
        this.networkDomainId = builder.networkDomainId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveDatabasesToNetworkDomainRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return networkDomainId
     */
    public String getNetworkDomainId() {
        return this.networkDomainId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<MoveDatabasesToNetworkDomainRequest, Builder> {
        private java.util.List < String > databaseIds; 
        private String instanceId; 
        private String networkDomainId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(MoveDatabasesToNetworkDomainRequest request) {
            super(request);
            this.databaseIds = request.databaseIds;
            this.instanceId = request.instanceId;
            this.networkDomainId = request.networkDomainId;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NetworkDomainId.
         */
        public Builder networkDomainId(String networkDomainId) {
            this.putQueryParameter("NetworkDomainId", networkDomainId);
            this.networkDomainId = networkDomainId;
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
        public MoveDatabasesToNetworkDomainRequest build() {
            return new MoveDatabasesToNetworkDomainRequest(this);
        } 

    } 

}
