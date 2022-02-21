// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBlockStatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyBlockStatusResponse</p>
 */
public class ModifyBlockStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyBlockStatusResponseBody body;

    private ModifyBlockStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyBlockStatusResponse create() {
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
    public ModifyBlockStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyBlockStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyBlockStatusResponseBody body);

        @Override
        ModifyBlockStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyBlockStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyBlockStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyBlockStatusResponse response) {
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
        public Builder body(ModifyBlockStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyBlockStatusResponse build() {
            return new ModifyBlockStatusResponse(this);
        } 

    } 

}
