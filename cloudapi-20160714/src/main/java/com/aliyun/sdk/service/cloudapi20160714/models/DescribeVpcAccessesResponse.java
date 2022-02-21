// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcAccessesResponse} extends {@link TeaModel}
 *
 * <p>DescribeVpcAccessesResponse</p>
 */
public class DescribeVpcAccessesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVpcAccessesResponseBody body;

    private DescribeVpcAccessesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVpcAccessesResponse create() {
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
    public DescribeVpcAccessesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVpcAccessesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVpcAccessesResponseBody body);

        @Override
        DescribeVpcAccessesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVpcAccessesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVpcAccessesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVpcAccessesResponse response) {
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
        public Builder body(DescribeVpcAccessesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVpcAccessesResponse build() {
            return new DescribeVpcAccessesResponse(this);
        } 

    } 

}
