// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AbortLockResponse} extends {@link TeaModel}
 *
 * <p>AbortLockResponse</p>
 */
public class AbortLockResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AbortLockResponseBody body;

    private AbortLockResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AbortLockResponse create() {
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
    public AbortLockResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AbortLockResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AbortLockResponseBody body);

        @Override
        AbortLockResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AbortLockResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AbortLockResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AbortLockResponse response) {
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
        public Builder body(AbortLockResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AbortLockResponse build() {
            return new AbortLockResponse(this);
        } 

    } 

}
