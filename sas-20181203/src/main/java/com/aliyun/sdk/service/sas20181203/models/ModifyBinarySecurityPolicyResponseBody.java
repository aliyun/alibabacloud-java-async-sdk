// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyBinarySecurityPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyBinarySecurityPolicyResponseBody</p>
 */
public class ModifyBinarySecurityPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyBinarySecurityPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBinarySecurityPolicyResponseBody create() {
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
         * <p>The request ID of the result.</p>
         * 
         * <strong>example:</strong>
         * <p>C699E4E4-F2F4-58FC-A949-457FFE59****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyBinarySecurityPolicyResponseBody build() {
            return new ModifyBinarySecurityPolicyResponseBody(this);
        } 

    } 

}
