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
 * {@link CreateNetworkRulesRequest} extends {@link RequestModel}
 *
 * <p>CreateNetworkRulesRequest</p>
 */
public class CreateNetworkRulesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkRules")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkRules;

    private CreateNetworkRulesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.networkRules = builder.networkRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkRulesRequest create() {
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

    public static final class Builder extends Request.Builder<CreateNetworkRulesRequest, Builder> {
        private String regionId; 
        private String networkRules; 

        private Builder() {
            super();
        } 

        private Builder(CreateNetworkRulesRequest request) {
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
         * <p>The details of the port forwarding rule. This parameter is a JSON string. The string contains the following fields:</p>
         * <ul>
         * <li><strong>InstanceId</strong>: the ID of the instance. This field is required and must be of the STRING type.</li>
         * <li><strong>Protocol</strong>: the forwarding protocol. This field is required and must be of the STRING type. Valid values: <strong>tcp</strong> and <strong>udp</strong>.</li>
         * <li><strong>FrontendPort</strong>: the forwarding port. This field is required and must be of the INTEGER type.</li>
         * <li><strong>BackendPort</strong>: the port of the origin server. This field is required and must be of the INTEGER type.</li>
         * <li><strong>RealServers</strong>: the IP addresses of the origin server. This field is required and must be a JSON array. You can specify up to 20 IP addresses.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;InstanceId&quot;:&quot;ddoscoo-cn-mp91j1ao****&quot;,&quot;Protocol&quot;:&quot;tcp&quot;,&quot;FrontendPort&quot;:8080,&quot;BackendPort&quot;:8080,&quot;RealServers&quot;:[&quot;1.1.1.1&quot;,&quot;2.2.2.2&quot;]}]</p>
         */
        public Builder networkRules(String networkRules) {
            this.putQueryParameter("NetworkRules", networkRules);
            this.networkRules = networkRules;
            return this;
        }

        @Override
        public CreateNetworkRulesRequest build() {
            return new CreateNetworkRulesRequest(this);
        } 

    } 

}
