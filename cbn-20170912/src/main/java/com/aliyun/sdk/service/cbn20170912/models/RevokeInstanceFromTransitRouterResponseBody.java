// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeInstanceFromTransitRouterResponseBody} extends {@link TeaModel}
 *
 * <p>RevokeInstanceFromTransitRouterResponseBody</p>
 */
public class RevokeInstanceFromTransitRouterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RevokeInstanceFromTransitRouterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeInstanceFromTransitRouterResponseBody create() {
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

        public RevokeInstanceFromTransitRouterResponseBody build() {
            return new RevokeInstanceFromTransitRouterResponseBody(this);
        } 

    } 

}
