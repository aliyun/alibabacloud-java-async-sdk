// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MoveHostsToNetworkDomainRequest} extends {@link RequestModel}
 *
 * <p>MoveHostsToNetworkDomainRequest</p>
 */
public class MoveHostsToNetworkDomainRequest extends Request {
    @Query
    @NameInMap("HostIds")
    @Validation(required = true)
    private java.util.List < String > hostIds;

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

    private MoveHostsToNetworkDomainRequest(Builder builder) {
        super(builder);
        this.hostIds = builder.hostIds;
        this.instanceId = builder.instanceId;
        this.networkDomainId = builder.networkDomainId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveHostsToNetworkDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostIds
     */
    public java.util.List < String > getHostIds() {
        return this.hostIds;
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

    public static final class Builder extends Request.Builder<MoveHostsToNetworkDomainRequest, Builder> {
        private java.util.List < String > hostIds; 
        private String instanceId; 
        private String networkDomainId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(MoveHostsToNetworkDomainRequest request) {
            super(request);
            this.hostIds = request.hostIds;
            this.instanceId = request.instanceId;
            this.networkDomainId = request.networkDomainId;
            this.regionId = request.regionId;
        } 

        /**
         * HostIds.
         */
        public Builder hostIds(java.util.List < String > hostIds) {
            this.putQueryParameter("HostIds", hostIds);
            this.hostIds = hostIds;
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
        public MoveHostsToNetworkDomainRequest build() {
            return new MoveHostsToNetworkDomainRequest(this);
        } 

    } 

}
