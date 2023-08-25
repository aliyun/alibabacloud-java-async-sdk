// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProjectComponentsResponse} extends {@link TeaModel}
 *
 * <p>DescribeProjectComponentsResponse</p>
 */
public class DescribeProjectComponentsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeProjectComponentsResponseBody body;

    private DescribeProjectComponentsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeProjectComponentsResponse create() {
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
    public DescribeProjectComponentsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeProjectComponentsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeProjectComponentsResponseBody body);

        @Override
        DescribeProjectComponentsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeProjectComponentsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeProjectComponentsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeProjectComponentsResponse response) {
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
        public Builder body(DescribeProjectComponentsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeProjectComponentsResponse build() {
            return new DescribeProjectComponentsResponse(this);
        } 

    } 

}
