// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVersionTestResponse} extends {@link TeaModel}
 *
 * <p>CreateVersionTestResponse</p>
 */
public class CreateVersionTestResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVersionTestResponseBody body;

    private CreateVersionTestResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVersionTestResponse create() {
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
    public CreateVersionTestResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVersionTestResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVersionTestResponseBody body);

        @Override
        CreateVersionTestResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVersionTestResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVersionTestResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVersionTestResponse response) {
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
        public Builder body(CreateVersionTestResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVersionTestResponse build() {
            return new CreateVersionTestResponse(this);
        } 

    } 

}
