// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGrabFrameTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateGrabFrameTaskResponse</p>
 */
public class CreateGrabFrameTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateGrabFrameTaskResponseBody body;

    private CreateGrabFrameTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateGrabFrameTaskResponse create() {
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
    public CreateGrabFrameTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateGrabFrameTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateGrabFrameTaskResponseBody body);

        @Override
        CreateGrabFrameTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateGrabFrameTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateGrabFrameTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateGrabFrameTaskResponse response) {
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
        public Builder body(CreateGrabFrameTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateGrabFrameTaskResponse build() {
            return new CreateGrabFrameTaskResponse(this);
        } 

    } 

}
