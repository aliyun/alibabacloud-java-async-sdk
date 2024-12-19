// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

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
 * {@link DetachSecurityGroupFromVpcEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>DetachSecurityGroupFromVpcEndpointResponseBody</p>
 */
public class DetachSecurityGroupFromVpcEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8D778FF9-7640-4C13-BCD6-9265CA9A2F81</p>
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
