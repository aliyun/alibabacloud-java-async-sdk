// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigLayer4RulePolicyRequest} extends {@link RequestModel}
 *
 * <p>ConfigLayer4RulePolicyRequest</p>
 */
public class ConfigLayer4RulePolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Listeners")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listeners;

    private ConfigLayer4RulePolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listeners = builder.listeners;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigLayer4RulePolicyRequest create() {
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
     * @return listeners
     */
    public String getListeners() {
        return this.listeners;
    }

    public static final class Builder extends Request.Builder<ConfigLayer4RulePolicyRequest, Builder> {
        private String regionId; 
        private String listeners; 

        private Builder() {
            super();
        } 

        private Builder(ConfigLayer4RulePolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.listeners = request.listeners;
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
         * The port forwarding rule that you want to manage.
         * <p>
         * 
         * This parameter is a string that consists of JSON arrays. Each element in a JSON array indicates a port forwarding rule. You can perform this operation only on one port forwarding rule at a time.
         * 
         * > You can call the [DescribeNetworkRules](~~157484~~) to query existing port forwarding rules.
         * 
         * Each port forwarding rule contains the following fields:
         * 
         * *   **InstanceId**: the ID of the instance. This field is required and must be of the STRING type.
         * 
         * *   **Protocol**: the forwarding protocol. This field is required and must be of the STRING type. Valid values: **tcp** and **udp**.
         * 
         * *   **FrontendPort**: the forwarding port. This field is required and must be of the INTEGER type.
         * 
         * *   **BackendPort**: the port of the origin server. This field is required and must be of the INTEGER type.
         * 
         * *   **PriRealServers**: the IP addresses of the primary origin server. This field is required and must be a JSON array. Each element in a JSON array indicates an IP address of the primary origin server. You can configure a maximum of 20 IP addresses.
         * 
         *     Each element in the JSON array contains the following field:
         * 
         *     *   **RealServer**: the IP address of the primary origin server. This field is required and must be of the STRING type.
         * 
         * *   **SecRealServers**: the IP addresses of the secondary origin server. This field is required and must be a JSON array. Each element in a JSON array indicates an IP address of the secondary origin server. You can configure a maximum of 20 IP addresses.
         * 
         *     Each element in the JSON array contains the following field:
         * 
         *     *   **RealServer**: the IP address of the secondary origin server. This field is required and must be of the STRING type.
         * 
         * *   **CurrentRsIndex**: the origin server that you want to use to receive service traffic. This field is required and must be of the INTEGER type. Valid values:
         * 
         *     *   **1**: the primary origin server, which indicates that Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the primary origin server.
         *     *   **2**: the secondary origin server, which indicates that Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the secondary origin server.
         */
        public Builder listeners(String listeners) {
            this.putQueryParameter("Listeners", listeners);
            this.listeners = listeners;
            return this;
        }

        @Override
        public ConfigLayer4RulePolicyRequest build() {
            return new ConfigLayer4RulePolicyRequest(this);
        } 

    } 

}
