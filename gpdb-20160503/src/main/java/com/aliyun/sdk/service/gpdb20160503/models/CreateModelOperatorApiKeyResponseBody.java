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
 * {@link CreateModelOperatorApiKeyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateModelOperatorApiKeyResponseBody</p>
 */
public class CreateModelOperatorApiKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiKeyId")
    private Integer apiKeyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CreateModelOperatorApiKeyResponseBody(Builder builder) {
        this.apiKeyId = builder.apiKeyId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelOperatorApiKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeyId
     */
    public Integer getApiKeyId() {
        return this.apiKeyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Integer apiKeyId; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(CreateModelOperatorApiKeyResponseBody model) {
            this.apiKeyId = model.apiKeyId;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The API key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder apiKeyId(Integer apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The acceptance status of the creation request. If the request is successfully accepted, the value is always Creating, which does not indicate that the API key is available. Call DescribeModelOperatorApiKey or ListModelOperatorApiKeys to query the subsequent status. You can obtain the endpoint only when the status is Running, and obtain the plaintext key by calling DescribeModelOperatorApiKey. Each call to this operation creates a new API key. Do not repeatedly call this operation to check the progress.</p>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateModelOperatorApiKeyResponseBody build() {
            return new CreateModelOperatorApiKeyResponseBody(this);
        } 

    } 

}
