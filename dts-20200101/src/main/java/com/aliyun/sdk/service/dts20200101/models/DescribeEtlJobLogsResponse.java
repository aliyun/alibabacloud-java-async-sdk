// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEtlJobLogsResponse} extends {@link TeaModel}
 *
 * <p>DescribeEtlJobLogsResponse</p>
 */
public class DescribeEtlJobLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEtlJobLogsResponseBody body;

    private DescribeEtlJobLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEtlJobLogsResponse create() {
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
    public DescribeEtlJobLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEtlJobLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEtlJobLogsResponseBody body);

        @Override
        DescribeEtlJobLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEtlJobLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEtlJobLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEtlJobLogsResponse response) {
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
        public Builder body(DescribeEtlJobLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEtlJobLogsResponse build() {
            return new DescribeEtlJobLogsResponse(this);
        } 

    } 

}
