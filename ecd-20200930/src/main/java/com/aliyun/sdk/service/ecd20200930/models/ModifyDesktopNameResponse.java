// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopNameResponse} extends {@link TeaModel}
 *
 * <p>ModifyDesktopNameResponse</p>
 */
public class ModifyDesktopNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDesktopNameResponseBody body;

    private ModifyDesktopNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDesktopNameResponse create() {
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
    public ModifyDesktopNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDesktopNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDesktopNameResponseBody body);

        @Override
        ModifyDesktopNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDesktopNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDesktopNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDesktopNameResponse response) {
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
        public Builder body(ModifyDesktopNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDesktopNameResponse build() {
            return new ModifyDesktopNameResponse(this);
        } 

    } 

}
