// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewDesktopsResponse} extends {@link TeaModel}
 *
 * <p>RenewDesktopsResponse</p>
 */
public class RenewDesktopsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RenewDesktopsResponseBody body;

    private RenewDesktopsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RenewDesktopsResponse create() {
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
    public RenewDesktopsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RenewDesktopsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RenewDesktopsResponseBody body);

        @Override
        RenewDesktopsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RenewDesktopsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RenewDesktopsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RenewDesktopsResponse response) {
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
        public Builder body(RenewDesktopsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RenewDesktopsResponse build() {
            return new RenewDesktopsResponse(this);
        } 

    } 

}
