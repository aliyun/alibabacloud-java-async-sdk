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
         * <p>The port forwarding rule that you want to manage.</p>
         * <p>This parameter is a string that consists of JSON arrays. Each element in a JSON array indicates a port forwarding rule. You can perform this operation only on one port forwarding rule at a time.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/157484.html">DescribeNetworkRules</a> to query existing port forwarding rules.</p>
         * </blockquote>
         * <p>Each port forwarding rule contains the following fields:</p>
         * <ul>
         * <li><p><strong>InstanceId</strong>: the ID of the instance. This field is required and must be of the STRING type.</p>
         * </li>
         * <li><p><strong>Protocol</strong>: the forwarding protocol. This field is required and must be of the STRING type. Valid values: <strong>tcp</strong> and <strong>udp</strong>.</p>
         * </li>
         * <li><p><strong>FrontendPort</strong>: the forwarding port. This field is required and must be of the INTEGER type.</p>
         * </li>
         * <li><p><strong>BackendPort</strong>: the port of the origin server. This field is required and must be of the INTEGER type.</p>
         * </li>
         * <li><p><strong>PriRealServers</strong>: the IP addresses of the primary origin server. This field is required and must be a JSON array. Each element in a JSON array indicates an IP address of the primary origin server. You can configure a maximum of 20 IP addresses.</p>
         * <p>Each element in the JSON array contains the following field:</p>
         * <ul>
         * <li><strong>RealServer</strong>: the IP address of the primary origin server. This field is required and must be of the STRING type.</li>
         * </ul>
         * </li>
         * <li><p><strong>SecRealServers</strong>: the IP addresses of the secondary origin server. This field is required and must be a JSON array. Each element in a JSON array indicates an IP address of the secondary origin server. You can configure a maximum of 20 IP addresses.</p>
         * <p>Each element in the JSON array contains the following field:</p>
         * <ul>
         * <li><strong>RealServer</strong>: the IP address of the secondary origin server. This field is required and must be of the STRING type.</li>
         * </ul>
         * </li>
         * <li><p><strong>CurrentRsIndex</strong>: the origin server that you want to use to receive service traffic. This field is required and must be of the INTEGER type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: the primary origin server, which indicates that Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the primary origin server.</li>
         * <li><strong>2</strong>: the secondary origin server, which indicates that Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the secondary origin server.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;InstanceId&quot;:&quot;ddosDip-sg-4hr2b3l****&quot;,&quot;Protocol&quot;:&quot;udp&quot;,&quot;FrontendPort&quot;:2020,&quot;BackendPort&quot;:2022,&quot;PriRealServers&quot;:[{&quot;RealServer&quot;:&quot;192.0.2.1&quot;},{&quot;RealServer&quot;:&quot;192.0.2.2&quot;}],&quot;SecRealServers&quot;:[{&quot;RealServer&quot;:&quot;192.0.2.3&quot;},{&quot;RealServer&quot;:&quot;192.0.2.4&quot;}],&quot;CurrentRsIndex&quot;:1}]</p>
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
