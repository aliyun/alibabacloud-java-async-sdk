// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcpeer20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpcPeerConnectionResponse} extends {@link TeaModel}
 *
 * <p>CreateVpcPeerConnectionResponse</p>
 */
public class CreateVpcPeerConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVpcPeerConnectionResponseBody body;

    private CreateVpcPeerConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVpcPeerConnectionResponse create() {
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
    public CreateVpcPeerConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVpcPeerConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVpcPeerConnectionResponseBody body);

        @Override
        CreateVpcPeerConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVpcPeerConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVpcPeerConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVpcPeerConnectionResponse response) {
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
        public Builder body(CreateVpcPeerConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVpcPeerConnectionResponse build() {
            return new CreateVpcPeerConnectionResponse(this);
        } 

    } 

}
