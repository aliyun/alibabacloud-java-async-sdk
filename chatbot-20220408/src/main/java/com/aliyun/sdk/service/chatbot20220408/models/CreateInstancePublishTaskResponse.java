// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstancePublishTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateInstancePublishTaskResponse</p>
 */
public class CreateInstancePublishTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateInstancePublishTaskResponseBody body;

    private CreateInstancePublishTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateInstancePublishTaskResponse create() {
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
    public CreateInstancePublishTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateInstancePublishTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateInstancePublishTaskResponseBody body);

        @Override
        CreateInstancePublishTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateInstancePublishTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateInstancePublishTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateInstancePublishTaskResponse response) {
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
        public Builder body(CreateInstancePublishTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateInstancePublishTaskResponse build() {
            return new CreateInstancePublishTaskResponse(this);
        } 

    } 

}
