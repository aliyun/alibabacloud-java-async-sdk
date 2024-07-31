// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFirewallRulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteFirewallRulesRequest</p>
 */
public class DeleteFirewallRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleIds")
    private java.util.List < String > ruleIds;

    private DeleteFirewallRulesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.ruleIds = builder.ruleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFirewallRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    /**
     * @return ruleIds
     */
    public java.util.List < String > getRuleIds() {
        return this.ruleIds;
    }

    public static final class Builder extends Request.Builder<DeleteFirewallRulesRequest, Builder> {
        private String clientToken; 
        private String instanceId; 
        private String regionId; 
        private java.util.List < String > ruleIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFirewallRulesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.ruleIds = request.ruleIds;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the simple application server.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region ID of the simple application server. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The IDs of the firewall rules that you want to delete.
         */
        public Builder ruleIds(java.util.List < String > ruleIds) {
            String ruleIdsShrink = shrink(ruleIds, "RuleIds", "simple");
            this.putQueryParameter("RuleIds", ruleIdsShrink);
            this.ruleIds = ruleIds;
            return this;
        }

        @Override
        public DeleteFirewallRulesRequest build() {
            return new DeleteFirewallRulesRequest(this);
        } 

    } 

}
