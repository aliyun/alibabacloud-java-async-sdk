// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCoreWordResponse} extends {@link TeaModel}
 *
 * <p>CreateCoreWordResponse</p>
 */
public class CreateCoreWordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCoreWordResponseBody body;

    private CreateCoreWordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCoreWordResponse create() {
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
    public CreateCoreWordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCoreWordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCoreWordResponseBody body);

        @Override
        CreateCoreWordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCoreWordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCoreWordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCoreWordResponse response) {
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
        public Builder body(CreateCoreWordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCoreWordResponse build() {
            return new CreateCoreWordResponse(this);
        } 

    } 

}
