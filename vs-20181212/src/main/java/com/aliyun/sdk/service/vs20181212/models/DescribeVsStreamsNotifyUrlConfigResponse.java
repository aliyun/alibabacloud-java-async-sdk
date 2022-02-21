// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVsStreamsNotifyUrlConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeVsStreamsNotifyUrlConfigResponse</p>
 */
public class DescribeVsStreamsNotifyUrlConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVsStreamsNotifyUrlConfigResponseBody body;

    private DescribeVsStreamsNotifyUrlConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVsStreamsNotifyUrlConfigResponse create() {
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
    public DescribeVsStreamsNotifyUrlConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVsStreamsNotifyUrlConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVsStreamsNotifyUrlConfigResponseBody body);

        @Override
        DescribeVsStreamsNotifyUrlConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVsStreamsNotifyUrlConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVsStreamsNotifyUrlConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVsStreamsNotifyUrlConfigResponse response) {
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
        public Builder body(DescribeVsStreamsNotifyUrlConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVsStreamsNotifyUrlConfigResponse build() {
            return new DescribeVsStreamsNotifyUrlConfigResponse(this);
        } 

    } 

}
