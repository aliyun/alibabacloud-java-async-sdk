// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddResolverEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>AddResolverEndpointResponseBody</p>
 */
public class AddResolverEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndpointId")
    private String endpointId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddResolverEndpointResponseBody(Builder builder) {
        this.endpointId = builder.endpointId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddResolverEndpointResponseBody create() {
        return builder().build();
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String endpointId; 
        private String requestId; 

        /**
         * <p>The endpoint ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hra0**</p>
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>32436208-E1AF-4DAB-B3B8-24F5F25B0950</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddResolverEndpointResponseBody build() {
            return new AddResolverEndpointResponseBody(this);
        } 

    } 

}
