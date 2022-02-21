// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeL2VipsByDomainResponse} extends {@link TeaModel}
 *
 * <p>DescribeL2VipsByDomainResponse</p>
 */
public class DescribeL2VipsByDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeL2VipsByDomainResponseBody body;

    private DescribeL2VipsByDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeL2VipsByDomainResponse create() {
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
    public DescribeL2VipsByDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeL2VipsByDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeL2VipsByDomainResponseBody body);

        @Override
        DescribeL2VipsByDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeL2VipsByDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeL2VipsByDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeL2VipsByDomainResponse response) {
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
        public Builder body(DescribeL2VipsByDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeL2VipsByDomainResponse build() {
            return new DescribeL2VipsByDomainResponse(this);
        } 

    } 

}
