// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditLogFilterResponse} extends {@link TeaModel}
 *
 * <p>DescribeAuditLogFilterResponse</p>
 */
public class DescribeAuditLogFilterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAuditLogFilterResponseBody body;

    private DescribeAuditLogFilterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAuditLogFilterResponse create() {
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
    public DescribeAuditLogFilterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAuditLogFilterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAuditLogFilterResponseBody body);

        @Override
        DescribeAuditLogFilterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAuditLogFilterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAuditLogFilterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAuditLogFilterResponse response) {
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
        public Builder body(DescribeAuditLogFilterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAuditLogFilterResponse build() {
            return new DescribeAuditLogFilterResponse(this);
        } 

    } 

}
