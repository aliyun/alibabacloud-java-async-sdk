// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAiotPersonTablesResponse} extends {@link TeaModel}
 *
 * <p>DescribeAiotPersonTablesResponse</p>
 */
public class DescribeAiotPersonTablesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAiotPersonTablesResponseBody body;

    private DescribeAiotPersonTablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAiotPersonTablesResponse create() {
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
    public DescribeAiotPersonTablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAiotPersonTablesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAiotPersonTablesResponseBody body);

        @Override
        DescribeAiotPersonTablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAiotPersonTablesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAiotPersonTablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAiotPersonTablesResponse response) {
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
        public Builder body(DescribeAiotPersonTablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAiotPersonTablesResponse build() {
            return new DescribeAiotPersonTablesResponse(this);
        } 

    } 

}
