// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDbInstanceDbsResponse} extends {@link TeaModel}
 *
 * <p>DescribeDbInstanceDbsResponse</p>
 */
public class DescribeDbInstanceDbsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDbInstanceDbsResponseBody body;

    private DescribeDbInstanceDbsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDbInstanceDbsResponse create() {
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
    public DescribeDbInstanceDbsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDbInstanceDbsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDbInstanceDbsResponseBody body);

        @Override
        DescribeDbInstanceDbsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDbInstanceDbsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDbInstanceDbsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDbInstanceDbsResponse response) {
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
        public Builder body(DescribeDbInstanceDbsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDbInstanceDbsResponse build() {
            return new DescribeDbInstanceDbsResponse(this);
        } 

    } 

}
