// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLoginBaseConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyLoginBaseConfigResponse</p>
 */
public class ModifyLoginBaseConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyLoginBaseConfigResponseBody body;

    private ModifyLoginBaseConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyLoginBaseConfigResponse create() {
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
    public ModifyLoginBaseConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyLoginBaseConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyLoginBaseConfigResponseBody body);

        @Override
        ModifyLoginBaseConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyLoginBaseConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyLoginBaseConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyLoginBaseConfigResponse response) {
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
        public Builder body(ModifyLoginBaseConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyLoginBaseConfigResponse build() {
            return new ModifyLoginBaseConfigResponse(this);
        } 

    } 

}
