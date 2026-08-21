// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ossagent20260810.models;

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
 * {@link A2aRequest} extends {@link RequestModel}
 *
 * <p>A2aRequest</p>
 */
public class A2aRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Env")
    private String env;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("jsonrpc")
    private String jsonrpc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("method")
    private String method;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("params")
    private Object params;

    private A2aRequest(Builder builder) {
        super(builder);
        this.env = builder.env;
        this.id = builder.id;
        this.jsonrpc = builder.jsonrpc;
        this.method = builder.method;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static A2aRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
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

    public static final class Builder extends Request.Builder<A2aRequest, Builder> {
        private String env; 
        private String id; 
        private String jsonrpc; 
        private String method; 
        private Object params; 

        private Builder() {
            super();
        } 

        private Builder(A2aRequest request) {
            super(request);
            this.env = request.env;
            this.id = request.id;
            this.jsonrpc = request.jsonrpc;
            this.method = request.method;
            this.params = request.params;
        } 

        /**
         * Env.
         */
        public Builder env(String env) {
            this.putQueryParameter("Env", env);
            this.env = env;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.putBodyParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * jsonrpc.
         */
        public Builder jsonrpc(String jsonrpc) {
            this.putBodyParameter("jsonrpc", jsonrpc);
            this.jsonrpc = jsonrpc;
            return this;
        }

        /**
         * method.
         */
        public Builder method(String method) {
            this.putBodyParameter("method", method);
            this.method = method;
            return this;
        }

        /**
         * params.
         */
        public Builder params(Object params) {
            this.putBodyParameter("params", params);
            this.params = params;
            return this;
        }

        @Override
        public A2aRequest build() {
            return new A2aRequest(this);
        } 

    } 

}
