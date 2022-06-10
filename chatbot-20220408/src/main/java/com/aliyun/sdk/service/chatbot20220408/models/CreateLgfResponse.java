// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLgfResponse} extends {@link TeaModel}
 *
 * <p>CreateLgfResponse</p>
 */
public class CreateLgfResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateLgfResponseBody body;

    private CreateLgfResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateLgfResponse create() {
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
    public CreateLgfResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateLgfResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateLgfResponseBody body);

        @Override
        CreateLgfResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateLgfResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateLgfResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateLgfResponse response) {
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
        public Builder body(CreateLgfResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateLgfResponse build() {
            return new CreateLgfResponse(this);
        } 

    } 

}
