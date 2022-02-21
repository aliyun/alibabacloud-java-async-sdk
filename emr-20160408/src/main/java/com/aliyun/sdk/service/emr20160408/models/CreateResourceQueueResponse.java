// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceQueueResponse} extends {@link TeaModel}
 *
 * <p>CreateResourceQueueResponse</p>
 */
public class CreateResourceQueueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateResourceQueueResponseBody body;

    private CreateResourceQueueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateResourceQueueResponse create() {
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
    public CreateResourceQueueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateResourceQueueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateResourceQueueResponseBody body);

        @Override
        CreateResourceQueueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateResourceQueueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateResourceQueueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateResourceQueueResponse response) {
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
        public Builder body(CreateResourceQueueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateResourceQueueResponse build() {
            return new CreateResourceQueueResponse(this);
        } 

    } 

}
