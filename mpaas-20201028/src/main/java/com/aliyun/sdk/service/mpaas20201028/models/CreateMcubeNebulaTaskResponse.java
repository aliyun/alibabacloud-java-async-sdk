// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcubeNebulaTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateMcubeNebulaTaskResponse</p>
 */
public class CreateMcubeNebulaTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMcubeNebulaTaskResponseBody body;

    private CreateMcubeNebulaTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMcubeNebulaTaskResponse create() {
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
    public CreateMcubeNebulaTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMcubeNebulaTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMcubeNebulaTaskResponseBody body);

        @Override
        CreateMcubeNebulaTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMcubeNebulaTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMcubeNebulaTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMcubeNebulaTaskResponse response) {
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
        public Builder body(CreateMcubeNebulaTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMcubeNebulaTaskResponse build() {
            return new CreateMcubeNebulaTaskResponse(this);
        } 

    } 

}
