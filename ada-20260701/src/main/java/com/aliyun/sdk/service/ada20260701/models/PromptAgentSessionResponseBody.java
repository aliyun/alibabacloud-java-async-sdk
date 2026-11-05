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
 * {@link PromptAgentSessionResponseBody} extends {@link TeaModel}
 *
 * <p>PromptAgentSessionResponseBody</p>
 */
public class PromptAgentSessionResponseBody extends TeaModel {
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

    private PromptAgentSessionResponseBody(Builder builder) {
        this.error = builder.error;
        this.id = builder.id;
        this.jsonrpc = builder.jsonrpc;
        this.method = builder.method;
        this.params = builder.params;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PromptAgentSessionResponseBody create() {
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

    public static final class Builder {
        private Object error; 
        private String id; 
        private String jsonrpc; 
        private String method; 
        private Object params; 
        private String requestId; 
        private Object result; 

        private Builder() {
        } 

        private Builder(PromptAgentSessionResponseBody model) {
            this.error = model.error;
            this.id = model.id;
            this.jsonrpc = model.jsonrpc;
            this.method = model.method;
            this.params = model.params;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The <code>Error</code> field in the frame. This is an in-stream error, which is an object.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;code&quot;:-32603,&quot;errorCode&quot;:&quot;CLI_STREAM_FAILED&quot;,&quot;message&quot;:&quot;The response stream was interrupted.&quot;}</p>
         */
        public Builder error(Object error) {
            this.error = error;
            return this;
        }

        /**
         * <p>The <code>Id</code> field in the frame, used to associate the request. Notification frames may not contain this field.</p>
         * 
         * <strong>example:</strong>
         * <p>request-001</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The <code>Jsonrpc</code> field in the frame. The value is <code>2.0</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        public Builder jsonrpc(String jsonrpc) {
            this.jsonrpc = jsonrpc;
            return this;
        }

        /**
         * <p>The <code>Method</code> field in the frame, used to distinguish notification categories.</p>
         * 
         * <strong>example:</strong>
         * <p>session/update</p>
         */
        public Builder method(String method) {
            this.method = method;
            return this;
        }

        /**
         * <p>The <code>Params</code> field in the frame. This is the notification payload, which is an object.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sessionId&quot;:&quot;0123456789abcdef0123456789abcdef&quot;,&quot;update&quot;:{&quot;sessionUpdate&quot;:&quot;agent_message_chunk&quot;,&quot;content&quot;:{&quot;type&quot;:&quot;text&quot;,&quot;text&quot;:&quot;Check whether the list is empty first.&quot;}},&quot;_meta&quot;:{&quot;offset&quot;:12,&quot;eventEpoch&quot;:&quot;epoch-example&quot;,&quot;promptId&quot;:&quot;prompt-example&quot;}}</p>
         */
        public Builder params(Object params) {
            this.params = params;
            return this;
        }

        /**
         * <p>The request diagnostic identifier. This identifier is not guaranteed to be included in every frame. You should also retain the diagnostic information in the response headers.</p>
         * 
         * <strong>example:</strong>
         * <p>0A1B2C3D-4E5F-6789-ABCD-EF0123456789</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The <code>Result</code> field in the frame. This is the normal result, which is an object.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;stopReason&quot;:&quot;end_turn&quot;}</p>
         */
        public Builder result(Object result) {
            this.result = result;
            return this;
        }

        public PromptAgentSessionResponseBody build() {
            return new PromptAgentSessionResponseBody(this);
        } 

    } 

}
