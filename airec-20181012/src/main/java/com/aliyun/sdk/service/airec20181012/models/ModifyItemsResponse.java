// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyItemsResponse} extends {@link TeaModel}
 *
 * <p>ModifyItemsResponse</p>
 */
public class ModifyItemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyItemsResponseBody body;

    private ModifyItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyItemsResponse create() {
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
    public ModifyItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyItemsResponseBody body);

        @Override
        ModifyItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyItemsResponse response) {
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
        public Builder body(ModifyItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyItemsResponse build() {
            return new ModifyItemsResponse(this);
        } 

    } 

}
