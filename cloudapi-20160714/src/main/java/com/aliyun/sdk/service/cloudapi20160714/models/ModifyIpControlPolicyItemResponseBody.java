// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIpControlPolicyItemResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyIpControlPolicyItemResponseBody</p>
 */
public class ModifyIpControlPolicyItemResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyIpControlPolicyItemResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyIpControlPolicyItemResponseBody create() {
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
         * Modifies a policy in an access control list (ACL).
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyIpControlPolicyItemResponseBody build() {
            return new ModifyIpControlPolicyItemResponseBody(this);
        } 

    } 

}
