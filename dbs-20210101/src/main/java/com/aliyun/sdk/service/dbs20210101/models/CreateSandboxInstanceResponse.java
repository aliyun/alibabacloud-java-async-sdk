// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSandboxInstanceResponse} extends {@link TeaModel}
 *
 * <p>CreateSandboxInstanceResponse</p>
 */
public class CreateSandboxInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSandboxInstanceResponseBody body;

    private CreateSandboxInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSandboxInstanceResponse create() {
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
    public CreateSandboxInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSandboxInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSandboxInstanceResponseBody body);

        @Override
        CreateSandboxInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSandboxInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSandboxInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSandboxInstanceResponse response) {
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
        public Builder body(CreateSandboxInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSandboxInstanceResponse build() {
            return new CreateSandboxInstanceResponse(this);
        } 

    } 

}
