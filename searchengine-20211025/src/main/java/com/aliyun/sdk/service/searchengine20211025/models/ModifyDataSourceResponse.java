// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDataSourceResponse} extends {@link TeaModel}
 *
 * <p>ModifyDataSourceResponse</p>
 */
public class ModifyDataSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDataSourceResponseBody body;

    private ModifyDataSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDataSourceResponse create() {
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
    public ModifyDataSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDataSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDataSourceResponseBody body);

        @Override
        ModifyDataSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDataSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDataSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDataSourceResponse response) {
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
        public Builder body(ModifyDataSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDataSourceResponse build() {
            return new ModifyDataSourceResponse(this);
        } 

    } 

}
