// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link UpdateCustomRoutingEndpointTrafficPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCustomRoutingEndpointTrafficPoliciesResponseBody</p>
 */
public class UpdateCustomRoutingEndpointTrafficPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PolicyIds")
    private java.util.List<String> policyIds;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyIds
     */
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> policyIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateCustomRoutingEndpointTrafficPoliciesResponseBody model) {
            this.policyIds = model.policyIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IDs of the traffic destinations.</p>
         */
        public Builder policyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
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
