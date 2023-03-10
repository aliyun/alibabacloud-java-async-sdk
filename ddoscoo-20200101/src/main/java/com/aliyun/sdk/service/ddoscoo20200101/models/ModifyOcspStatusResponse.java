// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyOcspStatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyOcspStatusResponse</p>
 */
public class ModifyOcspStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyOcspStatusResponseBody body;

    private ModifyOcspStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyOcspStatusResponse create() {
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
    public ModifyOcspStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyOcspStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyOcspStatusResponseBody body);

        @Override
        ModifyOcspStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyOcspStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyOcspStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyOcspStatusResponse response) {
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
        public Builder body(ModifyOcspStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyOcspStatusResponse build() {
            return new ModifyOcspStatusResponse(this);
        } 

    } 

}
