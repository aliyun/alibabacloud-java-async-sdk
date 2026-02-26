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
 * {@link CreateCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCredentialResponseBody</p>
 */
public class CreateCredentialResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CredentialId")
    private String credentialId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCredentialResponseBody(Builder builder) {
        this.credentialId = builder.credentialId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCredentialResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credentialId
     */
    public String getCredentialId() {
        return this.credentialId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String credentialId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateCredentialResponseBody model) {
            this.credentialId = model.credentialId;
            this.requestId = model.requestId;
        } 

        /**
         * CredentialId.
         */
        public Builder credentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCredentialResponseBody build() {
            return new CreateCredentialResponseBody(this);
        } 

    } 

}
