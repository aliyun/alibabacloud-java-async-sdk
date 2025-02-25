// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieoauth2_1_0.models;

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
 * {@link ExecuteSceneResponse} extends {@link TeaModel}
 *
 * <p>ExecuteSceneResponse</p>
 */
public class ExecuteSceneResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ExecuteSceneResponseBody body;

    private ExecuteSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ExecuteSceneResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public ExecuteSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExecuteSceneResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ExecuteSceneResponseBody body);

        @Override
        ExecuteSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExecuteSceneResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ExecuteSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExecuteSceneResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(ExecuteSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExecuteSceneResponse build() {
            return new ExecuteSceneResponse(this);
        } 

    } 

}
