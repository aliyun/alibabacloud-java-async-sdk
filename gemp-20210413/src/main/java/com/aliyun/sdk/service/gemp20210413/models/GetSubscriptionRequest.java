// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>GetSubscriptionRequest</p>
 */
public class GetSubscriptionRequest extends Request {
    @Body
    @NameInMap("subscriptionId")
    private Long subscriptionId;

    private GetSubscriptionRequest(Builder builder) {
        super(builder);
        this.subscriptionId = builder.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubscriptionRequest create() {
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

    public static final class Builder extends Request.Builder<GetSubscriptionRequest, Builder> {
        private Long subscriptionId; 

        private Builder() {
            super();
        } 

        private Builder(GetSubscriptionRequest response) {
            super(response);
            this.subscriptionId = response.subscriptionId;
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
        public GetSubscriptionRequest build() {
            return new GetSubscriptionRequest(this);
        } 

    } 

}
