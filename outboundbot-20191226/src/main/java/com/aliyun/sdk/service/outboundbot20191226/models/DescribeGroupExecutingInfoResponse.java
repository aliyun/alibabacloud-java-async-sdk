// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupExecutingInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeGroupExecutingInfoResponse</p>
 */
public class DescribeGroupExecutingInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGroupExecutingInfoResponseBody body;

    private DescribeGroupExecutingInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGroupExecutingInfoResponse create() {
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
    public DescribeGroupExecutingInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGroupExecutingInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGroupExecutingInfoResponseBody body);

        @Override
        DescribeGroupExecutingInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGroupExecutingInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGroupExecutingInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGroupExecutingInfoResponse response) {
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
        public Builder body(DescribeGroupExecutingInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGroupExecutingInfoResponse build() {
            return new DescribeGroupExecutingInfoResponse(this);
        } 

    } 

}
