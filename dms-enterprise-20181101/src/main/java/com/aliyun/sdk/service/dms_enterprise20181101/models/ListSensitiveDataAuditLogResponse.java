// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSensitiveDataAuditLogResponse} extends {@link TeaModel}
 *
 * <p>ListSensitiveDataAuditLogResponse</p>
 */
public class ListSensitiveDataAuditLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSensitiveDataAuditLogResponseBody body;

    private ListSensitiveDataAuditLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSensitiveDataAuditLogResponse create() {
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
    public ListSensitiveDataAuditLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSensitiveDataAuditLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSensitiveDataAuditLogResponseBody body);

        @Override
        ListSensitiveDataAuditLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSensitiveDataAuditLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSensitiveDataAuditLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSensitiveDataAuditLogResponse response) {
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
        public Builder body(ListSensitiveDataAuditLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSensitiveDataAuditLogResponse build() {
            return new ListSensitiveDataAuditLogResponse(this);
        } 

    } 

}
