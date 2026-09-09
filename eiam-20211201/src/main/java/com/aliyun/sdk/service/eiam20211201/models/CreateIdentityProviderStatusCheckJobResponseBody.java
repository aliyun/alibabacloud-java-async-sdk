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
 * {@link CreateIdentityProviderStatusCheckJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIdentityProviderStatusCheckJobResponseBody</p>
 */
public class CreateIdentityProviderStatusCheckJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IdentityProviderStatusCheckJobId")
    private String identityProviderStatusCheckJobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateIdentityProviderStatusCheckJobResponseBody(Builder builder) {
        this.identityProviderStatusCheckJobId = builder.identityProviderStatusCheckJobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIdentityProviderStatusCheckJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identityProviderStatusCheckJobId
     */
    public String getIdentityProviderStatusCheckJobId() {
        return this.identityProviderStatusCheckJobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String identityProviderStatusCheckJobId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateIdentityProviderStatusCheckJobResponseBody model) {
            this.identityProviderStatusCheckJobId = model.identityProviderStatusCheckJobId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>async_000xxxx</p>
         */
        public Builder identityProviderStatusCheckJobId(String identityProviderStatusCheckJobId) {
            this.identityProviderStatusCheckJobId = identityProviderStatusCheckJobId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIdentityProviderStatusCheckJobResponseBody build() {
            return new CreateIdentityProviderStatusCheckJobResponseBody(this);
        } 

    } 

}
