// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnLockResponse} extends {@link TeaModel}
 *
 * <p>UnLockResponse</p>
 */
public class UnLockResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnLockResponseBody body;

    private UnLockResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnLockResponse create() {
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
    public UnLockResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnLockResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnLockResponseBody body);

        @Override
        UnLockResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnLockResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnLockResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnLockResponse response) {
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
        public Builder body(UnLockResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnLockResponse build() {
            return new UnLockResponse(this);
        } 

    } 

}
