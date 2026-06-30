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
 * {@link DescribeModelOperatorApiKeyRequest} extends {@link RequestModel}
 *
 * <p>DescribeModelOperatorApiKeyRequest</p>
 */
public class DescribeModelOperatorApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKeyId")
    private Integer apiKeyId;

    private DescribeModelOperatorApiKeyRequest(Builder builder) {
        super(builder);
        this.apiKeyId = builder.apiKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelOperatorApiKeyRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeModelOperatorApiKeyRequest, Builder> {
        private Integer apiKeyId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeModelOperatorApiKeyRequest request) {
            super(request);
            this.apiKeyId = request.apiKeyId;
        } 

        /**
         * <p>API KEY ID。</p>
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
        public DescribeModelOperatorApiKeyRequest build() {
            return new DescribeModelOperatorApiKeyRequest(this);
        } 

    } 

}
