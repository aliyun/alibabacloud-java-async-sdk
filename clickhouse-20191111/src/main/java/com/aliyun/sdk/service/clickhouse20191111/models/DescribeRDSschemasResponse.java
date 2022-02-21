// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRDSschemasResponse} extends {@link TeaModel}
 *
 * <p>DescribeRDSschemasResponse</p>
 */
public class DescribeRDSschemasResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRDSschemasResponseBody body;

    private DescribeRDSschemasResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRDSschemasResponse create() {
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
    public DescribeRDSschemasResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRDSschemasResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRDSschemasResponseBody body);

        @Override
        DescribeRDSschemasResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRDSschemasResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRDSschemasResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRDSschemasResponse response) {
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
        public Builder body(DescribeRDSschemasResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRDSschemasResponse build() {
            return new DescribeRDSschemasResponse(this);
        } 

    } 

}
