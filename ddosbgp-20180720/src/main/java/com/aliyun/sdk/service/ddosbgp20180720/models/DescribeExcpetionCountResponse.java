// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExcpetionCountResponse} extends {@link TeaModel}
 *
 * <p>DescribeExcpetionCountResponse</p>
 */
public class DescribeExcpetionCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeExcpetionCountResponseBody body;

    private DescribeExcpetionCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeExcpetionCountResponse create() {
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
    public DescribeExcpetionCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeExcpetionCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeExcpetionCountResponseBody body);

        @Override
        DescribeExcpetionCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeExcpetionCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeExcpetionCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeExcpetionCountResponse response) {
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
        public Builder body(DescribeExcpetionCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeExcpetionCountResponse build() {
            return new DescribeExcpetionCountResponse(this);
        } 

    } 

}
