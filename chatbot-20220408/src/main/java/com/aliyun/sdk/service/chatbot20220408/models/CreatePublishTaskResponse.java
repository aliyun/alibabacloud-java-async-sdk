// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePublishTaskResponse} extends {@link TeaModel}
 *
 * <p>CreatePublishTaskResponse</p>
 */
public class CreatePublishTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePublishTaskResponseBody body;

    private CreatePublishTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePublishTaskResponse create() {
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
    public CreatePublishTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePublishTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePublishTaskResponseBody body);

        @Override
        CreatePublishTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePublishTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePublishTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePublishTaskResponse response) {
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
        public Builder body(CreatePublishTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePublishTaskResponse build() {
            return new CreatePublishTaskResponse(this);
        } 

    } 

}
