// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePropertyResponse} extends {@link TeaModel}
 *
 * <p>CreatePropertyResponse</p>
 */
public class CreatePropertyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePropertyResponseBody body;

    private CreatePropertyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePropertyResponse create() {
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
    public CreatePropertyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePropertyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePropertyResponseBody body);

        @Override
        CreatePropertyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePropertyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePropertyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePropertyResponse response) {
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
        public Builder body(CreatePropertyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePropertyResponse build() {
            return new CreatePropertyResponse(this);
        } 

    } 

}
