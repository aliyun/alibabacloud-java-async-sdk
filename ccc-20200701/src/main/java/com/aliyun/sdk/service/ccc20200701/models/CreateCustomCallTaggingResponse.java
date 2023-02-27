// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomCallTaggingResponse} extends {@link TeaModel}
 *
 * <p>CreateCustomCallTaggingResponse</p>
 */
public class CreateCustomCallTaggingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCustomCallTaggingResponseBody body;

    private CreateCustomCallTaggingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCustomCallTaggingResponse create() {
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
    public CreateCustomCallTaggingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCustomCallTaggingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCustomCallTaggingResponseBody body);

        @Override
        CreateCustomCallTaggingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCustomCallTaggingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCustomCallTaggingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCustomCallTaggingResponse response) {
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
        public Builder body(CreateCustomCallTaggingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCustomCallTaggingResponse build() {
            return new CreateCustomCallTaggingResponse(this);
        } 

    } 

}
