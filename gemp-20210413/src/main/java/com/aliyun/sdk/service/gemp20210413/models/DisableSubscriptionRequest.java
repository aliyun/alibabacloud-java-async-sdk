// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>DisableSubscriptionRequest</p>
 */
public class DisableSubscriptionRequest extends Request {
    @Body
    @NameInMap("subscriptionId")
    private Long subscriptionId;

    private DisableSubscriptionRequest(Builder builder) {
        super(builder);
        this.subscriptionId = builder.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableSubscriptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return subscriptionId
     */
    public Long getSubscriptionId() {
        return this.subscriptionId;
    }

    public static final class Builder extends Request.Builder<DisableSubscriptionRequest, Builder> {
        private Long subscriptionId; 

        private Builder() {
            super();
        } 

        private Builder(DisableSubscriptionRequest request) {
            super(request);
            this.subscriptionId = request.subscriptionId;
        } 

        /**
         * subscriptionId.
         */
        public Builder subscriptionId(Long subscriptionId) {
            this.putBodyParameter("subscriptionId", subscriptionId);
            this.subscriptionId = subscriptionId;
            return this;
        }

        @Override
        public DisableSubscriptionRequest build() {
            return new DisableSubscriptionRequest(this);
        } 

    } 

}
