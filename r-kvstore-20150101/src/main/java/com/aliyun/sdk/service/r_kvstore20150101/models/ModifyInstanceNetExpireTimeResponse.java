// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceNetExpireTimeResponse} extends {@link TeaModel}
 *
 * <p>ModifyInstanceNetExpireTimeResponse</p>
 */
public class ModifyInstanceNetExpireTimeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyInstanceNetExpireTimeResponseBody body;

    private ModifyInstanceNetExpireTimeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyInstanceNetExpireTimeResponse create() {
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
    public ModifyInstanceNetExpireTimeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyInstanceNetExpireTimeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyInstanceNetExpireTimeResponseBody body);

        @Override
        ModifyInstanceNetExpireTimeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyInstanceNetExpireTimeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyInstanceNetExpireTimeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyInstanceNetExpireTimeResponse response) {
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
        public Builder body(ModifyInstanceNetExpireTimeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyInstanceNetExpireTimeResponse build() {
            return new ModifyInstanceNetExpireTimeResponse(this);
        } 

    } 

}
