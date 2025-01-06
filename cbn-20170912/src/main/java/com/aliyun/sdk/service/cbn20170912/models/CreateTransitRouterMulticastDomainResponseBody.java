// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link CreateTransitRouterMulticastDomainResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterMulticastDomainResponseBody</p>
 */
public class CreateTransitRouterMulticastDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TransitRouterMulticastDomainId")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>94E19C6F-206F-5223-9A63-64B85851BC04</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the multicast domain.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-mcast-domain-40cwj0rgzgdtam****</p>
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
