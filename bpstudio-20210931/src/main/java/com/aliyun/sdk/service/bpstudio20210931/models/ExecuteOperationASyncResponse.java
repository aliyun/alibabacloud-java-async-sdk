// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteOperationASyncResponse} extends {@link TeaModel}
 *
 * <p>ExecuteOperationASyncResponse</p>
 */
public class ExecuteOperationASyncResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExecuteOperationASyncResponseBody body;

    private ExecuteOperationASyncResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExecuteOperationASyncResponse create() {
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
    public ExecuteOperationASyncResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExecuteOperationASyncResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExecuteOperationASyncResponseBody body);

        @Override
        ExecuteOperationASyncResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExecuteOperationASyncResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExecuteOperationASyncResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExecuteOperationASyncResponse response) {
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
        public Builder body(ExecuteOperationASyncResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExecuteOperationASyncResponse build() {
            return new ExecuteOperationASyncResponse(this);
        } 

    } 

}
