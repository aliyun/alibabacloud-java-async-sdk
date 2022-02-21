// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewDesktopGroupResponse} extends {@link TeaModel}
 *
 * <p>RenewDesktopGroupResponse</p>
 */
public class RenewDesktopGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RenewDesktopGroupResponseBody body;

    private RenewDesktopGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RenewDesktopGroupResponse create() {
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
    public RenewDesktopGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RenewDesktopGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RenewDesktopGroupResponseBody body);

        @Override
        RenewDesktopGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RenewDesktopGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RenewDesktopGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RenewDesktopGroupResponse response) {
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
        public Builder body(RenewDesktopGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RenewDesktopGroupResponse build() {
            return new RenewDesktopGroupResponse(this);
        } 

    } 

}
