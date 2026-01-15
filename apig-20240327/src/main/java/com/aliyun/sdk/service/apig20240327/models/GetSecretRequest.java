// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetSecretRequest} extends {@link RequestModel}
 *
 * <p>GetSecretRequest</p>
 */
public class GetSecretRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("secretId")
    private String secretId;

    private GetSecretRequest(Builder builder) {
        super(builder);
        this.secretId = builder.secretId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecretRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return secretId
     */
    public String getSecretId() {
        return this.secretId;
    }

    public static final class Builder extends Request.Builder<GetSecretRequest, Builder> {
        private String secretId; 

        private Builder() {
            super();
        } 

        private Builder(GetSecretRequest request) {
            super(request);
            this.secretId = request.secretId;
        } 

        /**
         * secretId.
         */
        public Builder secretId(String secretId) {
            this.putPathParameter("secretId", secretId);
            this.secretId = secretId;
            return this;
        }

        @Override
        public GetSecretRequest build() {
            return new GetSecretRequest(this);
        } 

    } 

}
