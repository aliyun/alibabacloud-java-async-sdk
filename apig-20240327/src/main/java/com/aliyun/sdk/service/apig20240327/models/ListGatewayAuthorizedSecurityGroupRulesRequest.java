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
 * {@link ListGatewayAuthorizedSecurityGroupRulesRequest} extends {@link RequestModel}
 *
 * <p>ListGatewayAuthorizedSecurityGroupRulesRequest</p>
 */
public class ListGatewayAuthorizedSecurityGroupRulesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    private ListGatewayAuthorizedSecurityGroupRulesRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayAuthorizedSecurityGroupRulesRequest create() {
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

    public static final class Builder extends Request.Builder<ListGatewayAuthorizedSecurityGroupRulesRequest, Builder> {
        private String gatewayId; 

        private Builder() {
            super();
        } 

        private Builder(ListGatewayAuthorizedSecurityGroupRulesRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cq2avtllh****</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        @Override
        public ListGatewayAuthorizedSecurityGroupRulesRequest build() {
            return new ListGatewayAuthorizedSecurityGroupRulesRequest(this);
        } 

    } 

}
