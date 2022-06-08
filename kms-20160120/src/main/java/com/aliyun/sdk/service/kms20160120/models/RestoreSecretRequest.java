// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestoreSecretRequest} extends {@link RequestModel}
 *
 * <p>RestoreSecretRequest</p>
 */
public class RestoreSecretRequest extends Request {
    @Query
    @NameInMap("SecretName")
    @Validation(required = true)
    private String secretName;

    private RestoreSecretRequest(Builder builder) {
        super(builder);
        this.secretName = builder.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestoreSecretRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    public static final class Builder extends Request.Builder<RestoreSecretRequest, Builder> {
        private String secretName; 

        private Builder() {
            super();
        } 

        private Builder(RestoreSecretRequest request) {
            super(request);
            this.secretName = request.secretName;
        } 

        /**
         * SecretName.
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        @Override
        public RestoreSecretRequest build() {
            return new RestoreSecretRequest(this);
        } 

    } 

}
