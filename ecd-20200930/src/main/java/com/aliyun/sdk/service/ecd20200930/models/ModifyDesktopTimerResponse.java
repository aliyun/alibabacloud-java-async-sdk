// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopTimerResponse} extends {@link TeaModel}
 *
 * <p>ModifyDesktopTimerResponse</p>
 */
public class ModifyDesktopTimerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDesktopTimerResponseBody body;

    private ModifyDesktopTimerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDesktopTimerResponse create() {
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
    public ModifyDesktopTimerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDesktopTimerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDesktopTimerResponseBody body);

        @Override
        ModifyDesktopTimerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDesktopTimerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDesktopTimerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDesktopTimerResponse response) {
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
        public Builder body(ModifyDesktopTimerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDesktopTimerResponse build() {
            return new ModifyDesktopTimerResponse(this);
        } 

    } 

}
