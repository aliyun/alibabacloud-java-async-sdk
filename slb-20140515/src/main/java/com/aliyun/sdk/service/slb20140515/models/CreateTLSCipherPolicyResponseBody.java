// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTLSCipherPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTLSCipherPolicyResponseBody</p>
 */
public class CreateTLSCipherPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TLSCipherPolicyId")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TLSCipherPolicyId.
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
