// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyHostsPortRequest} extends {@link RequestModel}
 *
 * <p>ModifyHostsPortRequest</p>
 */
public class ModifyHostsPortRequest extends Request {
    @Query
    @NameInMap("HostIds")
    private String hostIds;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Port")
    private String port;

    @Query
    @NameInMap("ProtocolName")
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

    public static final class Builder extends Request.Builder<Builder> {
        private String hostIds; 
        private String instanceId; 
        private String port; 
        private String protocolName; 
        private String regionId; 

        /**
         * <p>HostIds.</p>
         */
        public Builder hostIds(String hostIds) {
            this.putQueryParameter("HostIds", hostIds);
            this.hostIds = hostIds;
            return this;
        }

        /**
         * <p>InstanceId.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Port.</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>ProtocolName.</p>
         */
        public Builder protocolName(String protocolName) {
            this.putQueryParameter("ProtocolName", protocolName);
            this.protocolName = protocolName;
            return this;
        }

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        public ModifyHostsPortRequest build() {
            return new ModifyHostsPortRequest(this);
        } 

    } 

}
