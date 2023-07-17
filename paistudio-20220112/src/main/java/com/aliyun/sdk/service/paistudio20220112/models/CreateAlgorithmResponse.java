// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAlgorithmResponse} extends {@link TeaModel}
 *
 * <p>CreateAlgorithmResponse</p>
 */
public class CreateAlgorithmResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAlgorithmResponseBody body;

    private CreateAlgorithmResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAlgorithmResponse create() {
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
    public CreateAlgorithmResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAlgorithmResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAlgorithmResponseBody body);

        @Override
        CreateAlgorithmResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAlgorithmResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAlgorithmResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAlgorithmResponse response) {
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
        public Builder body(CreateAlgorithmResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAlgorithmResponse build() {
            return new CreateAlgorithmResponse(this);
        } 

    } 

}
