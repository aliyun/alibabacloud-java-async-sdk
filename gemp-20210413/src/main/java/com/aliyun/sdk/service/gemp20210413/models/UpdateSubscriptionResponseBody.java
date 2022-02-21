// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSubscriptionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSubscriptionResponseBody</p>
 */
public class UpdateSubscriptionResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    private UpdateSubscriptionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSubscriptionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateSubscriptionResponseBody build() {
            return new UpdateSubscriptionResponseBody(this);
        } 

    } 

}
