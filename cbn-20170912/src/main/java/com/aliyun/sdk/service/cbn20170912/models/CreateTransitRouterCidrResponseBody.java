// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTransitRouterCidrResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterCidrResponseBody</p>
 */
public class CreateTransitRouterCidrResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TransitRouterCidrId")
    private String transitRouterCidrId;

    private CreateTransitRouterCidrResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transitRouterCidrId = builder.transitRouterCidrId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterCidrResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transitRouterCidrId
     */
    public String getTransitRouterCidrId() {
        return this.transitRouterCidrId;
    }

    public static final class Builder {
        private String requestId; 
        private String transitRouterCidrId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TransitRouterCidrId.
         */
        public Builder transitRouterCidrId(String transitRouterCidrId) {
            this.transitRouterCidrId = transitRouterCidrId;
            return this;
        }

        public CreateTransitRouterCidrResponseBody build() {
            return new CreateTransitRouterCidrResponseBody(this);
        } 

    } 

}
