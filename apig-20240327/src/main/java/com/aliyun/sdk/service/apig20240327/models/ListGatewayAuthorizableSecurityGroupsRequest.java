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
 * {@link ListGatewayAuthorizableSecurityGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListGatewayAuthorizableSecurityGroupsRequest</p>
 */
public class ListGatewayAuthorizableSecurityGroupsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("csClusterId")
    private String csClusterId;

    private ListGatewayAuthorizableSecurityGroupsRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.csClusterId = builder.csClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayAuthorizableSecurityGroupsRequest create() {
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
     * @return csClusterId
     */
    public String getCsClusterId() {
        return this.csClusterId;
    }

    public static final class Builder extends Request.Builder<ListGatewayAuthorizableSecurityGroupsRequest, Builder> {
        private String gatewayId; 
        private String csClusterId; 

        private Builder() {
            super();
        } 

        private Builder(ListGatewayAuthorizableSecurityGroupsRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.csClusterId = request.csClusterId;
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

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c4a21b3560fad4ec299f3e63f4***</p>
         */
        public Builder csClusterId(String csClusterId) {
            this.putQueryParameter("csClusterId", csClusterId);
            this.csClusterId = csClusterId;
            return this;
        }

        @Override
        public ListGatewayAuthorizableSecurityGroupsRequest build() {
            return new ListGatewayAuthorizableSecurityGroupsRequest(this);
        } 

    } 

}
