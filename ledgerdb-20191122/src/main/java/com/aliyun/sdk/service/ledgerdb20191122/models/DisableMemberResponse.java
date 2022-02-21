// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableMemberResponse} extends {@link TeaModel}
 *
 * <p>DisableMemberResponse</p>
 */
public class DisableMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableMemberResponseBody body;

    private DisableMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableMemberResponse create() {
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
    public DisableMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableMemberResponseBody body);

        @Override
        DisableMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableMemberResponse response) {
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
        public Builder body(DisableMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableMemberResponse build() {
            return new DisableMemberResponse(this);
        } 

    } 

}
