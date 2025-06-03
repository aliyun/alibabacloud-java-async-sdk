// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link RestoreSecretRequest} extends {@link RequestModel}
 *
 * <p>RestoreSecretRequest</p>
 */
public class RestoreSecretRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The name of the secret you want to restore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>secret001</p>
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
