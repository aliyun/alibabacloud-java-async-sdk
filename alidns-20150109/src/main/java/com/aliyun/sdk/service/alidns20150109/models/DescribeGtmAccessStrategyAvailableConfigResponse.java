// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmAccessStrategyAvailableConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeGtmAccessStrategyAvailableConfigResponse</p>
 */
public class DescribeGtmAccessStrategyAvailableConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGtmAccessStrategyAvailableConfigResponseBody body;

    private DescribeGtmAccessStrategyAvailableConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGtmAccessStrategyAvailableConfigResponse create() {
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
    public DescribeGtmAccessStrategyAvailableConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGtmAccessStrategyAvailableConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGtmAccessStrategyAvailableConfigResponseBody body);

        @Override
        DescribeGtmAccessStrategyAvailableConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGtmAccessStrategyAvailableConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGtmAccessStrategyAvailableConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGtmAccessStrategyAvailableConfigResponse response) {
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
        public Builder body(DescribeGtmAccessStrategyAvailableConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGtmAccessStrategyAvailableConfigResponse build() {
            return new DescribeGtmAccessStrategyAvailableConfigResponse(this);
        } 

    } 

}
