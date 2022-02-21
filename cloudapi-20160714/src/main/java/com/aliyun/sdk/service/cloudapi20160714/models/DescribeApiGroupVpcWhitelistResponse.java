// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiGroupVpcWhitelistResponse} extends {@link TeaModel}
 *
 * <p>DescribeApiGroupVpcWhitelistResponse</p>
 */
public class DescribeApiGroupVpcWhitelistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeApiGroupVpcWhitelistResponseBody body;

    private DescribeApiGroupVpcWhitelistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeApiGroupVpcWhitelistResponse create() {
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
    public DescribeApiGroupVpcWhitelistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeApiGroupVpcWhitelistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeApiGroupVpcWhitelistResponseBody body);

        @Override
        DescribeApiGroupVpcWhitelistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeApiGroupVpcWhitelistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeApiGroupVpcWhitelistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeApiGroupVpcWhitelistResponse response) {
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
        public Builder body(DescribeApiGroupVpcWhitelistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeApiGroupVpcWhitelistResponse build() {
            return new DescribeApiGroupVpcWhitelistResponse(this);
        } 

    } 

}
