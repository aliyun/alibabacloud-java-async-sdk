// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFunctionTaskResponse} extends {@link TeaModel}
 *
 * <p>GetFunctionTaskResponse</p>
 */
public class GetFunctionTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFunctionTaskResponseBody body;

    private GetFunctionTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFunctionTaskResponse create() {
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
    public GetFunctionTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFunctionTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFunctionTaskResponseBody body);

        @Override
        GetFunctionTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFunctionTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFunctionTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFunctionTaskResponse response) {
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
        public Builder body(GetFunctionTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFunctionTaskResponse build() {
            return new GetFunctionTaskResponse(this);
        } 

    } 

}
