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
 * {@link DeleteSubscriptionResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSubscriptionResponseBody</p>
 */
public class DeleteSubscriptionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("subscriptionId")
    private String subscriptionId;

    private DeleteSubscriptionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.subscriptionId = builder.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSubscriptionResponseBody create() {
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
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public static final class Builder {
        private String requestId; 
        private String subscriptionId; 

        private Builder() {
        } 

        private Builder(DeleteSubscriptionResponseBody model) {
            this.requestId = model.requestId;
            this.subscriptionId = model.subscriptionId;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>8A33DBEA-<em><strong><strong>-</strong></strong></em>-<em><strong><strong>-</strong></strong></em></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>123123123123</p>
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public DeleteSubscriptionResponseBody build() {
            return new DeleteSubscriptionResponseBody(this);
        } 

    } 

}
