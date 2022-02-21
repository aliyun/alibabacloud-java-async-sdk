// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebAreaBlockSwitchResponse} extends {@link TeaModel}
 *
 * <p>ModifyWebAreaBlockSwitchResponse</p>
 */
public class ModifyWebAreaBlockSwitchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyWebAreaBlockSwitchResponseBody body;

    private ModifyWebAreaBlockSwitchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyWebAreaBlockSwitchResponse create() {
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
    public ModifyWebAreaBlockSwitchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyWebAreaBlockSwitchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyWebAreaBlockSwitchResponseBody body);

        @Override
        ModifyWebAreaBlockSwitchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyWebAreaBlockSwitchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyWebAreaBlockSwitchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyWebAreaBlockSwitchResponse response) {
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
        public Builder body(ModifyWebAreaBlockSwitchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyWebAreaBlockSwitchResponse build() {
            return new ModifyWebAreaBlockSwitchResponse(this);
        } 

    } 

}
