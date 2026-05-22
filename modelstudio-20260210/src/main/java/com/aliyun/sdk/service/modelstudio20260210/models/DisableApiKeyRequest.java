// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link DisableApiKeyRequest} extends {@link RequestModel}
 *
 * <p>DisableApiKeyRequest</p>
 */
public class DisableApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("apiKeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long apiKeyId;

    private DisableApiKeyRequest(Builder builder) {
        super(builder);
        this.apiKeyId = builder.apiKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableApiKeyRequest create() {
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

    public static final class Builder extends Request.Builder<DisableApiKeyRequest, Builder> {
        private Long apiKeyId; 

        private Builder() {
            super();
        } 

        private Builder(DisableApiKeyRequest request) {
            super(request);
            this.apiKeyId = request.apiKeyId;
        } 

        /**
         * <p>API Key ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3268483</p>
         */
        public Builder apiKeyId(Long apiKeyId) {
            this.putPathParameter("apiKeyId", apiKeyId);
            this.apiKeyId = apiKeyId;
            return this;
        }

        @Override
        public DisableApiKeyRequest build() {
            return new DisableApiKeyRequest(this);
        } 

    } 

}
