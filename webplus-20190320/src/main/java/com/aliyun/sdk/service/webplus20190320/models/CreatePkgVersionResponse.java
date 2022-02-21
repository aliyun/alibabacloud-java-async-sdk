// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePkgVersionResponse} extends {@link TeaModel}
 *
 * <p>CreatePkgVersionResponse</p>
 */
public class CreatePkgVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePkgVersionResponseBody body;

    private CreatePkgVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePkgVersionResponse create() {
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
    public CreatePkgVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePkgVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePkgVersionResponseBody body);

        @Override
        CreatePkgVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePkgVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePkgVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePkgVersionResponse response) {
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
        public Builder body(CreatePkgVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePkgVersionResponse build() {
            return new CreatePkgVersionResponse(this);
        } 

    } 

}
