// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigUdpReflectRequest} extends {@link RequestModel}
 *
 * <p>ConfigUdpReflectRequest</p>
 */
public class ConfigUdpReflectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ConfigUdpReflectRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigUdpReflectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
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

    public static final class Builder extends Request.Builder<ConfigUdpReflectRequest, Builder> {
        private String config; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigUdpReflectRequest request) {
            super(request);
            this.config = request.config;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * The configuration of the filtering policy for UDP reflection attacks.
         * <p>
         * 
         * The value is a string that consists of a JSON struct. The JSON struct contains the following field:
         * 
         * *   **UdpSports**: the source ports of the UDP traffic that you want to block. This field is required and must be of the ARRAY type. Example: `[17,19]`.
         * 
         *     We recommend that you block the following source ports of UDP traffic:
         * 
         *     *   UDP 17: QOTD reflection attacks
         *     *   UDP 19: CharGEN reflection attacks
         *     *   UDP 69: TFTP reflection attacks
         *     *   UDP 111: Portmap reflection attacks
         *     *   UDP 123: NTP reflection attacks
         *     *   UDP 137: NetBIOS reflection attacks
         *     *   UDP 161: SNMPv2 reflection attacks
         *     *   UDP 389: CLDAP reflection attacks
         *     *   UDP 1194: OpenVPN reflection attacks
         *     *   UDP 1900: SSDP reflection attacks
         *     *   UDP 3389: RDP reflection attacks
         *     *   UDP 11211: memcached reflection attacks
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * The ID of the instance.
         * <p>
         * 
         * > You can call the [DescribeInstanceIds](~~157459~~) operation to query the IDs of all instances.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region ID of the Anti-DDoS Proxy instance. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou**: indicates an Anti-DDoS Proxy (Chinese Mainland) instance. This is the default value.
         * *   **ap-southeast-1**: indicates an Anti-DDoS Proxy (Outside Chinese Mainland) instance.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ConfigUdpReflectRequest build() {
            return new ConfigUdpReflectRequest(this);
        } 

    } 

}
