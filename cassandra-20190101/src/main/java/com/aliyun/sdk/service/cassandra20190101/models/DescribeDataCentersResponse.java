// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataCentersResponse} extends {@link TeaModel}
 *
 * <p>DescribeDataCentersResponse</p>
 */
public class DescribeDataCentersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDataCentersResponseBody body;

    private DescribeDataCentersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDataCentersResponse create() {
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
    public DescribeDataCentersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDataCentersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDataCentersResponseBody body);

        @Override
        DescribeDataCentersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDataCentersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDataCentersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDataCentersResponse response) {
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
        public Builder body(DescribeDataCentersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDataCentersResponse build() {
            return new DescribeDataCentersResponse(this);
        } 

    } 

}
