// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckSqlAuditEnableStatusResponse} extends {@link TeaModel}
 *
 * <p>CheckSqlAuditEnableStatusResponse</p>
 */
public class CheckSqlAuditEnableStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckSqlAuditEnableStatusResponseBody body;

    private CheckSqlAuditEnableStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckSqlAuditEnableStatusResponse create() {
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
    public CheckSqlAuditEnableStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckSqlAuditEnableStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckSqlAuditEnableStatusResponseBody body);

        @Override
        CheckSqlAuditEnableStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckSqlAuditEnableStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckSqlAuditEnableStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckSqlAuditEnableStatusResponse response) {
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
        public Builder body(CheckSqlAuditEnableStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckSqlAuditEnableStatusResponse build() {
            return new CheckSqlAuditEnableStatusResponse(this);
        } 

    } 

}
