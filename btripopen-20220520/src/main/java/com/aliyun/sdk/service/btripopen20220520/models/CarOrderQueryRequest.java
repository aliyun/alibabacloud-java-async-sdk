// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CarOrderQueryRequest} extends {@link RequestModel}
 *
 * <p>CarOrderQueryRequest</p>
 */
public class CarOrderQueryRequest extends Request {
    @Query
    @NameInMap("order_id")
    private Long orderId;

    @Query
    @NameInMap("sub_order_id")
    private Long subOrderId;

    @Header
    @NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private CarOrderQueryRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
        this.subOrderId = builder.subOrderId;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CarOrderQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return subOrderId
     */
    public Long getSubOrderId() {
        return this.subOrderId;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<CarOrderQueryRequest, Builder> {
        private Long orderId; 
        private Long subOrderId; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(CarOrderQueryRequest request) {
            super(request);
            this.orderId = request.orderId;
            this.subOrderId = request.subOrderId;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * order_id.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("order_id", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * sub_order_id.
         */
        public Builder subOrderId(Long subOrderId) {
            this.putQueryParameter("sub_order_id", subOrderId);
            this.subOrderId = subOrderId;
            return this;
        }

        /**
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public CarOrderQueryRequest build() {
            return new CarOrderQueryRequest(this);
        } 

    } 

}
