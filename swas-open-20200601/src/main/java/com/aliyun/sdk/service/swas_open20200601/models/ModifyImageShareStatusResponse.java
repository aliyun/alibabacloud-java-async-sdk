// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyImageShareStatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyImageShareStatusResponse</p>
 */
public class ModifyImageShareStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyImageShareStatusResponseBody body;

    private ModifyImageShareStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyImageShareStatusResponse create() {
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
    public ModifyImageShareStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyImageShareStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyImageShareStatusResponseBody body);

        @Override
        ModifyImageShareStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyImageShareStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyImageShareStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyImageShareStatusResponse response) {
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
        public Builder body(ModifyImageShareStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyImageShareStatusResponse build() {
            return new ModifyImageShareStatusResponse(this);
        } 

    } 

}
