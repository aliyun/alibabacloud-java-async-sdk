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
 * {@link DeleteGatewaySecurityGroupRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteGatewaySecurityGroupRuleRequest</p>
 */
public class DeleteGatewaySecurityGroupRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("securityGroupRuleId")
    private String securityGroupRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cascadingDelete")
    private Boolean cascadingDelete;

    private DeleteGatewaySecurityGroupRuleRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.securityGroupRuleId = builder.securityGroupRuleId;
        this.cascadingDelete = builder.cascadingDelete;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGatewaySecurityGroupRuleRequest create() {
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
     * @return securityGroupRuleId
     */
    public String getSecurityGroupRuleId() {
        return this.securityGroupRuleId;
    }

    /**
     * @return cascadingDelete
     */
    public Boolean getCascadingDelete() {
        return this.cascadingDelete;
    }

    public static final class Builder extends Request.Builder<DeleteGatewaySecurityGroupRuleRequest, Builder> {
        private String gatewayId; 
        private String securityGroupRuleId; 
        private Boolean cascadingDelete; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGatewaySecurityGroupRuleRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.securityGroupRuleId = request.securityGroupRuleId;
            this.cascadingDelete = request.cascadingDelete;
        } 

        /**
         * <p>Cloud-native API Gateway ID</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cpv4sqdl*****</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>Cloud-native API Gateway security rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gsgr-cpqnj1llht***</p>
         */
        public Builder securityGroupRuleId(String securityGroupRuleId) {
            this.putPathParameter("securityGroupRuleId", securityGroupRuleId);
            this.securityGroupRuleId = securityGroupRuleId;
            return this;
        }

        /**
         * <p>Whether to cascade delete the security group rules.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder cascadingDelete(Boolean cascadingDelete) {
            this.putQueryParameter("cascadingDelete", cascadingDelete);
            this.cascadingDelete = cascadingDelete;
            return this;
        }

        @Override
        public DeleteGatewaySecurityGroupRuleRequest build() {
            return new DeleteGatewaySecurityGroupRuleRequest(this);
        } 

    } 

}
