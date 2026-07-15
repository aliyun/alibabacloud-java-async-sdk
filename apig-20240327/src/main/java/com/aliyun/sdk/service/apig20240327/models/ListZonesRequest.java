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
 * {@link ListZonesRequest} extends {@link RequestModel}
 *
 * <p>ListZonesRequest</p>
 */
public class ListZonesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayEdition")
    private String gatewayEdition;

    private ListZonesRequest(Builder builder) {
        super(builder);
        this.gatewayEdition = builder.gatewayEdition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListZonesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayEdition
     */
    public String getGatewayEdition() {
        return this.gatewayEdition;
    }

    public static final class Builder extends Request.Builder<ListZonesRequest, Builder> {
        private String gatewayEdition; 

        private Builder() {
            super();
        } 

        private Builder(ListZonesRequest request) {
            super(request);
            this.gatewayEdition = request.gatewayEdition;
        } 

        /**
         * gatewayEdition.
         */
        public Builder gatewayEdition(String gatewayEdition) {
            this.putQueryParameter("gatewayEdition", gatewayEdition);
            this.gatewayEdition = gatewayEdition;
            return this;
        }

        @Override
        public ListZonesRequest build() {
            return new ListZonesRequest(this);
        } 

    } 

}
