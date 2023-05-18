// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AcceptResourceShareInvitationResponse} extends {@link TeaModel}
 *
 * <p>AcceptResourceShareInvitationResponse</p>
 */
public class AcceptResourceShareInvitationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AcceptResourceShareInvitationResponseBody body;

    private AcceptResourceShareInvitationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AcceptResourceShareInvitationResponse create() {
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
    public AcceptResourceShareInvitationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AcceptResourceShareInvitationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AcceptResourceShareInvitationResponseBody body);

        @Override
        AcceptResourceShareInvitationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AcceptResourceShareInvitationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AcceptResourceShareInvitationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AcceptResourceShareInvitationResponse response) {
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
        public Builder body(AcceptResourceShareInvitationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AcceptResourceShareInvitationResponse build() {
            return new AcceptResourceShareInvitationResponse(this);
        } 

    } 

}
