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
 * {@link DeleteModelOperatorApiKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteModelOperatorApiKeyResponseBody</p>
 */
public class DeleteModelOperatorApiKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiKeyId")
    private Integer apiKeyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteModelOperatorApiKeyResponseBody(Builder builder) {
        this.apiKeyId = builder.apiKeyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteModelOperatorApiKeyResponseBody create() {
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

        private Builder(DeleteModelOperatorApiKeyResponseBody model) {
            this.apiKeyId = model.apiKeyId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the API key whose deletion is accepted. The return of this field does not indicate that the underlying cleanup is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder apiKeyId(Integer apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * <p>The request ID. You can use this ID to locate and troubleshoot the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteModelOperatorApiKeyResponseBody build() {
            return new DeleteModelOperatorApiKeyResponseBody(this);
        } 

    } 

}
