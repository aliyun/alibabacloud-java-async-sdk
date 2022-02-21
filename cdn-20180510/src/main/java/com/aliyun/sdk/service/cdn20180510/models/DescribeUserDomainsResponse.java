// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserDomainsResponse} extends {@link TeaModel}
 *
 * <p>DescribeUserDomainsResponse</p>
 */
public class DescribeUserDomainsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUserDomainsResponseBody body;

    private DescribeUserDomainsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUserDomainsResponse create() {
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
    public DescribeUserDomainsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUserDomainsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUserDomainsResponseBody body);

        @Override
        DescribeUserDomainsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUserDomainsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUserDomainsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUserDomainsResponse response) {
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
        public Builder body(DescribeUserDomainsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUserDomainsResponse build() {
            return new DescribeUserDomainsResponse(this);
        } 

    } 

}
