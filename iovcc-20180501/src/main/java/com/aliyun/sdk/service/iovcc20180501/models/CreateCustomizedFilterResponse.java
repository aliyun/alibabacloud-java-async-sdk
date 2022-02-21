// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomizedFilterResponse} extends {@link TeaModel}
 *
 * <p>CreateCustomizedFilterResponse</p>
 */
public class CreateCustomizedFilterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCustomizedFilterResponseBody body;

    private CreateCustomizedFilterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCustomizedFilterResponse create() {
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
    public CreateCustomizedFilterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCustomizedFilterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCustomizedFilterResponseBody body);

        @Override
        CreateCustomizedFilterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCustomizedFilterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCustomizedFilterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCustomizedFilterResponse response) {
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
        public Builder body(CreateCustomizedFilterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCustomizedFilterResponse build() {
            return new CreateCustomizedFilterResponse(this);
        } 

    } 

}
