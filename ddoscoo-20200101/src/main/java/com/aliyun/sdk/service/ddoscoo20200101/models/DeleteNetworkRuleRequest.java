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
 * {@link DeleteNetworkRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteNetworkRuleRequest</p>
 */
public class DeleteNetworkRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkRule")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkRule;

    private DeleteNetworkRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.networkRule = builder.networkRule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNetworkRuleRequest create() {
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
     * @return networkRule
     */
    public String getNetworkRule() {
        return this.networkRule;
    }

    public static final class Builder extends Request.Builder<DeleteNetworkRuleRequest, Builder> {
        private String regionId; 
        private String networkRule; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNetworkRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.networkRule = request.networkRule;
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
         * <p>An array that consists of the information about the port forwarding rule. This parameter is a JSON string. The string contains the following fields:</p>
         * <ul>
         * <li><strong>InstanceId</strong>: the ID of the instance. This field is required and must be of the STRING type.</li>
         * <li><strong>Protocol</strong>: the forwarding protocol. This field is required and must be of the STRING type. Valid values: <strong>tcp</strong> and <strong>udp</strong>.</li>
         * <li><strong>FrontendPort</strong>: the forwarding port. This field is required and must be of the INTEGER type.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;InstanceId&quot;:&quot;ddoscoo-cn-mp91j1ao****&quot;,&quot;Protocol&quot;:&quot;tcp&quot;,&quot;FrontendPort&quot;:8080}]</p>
         */
        public Builder networkRule(String networkRule) {
            this.putQueryParameter("NetworkRule", networkRule);
            this.networkRule = networkRule;
            return this;
        }

        @Override
        public DeleteNetworkRuleRequest build() {
            return new DeleteNetworkRuleRequest(this);
        } 

    } 

}
