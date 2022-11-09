// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditRecordsResponse} extends {@link TeaModel}
 *
 * <p>DescribeAuditRecordsResponse</p>
 */
public class DescribeAuditRecordsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAuditRecordsResponseBody body;

    private DescribeAuditRecordsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAuditRecordsResponse create() {
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
    public DescribeAuditRecordsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAuditRecordsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAuditRecordsResponseBody body);

        @Override
        DescribeAuditRecordsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAuditRecordsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAuditRecordsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAuditRecordsResponse response) {
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
        public Builder body(DescribeAuditRecordsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAuditRecordsResponse build() {
            return new DescribeAuditRecordsResponse(this);
        } 

    } 

}
