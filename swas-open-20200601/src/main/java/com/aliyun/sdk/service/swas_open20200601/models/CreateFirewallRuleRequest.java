// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFirewallRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateFirewallRuleRequest</p>
 */
public class CreateFirewallRuleRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Port")
    @Validation(required = true)
    private String port;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("RuleProtocol")
    @Validation(required = true)
    private String ruleProtocol;

    private CreateFirewallRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.port = builder.port;
        this.regionId = builder.regionId;
        this.remark = builder.remark;
        this.ruleProtocol = builder.ruleProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFirewallRuleRequest create() {
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
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return ruleProtocol
     */
    public String getRuleProtocol() {
        return this.ruleProtocol;
    }

    public static final class Builder extends Request.Builder<CreateFirewallRuleRequest, Builder> {
        private String clientToken; 
        private String instanceId; 
        private String port; 
        private String regionId; 
        private String remark; 
        private String ruleProtocol; 

        private Builder() {
            super();
        } 

        private Builder(CreateFirewallRuleRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.instanceId = response.instanceId;
            this.port = response.port;
            this.regionId = response.regionId;
            this.remark = response.remark;
            this.ruleProtocol = response.ruleProtocol;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * RuleProtocol.
         */
        public Builder ruleProtocol(String ruleProtocol) {
            this.putQueryParameter("RuleProtocol", ruleProtocol);
            this.ruleProtocol = ruleProtocol;
            return this;
        }

        @Override
        public CreateFirewallRuleRequest build() {
            return new CreateFirewallRuleRequest(this);
        } 

    } 

}
