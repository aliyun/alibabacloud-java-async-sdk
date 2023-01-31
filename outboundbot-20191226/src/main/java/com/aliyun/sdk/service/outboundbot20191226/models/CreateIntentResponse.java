// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIntentResponse} extends {@link TeaModel}
 *
 * <p>CreateIntentResponse</p>
 */
public class CreateIntentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateIntentResponseBody body;

    private CreateIntentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateIntentResponse create() {
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
    public CreateIntentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateIntentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateIntentResponseBody body);

        @Override
        CreateIntentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateIntentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateIntentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateIntentResponse response) {
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
        public Builder body(CreateIntentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateIntentResponse build() {
            return new CreateIntentResponse(this);
        } 

    } 

}
