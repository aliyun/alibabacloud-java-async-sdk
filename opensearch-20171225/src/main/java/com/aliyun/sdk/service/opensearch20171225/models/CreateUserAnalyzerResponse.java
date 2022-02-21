// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserAnalyzerResponse} extends {@link TeaModel}
 *
 * <p>CreateUserAnalyzerResponse</p>
 */
public class CreateUserAnalyzerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateUserAnalyzerResponseBody body;

    private CreateUserAnalyzerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateUserAnalyzerResponse create() {
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
    public CreateUserAnalyzerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateUserAnalyzerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateUserAnalyzerResponseBody body);

        @Override
        CreateUserAnalyzerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateUserAnalyzerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateUserAnalyzerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateUserAnalyzerResponse response) {
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
        public Builder body(CreateUserAnalyzerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateUserAnalyzerResponse build() {
            return new CreateUserAnalyzerResponse(this);
        } 

    } 

}
