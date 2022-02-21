// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceLoginAuditLogResponse} extends {@link TeaModel}
 *
 * <p>ListInstanceLoginAuditLogResponse</p>
 */
public class ListInstanceLoginAuditLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInstanceLoginAuditLogResponseBody body;

    private ListInstanceLoginAuditLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInstanceLoginAuditLogResponse create() {
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
    public ListInstanceLoginAuditLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInstanceLoginAuditLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInstanceLoginAuditLogResponseBody body);

        @Override
        ListInstanceLoginAuditLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInstanceLoginAuditLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInstanceLoginAuditLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInstanceLoginAuditLogResponse response) {
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
        public Builder body(ListInstanceLoginAuditLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInstanceLoginAuditLogResponse build() {
            return new ListInstanceLoginAuditLogResponse(this);
        } 

    } 

}
