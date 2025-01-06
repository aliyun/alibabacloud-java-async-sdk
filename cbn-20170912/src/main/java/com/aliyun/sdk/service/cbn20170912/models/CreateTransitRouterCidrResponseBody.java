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
 * {@link CreateTransitRouterCidrResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterCidrResponseBody</p>
 */
public class CreateTransitRouterCidrResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TransitRouterCidrId")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0876E54E-3E36-5C31-89F0-9EE8A9266F9A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>cidr-0zv0q9crqpntzz****</p>
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
