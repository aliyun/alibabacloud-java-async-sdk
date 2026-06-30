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

    private CreateModelOperatorApiKeyResponseBody(Builder builder) {
        this.apiKeyId = builder.apiKeyId;
        this.requestId = builder.requestId;
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

    public static final class Builder {
        private Integer apiKeyId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateModelOperatorApiKeyResponseBody model) {
            this.apiKeyId = model.apiKeyId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>API KEY ID。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder apiKeyId(Integer apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateModelOperatorApiKeyResponseBody build() {
            return new CreateModelOperatorApiKeyResponseBody(this);
        } 

    } 

}
