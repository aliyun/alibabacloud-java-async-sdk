// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableSqlAuditResponse} extends {@link TeaModel}
 *
 * <p>DisableSqlAuditResponse</p>
 */
public class DisableSqlAuditResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableSqlAuditResponseBody body;

    private DisableSqlAuditResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableSqlAuditResponse create() {
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
    public DisableSqlAuditResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableSqlAuditResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableSqlAuditResponseBody body);

        @Override
        DisableSqlAuditResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableSqlAuditResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableSqlAuditResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableSqlAuditResponse response) {
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
        public Builder body(DisableSqlAuditResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableSqlAuditResponse build() {
            return new DisableSqlAuditResponse(this);
        } 

    } 

}
