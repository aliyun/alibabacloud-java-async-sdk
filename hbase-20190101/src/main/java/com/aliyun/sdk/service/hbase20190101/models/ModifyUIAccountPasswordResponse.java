// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUIAccountPasswordResponse} extends {@link TeaModel}
 *
 * <p>ModifyUIAccountPasswordResponse</p>
 */
public class ModifyUIAccountPasswordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyUIAccountPasswordResponseBody body;

    private ModifyUIAccountPasswordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyUIAccountPasswordResponse create() {
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
    public ModifyUIAccountPasswordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyUIAccountPasswordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyUIAccountPasswordResponseBody body);

        @Override
        ModifyUIAccountPasswordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyUIAccountPasswordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyUIAccountPasswordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyUIAccountPasswordResponse response) {
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
        public Builder body(ModifyUIAccountPasswordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyUIAccountPasswordResponse build() {
            return new ModifyUIAccountPasswordResponse(this);
        } 

    } 

}
