// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyADInfoResponse} extends {@link TeaModel}
 *
 * <p>ModifyADInfoResponse</p>
 */
public class ModifyADInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyADInfoResponseBody body;

    private ModifyADInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyADInfoResponse create() {
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
    public ModifyADInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyADInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyADInfoResponseBody body);

        @Override
        ModifyADInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyADInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyADInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyADInfoResponse response) {
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
        public Builder body(ModifyADInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyADInfoResponse build() {
            return new ModifyADInfoResponse(this);
        } 

    } 

}
