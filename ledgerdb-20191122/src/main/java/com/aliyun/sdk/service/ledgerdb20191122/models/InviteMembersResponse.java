// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InviteMembersResponse} extends {@link TeaModel}
 *
 * <p>InviteMembersResponse</p>
 */
public class InviteMembersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InviteMembersResponseBody body;

    private InviteMembersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InviteMembersResponse create() {
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
    public InviteMembersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InviteMembersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InviteMembersResponseBody body);

        @Override
        InviteMembersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InviteMembersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InviteMembersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InviteMembersResponse response) {
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
        public Builder body(InviteMembersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InviteMembersResponse build() {
            return new InviteMembersResponse(this);
        } 

    } 

}
