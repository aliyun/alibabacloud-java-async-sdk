// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcpeer20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RejectVpcPeerConnectionResponse} extends {@link TeaModel}
 *
 * <p>RejectVpcPeerConnectionResponse</p>
 */
public class RejectVpcPeerConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RejectVpcPeerConnectionResponseBody body;

    private RejectVpcPeerConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RejectVpcPeerConnectionResponse create() {
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
    public RejectVpcPeerConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RejectVpcPeerConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RejectVpcPeerConnectionResponseBody body);

        @Override
        RejectVpcPeerConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RejectVpcPeerConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RejectVpcPeerConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RejectVpcPeerConnectionResponse response) {
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
        public Builder body(RejectVpcPeerConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RejectVpcPeerConnectionResponse build() {
            return new RejectVpcPeerConnectionResponse(this);
        } 

    } 

}
