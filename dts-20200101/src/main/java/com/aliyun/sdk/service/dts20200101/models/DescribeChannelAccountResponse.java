// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChannelAccountResponse} extends {@link TeaModel}
 *
 * <p>DescribeChannelAccountResponse</p>
 */
public class DescribeChannelAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeChannelAccountResponseBody body;

    private DescribeChannelAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeChannelAccountResponse create() {
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
    public DescribeChannelAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeChannelAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeChannelAccountResponseBody body);

        @Override
        DescribeChannelAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeChannelAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeChannelAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeChannelAccountResponse response) {
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
        public Builder body(DescribeChannelAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeChannelAccountResponse build() {
            return new DescribeChannelAccountResponse(this);
        } 

    } 

}
