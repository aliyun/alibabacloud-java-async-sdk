// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRDSTablesResponse} extends {@link TeaModel}
 *
 * <p>DescribeRDSTablesResponse</p>
 */
public class DescribeRDSTablesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRDSTablesResponseBody body;

    private DescribeRDSTablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRDSTablesResponse create() {
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
    public DescribeRDSTablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRDSTablesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRDSTablesResponseBody body);

        @Override
        DescribeRDSTablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRDSTablesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRDSTablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRDSTablesResponse response) {
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
        public Builder body(DescribeRDSTablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRDSTablesResponse build() {
            return new DescribeRDSTablesResponse(this);
        } 

    } 

}
