// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyDatabaseResponse} extends {@link TeaModel}
 *
 * <p>CopyDatabaseResponse</p>
 */
public class CopyDatabaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CopyDatabaseResponseBody body;

    private CopyDatabaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CopyDatabaseResponse create() {
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
    public CopyDatabaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CopyDatabaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CopyDatabaseResponseBody body);

        @Override
        CopyDatabaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CopyDatabaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CopyDatabaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CopyDatabaseResponse response) {
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
        public Builder body(CopyDatabaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CopyDatabaseResponse build() {
            return new CopyDatabaseResponse(this);
        } 

    } 

}
