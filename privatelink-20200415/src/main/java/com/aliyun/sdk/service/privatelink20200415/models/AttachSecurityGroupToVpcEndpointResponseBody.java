// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachSecurityGroupToVpcEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>AttachSecurityGroupToVpcEndpointResponseBody</p>
 */
public class AttachSecurityGroupToVpcEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AttachSecurityGroupToVpcEndpointResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachSecurityGroupToVpcEndpointResponseBody create() {
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

        public AttachSecurityGroupToVpcEndpointResponseBody build() {
            return new AttachSecurityGroupToVpcEndpointResponseBody(this);
        } 

    } 

}
