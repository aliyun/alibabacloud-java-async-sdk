// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackupSourceEndpointResponse} extends {@link TeaModel}
 *
 * <p>ModifyBackupSourceEndpointResponse</p>
 */
public class ModifyBackupSourceEndpointResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyBackupSourceEndpointResponseBody body;

    private ModifyBackupSourceEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyBackupSourceEndpointResponse create() {
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
    public ModifyBackupSourceEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyBackupSourceEndpointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyBackupSourceEndpointResponseBody body);

        @Override
        ModifyBackupSourceEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyBackupSourceEndpointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyBackupSourceEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyBackupSourceEndpointResponse response) {
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
        public Builder body(ModifyBackupSourceEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyBackupSourceEndpointResponse build() {
            return new ModifyBackupSourceEndpointResponse(this);
        } 

    } 

}
