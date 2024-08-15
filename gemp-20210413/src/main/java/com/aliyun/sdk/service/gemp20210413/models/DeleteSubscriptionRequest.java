// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>DeleteSubscriptionRequest</p>
 */
public class DeleteSubscriptionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subscriptionId")
    private Long subscriptionId;

    private DeleteSubscriptionRequest(Builder builder) {
        super(builder);
        this.subscriptionId = builder.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSubscriptionRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteSubscriptionRequest, Builder> {
        private Long subscriptionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSubscriptionRequest request) {
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
        public DeleteSubscriptionRequest build() {
            return new DeleteSubscriptionRequest(this);
        } 

    } 

}
