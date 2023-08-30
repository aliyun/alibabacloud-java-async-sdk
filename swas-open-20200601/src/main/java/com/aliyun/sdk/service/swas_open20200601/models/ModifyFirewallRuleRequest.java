// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFirewallRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyFirewallRuleRequest</p>
 */
public class ModifyFirewallRuleRequest extends Request {
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
    @NameInMap("RuleId")
    @Validation(required = true)
    private String ruleId;

    @Query
    @NameInMap("RuleProtocol")
    @Validation(required = true)
    private String ruleProtocol;

    @Query
    @NameInMap("SourceCidrIp")
    private String sourceCidrIp;

    private ModifyFirewallRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.port = builder.port;
        this.regionId = builder.regionId;
        this.remark = builder.remark;
        this.ruleId = builder.ruleId;
        this.ruleProtocol = builder.ruleProtocol;
        this.sourceCidrIp = builder.sourceCidrIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFirewallRuleRequest create() {
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
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleProtocol
     */
    public String getRuleProtocol() {
        return this.ruleProtocol;
    }

    /**
     * @return sourceCidrIp
     */
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public static final class Builder extends Request.Builder<ModifyFirewallRuleRequest, Builder> {
        private String clientToken; 
        private String instanceId; 
        private String port; 
        private String regionId; 
        private String remark; 
        private String ruleId; 
        private String ruleProtocol; 
        private String sourceCidrIp; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFirewallRuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.port = request.port;
            this.regionId = request.regionId;
            this.remark = request.remark;
            this.ruleId = request.ruleId;
            this.ruleProtocol = request.ruleProtocol;
            this.sourceCidrIp = request.sourceCidrIp;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The value of **ClientToken** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
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
         * The port range. Valid values: 165535. Specify a port range in the format of \<start port number>/\<end port number>. Example: `1024/1055`, which indicates that the port range of 10241055.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
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
         * The remarks of the firewall rule.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The ID of the firewall rule.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * The transport layer protocol. Valid values:
         * <p>
         * 
         * *   TCP: the TCP protocol
         * *   UDP: the UDP protocol
         * *   TCP+UDP: the TCP and UDP protocols
         */
        public Builder ruleProtocol(String ruleProtocol) {
            this.putQueryParameter("RuleProtocol", ruleProtocol);
            this.ruleProtocol = ruleProtocol;
            return this;
        }

        /**
         * The IP address or CIDR block that is allowed in the firewall rule.
         */
        public Builder sourceCidrIp(String sourceCidrIp) {
            this.putQueryParameter("SourceCidrIp", sourceCidrIp);
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }

        @Override
        public ModifyFirewallRuleRequest build() {
            return new ModifyFirewallRuleRequest(this);
        } 

    } 

}
