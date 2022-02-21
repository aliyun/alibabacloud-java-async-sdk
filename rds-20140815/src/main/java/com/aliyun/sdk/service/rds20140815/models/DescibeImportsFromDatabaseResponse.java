// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescibeImportsFromDatabaseResponse} extends {@link TeaModel}
 *
 * <p>DescibeImportsFromDatabaseResponse</p>
 */
public class DescibeImportsFromDatabaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescibeImportsFromDatabaseResponseBody body;

    private DescibeImportsFromDatabaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescibeImportsFromDatabaseResponse create() {
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
    public DescibeImportsFromDatabaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescibeImportsFromDatabaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescibeImportsFromDatabaseResponseBody body);

        @Override
        DescibeImportsFromDatabaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescibeImportsFromDatabaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescibeImportsFromDatabaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescibeImportsFromDatabaseResponse response) {
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
        public Builder body(DescibeImportsFromDatabaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescibeImportsFromDatabaseResponse build() {
            return new DescibeImportsFromDatabaseResponse(this);
        } 

    } 

}
