// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClassResponse} extends {@link TeaModel}
 *
 * <p>CreateClassResponse</p>
 */
public class CreateClassResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateClassResponseBody body;

    private CreateClassResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateClassResponse create() {
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
    public CreateClassResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateClassResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateClassResponseBody body);

        @Override
        CreateClassResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateClassResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateClassResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateClassResponse response) {
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
        public Builder body(CreateClassResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateClassResponse build() {
            return new CreateClassResponse(this);
        } 

    } 

}
