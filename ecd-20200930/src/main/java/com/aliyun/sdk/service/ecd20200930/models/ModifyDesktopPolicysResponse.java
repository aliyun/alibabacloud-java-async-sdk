// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopPolicysResponse} extends {@link TeaModel}
 *
 * <p>ModifyDesktopPolicysResponse</p>
 */
public class ModifyDesktopPolicysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDesktopPolicysResponseBody body;

    private ModifyDesktopPolicysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDesktopPolicysResponse create() {
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
    public ModifyDesktopPolicysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDesktopPolicysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDesktopPolicysResponseBody body);

        @Override
        ModifyDesktopPolicysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDesktopPolicysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDesktopPolicysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDesktopPolicysResponse response) {
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
        public Builder body(ModifyDesktopPolicysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDesktopPolicysResponse build() {
            return new ModifyDesktopPolicysResponse(this);
        } 

    } 

}
