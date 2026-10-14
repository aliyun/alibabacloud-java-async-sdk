// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
         * <p>The configuration of the UDP reflection attack attack prevention protection policy to add.</p>
         * <p>This parameter is a string that represents a JSON structure transformed into a character string. The JSON structure contains the following field:</p>
         * <ul>
         * <li><p><strong>UdpSports</strong>: Array type. Required. The UDP reflection source ports to block. Example: <code>[17,19]</code>.</p>
         * <p>  Block the following source ports that are commonly used in UDP reflection attacks:</p>
         * <ul>
         * <li>UDP 17: QOTD reflection attacks</li>
         * <li>UDP 19: CharGEN reflection attacks</li>
         * <li>UDP 69: TFTP reflection attacks</li>
         * <li>UDP 111: Portmap reflection attacks</li>
         * <li>UDP 123: NTP reflection attacks</li>
         * <li>UDP 137: NetBIOS reflection attacks</li>
         * <li>UDP 161: SNMPv2 reflection attacks</li>
         * <li>UDP 389: CLDAP reflection attacks</li>
         * <li>UDP 1194: OpenVPN reflection attacks</li>
         * <li>UDP 1900: SSDP reflection attacks</li>
         * <li>UDP 3389: RDP reflection attacks</li>
         * <li>UDP 11211: Memcached reflection attacks</li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;UdpSports\&quot;:[17,19]}</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance to manage.</p>
         * <blockquote>
         * <p>You can invoke <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> to query the IDs of all Anti-DDoS Pro or Anti-DDoS Premium instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-i7m25564****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID of the Anti-DDoS Pro or Anti-DDoS Premium instance. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong> (default): the Chinese mainland, which indicates an Anti-DDoS Pro instance.</li>
         * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland, which indicates an Anti-DDoS Premium instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
