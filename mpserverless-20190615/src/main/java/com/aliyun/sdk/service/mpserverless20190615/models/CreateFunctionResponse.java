// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFunctionResponse} extends {@link TeaModel}
 *
 * <p>CreateFunctionResponse</p>
 */
public class CreateFunctionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFunctionResponseBody body;

    private CreateFunctionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFunctionResponse create() {
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
    public CreateFunctionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFunctionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFunctionResponseBody body);

        @Override
        CreateFunctionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFunctionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFunctionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFunctionResponse response) {
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
        public Builder body(CreateFunctionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFunctionResponse build() {
            return new CreateFunctionResponse(this);
        } 

    } 

}
