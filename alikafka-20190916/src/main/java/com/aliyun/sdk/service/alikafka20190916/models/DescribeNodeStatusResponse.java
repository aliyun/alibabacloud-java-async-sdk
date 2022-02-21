// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNodeStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeNodeStatusResponse</p>
 */
public class DescribeNodeStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeNodeStatusResponseBody body;

    private DescribeNodeStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeNodeStatusResponse create() {
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
    public DescribeNodeStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNodeStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeNodeStatusResponseBody body);

        @Override
        DescribeNodeStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNodeStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeNodeStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNodeStatusResponse response) {
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
        public Builder body(DescribeNodeStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNodeStatusResponse build() {
            return new DescribeNodeStatusResponse(this);
        } 

    } 

}
