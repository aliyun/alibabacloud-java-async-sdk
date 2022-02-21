// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProjectAppSecurityResponse} extends {@link TeaModel}
 *
 * <p>DescribeProjectAppSecurityResponse</p>
 */
public class DescribeProjectAppSecurityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeProjectAppSecurityResponseBody body;

    private DescribeProjectAppSecurityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeProjectAppSecurityResponse create() {
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
    public DescribeProjectAppSecurityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeProjectAppSecurityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeProjectAppSecurityResponseBody body);

        @Override
        DescribeProjectAppSecurityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeProjectAppSecurityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeProjectAppSecurityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeProjectAppSecurityResponse response) {
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
        public Builder body(DescribeProjectAppSecurityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeProjectAppSecurityResponse build() {
            return new DescribeProjectAppSecurityResponse(this);
        } 

    } 

}
