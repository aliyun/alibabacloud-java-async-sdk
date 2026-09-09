// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link CreateCredentialProviderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCredentialProviderResponseBody</p>
 */
public class CreateCredentialProviderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CredentialProviderId")
    private String credentialProviderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCredentialProviderResponseBody(Builder builder) {
        this.credentialProviderId = builder.credentialProviderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCredentialProviderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credentialProviderId
     */
    public String getCredentialProviderId() {
        return this.credentialProviderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String credentialProviderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateCredentialProviderResponseBody model) {
            this.credentialProviderId = model.credentialProviderId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The credential provider ID.</p>
         * 
         * <strong>example:</strong>
         * <p>atp_01kr2cmj5gxxx4fvmls2e93dxxxxx</p>
         */
        public Builder credentialProviderId(String credentialProviderId) {
            this.credentialProviderId = credentialProviderId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCredentialProviderResponseBody build() {
            return new CreateCredentialProviderResponseBody(this);
        } 

    } 

}
