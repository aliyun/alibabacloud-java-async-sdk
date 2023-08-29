// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcubeMiniTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateMcubeMiniTaskResponse</p>
 */
public class CreateMcubeMiniTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMcubeMiniTaskResponseBody body;

    private CreateMcubeMiniTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMcubeMiniTaskResponse create() {
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
    public CreateMcubeMiniTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMcubeMiniTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMcubeMiniTaskResponseBody body);

        @Override
        CreateMcubeMiniTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMcubeMiniTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMcubeMiniTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMcubeMiniTaskResponse response) {
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
        public Builder body(CreateMcubeMiniTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMcubeMiniTaskResponse build() {
            return new CreateMcubeMiniTaskResponse(this);
        } 

    } 

}
