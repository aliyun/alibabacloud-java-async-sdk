// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebPreciseAccessSwitchResponse} extends {@link TeaModel}
 *
 * <p>ModifyWebPreciseAccessSwitchResponse</p>
 */
public class ModifyWebPreciseAccessSwitchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyWebPreciseAccessSwitchResponseBody body;

    private ModifyWebPreciseAccessSwitchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyWebPreciseAccessSwitchResponse create() {
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
    public ModifyWebPreciseAccessSwitchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyWebPreciseAccessSwitchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyWebPreciseAccessSwitchResponseBody body);

        @Override
        ModifyWebPreciseAccessSwitchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyWebPreciseAccessSwitchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyWebPreciseAccessSwitchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyWebPreciseAccessSwitchResponse response) {
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
        public Builder body(ModifyWebPreciseAccessSwitchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyWebPreciseAccessSwitchResponse build() {
            return new ModifyWebPreciseAccessSwitchResponse(this);
        } 

    } 

}
