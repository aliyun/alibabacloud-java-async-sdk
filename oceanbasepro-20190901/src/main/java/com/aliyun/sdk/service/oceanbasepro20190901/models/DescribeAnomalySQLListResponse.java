// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAnomalySQLListResponse} extends {@link TeaModel}
 *
 * <p>DescribeAnomalySQLListResponse</p>
 */
public class DescribeAnomalySQLListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAnomalySQLListResponseBody body;

    private DescribeAnomalySQLListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAnomalySQLListResponse create() {
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
    public DescribeAnomalySQLListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAnomalySQLListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAnomalySQLListResponseBody body);

        @Override
        DescribeAnomalySQLListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAnomalySQLListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAnomalySQLListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAnomalySQLListResponse response) {
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
        public Builder body(DescribeAnomalySQLListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAnomalySQLListResponse build() {
            return new DescribeAnomalySQLListResponse(this);
        } 

    } 

}
