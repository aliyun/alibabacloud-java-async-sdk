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
 * {@link ConfigLayer4RuleBakModeRequest} extends {@link RequestModel}
 *
 * <p>ConfigLayer4RuleBakModeRequest</p>
 */
public class ConfigLayer4RuleBakModeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BakMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bakMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Listeners")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listeners;

    private ConfigLayer4RuleBakModeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bakMode = builder.bakMode;
        this.listeners = builder.listeners;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigLayer4RuleBakModeRequest create() {
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
     * @return bakMode
     */
    public String getBakMode() {
        return this.bakMode;
    }

    /**
     * @return listeners
     */
    public String getListeners() {
        return this.listeners;
    }

    public static final class Builder extends Request.Builder<ConfigLayer4RuleBakModeRequest, Builder> {
        private String regionId; 
        private String bakMode; 
        private String listeners; 

        private Builder() {
            super();
        } 

        private Builder(ConfigLayer4RuleBakModeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bakMode = request.bakMode;
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
         * <p>The back-to-origin mode. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The default back-to-origin mode. Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the origin server IP address that you specified when you called <a href="https://help.aliyun.com/document_detail/157482.html">CreateNetworkRules</a> to create the port forwarding rule.</li>
         * <li><strong>1</strong>: The origin redundancy mode. Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the primary origin server IP address or secondary origin server IP address that you configured by calling <a href="https://help.aliyun.com/document_detail/312684.html">ConfigLayer4RulePolicy</a>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bakMode(String bakMode) {
            this.putQueryParameter("BakMode", bakMode);
            this.bakMode = bakMode;
            return this;
        }

        /**
         * <p>The port forwarding rule to configure.</p>
         * <p>This parameter is a string converted from a JSON array. Each element in the JSON array represents a created port forwarding rule. You can configure up to one port forwarding rule at a time.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/157484.html">DescribeNetworkRules</a> to query all created port forwarding rules.</p>
         * </blockquote>
         * <p>Each port forwarding rule contains the following fields:</p>
         * <ul>
         * <li><strong>InstanceId</strong>: String type. Required. The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance.</li>
         * <li><strong>Protocol</strong>: String type. Required. The forwarding protocol type. Valid values: <strong>tcp</strong>, <strong>udp</strong>.</li>
         * <li><strong>FrontendPort</strong>: Integer type. Required. The Redirection Port.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;InstanceId\&quot;:\&quot;ddosDip-sg-4hr2b3l****\&quot;,\&quot;FrontendPort\&quot;:2020,\&quot;Protocol\&quot;:\&quot;udp\&quot;}]</p>
         */
        public Builder listeners(String listeners) {
            this.putQueryParameter("Listeners", listeners);
            this.listeners = listeners;
            return this;
        }

        @Override
        public ConfigLayer4RuleBakModeRequest build() {
            return new ConfigLayer4RuleBakModeRequest(this);
        } 

    } 

}
