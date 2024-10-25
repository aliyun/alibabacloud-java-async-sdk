// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetLoadBalancerHTTPSListenerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>SetLoadBalancerHTTPSListenerAttributeResponseBody</p>
 */
public class SetLoadBalancerHTTPSListenerAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetLoadBalancerHTTPSListenerAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLoadBalancerHTTPSListenerAttributeResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetLoadBalancerHTTPSListenerAttributeResponseBody build() {
            return new SetLoadBalancerHTTPSListenerAttributeResponseBody(this);
        } 

    } 

}
