// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHostResponse} extends {@link TeaModel}
 *
 * <p>ModifyHostResponse</p>
 */
public class ModifyHostResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyHostResponseBody body;

    private ModifyHostResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyHostResponse create() {
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
    public ModifyHostResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyHostResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyHostResponseBody body);

        @Override
        ModifyHostResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyHostResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyHostResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyHostResponse response) {
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
        public Builder body(ModifyHostResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyHostResponse build() {
            return new ModifyHostResponse(this);
        } 

    } 

}
