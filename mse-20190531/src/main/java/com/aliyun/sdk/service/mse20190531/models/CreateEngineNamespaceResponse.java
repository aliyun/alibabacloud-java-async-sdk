// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEngineNamespaceResponse} extends {@link TeaModel}
 *
 * <p>CreateEngineNamespaceResponse</p>
 */
public class CreateEngineNamespaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEngineNamespaceResponseBody body;

    private CreateEngineNamespaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateEngineNamespaceResponse create() {
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
    public CreateEngineNamespaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEngineNamespaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateEngineNamespaceResponseBody body);

        @Override
        CreateEngineNamespaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEngineNamespaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateEngineNamespaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEngineNamespaceResponse response) {
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
        public Builder body(CreateEngineNamespaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEngineNamespaceResponse build() {
            return new CreateEngineNamespaceResponse(this);
        } 

    } 

}
