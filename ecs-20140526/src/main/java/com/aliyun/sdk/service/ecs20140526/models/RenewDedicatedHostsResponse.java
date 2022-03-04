// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewDedicatedHostsResponse} extends {@link TeaModel}
 *
 * <p>RenewDedicatedHostsResponse</p>
 */
public class RenewDedicatedHostsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RenewDedicatedHostsResponseBody body;

    private RenewDedicatedHostsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RenewDedicatedHostsResponse create() {
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
    public RenewDedicatedHostsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RenewDedicatedHostsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RenewDedicatedHostsResponseBody body);

        @Override
        RenewDedicatedHostsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RenewDedicatedHostsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RenewDedicatedHostsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RenewDedicatedHostsResponse response) {
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
        public Builder body(RenewDedicatedHostsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RenewDedicatedHostsResponse build() {
            return new RenewDedicatedHostsResponse(this);
        } 

    } 

}
