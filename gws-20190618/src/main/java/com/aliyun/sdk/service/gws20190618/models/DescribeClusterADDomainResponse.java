// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterADDomainResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterADDomainResponse</p>
 */
public class DescribeClusterADDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClusterADDomainResponseBody body;

    private DescribeClusterADDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClusterADDomainResponse create() {
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
    public DescribeClusterADDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterADDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClusterADDomainResponseBody body);

        @Override
        DescribeClusterADDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterADDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClusterADDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterADDomainResponse response) {
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
        public Builder body(DescribeClusterADDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterADDomainResponse build() {
            return new DescribeClusterADDomainResponse(this);
        } 

    } 

}
