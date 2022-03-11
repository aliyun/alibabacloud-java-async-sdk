// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachHostAccountsFromHostShareKeyResponse} extends {@link TeaModel}
 *
 * <p>DetachHostAccountsFromHostShareKeyResponse</p>
 */
public class DetachHostAccountsFromHostShareKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachHostAccountsFromHostShareKeyResponseBody body;

    private DetachHostAccountsFromHostShareKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachHostAccountsFromHostShareKeyResponse create() {
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
    public DetachHostAccountsFromHostShareKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachHostAccountsFromHostShareKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachHostAccountsFromHostShareKeyResponseBody body);

        @Override
        DetachHostAccountsFromHostShareKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachHostAccountsFromHostShareKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachHostAccountsFromHostShareKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachHostAccountsFromHostShareKeyResponse response) {
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
        public Builder body(DetachHostAccountsFromHostShareKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachHostAccountsFromHostShareKeyResponse build() {
            return new DetachHostAccountsFromHostShareKeyResponse(this);
        } 

    } 

}
