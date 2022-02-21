// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChannelUsersResponse} extends {@link TeaModel}
 *
 * <p>DescribeChannelUsersResponse</p>
 */
public class DescribeChannelUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeChannelUsersResponseBody body;

    private DescribeChannelUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeChannelUsersResponse create() {
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
    public DescribeChannelUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeChannelUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeChannelUsersResponseBody body);

        @Override
        DescribeChannelUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeChannelUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeChannelUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeChannelUsersResponse response) {
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
        public Builder body(DescribeChannelUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeChannelUsersResponse build() {
            return new DescribeChannelUsersResponse(this);
        } 

    } 

}
