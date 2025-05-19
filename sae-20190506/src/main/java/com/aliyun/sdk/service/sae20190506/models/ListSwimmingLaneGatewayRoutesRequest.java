// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListSwimmingLaneGatewayRoutesRequest} extends {@link RequestModel}
 *
 * <p>ListSwimmingLaneGatewayRoutesRequest</p>
 */
public class ListSwimmingLaneGatewayRoutesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    private ListSwimmingLaneGatewayRoutesRequest(Builder builder) {
        super(builder);
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.namespaceId = builder.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSwimmingLaneGatewayRoutesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public static final class Builder extends Request.Builder<ListSwimmingLaneGatewayRoutesRequest, Builder> {
        private String gatewayUniqueId; 
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListSwimmingLaneGatewayRoutesRequest request) {
            super(request);
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.namespaceId = request.namespaceId;
        } 

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        @Override
        public ListSwimmingLaneGatewayRoutesRequest build() {
            return new ListSwimmingLaneGatewayRoutesRequest(this);
        } 

    } 

}
