// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVsStreamsOnlineListResponse} extends {@link TeaModel}
 *
 * <p>DescribeVsStreamsOnlineListResponse</p>
 */
public class DescribeVsStreamsOnlineListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVsStreamsOnlineListResponseBody body;

    private DescribeVsStreamsOnlineListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVsStreamsOnlineListResponse create() {
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
    public DescribeVsStreamsOnlineListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVsStreamsOnlineListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVsStreamsOnlineListResponseBody body);

        @Override
        DescribeVsStreamsOnlineListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVsStreamsOnlineListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVsStreamsOnlineListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVsStreamsOnlineListResponse response) {
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
        public Builder body(DescribeVsStreamsOnlineListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVsStreamsOnlineListResponse build() {
            return new DescribeVsStreamsOnlineListResponse(this);
        } 

    } 

}
