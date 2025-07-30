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
 * {@link CreateIdentityProviderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIdentityProviderResponseBody</p>
 */
public class CreateIdentityProviderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IdentityProviderId")
    private String identityProviderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateIdentityProviderResponseBody(Builder builder) {
        this.identityProviderId = builder.identityProviderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIdentityProviderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identityProviderId
     */
    public String getIdentityProviderId() {
        return this.identityProviderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String identityProviderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateIdentityProviderResponseBody model) {
            this.identityProviderId = model.identityProviderId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Identity provider ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idp_mwpcwnhrimlr2horxXXXX</p>
         */
        public Builder identityProviderId(String identityProviderId) {
            this.identityProviderId = identityProviderId;
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

        public CreateIdentityProviderResponseBody build() {
            return new CreateIdentityProviderResponseBody(this);
        } 

    } 

}
