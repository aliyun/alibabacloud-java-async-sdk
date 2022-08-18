// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeApplicationFromUsersResponse} extends {@link TeaModel}
 *
 * <p>RevokeApplicationFromUsersResponse</p>
 */
public class RevokeApplicationFromUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RevokeApplicationFromUsersResponseBody body;

    private RevokeApplicationFromUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RevokeApplicationFromUsersResponse create() {
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
    public RevokeApplicationFromUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokeApplicationFromUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RevokeApplicationFromUsersResponseBody body);

        @Override
        RevokeApplicationFromUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokeApplicationFromUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RevokeApplicationFromUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokeApplicationFromUsersResponse response) {
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
        public Builder body(RevokeApplicationFromUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokeApplicationFromUsersResponse build() {
            return new RevokeApplicationFromUsersResponse(this);
        } 

    } 

}
