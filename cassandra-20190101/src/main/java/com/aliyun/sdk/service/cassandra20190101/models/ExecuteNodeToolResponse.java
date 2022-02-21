// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteNodeToolResponse} extends {@link TeaModel}
 *
 * <p>ExecuteNodeToolResponse</p>
 */
public class ExecuteNodeToolResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExecuteNodeToolResponseBody body;

    private ExecuteNodeToolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExecuteNodeToolResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public ExecuteNodeToolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExecuteNodeToolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExecuteNodeToolResponseBody body);

        @Override
        ExecuteNodeToolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExecuteNodeToolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExecuteNodeToolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExecuteNodeToolResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(ExecuteNodeToolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExecuteNodeToolResponse build() {
            return new ExecuteNodeToolResponse(this);
        } 

    } 

}
