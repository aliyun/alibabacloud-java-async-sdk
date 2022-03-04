// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TerminateVirtualBorderRouterResponse} extends {@link TeaModel}
 *
 * <p>TerminateVirtualBorderRouterResponse</p>
 */
public class TerminateVirtualBorderRouterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TerminateVirtualBorderRouterResponseBody body;

    private TerminateVirtualBorderRouterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TerminateVirtualBorderRouterResponse create() {
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
    public TerminateVirtualBorderRouterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TerminateVirtualBorderRouterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TerminateVirtualBorderRouterResponseBody body);

        @Override
        TerminateVirtualBorderRouterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TerminateVirtualBorderRouterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TerminateVirtualBorderRouterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TerminateVirtualBorderRouterResponse response) {
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
        public Builder body(TerminateVirtualBorderRouterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TerminateVirtualBorderRouterResponse build() {
            return new TerminateVirtualBorderRouterResponse(this);
        } 

    } 

}
