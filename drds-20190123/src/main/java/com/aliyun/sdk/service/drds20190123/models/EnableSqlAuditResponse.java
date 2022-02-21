// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableSqlAuditResponse} extends {@link TeaModel}
 *
 * <p>EnableSqlAuditResponse</p>
 */
public class EnableSqlAuditResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableSqlAuditResponseBody body;

    private EnableSqlAuditResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableSqlAuditResponse create() {
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
    public EnableSqlAuditResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableSqlAuditResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableSqlAuditResponseBody body);

        @Override
        EnableSqlAuditResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableSqlAuditResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableSqlAuditResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableSqlAuditResponse response) {
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
        public Builder body(EnableSqlAuditResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableSqlAuditResponse build() {
            return new EnableSqlAuditResponse(this);
        } 

    } 

}
