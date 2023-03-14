// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHostsPortRequest} extends {@link RequestModel}
 *
 * <p>ModifyHostsPortRequest</p>
 */
public class ModifyHostsPortRequest extends Request {
    @Query
    @NameInMap("HostIds")
    @Validation(required = true)
    private String hostIds;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Port")
    @Validation(required = true)
    private String port;

    @Query
    @NameInMap("ProtocolName")
    @Validation(required = true)
    private String protocolName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ModifyHostsPortRequest(Builder builder) {
        super(builder);
        this.hostIds = builder.hostIds;
        this.instanceId = builder.instanceId;
        this.port = builder.port;
        this.protocolName = builder.protocolName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHostsPortRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostIds
     */
    public String getHostIds() {
        return this.hostIds;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return protocolName
     */
    public String getProtocolName() {
        return this.protocolName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyHostsPortRequest, Builder> {
        private String hostIds; 
        private String instanceId; 
        private String port; 
        private String protocolName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHostsPortRequest request) {
            super(request);
            this.hostIds = request.hostIds;
            this.instanceId = request.instanceId;
            this.port = request.port;
            this.protocolName = request.protocolName;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the host for which you want to change the port. The value is a JSON string. You can add up to 100 host IDs. If you specify multiple IDs, separate the IDs with commas (,).
         * <p>
         * 
         * >  You can call the [ListHosts](~~200665~~) operation to query the IDs of hosts.
         */
        public Builder hostIds(String hostIds) {
            this.putQueryParameter("HostIds", hostIds);
            this.hostIds = hostIds;
            return this;
        }

        /**
         * The ID of the bastion host for which you want to change the port of the host.
         * <p>
         * 
         * >  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The new port of the host. The port number must be an integer. Valid values: 22 to 65535.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * The protocol that is used to connect to the host. Valid values:
         * <p>
         * 
         * *   **SSH**
         * *   **RDP**
         */
        public Builder protocolName(String protocolName) {
            this.putQueryParameter("ProtocolName", protocolName);
            this.protocolName = protocolName;
            return this;
        }

        /**
         * The region ID of the bastion host for which you want to change the port of the host.
         * <p>
         * 
         * >  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyHostsPortRequest build() {
            return new ModifyHostsPortRequest(this);
        } 

    } 

}
