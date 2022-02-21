// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditFilesResponse} extends {@link TeaModel}
 *
 * <p>DescribeAuditFilesResponse</p>
 */
public class DescribeAuditFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAuditFilesResponseBody body;

    private DescribeAuditFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAuditFilesResponse create() {
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
    public DescribeAuditFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAuditFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAuditFilesResponseBody body);

        @Override
        DescribeAuditFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAuditFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAuditFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAuditFilesResponse response) {
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
        public Builder body(DescribeAuditFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAuditFilesResponse build() {
            return new DescribeAuditFilesResponse(this);
        } 

    } 

}
