// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmLogsResponse} extends {@link TeaModel}
 *
 * <p>DescribeGtmLogsResponse</p>
 */
public class DescribeGtmLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGtmLogsResponseBody body;

    private DescribeGtmLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGtmLogsResponse create() {
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
    public DescribeGtmLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGtmLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGtmLogsResponseBody body);

        @Override
        DescribeGtmLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGtmLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGtmLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGtmLogsResponse response) {
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
        public Builder body(DescribeGtmLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGtmLogsResponse build() {
            return new DescribeGtmLogsResponse(this);
        } 

    } 

}
