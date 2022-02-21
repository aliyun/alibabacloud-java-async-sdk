// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshWebofficeTokenResponse} extends {@link TeaModel}
 *
 * <p>RefreshWebofficeTokenResponse</p>
 */
public class RefreshWebofficeTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefreshWebofficeTokenResponseBody body;

    private RefreshWebofficeTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RefreshWebofficeTokenResponse create() {
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
    public RefreshWebofficeTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshWebofficeTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RefreshWebofficeTokenResponseBody body);

        @Override
        RefreshWebofficeTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshWebofficeTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RefreshWebofficeTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshWebofficeTokenResponse response) {
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
        public Builder body(RefreshWebofficeTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshWebofficeTokenResponse build() {
            return new RefreshWebofficeTokenResponse(this);
        } 

    } 

}
