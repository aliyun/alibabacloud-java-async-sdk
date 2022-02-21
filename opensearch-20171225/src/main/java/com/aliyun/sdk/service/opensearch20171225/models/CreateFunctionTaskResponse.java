// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFunctionTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateFunctionTaskResponse</p>
 */
public class CreateFunctionTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFunctionTaskResponseBody body;

    private CreateFunctionTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFunctionTaskResponse create() {
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
    public CreateFunctionTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFunctionTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFunctionTaskResponseBody body);

        @Override
        CreateFunctionTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFunctionTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFunctionTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFunctionTaskResponse response) {
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
        public Builder body(CreateFunctionTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFunctionTaskResponse build() {
            return new CreateFunctionTaskResponse(this);
        } 

    } 

}
