// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableResourceResponse} extends {@link TeaModel}
 *
 * <p>DescribeAvailableResourceResponse</p>
 */
public class DescribeAvailableResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAvailableResourceResponseBody body;

    private DescribeAvailableResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAvailableResourceResponse create() {
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
    public DescribeAvailableResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAvailableResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAvailableResourceResponseBody body);

        @Override
        DescribeAvailableResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAvailableResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAvailableResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAvailableResourceResponse response) {
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
        public Builder body(DescribeAvailableResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAvailableResourceResponse build() {
            return new DescribeAvailableResourceResponse(this);
        } 

    } 

}
