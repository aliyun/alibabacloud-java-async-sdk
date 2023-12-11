// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMetaCategoryResponse} extends {@link TeaModel}
 *
 * <p>CreateMetaCategoryResponse</p>
 */
public class CreateMetaCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMetaCategoryResponseBody body;

    private CreateMetaCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMetaCategoryResponse create() {
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
    public CreateMetaCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMetaCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMetaCategoryResponseBody body);

        @Override
        CreateMetaCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMetaCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMetaCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMetaCategoryResponse response) {
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
        public Builder body(CreateMetaCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMetaCategoryResponse build() {
            return new CreateMetaCategoryResponse(this);
        } 

    } 

}
