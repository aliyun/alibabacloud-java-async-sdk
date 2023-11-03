// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachSecurityGroupFromVpcEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>DetachSecurityGroupFromVpcEndpointResponseBody</p>
 */
public class DetachSecurityGroupFromVpcEndpointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DetachSecurityGroupFromVpcEndpointResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachSecurityGroupFromVpcEndpointResponseBody create() {
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

        public DetachSecurityGroupFromVpcEndpointResponseBody build() {
            return new DetachSecurityGroupFromVpcEndpointResponseBody(this);
        } 

    } 

}
