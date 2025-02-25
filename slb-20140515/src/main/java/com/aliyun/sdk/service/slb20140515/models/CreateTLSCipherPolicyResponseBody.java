// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link CreateTLSCipherPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTLSCipherPolicyResponseBody</p>
 */
public class CreateTLSCipherPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TLSCipherPolicyId")
    private String TLSCipherPolicyId;

    private CreateTLSCipherPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.TLSCipherPolicyId = builder.TLSCipherPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTLSCipherPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return TLSCipherPolicyId
     */
    public String getTLSCipherPolicyId() {
        return this.TLSCipherPolicyId;
    }

    public static final class Builder {
        private String requestId; 
        private String TLSCipherPolicyId; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D7A8875F-373A-5F48-8484-25B07A61F2AF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>tls-bp14bb1e7dll4f****</p>
         */
        public Builder TLSCipherPolicyId(String TLSCipherPolicyId) {
            this.TLSCipherPolicyId = TLSCipherPolicyId;
            return this;
        }

        public CreateTLSCipherPolicyResponseBody build() {
            return new CreateTLSCipherPolicyResponseBody(this);
        } 

    } 

}
