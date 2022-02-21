// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateImageResponse} extends {@link TeaModel}
 *
 * <p>CreateImageResponse</p>
 */
public class CreateImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateImageResponseBody body;

    private CreateImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateImageResponse create() {
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
    public CreateImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateImageResponseBody body);

        @Override
        CreateImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateImageResponse response) {
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
        public Builder body(CreateImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateImageResponse build() {
            return new CreateImageResponse(this);
        } 

    } 

}
