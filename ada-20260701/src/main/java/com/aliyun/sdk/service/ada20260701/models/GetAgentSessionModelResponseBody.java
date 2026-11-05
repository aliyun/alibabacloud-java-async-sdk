// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ada20260701.models;

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
 * {@link GetAgentSessionModelResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentSessionModelResponseBody</p>
 */
public class GetAgentSessionModelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JsonRpcResponse")
    private Object jsonRpcResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAgentSessionModelResponseBody(Builder builder) {
        this.jsonRpcResponse = builder.jsonRpcResponse;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentSessionModelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jsonRpcResponse
     */
    public Object getJsonRpcResponse() {
        return this.jsonRpcResponse;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Object jsonRpcResponse; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAgentSessionModelResponseBody model) {
            this.jsonRpcResponse = model.jsonRpcResponse;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The defined JSON-RPC response structure. For core nested fields, see the supplementary description.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;jsonrpc&quot;:&quot;2.0&quot;,&quot;id&quot;:&quot;request-001&quot;,&quot;result&quot;:{&quot;modelId&quot;:&quot;text-model-example&quot;,&quot;thinkingLevel&quot;:&quot;off&quot;,&quot;thinkingLevels&quot;:[&quot;off&quot;,&quot;low&quot;,&quot;medium&quot;,&quot;high&quot;]}}</p>
         */
        public Builder jsonRpcResponse(Object jsonRpcResponse) {
            this.jsonRpcResponse = jsonRpcResponse;
            return this;
        }

        /**
         * <p>The ID of the request, which is used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>0A1B2C3D-4E5F-6789-ABCD-EF0123456789</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAgentSessionModelResponseBody build() {
            return new GetAgentSessionModelResponseBody(this);
        } 

    } 

}
