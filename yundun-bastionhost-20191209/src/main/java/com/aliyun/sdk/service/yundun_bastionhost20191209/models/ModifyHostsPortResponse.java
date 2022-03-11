// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHostsPortResponse} extends {@link TeaModel}
 *
 * <p>ModifyHostsPortResponse</p>
 */
public class ModifyHostsPortResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyHostsPortResponseBody body;

    private ModifyHostsPortResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyHostsPortResponse create() {
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
    public ModifyHostsPortResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyHostsPortResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyHostsPortResponseBody body);

        @Override
        ModifyHostsPortResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyHostsPortResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyHostsPortResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyHostsPortResponse response) {
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
        public Builder body(ModifyHostsPortResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyHostsPortResponse build() {
            return new ModifyHostsPortResponse(this);
        } 

    } 

}
