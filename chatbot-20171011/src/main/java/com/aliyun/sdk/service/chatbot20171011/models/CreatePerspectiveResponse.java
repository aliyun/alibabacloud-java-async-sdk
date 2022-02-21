// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePerspectiveResponse} extends {@link TeaModel}
 *
 * <p>CreatePerspectiveResponse</p>
 */
public class CreatePerspectiveResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePerspectiveResponseBody body;

    private CreatePerspectiveResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePerspectiveResponse create() {
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
    public CreatePerspectiveResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePerspectiveResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePerspectiveResponseBody body);

        @Override
        CreatePerspectiveResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePerspectiveResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePerspectiveResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePerspectiveResponse response) {
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
        public Builder body(CreatePerspectiveResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePerspectiveResponse build() {
            return new CreatePerspectiveResponse(this);
        } 

    } 

}
