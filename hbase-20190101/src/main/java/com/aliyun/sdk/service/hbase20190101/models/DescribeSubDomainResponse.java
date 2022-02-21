// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSubDomainResponse} extends {@link TeaModel}
 *
 * <p>DescribeSubDomainResponse</p>
 */
public class DescribeSubDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSubDomainResponseBody body;

    private DescribeSubDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSubDomainResponse create() {
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
    public DescribeSubDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSubDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSubDomainResponseBody body);

        @Override
        DescribeSubDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSubDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSubDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSubDomainResponse response) {
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
        public Builder body(DescribeSubDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSubDomainResponse build() {
            return new DescribeSubDomainResponse(this);
        } 

    } 

}
