// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpLocationServiceResponse} extends {@link TeaModel}
 *
 * <p>DescribeIpLocationServiceResponse</p>
 */
public class DescribeIpLocationServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeIpLocationServiceResponseBody body;

    private DescribeIpLocationServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeIpLocationServiceResponse create() {
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
    public DescribeIpLocationServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIpLocationServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeIpLocationServiceResponseBody body);

        @Override
        DescribeIpLocationServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIpLocationServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeIpLocationServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIpLocationServiceResponse response) {
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
        public Builder body(DescribeIpLocationServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIpLocationServiceResponse build() {
            return new DescribeIpLocationServiceResponse(this);
        } 

    } 

}
