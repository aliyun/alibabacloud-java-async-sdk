// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEntityResponse} extends {@link TeaModel}
 *
 * <p>CreateEntityResponse</p>
 */
public class CreateEntityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEntityResponseBody body;

    private CreateEntityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateEntityResponse create() {
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
    public CreateEntityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEntityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateEntityResponseBody body);

        @Override
        CreateEntityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEntityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateEntityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEntityResponse response) {
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
        public Builder body(CreateEntityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEntityResponse build() {
            return new CreateEntityResponse(this);
        } 

    } 

}
