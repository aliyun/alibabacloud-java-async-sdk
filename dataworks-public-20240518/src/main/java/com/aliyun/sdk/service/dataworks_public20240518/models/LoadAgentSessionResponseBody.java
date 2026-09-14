// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link LoadAgentSessionResponseBody} extends {@link TeaModel}
 *
 * <p>LoadAgentSessionResponseBody</p>
 */
public class LoadAgentSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Error")
    private Object error;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Jsonrpc")
    private String jsonrpc;

    @com.aliyun.core.annotation.NameInMap("Method")
    private String method;

    @com.aliyun.core.annotation.NameInMap("Params")
    private Object params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Object result;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private Long timestamp;

    private LoadAgentSessionResponseBody(Builder builder) {
        this.error = builder.error;
        this.id = builder.id;
        this.jsonrpc = builder.jsonrpc;
        this.method = builder.method;
        this.params = builder.params;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LoadAgentSessionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return error
     */
    public Object getError() {
        return this.error;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return jsonrpc
     */
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return params
     */
    public Object getParams() {
        return this.params;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Object getResult() {
        return this.result;
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private Object error; 
        private String id; 
        private String jsonrpc; 
        private String method; 
        private Object params; 
        private String requestId; 
        private Object result; 
        private Long timestamp; 

        private Builder() {
        } 

        private Builder(LoadAgentSessionResponseBody model) {
            this.error = model.error;
            this.id = model.id;
            this.jsonrpc = model.jsonrpc;
            this.method = model.method;
            this.params = model.params;
            this.requestId = model.requestId;
            this.result = model.result;
            this.timestamp = model.timestamp;
        } 

        /**
         * <p>The error object of the SSE frame. This field is present when an error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;code&quot;: 400, &quot;errorCode&quot;: &quot;0x50000000001&quot;, &quot;message&quot;: &quot;not exist session&quot;, &quot;data&quot;: null}</p>
         */
        public Builder error(Object error) {
            this.error = error;
            return this;
        }

        /**
         * <p>The client-generated request ID, returned from the request.</p>
         * 
         * <strong>example:</strong>
         * <p>676303114031776</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The JSON-RPC version. The value is <code>2.0</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        public Builder jsonrpc(String jsonrpc) {
            this.jsonrpc = jsonrpc;
            return this;
        }

        /**
         * <p>The method of the SSE frame.</p>
         * 
         * <strong>example:</strong>
         * <p>session/update</p>
         */
        public Builder method(String method) {
            this.method = method;
            return this;
        }

        /**
         * <p>The parameters of the SSE frame.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sessionId&quot;:&quot;af4f5ef8-e8f5-481c-ad1f-94886c6c0aed&quot;,&quot;update&quot;:{&quot;sessionUpdate&quot;:&quot;agent_message_chunk&quot;,&quot;content&quot;:{&quot;type&quot;:&quot;text&quot;,&quot;text&quot;:&quot;hello world&quot;}}}</p>
         */
        public Builder params(Object params) {
            this.params = params;
            return this;
        }

        /**
         * <p>The unique request ID generated for this request.</p>
         * 
         * <strong>example:</strong>
         * <p>0D41C608-0C60-5EB0-B986-1460909CF642</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result object of the SSE frame. This field is present when the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;stopReason&quot;:&quot;end_turn&quot;}</p>
         */
        public Builder result(Object result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1769479322828</p>
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public LoadAgentSessionResponseBody build() {
            return new LoadAgentSessionResponseBody(this);
        } 

    } 

}
