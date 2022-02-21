// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserInfoInChannelResponse} extends {@link TeaModel}
 *
 * <p>DescribeUserInfoInChannelResponse</p>
 */
public class DescribeUserInfoInChannelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUserInfoInChannelResponseBody body;

    private DescribeUserInfoInChannelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUserInfoInChannelResponse create() {
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
    public DescribeUserInfoInChannelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUserInfoInChannelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUserInfoInChannelResponseBody body);

        @Override
        DescribeUserInfoInChannelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUserInfoInChannelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUserInfoInChannelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUserInfoInChannelResponse response) {
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
        public Builder body(DescribeUserInfoInChannelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUserInfoInChannelResponse build() {
            return new DescribeUserInfoInChannelResponse(this);
        } 

    } 

}
