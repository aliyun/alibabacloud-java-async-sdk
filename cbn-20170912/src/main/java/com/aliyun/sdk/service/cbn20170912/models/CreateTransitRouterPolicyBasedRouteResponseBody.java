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
 * {@link CreateTransitRouterPolicyBasedRouteResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterPolicyBasedRouteResponseBody</p>
 */
public class CreateTransitRouterPolicyBasedRouteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PolicyBasedRouteId")
    private String policyBasedRouteId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateTransitRouterPolicyBasedRouteResponseBody(Builder builder) {
        this.policyBasedRouteId = builder.policyBasedRouteId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterPolicyBasedRouteResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyBasedRouteId
     */
    public String getPolicyBasedRouteId() {
        return this.policyBasedRouteId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String policyBasedRouteId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateTransitRouterPolicyBasedRouteResponseBody model) {
            this.policyBasedRouteId = model.policyBasedRouteId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The instance ID of the policy-based routing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>pbr-123abczxc</p>
         */
        public Builder policyBasedRouteId(String policyBasedRouteId) {
            this.policyBasedRouteId = policyBasedRouteId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13526224-5780-4426-8BDF-BC8B08700F22</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateTransitRouterPolicyBasedRouteResponseBody build() {
            return new CreateTransitRouterPolicyBasedRouteResponseBody(this);
        } 

    } 

}
