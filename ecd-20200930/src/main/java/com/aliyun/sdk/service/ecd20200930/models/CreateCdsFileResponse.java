// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCdsFileResponse} extends {@link TeaModel}
 *
 * <p>CreateCdsFileResponse</p>
 */
public class CreateCdsFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCdsFileResponseBody body;

    private CreateCdsFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCdsFileResponse create() {
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
    public CreateCdsFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCdsFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCdsFileResponseBody body);

        @Override
        CreateCdsFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCdsFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCdsFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCdsFileResponse response) {
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
        public Builder body(CreateCdsFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCdsFileResponse build() {
            return new CreateCdsFileResponse(this);
        } 

    } 

}
