// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelSubscriptionBillRequest} extends {@link RequestModel}
 *
 * <p>CancelSubscriptionBillRequest</p>
 */
public class CancelSubscriptionBillRequest extends Request {
    @Query
    @NameInMap("SubscribeType")
    @Validation(required = true)
    private String subscribeType;

    private CancelSubscriptionBillRequest(Builder builder) {
        super(builder);
        this.subscribeType = builder.subscribeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelSubscriptionBillRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return subscribeType
     */
    public String getSubscribeType() {
        return this.subscribeType;
    }

    public static final class Builder extends Request.Builder<CancelSubscriptionBillRequest, Builder> {
        private String subscribeType; 

        private Builder() {
            super();
        } 

        private Builder(CancelSubscriptionBillRequest request) {
            super(request);
            this.subscribeType = request.subscribeType;
        } 

        /**
         * subscribeType
         */
        public Builder subscribeType(String subscribeType) {
            this.putQueryParameter("SubscribeType", subscribeType);
            this.subscribeType = subscribeType;
            return this;
        }

        @Override
        public CancelSubscriptionBillRequest build() {
            return new CancelSubscriptionBillRequest(this);
        } 

    } 

}
