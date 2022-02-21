// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVaultsResponse} extends {@link TeaModel}
 *
 * <p>DescribeVaultsResponse</p>
 */
public class DescribeVaultsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVaultsResponseBody body;

    private DescribeVaultsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVaultsResponse create() {
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
    public DescribeVaultsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVaultsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVaultsResponseBody body);

        @Override
        DescribeVaultsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVaultsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVaultsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVaultsResponse response) {
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
        public Builder body(DescribeVaultsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVaultsResponse build() {
            return new DescribeVaultsResponse(this);
        } 

    } 

}
