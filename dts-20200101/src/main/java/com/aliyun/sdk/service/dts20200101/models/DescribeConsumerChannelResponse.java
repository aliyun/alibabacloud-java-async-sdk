// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConsumerChannelResponse} extends {@link TeaModel}
 *
 * <p>DescribeConsumerChannelResponse</p>
 */
public class DescribeConsumerChannelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeConsumerChannelResponseBody body;

    private DescribeConsumerChannelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeConsumerChannelResponse create() {
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
    public DescribeConsumerChannelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeConsumerChannelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeConsumerChannelResponseBody body);

        @Override
        DescribeConsumerChannelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeConsumerChannelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeConsumerChannelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeConsumerChannelResponse response) {
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
        public Builder body(DescribeConsumerChannelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeConsumerChannelResponse build() {
            return new DescribeConsumerChannelResponse(this);
        } 

    } 

}
