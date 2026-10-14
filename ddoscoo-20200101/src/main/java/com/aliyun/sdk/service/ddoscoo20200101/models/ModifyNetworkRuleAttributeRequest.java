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
 * {@link ModifyNetworkRuleAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyNetworkRuleAttributeRequest</p>
 */
public class ModifyNetworkRuleAttributeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForwardProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String forwardProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FrontendPort")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer frontendPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Module")
    private String module;

    private ModifyNetworkRuleAttributeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.config = builder.config;
        this.forwardProtocol = builder.forwardProtocol;
        this.frontendPort = builder.frontendPort;
        this.instanceId = builder.instanceId;
        this.module = builder.module;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNetworkRuleAttributeRequest create() {
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
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return forwardProtocol
     */
    public String getForwardProtocol() {
        return this.forwardProtocol;
    }

    /**
     * @return frontendPort
     */
    public Integer getFrontendPort() {
        return this.frontendPort;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return module
     */
    public String getModule() {
        return this.module;
    }

    public static final class Builder extends Request.Builder<ModifyNetworkRuleAttributeRequest, Builder> {
        private String regionId; 
        private String config; 
        private String forwardProtocol; 
        private Integer frontendPort; 
        private String instanceId; 
        private String module; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNetworkRuleAttributeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.config = request.config;
            this.forwardProtocol = request.forwardProtocol;
            this.frontendPort = request.frontendPort;
            this.instanceId = request.instanceId;
            this.module = request.module;
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
         * <p>The advanced settings for the port forwarding rule. Specify the settings as a JSON string. The structure is described below.
         * The structure of \<code>TcpConfig\\</code> is as follows:</p>
         * <ul>
         * <li><p><strong>PersistenceTimeout</strong>: An integer. This parameter is required. The timeout period for session persistence. Unit: seconds. Valid values: <strong>30</strong> to <strong>3600</strong>. The default value is <strong>0</strong>, which disables session persistence.</p>
         * </li>
         * <li><p><strong>Synproxy</strong>: A string. This parameter is required. The status of the False Source setting for the DDoS mitigation policy. Valid values: \<code>off\\</code> and \<code>on\\</code>.</p>
         * </li>
         * <li><p><strong>NodataConn</strong>: A string. This parameter is required. The status of the Empty Connection setting for the DDoS mitigation policy. Valid values: \<code>off\\</code> and \<code>on\\</code>.</p>
         * </li>
         * <li><p><strong>Sla</strong>: A struct. This parameter is required. The configuration for destination rate limiting. For more information, see the \<code>Sla\\</code> section below.</p>
         * </li>
         * <li><p><strong>Slimit</strong>: A struct. This parameter is required. The configuration for source rate limiting. For more information, see the \<code>Slimit\\</code> section below.</p>
         * </li>
         * <li><p><strong>PayloadLen</strong>: A struct. This parameter is required. The packet length filter configuration. For more information, see the \<code>PayloadLen\\</code> section below.</p>
         * </li>
         * </ul>
         * <p>The structure of \<code>Sla\\</code> is as follows:</p>
         * <ul>
         * <li><p><strong>Cps</strong>: An integer. This parameter is required. The maximum number of new connections per second to a destination IP address. Valid values: 100 to 100,000.</p>
         * </li>
         * <li><p><strong>Maxconn</strong>: An integer. This parameter is required. The maximum number of concurrent connections to a destination IP address. Valid values: 1,000 to 1,000,000.</p>
         * </li>
         * <li><p><strong>CpsEnable</strong>: An integer. This parameter is required. Specifies whether to enable the limit on new connections. Valid values: 0 (disabled) and 1 (enabled). The default value is 1.</p>
         * </li>
         * <li><p><strong>MaxconnEnable</strong>: An integer. This parameter is required. Specifies whether to enable the limit on concurrent connections. Valid values: 0 (disabled) and 1 (enabled). The default value is 1.</p>
         * </li>
         * </ul>
         * <p>The structure of \<code>Slimit\\</code> is as follows:</p>
         * <ul>
         * <li><p><strong>Cps</strong>: An integer. This parameter is required. The maximum number of new connections per second from a source IP address. Valid values: 1 to 50,000.</p>
         * </li>
         * <li><p><strong>Maxconn</strong>: An integer. This parameter is required. The maximum number of concurrent connections from a source IP address. Valid values: 1 to 50,000.</p>
         * </li>
         * <li><p><strong>CpsEnable</strong>: An integer. This parameter is required. Specifies whether to enable the limit on new connections. Valid values: 0 (disabled) and 1 (enabled). The default value is 1.</p>
         * </li>
         * <li><p><strong>MaxconnEnable</strong>: An integer. This parameter is required. Specifies whether to enable the limit on concurrent connections. Valid values: 0 (disabled) and 1 (enabled). The default value is 1.</p>
         * </li>
         * <li><p><strong>CpsMode</strong>: An integer. This parameter is required. The mode for the new connection rate limit from a source IP address. Valid values: 1 (off) and 2 (auto).</p>
         * </li>
         * </ul>
         * <p>The structure of \<code>PayloadLen\\</code> is as follows:</p>
         * <ul>
         * <li><p><strong>Min</strong>: An integer. This parameter is required. The minimum packet length. Valid values: 0 to 1,500.</p>
         * </li>
         * <li><p><strong>Max</strong>: An integer. This parameter is required. The maximum packet length. Valid values: 0 to 1,500.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Slimit&quot;:{&quot;CpsEnable&quot;:1,&quot;MaxconnEnable&quot;:1,&quot;Cps&quot;:1,&quot;Maxconn&quot;:1},&quot;Sla&quot;:{&quot;CpsEnable&quot;:1,&quot;MaxconnEnable&quot;:1,&quot;Cps&quot;:100,&quot;Maxconn&quot;:1000},&quot;PayloadLen&quot;:{&quot;Min&quot;:0,&quot;Max&quot;:1500}}</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The forwarding protocol. Valid values:</p>
         * <ul>
         * <li><p><strong>tcp</strong></p>
         * </li>
         * <li><p><strong>udp</strong></p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        public Builder forwardProtocol(String forwardProtocol) {
            this.putQueryParameter("ForwardProtocol", forwardProtocol);
            this.forwardProtocol = forwardProtocol;
            return this;
        }

        /**
         * <p>The forwarding port.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder frontendPort(Integer frontendPort) {
            this.putQueryParameter("FrontendPort", frontendPort);
            this.frontendPort = frontendPort;
            return this;
        }

        /**
         * <p>The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance.</p>
         * <blockquote>
         * <p>Call <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> to query the IDs of all Anti-DDoS Pro and Anti-DDoS Premium instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-mp91j1ao****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The module for Layer 7 port support. The default value is sla. Valid value:</p>
         * <p><strong>sla</strong>: Speed Limit for Destination</p>
         * 
         * <strong>example:</strong>
         * <p>sla</p>
         */
        public Builder module(String module) {
            this.putQueryParameter("Module", module);
            this.module = module;
            return this;
        }

        @Override
        public ModifyNetworkRuleAttributeRequest build() {
            return new ModifyNetworkRuleAttributeRequest(this);
        } 

    } 

}
