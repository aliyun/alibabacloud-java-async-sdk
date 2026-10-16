// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link DetachPolicySetFromGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>DetachPolicySetFromGatewayResponseBody</p>
 */
public class DetachPolicySetFromGatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DetachPolicySetFromGatewayResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachPolicySetFromGatewayResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(DetachPolicySetFromGatewayResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2A48EB1D-D645-5758-91AF-EDF8E36E257B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DetachPolicySetFromGatewayResponseBody build() {
            return new DetachPolicySetFromGatewayResponseBody(this);
        } 

    } 

}
