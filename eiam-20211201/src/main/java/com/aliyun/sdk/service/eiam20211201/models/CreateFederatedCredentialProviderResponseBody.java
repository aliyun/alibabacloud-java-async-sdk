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
 * {@link CreateFederatedCredentialProviderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFederatedCredentialProviderResponseBody</p>
 */
public class CreateFederatedCredentialProviderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FederatedCredentialProviderId")
    private String federatedCredentialProviderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateFederatedCredentialProviderResponseBody(Builder builder) {
        this.federatedCredentialProviderId = builder.federatedCredentialProviderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFederatedCredentialProviderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return federatedCredentialProviderId
     */
    public String getFederatedCredentialProviderId() {
        return this.federatedCredentialProviderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String federatedCredentialProviderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateFederatedCredentialProviderResponseBody model) {
            this.federatedCredentialProviderId = model.federatedCredentialProviderId;
            this.requestId = model.requestId;
        } 

        /**
         * FederatedCredentialProviderId.
         */
        public Builder federatedCredentialProviderId(String federatedCredentialProviderId) {
            this.federatedCredentialProviderId = federatedCredentialProviderId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateFederatedCredentialProviderResponseBody build() {
            return new CreateFederatedCredentialProviderResponseBody(this);
        } 

    } 

}
