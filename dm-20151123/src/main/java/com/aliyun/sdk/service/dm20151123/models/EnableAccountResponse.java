// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableAccountResponse} extends {@link TeaModel}
 *
 * <p>EnableAccountResponse</p>
 */
public class EnableAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableAccountResponseBody body;

    private EnableAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableAccountResponse create() {
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
    public EnableAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableAccountResponseBody body);

        @Override
        EnableAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableAccountResponse response) {
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
        public Builder body(EnableAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableAccountResponse build() {
            return new EnableAccountResponse(this);
        } 

    } 

}
