// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LockAccountResponse} extends {@link TeaModel}
 *
 * <p>LockAccountResponse</p>
 */
public class LockAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private LockAccountResponseBody body;

    private LockAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static LockAccountResponse create() {
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
    public LockAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LockAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(LockAccountResponseBody body);

        @Override
        LockAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LockAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private LockAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LockAccountResponse response) {
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
        public Builder body(LockAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LockAccountResponse build() {
            return new LockAccountResponse(this);
        } 

    } 

}
