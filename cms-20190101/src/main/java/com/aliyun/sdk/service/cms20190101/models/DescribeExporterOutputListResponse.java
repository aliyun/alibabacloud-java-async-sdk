// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExporterOutputListResponse} extends {@link TeaModel}
 *
 * <p>DescribeExporterOutputListResponse</p>
 */
public class DescribeExporterOutputListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeExporterOutputListResponseBody body;

    private DescribeExporterOutputListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeExporterOutputListResponse create() {
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
    public DescribeExporterOutputListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeExporterOutputListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeExporterOutputListResponseBody body);

        @Override
        DescribeExporterOutputListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeExporterOutputListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeExporterOutputListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeExporterOutputListResponse response) {
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
        public Builder body(DescribeExporterOutputListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeExporterOutputListResponse build() {
            return new DescribeExporterOutputListResponse(this);
        } 

    } 

}
