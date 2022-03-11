// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHostAccountResponse} extends {@link TeaModel}
 *
 * <p>ModifyHostAccountResponse</p>
 */
public class ModifyHostAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyHostAccountResponseBody body;

    private ModifyHostAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyHostAccountResponse create() {
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
    public ModifyHostAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyHostAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyHostAccountResponseBody body);

        @Override
        ModifyHostAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyHostAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyHostAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyHostAccountResponse response) {
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
        public Builder body(ModifyHostAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyHostAccountResponse build() {
            return new ModifyHostAccountResponse(this);
        } 

    } 

}
