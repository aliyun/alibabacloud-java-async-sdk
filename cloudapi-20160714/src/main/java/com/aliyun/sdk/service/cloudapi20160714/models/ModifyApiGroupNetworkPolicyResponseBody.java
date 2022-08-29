// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyApiGroupNetworkPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyApiGroupNetworkPolicyResponseBody</p>
 */
public class ModifyApiGroupNetworkPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyApiGroupNetworkPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApiGroupNetworkPolicyResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyApiGroupNetworkPolicyResponseBody build() {
            return new ModifyApiGroupNetworkPolicyResponseBody(this);
        } 

    } 

}
