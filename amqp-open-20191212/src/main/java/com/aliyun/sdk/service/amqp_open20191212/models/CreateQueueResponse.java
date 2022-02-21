// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQueueResponse} extends {@link TeaModel}
 *
 * <p>CreateQueueResponse</p>
 */
public class CreateQueueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateQueueResponseBody body;

    private CreateQueueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateQueueResponse create() {
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
    public CreateQueueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateQueueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateQueueResponseBody body);

        @Override
        CreateQueueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateQueueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateQueueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateQueueResponse response) {
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
        public Builder body(CreateQueueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateQueueResponse build() {
            return new CreateQueueResponse(this);
        } 

    } 

}
