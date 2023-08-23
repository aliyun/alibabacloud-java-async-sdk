// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRcuSceneResponse} extends {@link TeaModel}
 *
 * <p>CreateRcuSceneResponse</p>
 */
public class CreateRcuSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRcuSceneResponseBody body;

    private CreateRcuSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRcuSceneResponse create() {
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
    public CreateRcuSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRcuSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRcuSceneResponseBody body);

        @Override
        CreateRcuSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRcuSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRcuSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRcuSceneResponse response) {
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
        public Builder body(CreateRcuSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRcuSceneResponse build() {
            return new CreateRcuSceneResponse(this);
        } 

    } 

}
