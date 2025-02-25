// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link AddGatewaySecurityGroupRuleRequest} extends {@link RequestModel}
 *
 * <p>AddGatewaySecurityGroupRuleRequest</p>
 */
public class AddGatewaySecurityGroupRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("portRanges")
    private java.util.List<String> portRanges;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("securityGroupId")
    private String securityGroupId;

    private AddGatewaySecurityGroupRuleRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.description = builder.description;
        this.portRanges = builder.portRanges;
        this.securityGroupId = builder.securityGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddGatewaySecurityGroupRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return portRanges
     */
    public java.util.List<String> getPortRanges() {
        return this.portRanges;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public static final class Builder extends Request.Builder<AddGatewaySecurityGroupRuleRequest, Builder> {
        private String gatewayId; 
        private String description; 
        private java.util.List<String> portRanges; 
        private String securityGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AddGatewaySecurityGroupRuleRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.description = request.description;
            this.portRanges = request.portRanges;
            this.securityGroupId = request.securityGroupId;
        } 

        /**
         * <p>Cloud-native API Gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cpv4sqdlh***</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>Description of the security group rule.</p>
         * 
         * <strong>example:</strong>
         * <p>商品中心访问安全组</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Port ranges.</p>
         */
        public Builder portRanges(java.util.List<String> portRanges) {
            this.putBodyParameter("portRanges", portRanges);
            this.portRanges = portRanges;
            return this;
        }

        /**
         * <p>Security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-wz929kxhcdp****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putBodyParameter("securityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        @Override
        public AddGatewaySecurityGroupRuleRequest build() {
            return new AddGatewaySecurityGroupRuleRequest(this);
        } 

    } 

}
