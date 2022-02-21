// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticsearchHealthResponse} extends {@link TeaModel}
 *
 * <p>DescribeElasticsearchHealthResponse</p>
 */
public class DescribeElasticsearchHealthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeElasticsearchHealthResponseBody body;

    private DescribeElasticsearchHealthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeElasticsearchHealthResponse create() {
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
    public DescribeElasticsearchHealthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeElasticsearchHealthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeElasticsearchHealthResponseBody body);

        @Override
        DescribeElasticsearchHealthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeElasticsearchHealthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeElasticsearchHealthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeElasticsearchHealthResponse response) {
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
        public Builder body(DescribeElasticsearchHealthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeElasticsearchHealthResponse build() {
            return new DescribeElasticsearchHealthResponse(this);
        } 

    } 

}
