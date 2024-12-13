// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ClearExternalSAMLIdentityProviderResponseBody} extends {@link TeaModel}
 *
 * <p>ClearExternalSAMLIdentityProviderResponseBody</p>
 */
public class ClearExternalSAMLIdentityProviderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ClearExternalSAMLIdentityProviderResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearExternalSAMLIdentityProviderResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>96D1E5FF-0301-5636-8D33-071E033CFB82</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ClearExternalSAMLIdentityProviderResponseBody build() {
            return new ClearExternalSAMLIdentityProviderResponseBody(this);
        } 

    } 

}
