// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InviteSubAccountResponse} extends {@link TeaModel}
 *
 * <p>InviteSubAccountResponse</p>
 */
public class InviteSubAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InviteSubAccountResponseBody body;

    private InviteSubAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InviteSubAccountResponse create() {
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
    public InviteSubAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InviteSubAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InviteSubAccountResponseBody body);

        @Override
        InviteSubAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InviteSubAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InviteSubAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InviteSubAccountResponse response) {
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
        public Builder body(InviteSubAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InviteSubAccountResponse build() {
            return new InviteSubAccountResponse(this);
        } 

    } 

}
