// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RollbackInstanceVersionResponse} extends {@link TeaModel}
 *
 * <p>RollbackInstanceVersionResponse</p>
 */
public class RollbackInstanceVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RollbackInstanceVersionResponseBody body;

    private RollbackInstanceVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RollbackInstanceVersionResponse create() {
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
    public RollbackInstanceVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RollbackInstanceVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RollbackInstanceVersionResponseBody body);

        @Override
        RollbackInstanceVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RollbackInstanceVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RollbackInstanceVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RollbackInstanceVersionResponse response) {
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
        public Builder body(RollbackInstanceVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RollbackInstanceVersionResponse build() {
            return new RollbackInstanceVersionResponse(this);
        } 

    } 

}
