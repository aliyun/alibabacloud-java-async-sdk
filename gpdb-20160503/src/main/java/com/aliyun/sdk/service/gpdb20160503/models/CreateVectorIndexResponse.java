// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVectorIndexResponse} extends {@link TeaModel}
 *
 * <p>CreateVectorIndexResponse</p>
 */
public class CreateVectorIndexResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVectorIndexResponseBody body;

    private CreateVectorIndexResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVectorIndexResponse create() {
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
    public CreateVectorIndexResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVectorIndexResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVectorIndexResponseBody body);

        @Override
        CreateVectorIndexResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVectorIndexResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVectorIndexResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVectorIndexResponse response) {
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
        public Builder body(CreateVectorIndexResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVectorIndexResponse build() {
            return new CreateVectorIndexResponse(this);
        } 

    } 

}
