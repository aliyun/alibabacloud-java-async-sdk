// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcpeer20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AcceptVpcPeerConnectionResponse} extends {@link TeaModel}
 *
 * <p>AcceptVpcPeerConnectionResponse</p>
 */
public class AcceptVpcPeerConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AcceptVpcPeerConnectionResponseBody body;

    private AcceptVpcPeerConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AcceptVpcPeerConnectionResponse create() {
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
    public AcceptVpcPeerConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AcceptVpcPeerConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AcceptVpcPeerConnectionResponseBody body);

        @Override
        AcceptVpcPeerConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AcceptVpcPeerConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AcceptVpcPeerConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AcceptVpcPeerConnectionResponse response) {
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
        public Builder body(AcceptVpcPeerConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AcceptVpcPeerConnectionResponse build() {
            return new AcceptVpcPeerConnectionResponse(this);
        } 

    } 

}
