// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCategoryResponse} extends {@link TeaModel}
 *
 * <p>CreateCategoryResponse</p>
 */
public class CreateCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCategoryResponseBody body;

    private CreateCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCategoryResponse create() {
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
    public CreateCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCategoryResponseBody body);

        @Override
        CreateCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCategoryResponse response) {
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
        public Builder body(CreateCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCategoryResponse build() {
            return new CreateCategoryResponse(this);
        } 

    } 

}
