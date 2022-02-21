// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEngineNamespaceResponse} extends {@link TeaModel}
 *
 * <p>UpdateEngineNamespaceResponse</p>
 */
public class UpdateEngineNamespaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateEngineNamespaceResponseBody body;

    private UpdateEngineNamespaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateEngineNamespaceResponse create() {
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
    public UpdateEngineNamespaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateEngineNamespaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateEngineNamespaceResponseBody body);

        @Override
        UpdateEngineNamespaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateEngineNamespaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateEngineNamespaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateEngineNamespaceResponse response) {
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
        public Builder body(UpdateEngineNamespaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateEngineNamespaceResponse build() {
            return new UpdateEngineNamespaceResponse(this);
        } 

    } 

}
