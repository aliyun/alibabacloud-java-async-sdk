// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGatewaySlbRequest} extends {@link RequestModel}
 *
 * <p>ListGatewaySlbRequest</p>
 */
public class ListGatewaySlbRequest extends Request {
    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    private ListGatewaySlbRequest(Builder builder) {
        super(builder);
        this.gatewayUniqueId = builder.gatewayUniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewaySlbRequest create() {
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

    public static final class Builder extends Request.Builder<ListGatewaySlbRequest, Builder> {
        private String gatewayUniqueId; 

        private Builder() {
            super();
        } 

        private Builder(ListGatewaySlbRequest response) {
            super(response);
            this.gatewayUniqueId = response.gatewayUniqueId;
        } 

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        @Override
        public ListGatewaySlbRequest build() {
            return new ListGatewaySlbRequest(this);
        } 

    } 

}
