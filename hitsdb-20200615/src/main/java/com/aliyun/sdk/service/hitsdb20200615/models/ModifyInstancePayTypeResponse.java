// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstancePayTypeResponse} extends {@link TeaModel}
 *
 * <p>ModifyInstancePayTypeResponse</p>
 */
public class ModifyInstancePayTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyInstancePayTypeResponseBody body;

    private ModifyInstancePayTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyInstancePayTypeResponse create() {
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
    public ModifyInstancePayTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyInstancePayTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyInstancePayTypeResponseBody body);

        @Override
        ModifyInstancePayTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyInstancePayTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyInstancePayTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyInstancePayTypeResponse response) {
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
        public Builder body(ModifyInstancePayTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyInstancePayTypeResponse build() {
            return new ModifyInstancePayTypeResponse(this);
        } 

    } 

}
