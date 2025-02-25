// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCustomRoutingEndpointTrafficPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCustomRoutingEndpointTrafficPoliciesResponseBody</p>
 */
public class UpdateCustomRoutingEndpointTrafficPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PolicyIds")
    private java.util.List < String > policyIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateCustomRoutingEndpointTrafficPoliciesResponseBody(Builder builder) {
        this.policyIds = builder.policyIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomRoutingEndpointTrafficPoliciesResponseBody create() {
        return builder().build();
    }

    /**
     * @return policyIds
     */
    public java.util.List < String > getPolicyIds() {
        return this.policyIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > policyIds; 
        private String requestId; 

        /**
         * The IDs of the traffic destinations.
         */
        public Builder policyIds(java.util.List < String > policyIds) {
            this.policyIds = policyIds;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateCustomRoutingEndpointTrafficPoliciesResponseBody build() {
            return new UpdateCustomRoutingEndpointTrafficPoliciesResponseBody(this);
        } 

    } 

}
