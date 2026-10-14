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
 * {@link DescribeNetworkRuleAttributesRequest} extends {@link RequestModel}
 *
 * <p>DescribeNetworkRuleAttributesRequest</p>
 */
public class DescribeNetworkRuleAttributesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkRules")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkRules;

    private DescribeNetworkRuleAttributesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.networkRules = builder.networkRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkRuleAttributesRequest create() {
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
     * @return networkRules
     */
    public String getNetworkRules() {
        return this.networkRules;
    }

    public static final class Builder extends Request.Builder<DescribeNetworkRuleAttributesRequest, Builder> {
        private String regionId; 
        private String networkRules; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNetworkRuleAttributesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.networkRules = request.networkRules;
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
         * <p>The port forwarding rules to query. This parameter is a JSON string with the following structure:</p>
         * <ul>
         * <li><strong>InstanceId</strong>: String type. Required. The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance.</li>
         * <li><strong>Protocol</strong>: String type. Required. The forwarding protocol type. Valid values: <strong>tcp</strong>, <strong>udp</strong>.</li>
         * <li><strong>FrontendPort</strong>: Integer type. Required. The forwarding port.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;InstanceId&quot;:&quot;ddoscoo-cn-mp91j1ao****&quot;,&quot;Protocol&quot;:&quot;tcp&quot;,&quot;FrontendPort&quot;:8080}]</p>
         */
        public Builder networkRules(String networkRules) {
            this.putQueryParameter("NetworkRules", networkRules);
            this.networkRules = networkRules;
            return this;
        }

        @Override
        public DescribeNetworkRuleAttributesRequest build() {
            return new DescribeNetworkRuleAttributesRequest(this);
        } 

    } 

}
