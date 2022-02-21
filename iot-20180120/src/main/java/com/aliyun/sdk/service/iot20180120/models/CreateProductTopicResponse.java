// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProductTopicResponse} extends {@link TeaModel}
 *
 * <p>CreateProductTopicResponse</p>
 */
public class CreateProductTopicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateProductTopicResponseBody body;

    private CreateProductTopicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateProductTopicResponse create() {
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
    public CreateProductTopicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateProductTopicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateProductTopicResponseBody body);

        @Override
        CreateProductTopicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateProductTopicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateProductTopicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateProductTopicResponse response) {
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
        public Builder body(CreateProductTopicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateProductTopicResponse build() {
            return new CreateProductTopicResponse(this);
        } 

    } 

}
