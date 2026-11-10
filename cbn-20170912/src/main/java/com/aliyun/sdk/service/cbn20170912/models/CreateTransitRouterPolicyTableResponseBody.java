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
 * {@link CreateTransitRouterPolicyTableResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterPolicyTableResponseBody</p>
 */
public class CreateTransitRouterPolicyTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PolicyTableId")
    private String policyTableId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateTransitRouterPolicyTableResponseBody(Builder builder) {
        this.policyTableId = builder.policyTableId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterPolicyTableResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyTableId
     */
    public String getPolicyTableId() {
        return this.policyTableId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String policyTableId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateTransitRouterPolicyTableResponseBody model) {
            this.policyTableId = model.policyTableId;
            this.requestId = model.requestId;
        } 

        /**
         * PolicyTableId.
         */
        public Builder policyTableId(String policyTableId) {
            this.policyTableId = policyTableId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateTransitRouterPolicyTableResponseBody build() {
            return new CreateTransitRouterPolicyTableResponseBody(this);
        } 

    } 

}
