// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailiancontrol20240816.models;

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
 * {@link GetApiKeyRequest} extends {@link RequestModel}
 *
 * <p>GetApiKeyRequest</p>
 */
public class GetApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apiKeyId")
    private String apiKeyId;

    private GetApiKeyRequest(Builder builder) {
        super(builder);
        this.apiKeyId = builder.apiKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApiKeyRequest create() {
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

    public static final class Builder extends Request.Builder<GetApiKeyRequest, Builder> {
        private String apiKeyId; 

        private Builder() {
            super();
        } 

        private Builder(GetApiKeyRequest request) {
            super(request);
            this.apiKeyId = request.apiKeyId;
        } 

        /**
         * apiKeyId.
         */
        public Builder apiKeyId(String apiKeyId) {
            this.putQueryParameter("apiKeyId", apiKeyId);
            this.apiKeyId = apiKeyId;
            return this;
        }

        @Override
        public GetApiKeyRequest build() {
            return new GetApiKeyRequest(this);
        } 

    } 

}
