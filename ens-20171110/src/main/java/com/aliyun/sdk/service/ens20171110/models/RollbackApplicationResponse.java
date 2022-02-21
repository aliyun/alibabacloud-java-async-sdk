// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RollbackApplicationResponse} extends {@link TeaModel}
 *
 * <p>RollbackApplicationResponse</p>
 */
public class RollbackApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RollbackApplicationResponseBody body;

    private RollbackApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RollbackApplicationResponse create() {
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
    public RollbackApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RollbackApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RollbackApplicationResponseBody body);

        @Override
        RollbackApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RollbackApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RollbackApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RollbackApplicationResponse response) {
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
        public Builder body(RollbackApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RollbackApplicationResponse build() {
            return new RollbackApplicationResponse(this);
        } 

    } 

}
