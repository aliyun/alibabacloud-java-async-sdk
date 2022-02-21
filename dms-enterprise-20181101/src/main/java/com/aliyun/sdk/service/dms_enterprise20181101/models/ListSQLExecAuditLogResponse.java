// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSQLExecAuditLogResponse} extends {@link TeaModel}
 *
 * <p>ListSQLExecAuditLogResponse</p>
 */
public class ListSQLExecAuditLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSQLExecAuditLogResponseBody body;

    private ListSQLExecAuditLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSQLExecAuditLogResponse create() {
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
    public ListSQLExecAuditLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSQLExecAuditLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSQLExecAuditLogResponseBody body);

        @Override
        ListSQLExecAuditLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSQLExecAuditLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSQLExecAuditLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSQLExecAuditLogResponse response) {
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
        public Builder body(ListSQLExecAuditLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSQLExecAuditLogResponse build() {
            return new ListSQLExecAuditLogResponse(this);
        } 

    } 

}
