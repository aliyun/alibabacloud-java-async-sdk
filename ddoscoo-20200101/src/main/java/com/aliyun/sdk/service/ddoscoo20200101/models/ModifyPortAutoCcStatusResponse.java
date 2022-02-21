// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPortAutoCcStatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyPortAutoCcStatusResponse</p>
 */
public class ModifyPortAutoCcStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyPortAutoCcStatusResponseBody body;

    private ModifyPortAutoCcStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyPortAutoCcStatusResponse create() {
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
    public ModifyPortAutoCcStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyPortAutoCcStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyPortAutoCcStatusResponseBody body);

        @Override
        ModifyPortAutoCcStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyPortAutoCcStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyPortAutoCcStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyPortAutoCcStatusResponse response) {
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
        public Builder body(ModifyPortAutoCcStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyPortAutoCcStatusResponse build() {
            return new ModifyPortAutoCcStatusResponse(this);
        } 

    } 

}
