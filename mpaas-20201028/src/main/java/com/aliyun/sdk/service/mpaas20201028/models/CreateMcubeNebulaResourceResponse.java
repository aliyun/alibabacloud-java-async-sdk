// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcubeNebulaResourceResponse} extends {@link TeaModel}
 *
 * <p>CreateMcubeNebulaResourceResponse</p>
 */
public class CreateMcubeNebulaResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMcubeNebulaResourceResponseBody body;

    private CreateMcubeNebulaResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMcubeNebulaResourceResponse create() {
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
    public CreateMcubeNebulaResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMcubeNebulaResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMcubeNebulaResourceResponseBody body);

        @Override
        CreateMcubeNebulaResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMcubeNebulaResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMcubeNebulaResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMcubeNebulaResourceResponse response) {
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
        public Builder body(CreateMcubeNebulaResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMcubeNebulaResourceResponse build() {
            return new CreateMcubeNebulaResourceResponse(this);
        } 

    } 

}
