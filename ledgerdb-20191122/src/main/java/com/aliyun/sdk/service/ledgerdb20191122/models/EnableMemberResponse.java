// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableMemberResponse} extends {@link TeaModel}
 *
 * <p>EnableMemberResponse</p>
 */
public class EnableMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableMemberResponseBody body;

    private EnableMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableMemberResponse create() {
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
    public EnableMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableMemberResponseBody body);

        @Override
        EnableMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableMemberResponse response) {
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
        public Builder body(EnableMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableMemberResponse build() {
            return new EnableMemberResponse(this);
        } 

    } 

}
