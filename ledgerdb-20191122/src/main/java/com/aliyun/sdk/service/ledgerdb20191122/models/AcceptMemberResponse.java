// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AcceptMemberResponse} extends {@link TeaModel}
 *
 * <p>AcceptMemberResponse</p>
 */
public class AcceptMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AcceptMemberResponseBody body;

    private AcceptMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AcceptMemberResponse create() {
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
    public AcceptMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AcceptMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AcceptMemberResponseBody body);

        @Override
        AcceptMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AcceptMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AcceptMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AcceptMemberResponse response) {
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
        public Builder body(AcceptMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AcceptMemberResponse build() {
            return new AcceptMemberResponse(this);
        } 

    } 

}
