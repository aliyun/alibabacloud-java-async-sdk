// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDirectoryResponse} extends {@link TeaModel}
 *
 * <p>ModifyDirectoryResponse</p>
 */
public class ModifyDirectoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDirectoryResponseBody body;

    private ModifyDirectoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDirectoryResponse create() {
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
    public ModifyDirectoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDirectoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDirectoryResponseBody body);

        @Override
        ModifyDirectoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDirectoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDirectoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDirectoryResponse response) {
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
        public Builder body(ModifyDirectoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDirectoryResponse build() {
            return new ModifyDirectoryResponse(this);
        } 

    } 

}
