// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyADConnectorDirectoryResponse} extends {@link TeaModel}
 *
 * <p>ModifyADConnectorDirectoryResponse</p>
 */
public class ModifyADConnectorDirectoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyADConnectorDirectoryResponseBody body;

    private ModifyADConnectorDirectoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyADConnectorDirectoryResponse create() {
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
    public ModifyADConnectorDirectoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyADConnectorDirectoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyADConnectorDirectoryResponseBody body);

        @Override
        ModifyADConnectorDirectoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyADConnectorDirectoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyADConnectorDirectoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyADConnectorDirectoryResponse response) {
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
        public Builder body(ModifyADConnectorDirectoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyADConnectorDirectoryResponse build() {
            return new ModifyADConnectorDirectoryResponse(this);
        } 

    } 

}
