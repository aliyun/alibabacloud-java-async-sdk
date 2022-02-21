// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomizedPropertyResponse} extends {@link TeaModel}
 *
 * <p>CreateCustomizedPropertyResponse</p>
 */
public class CreateCustomizedPropertyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCustomizedPropertyResponseBody body;

    private CreateCustomizedPropertyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCustomizedPropertyResponse create() {
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
    public CreateCustomizedPropertyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCustomizedPropertyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCustomizedPropertyResponseBody body);

        @Override
        CreateCustomizedPropertyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCustomizedPropertyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCustomizedPropertyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCustomizedPropertyResponse response) {
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
        public Builder body(CreateCustomizedPropertyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCustomizedPropertyResponse build() {
            return new CreateCustomizedPropertyResponse(this);
        } 

    } 

}
