// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AcceptFabricInvitationResponse} extends {@link TeaModel}
 *
 * <p>AcceptFabricInvitationResponse</p>
 */
public class AcceptFabricInvitationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AcceptFabricInvitationResponseBody body;

    private AcceptFabricInvitationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AcceptFabricInvitationResponse create() {
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
    public AcceptFabricInvitationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AcceptFabricInvitationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AcceptFabricInvitationResponseBody body);

        @Override
        AcceptFabricInvitationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AcceptFabricInvitationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AcceptFabricInvitationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AcceptFabricInvitationResponse response) {
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
        public Builder body(AcceptFabricInvitationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AcceptFabricInvitationResponse build() {
            return new AcceptFabricInvitationResponse(this);
        } 

    } 

}
