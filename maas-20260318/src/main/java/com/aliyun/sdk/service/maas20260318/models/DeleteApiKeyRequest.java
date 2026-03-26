// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maas20260318.models;

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
 * {@link DeleteApiKeyRequest} extends {@link RequestModel}
 *
 * <p>DeleteApiKeyRequest</p>
 */
public class DeleteApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("apiKeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long apiKeyId;

    private DeleteApiKeyRequest(Builder builder) {
        super(builder);
        this.apiKeyId = builder.apiKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApiKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeyId
     */
    public Long getApiKeyId() {
        return this.apiKeyId;
    }

    public static final class Builder extends Request.Builder<DeleteApiKeyRequest, Builder> {
        private Long apiKeyId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteApiKeyRequest request) {
            super(request);
            this.apiKeyId = request.apiKeyId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apiKeyId(Long apiKeyId) {
            this.putPathParameter("apiKeyId", apiKeyId);
            this.apiKeyId = apiKeyId;
            return this;
        }

        @Override
        public DeleteApiKeyRequest build() {
            return new DeleteApiKeyRequest(this);
        } 

    } 

}
