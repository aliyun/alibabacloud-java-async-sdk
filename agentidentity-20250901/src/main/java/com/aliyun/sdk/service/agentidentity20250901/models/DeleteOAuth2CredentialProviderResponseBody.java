// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link DeleteOAuth2CredentialProviderResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteOAuth2CredentialProviderResponseBody</p>
 */
public class DeleteOAuth2CredentialProviderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteOAuth2CredentialProviderResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOAuth2CredentialProviderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteOAuth2CredentialProviderResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The unique identifier of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>679B5D1D-F2A2-5D8F-BB56-B62C28CDA9D6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteOAuth2CredentialProviderResponseBody build() {
            return new DeleteOAuth2CredentialProviderResponseBody(this);
        } 

    } 

}
