// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTransitRouterMulticastDomainResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterMulticastDomainResponseBody</p>
 */
public class CreateTransitRouterMulticastDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TransitRouterMulticastDomainId")
    private String transitRouterMulticastDomainId;

    private CreateTransitRouterMulticastDomainResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transitRouterMulticastDomainId = builder.transitRouterMulticastDomainId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterMulticastDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transitRouterMulticastDomainId
     */
    public String getTransitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }

    public static final class Builder {
        private String requestId; 
        private String transitRouterMulticastDomainId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the multicast domain.
         */
        public Builder transitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
            this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
            return this;
        }

        public CreateTransitRouterMulticastDomainResponseBody build() {
            return new CreateTransitRouterMulticastDomainResponseBody(this);
        } 

    } 

}
