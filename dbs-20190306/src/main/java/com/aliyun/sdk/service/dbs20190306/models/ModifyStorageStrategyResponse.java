// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyStorageStrategyResponse} extends {@link TeaModel}
 *
 * <p>ModifyStorageStrategyResponse</p>
 */
public class ModifyStorageStrategyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyStorageStrategyResponseBody body;

    private ModifyStorageStrategyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyStorageStrategyResponse create() {
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
    public ModifyStorageStrategyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyStorageStrategyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyStorageStrategyResponseBody body);

        @Override
        ModifyStorageStrategyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyStorageStrategyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyStorageStrategyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyStorageStrategyResponse response) {
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
        public Builder body(ModifyStorageStrategyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyStorageStrategyResponse build() {
            return new ModifyStorageStrategyResponse(this);
        } 

    } 

}
