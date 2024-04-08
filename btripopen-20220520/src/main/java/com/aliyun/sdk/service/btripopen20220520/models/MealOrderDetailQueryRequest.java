// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MealOrderDetailQueryRequest} extends {@link RequestModel}
 *
 * <p>MealOrderDetailQueryRequest</p>
 */
public class MealOrderDetailQueryRequest extends Request {
    @Path
    @NameInMap("order_id")
    @Validation(required = true)
    private String orderId;

    @Query
    @NameInMap("user_id")
    private String userId;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private MealOrderDetailQueryRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
        this.userId = builder.userId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MealOrderDetailQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<MealOrderDetailQueryRequest, Builder> {
        private String orderId; 
        private String userId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(MealOrderDetailQueryRequest request) {
            super(request);
            this.orderId = request.orderId;
            this.userId = request.userId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * order_id.
         */
        public Builder orderId(String orderId) {
            this.putPathParameter("order_id", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public MealOrderDetailQueryRequest build() {
            return new MealOrderDetailQueryRequest(this);
        } 

    } 

}
