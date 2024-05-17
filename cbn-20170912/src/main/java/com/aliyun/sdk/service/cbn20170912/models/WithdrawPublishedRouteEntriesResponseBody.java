// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WithdrawPublishedRouteEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>WithdrawPublishedRouteEntriesResponseBody</p>
 */
public class WithdrawPublishedRouteEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private WithdrawPublishedRouteEntriesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WithdrawPublishedRouteEntriesResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public WithdrawPublishedRouteEntriesResponseBody build() {
            return new WithdrawPublishedRouteEntriesResponseBody(this);
        } 

    } 

}
