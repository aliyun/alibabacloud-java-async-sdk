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

        private Builder(CreateFirewallRuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.port = request.port;
            this.regionId = request.regionId;
            this.remark = request.remark;
            this.ruleProtocol = request.ruleProtocol;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. ****For more information, see [How to ensure idempotence](~~25693~~).
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
         * The port range. Valid values: 1 to 65535. Specify a port range in the format of \<start port number>/\<end port number>. Example: `1024/1055`, which indicates that the port range of 1024 to 1055.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * The region ID of the simple application server.
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

        @Override
        public CreateFirewallRuleRequest build() {
            return new CreateFirewallRuleRequest(this);
        } 

    } 

}
