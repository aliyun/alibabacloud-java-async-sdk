// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmAccessStrategiesResponse} extends {@link TeaModel}
 *
 * <p>DescribeGtmAccessStrategiesResponse</p>
 */
public class DescribeGtmAccessStrategiesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGtmAccessStrategiesResponseBody body;

    private DescribeGtmAccessStrategiesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGtmAccessStrategiesResponse create() {
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
    public DescribeGtmAccessStrategiesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGtmAccessStrategiesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGtmAccessStrategiesResponseBody body);

        @Override
        DescribeGtmAccessStrategiesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGtmAccessStrategiesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGtmAccessStrategiesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGtmAccessStrategiesResponse response) {
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
        public Builder body(DescribeGtmAccessStrategiesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGtmAccessStrategiesResponse build() {
            return new DescribeGtmAccessStrategiesResponse(this);
        } 

    } 

}
