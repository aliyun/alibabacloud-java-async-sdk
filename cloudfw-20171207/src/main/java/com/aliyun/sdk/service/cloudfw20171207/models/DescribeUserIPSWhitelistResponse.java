// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserIPSWhitelistResponse} extends {@link TeaModel}
 *
 * <p>DescribeUserIPSWhitelistResponse</p>
 */
public class DescribeUserIPSWhitelistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUserIPSWhitelistResponseBody body;

    private DescribeUserIPSWhitelistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUserIPSWhitelistResponse create() {
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
    public DescribeUserIPSWhitelistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUserIPSWhitelistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUserIPSWhitelistResponseBody body);

        @Override
        DescribeUserIPSWhitelistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUserIPSWhitelistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUserIPSWhitelistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUserIPSWhitelistResponse response) {
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
        public Builder body(DescribeUserIPSWhitelistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUserIPSWhitelistResponse build() {
            return new DescribeUserIPSWhitelistResponse(this);
        } 

    } 

}
