// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateDedicatedHostsResponse} extends {@link TeaModel}
 *
 * <p>AllocateDedicatedHostsResponse</p>
 */
public class AllocateDedicatedHostsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AllocateDedicatedHostsResponseBody body;

    private AllocateDedicatedHostsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AllocateDedicatedHostsResponse create() {
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
    public AllocateDedicatedHostsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AllocateDedicatedHostsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AllocateDedicatedHostsResponseBody body);

        @Override
        AllocateDedicatedHostsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AllocateDedicatedHostsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AllocateDedicatedHostsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AllocateDedicatedHostsResponse response) {
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
        public Builder body(AllocateDedicatedHostsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AllocateDedicatedHostsResponse build() {
            return new AllocateDedicatedHostsResponse(this);
        } 

    } 

}
