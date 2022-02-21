// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSceneResponse} extends {@link TeaModel}
 *
 * <p>CreateSceneResponse</p>
 */
public class CreateSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSceneResponseBody body;

    private CreateSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSceneResponse create() {
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
    public CreateSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSceneResponseBody body);

        @Override
        CreateSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSceneResponse response) {
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
        public Builder body(CreateSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSceneResponse build() {
            return new CreateSceneResponse(this);
        } 

    } 

}
