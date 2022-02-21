// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnlockAccountResponse} extends {@link TeaModel}
 *
 * <p>UnlockAccountResponse</p>
 */
public class UnlockAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnlockAccountResponseBody body;

    private UnlockAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnlockAccountResponse create() {
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
    public UnlockAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnlockAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnlockAccountResponseBody body);

        @Override
        UnlockAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnlockAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnlockAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnlockAccountResponse response) {
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
        public Builder body(UnlockAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnlockAccountResponse build() {
            return new UnlockAccountResponse(this);
        } 

    } 

}
