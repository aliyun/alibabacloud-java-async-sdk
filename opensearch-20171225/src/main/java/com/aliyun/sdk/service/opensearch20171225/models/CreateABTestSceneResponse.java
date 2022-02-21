// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateABTestSceneResponse} extends {@link TeaModel}
 *
 * <p>CreateABTestSceneResponse</p>
 */
public class CreateABTestSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateABTestSceneResponseBody body;

    private CreateABTestSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateABTestSceneResponse create() {
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
    public CreateABTestSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateABTestSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateABTestSceneResponseBody body);

        @Override
        CreateABTestSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateABTestSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateABTestSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateABTestSceneResponse response) {
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
        public Builder body(CreateABTestSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateABTestSceneResponse build() {
            return new CreateABTestSceneResponse(this);
        } 

    } 

}
