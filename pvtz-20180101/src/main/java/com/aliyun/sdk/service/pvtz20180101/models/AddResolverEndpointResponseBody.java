// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddResolverEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>AddResolverEndpointResponseBody</p>
 */
public class AddResolverEndpointResponseBody extends TeaModel {
    @NameInMap("EndpointId")
    private String endpointId;

    @NameInMap("RequestId")
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
         * EndpointId.
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * RequestId.
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
