// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDtsJobPasswordResponse} extends {@link TeaModel}
 *
 * <p>ModifyDtsJobPasswordResponse</p>
 */
public class ModifyDtsJobPasswordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDtsJobPasswordResponseBody body;

    private ModifyDtsJobPasswordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDtsJobPasswordResponse create() {
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
    public ModifyDtsJobPasswordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDtsJobPasswordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDtsJobPasswordResponseBody body);

        @Override
        ModifyDtsJobPasswordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDtsJobPasswordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDtsJobPasswordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDtsJobPasswordResponse response) {
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
        public Builder body(ModifyDtsJobPasswordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDtsJobPasswordResponse build() {
            return new ModifyDtsJobPasswordResponse(this);
        } 

    } 

}
