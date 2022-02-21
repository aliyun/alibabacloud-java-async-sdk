// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebAreaBlockResponse} extends {@link TeaModel}
 *
 * <p>ModifyWebAreaBlockResponse</p>
 */
public class ModifyWebAreaBlockResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyWebAreaBlockResponseBody body;

    private ModifyWebAreaBlockResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyWebAreaBlockResponse create() {
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
    public ModifyWebAreaBlockResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyWebAreaBlockResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyWebAreaBlockResponseBody body);

        @Override
        ModifyWebAreaBlockResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyWebAreaBlockResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyWebAreaBlockResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyWebAreaBlockResponse response) {
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
        public Builder body(ModifyWebAreaBlockResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyWebAreaBlockResponse build() {
            return new ModifyWebAreaBlockResponse(this);
        } 

    } 

}
