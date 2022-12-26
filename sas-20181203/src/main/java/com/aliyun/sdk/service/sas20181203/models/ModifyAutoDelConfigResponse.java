// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAutoDelConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyAutoDelConfigResponse</p>
 */
public class ModifyAutoDelConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyAutoDelConfigResponseBody body;

    private ModifyAutoDelConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyAutoDelConfigResponse create() {
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
    public ModifyAutoDelConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyAutoDelConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyAutoDelConfigResponseBody body);

        @Override
        ModifyAutoDelConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAutoDelConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyAutoDelConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAutoDelConfigResponse response) {
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
        public Builder body(ModifyAutoDelConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyAutoDelConfigResponse build() {
            return new ModifyAutoDelConfigResponse(this);
        } 

    } 

}
