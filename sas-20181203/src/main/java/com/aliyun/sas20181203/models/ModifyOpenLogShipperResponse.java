// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyOpenLogShipperResponse} extends {@link TeaModel}
 *
 * <p>ModifyOpenLogShipperResponse</p>
 */
public class ModifyOpenLogShipperResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyOpenLogShipperResponseBody body;

    private ModifyOpenLogShipperResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyOpenLogShipperResponse create() {
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
    public ModifyOpenLogShipperResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyOpenLogShipperResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyOpenLogShipperResponseBody body);

        @Override
        ModifyOpenLogShipperResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyOpenLogShipperResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyOpenLogShipperResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyOpenLogShipperResponse response) {
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
        public Builder body(ModifyOpenLogShipperResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyOpenLogShipperResponse build() {
            return new ModifyOpenLogShipperResponse(this);
        } 

    } 

}
