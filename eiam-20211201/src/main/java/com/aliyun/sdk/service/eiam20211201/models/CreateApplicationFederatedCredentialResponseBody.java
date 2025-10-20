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
 * {@link CreateApplicationFederatedCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApplicationFederatedCredentialResponseBody</p>
 */
public class CreateApplicationFederatedCredentialResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationFederatedCredentialId")
    private String applicationFederatedCredentialId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateApplicationFederatedCredentialResponseBody(Builder builder) {
        this.applicationFederatedCredentialId = builder.applicationFederatedCredentialId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationFederatedCredentialResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationFederatedCredentialId
     */
    public String getApplicationFederatedCredentialId() {
        return this.applicationFederatedCredentialId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String applicationFederatedCredentialId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateApplicationFederatedCredentialResponseBody model) {
            this.applicationFederatedCredentialId = model.applicationFederatedCredentialId;
            this.requestId = model.requestId;
        } 

        /**
         * ApplicationFederatedCredentialId.
         */
        public Builder applicationFederatedCredentialId(String applicationFederatedCredentialId) {
            this.applicationFederatedCredentialId = applicationFederatedCredentialId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateApplicationFederatedCredentialResponseBody build() {
            return new CreateApplicationFederatedCredentialResponseBody(this);
        } 

    } 

}
