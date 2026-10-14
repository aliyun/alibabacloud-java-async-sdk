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
         * <p>The port forwarding rules.</p>
         * <p>This parameter is a string that represents a JSON array converted from a character string. Each element in the JSON array represents a created port forwarding rule. You can specify up to one port forwarding rule at a time.</p>
         * <blockquote>
         * <p>You can invoke <a href="https://help.aliyun.com/document_detail/157484.html">DescribeNetworkRules</a> to query all created port forwarding rules.</p>
         * </blockquote>
         * <p>Each port forwarding rule contains the following fields:</p>
         * <ul>
         * <li><p><strong>InstanceId</strong>: string. Required. The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance.</p>
         * </li>
         * <li><p><strong>Protocol</strong>: string. Required. The forwarding protocol type. Valid values: <strong>tcp</strong>, <strong>udp</strong>.</p>
         * </li>
         * <li><p><strong>FrontendPort</strong>: integer. Required. The Redirection Port.</p>
         * </li>
         * <li><p><strong>BackendPort</strong>: integer. Required. The origin server port.</p>
         * </li>
         * <li><p><strong>PriRealServers</strong>: JSON array. Required. The list of primary origin server IP addresses. Each element in the JSON array represents a primary origin server IP address. You can specify up to 20 primary origin server IP addresses.</p>
         * <p>  Each primary origin server IP address contains the following fields:</p>
         * <ul>
         * <li><strong>RealServer</strong>: string. Required. The primary origin server IP address.</li>
         * </ul>
         * </li>
         * <li><p><strong>SecRealServers</strong>: JSON array. Required. The list of secondary origin server IP addresses. Each element in the JSON array represents a secondary origin server IP address. You can specify up to 20 secondary origin server IP addresses.</p>
         * <p>  Each secondary origin server IP address contains the following fields:</p>
         * <ul>
         * <li><strong>RealServer</strong>: string. Required. The secondary origin server IP address.</li>
         * </ul>
         * </li>
         * <li><p><strong>CurrentRsIndex</strong>: integer. Required. The type of origin server to activate. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The primary origin server settings take effect. Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the primary origin server IP addresses.</li>
         * <li><strong>2</strong>: The secondary origin server settings take effect. Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the secondary origin server IP addresses.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;InstanceId\&quot;:\&quot;ddosDip-sg-4hr2b3l****\&quot;,\&quot;Protocol\&quot;:\&quot;udp\&quot;,\&quot;FrontendPort\&quot;:2020,\&quot;BackendPort\&quot;:2022,\&quot;PriRealServers\&quot;:[{\&quot;RealServer\&quot;:\&quot;192.0.2.1\&quot;},{\&quot;RealServer\&quot;:\&quot;192.0.2.2\&quot;}],\&quot;SecRealServers\&quot;:[{\&quot;RealServer\&quot;:\&quot;192.0.2.3\&quot;},{\&quot;RealServer\&quot;:\&quot;192.0.2.4\&quot;}],\&quot;CurrentRsIndex\&quot;:1}]</p>
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
