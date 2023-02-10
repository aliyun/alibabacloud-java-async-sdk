// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrainOrderQueryV2Request} extends {@link RequestModel}
 *
 * <p>TrainOrderQueryV2Request</p>
 */
public class TrainOrderQueryV2Request extends Request {
    @Query
    @NameInMap("order_id")
    private Long orderId;

    @Query
    @NameInMap("user_id")
    private String userId;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    @Validation(required = true)
    private String xAcsBtripCorpToken;

    private TrainOrderQueryV2Request(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
        this.userId = builder.userId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrainOrderQueryV2Request create() {
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

    public static final class Builder extends Request.Builder<TrainOrderQueryV2Request, Builder> {
        private Long orderId; 
        private String userId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TrainOrderQueryV2Request request) {
            super(request);
            this.orderId = request.orderId;
            this.userId = request.userId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
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
        public TrainOrderQueryV2Request build() {
            return new TrainOrderQueryV2Request(this);
        } 

    } 

}
