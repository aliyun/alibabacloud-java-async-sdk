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
 * {@link RotateTokenPlanKeyRequest} extends {@link RequestModel}
 *
 * <p>RotateTokenPlanKeyRequest</p>
 */
public class RotateTokenPlanKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiKeyId;

    private RotateTokenPlanKeyRequest(Builder builder) {
        super(builder);
        this.apiKeyId = builder.apiKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RotateTokenPlanKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeyId
     */
    public String getApiKeyId() {
        return this.apiKeyId;
    }

    public static final class Builder extends Request.Builder<RotateTokenPlanKeyRequest, Builder> {
        private String apiKeyId; 

        private Builder() {
            super();
        } 

        private Builder(RotateTokenPlanKeyRequest request) {
            super(request);
            this.apiKeyId = request.apiKeyId;
        } 

        /**
         * <p>API Key ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ak_123456</p>
         */
        public Builder apiKeyId(String apiKeyId) {
            this.putQueryParameter("ApiKeyId", apiKeyId);
            this.apiKeyId = apiKeyId;
            return this;
        }

        @Override
        public RotateTokenPlanKeyRequest build() {
            return new RotateTokenPlanKeyRequest(this);
        } 

    } 

}
