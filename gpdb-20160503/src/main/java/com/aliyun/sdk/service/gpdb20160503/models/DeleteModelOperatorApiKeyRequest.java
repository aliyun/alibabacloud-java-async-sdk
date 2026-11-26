// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DeleteModelOperatorApiKeyRequest} extends {@link RequestModel}
 *
 * <p>DeleteModelOperatorApiKeyRequest</p>
 */
public class DeleteModelOperatorApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer apiKeyId;

    private DeleteModelOperatorApiKeyRequest(Builder builder) {
        super(builder);
        this.apiKeyId = builder.apiKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteModelOperatorApiKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeyId
     */
    public Integer getApiKeyId() {
        return this.apiKeyId;
    }

    public static final class Builder extends Request.Builder<DeleteModelOperatorApiKeyRequest, Builder> {
        private Integer apiKeyId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteModelOperatorApiKeyRequest request) {
            super(request);
            this.apiKeyId = request.apiKeyId;
        } 

        /**
         * <p>The ID of the API key to delete. The value must be an integer greater than 0. You can obtain the ID by calling ListModelOperatorApiKeys.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder apiKeyId(Integer apiKeyId) {
            this.putQueryParameter("ApiKeyId", apiKeyId);
            this.apiKeyId = apiKeyId;
            return this;
        }

        @Override
        public DeleteModelOperatorApiKeyRequest build() {
            return new DeleteModelOperatorApiKeyRequest(this);
        } 

    } 

}
