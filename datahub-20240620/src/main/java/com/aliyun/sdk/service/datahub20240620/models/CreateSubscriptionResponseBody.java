// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datahub20240620.models;

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
 * {@link CreateSubscriptionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSubscriptionResponseBody</p>
 */
public class CreateSubscriptionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubscriptionId")
    private String subscriptionId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private CreateSubscriptionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.subscriptionId = builder.subscriptionId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSubscriptionResponseBody create() {
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

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private String subscriptionId; 
        private String success; 

        private Builder() {
        } 

        private Builder(CreateSubscriptionResponseBody model) {
            this.requestId = model.requestId;
            this.subscriptionId = model.subscriptionId;
            this.success = model.success;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SubscriptionId.
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CreateSubscriptionResponseBody build() {
            return new CreateSubscriptionResponseBody(this);
        } 

    } 

}
