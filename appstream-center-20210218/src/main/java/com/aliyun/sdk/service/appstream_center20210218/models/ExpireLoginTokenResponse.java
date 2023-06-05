// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210218.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExpireLoginTokenResponse} extends {@link TeaModel}
 *
 * <p>ExpireLoginTokenResponse</p>
 */
public class ExpireLoginTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExpireLoginTokenResponseBody body;

    private ExpireLoginTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExpireLoginTokenResponse create() {
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
    public ExpireLoginTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExpireLoginTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExpireLoginTokenResponseBody body);

        @Override
        ExpireLoginTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExpireLoginTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExpireLoginTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExpireLoginTokenResponse response) {
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
        public Builder body(ExpireLoginTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExpireLoginTokenResponse build() {
            return new ExpireLoginTokenResponse(this);
        } 

    } 

}
