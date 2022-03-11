// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUserResponse} extends {@link TeaModel}
 *
 * <p>ModifyUserResponse</p>
 */
public class ModifyUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyUserResponseBody body;

    private ModifyUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyUserResponse create() {
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
    public ModifyUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyUserResponseBody body);

        @Override
        ModifyUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyUserResponse response) {
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
        public Builder body(ModifyUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyUserResponse build() {
            return new ModifyUserResponse(this);
        } 

    } 

}
