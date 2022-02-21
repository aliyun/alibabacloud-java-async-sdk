// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGatewayDomainRequest} extends {@link RequestModel}
 *
 * <p>ListGatewayDomainRequest</p>
 */
public class ListGatewayDomainRequest extends Request {
    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    private ListGatewayDomainRequest(Builder builder) {
        super(builder);
        this.gatewayUniqueId = builder.gatewayUniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayDomainRequest create() {
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

    public static final class Builder extends Request.Builder<ListGatewayDomainRequest, Builder> {
        private String gatewayUniqueId; 

        private Builder() {
            super();
        } 

        private Builder(ListGatewayDomainRequest response) {
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
        public ListGatewayDomainRequest build() {
            return new ListGatewayDomainRequest(this);
        } 

    } 

}
