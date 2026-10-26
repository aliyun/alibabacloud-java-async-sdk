// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetSubscriptionResponseBody} extends {@link TeaModel}
 *
 * <p>GetSubscriptionResponseBody</p>
 */
public class GetSubscriptionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("subscription")
    private SubscriptionForView subscription;

    private GetSubscriptionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.subscription = builder.subscription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubscriptionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subscription
     */
    public SubscriptionForView getSubscription() {
        return this.subscription;
    }

    public static final class Builder {
        private String requestId; 
        private SubscriptionForView subscription; 

        private Builder() {
        } 

        private Builder(GetSubscriptionResponseBody model) {
            this.requestId = model.requestId;
            this.subscription = model.subscription;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>111111-222-333-1111-33333</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * subscription.
         */
        public Builder subscription(SubscriptionForView subscription) {
            this.subscription = subscription;
            return this;
        }

        public GetSubscriptionResponseBody build() {
            return new GetSubscriptionResponseBody(this);
        } 

    } 

}
