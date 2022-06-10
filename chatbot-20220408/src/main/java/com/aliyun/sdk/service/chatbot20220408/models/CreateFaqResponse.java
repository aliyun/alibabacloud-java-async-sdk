// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFaqResponse} extends {@link TeaModel}
 *
 * <p>CreateFaqResponse</p>
 */
public class CreateFaqResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFaqResponseBody body;

    private CreateFaqResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFaqResponse create() {
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
    public CreateFaqResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFaqResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFaqResponseBody body);

        @Override
        CreateFaqResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFaqResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFaqResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFaqResponse response) {
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
        public Builder body(CreateFaqResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFaqResponse build() {
            return new CreateFaqResponse(this);
        } 

    } 

}
