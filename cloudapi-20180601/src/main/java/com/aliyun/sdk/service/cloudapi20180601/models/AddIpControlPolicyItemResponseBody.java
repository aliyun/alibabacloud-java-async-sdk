// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddIpControlPolicyItemResponseBody} extends {@link TeaModel}
 *
 * <p>AddIpControlPolicyItemResponseBody</p>
 */
public class AddIpControlPolicyItemResponseBody extends TeaModel {
    @NameInMap("PolicyItemId")
    private String policyItemId;

    @NameInMap("RequestId")
    private String requestId;

    private AddIpControlPolicyItemResponseBody(Builder builder) {
        this.policyItemId = builder.policyItemId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddIpControlPolicyItemResponseBody create() {
        return builder().build();
    }

    /**
     * @return policyItemId
     */
    public String getPolicyItemId() {
        return this.policyItemId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String policyItemId; 
        private String requestId; 

        /**
         * PolicyItemId.
         */
        public Builder policyItemId(String policyItemId) {
            this.policyItemId = policyItemId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddIpControlPolicyItemResponseBody build() {
            return new AddIpControlPolicyItemResponseBody(this);
        } 

    } 

}
