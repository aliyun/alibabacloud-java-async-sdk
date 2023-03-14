// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticBandwidthSpecResponse} extends {@link TeaModel}
 *
 * <p>DescribeElasticBandwidthSpecResponse</p>
 */
public class DescribeElasticBandwidthSpecResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeElasticBandwidthSpecResponseBody body;

    private DescribeElasticBandwidthSpecResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeElasticBandwidthSpecResponse create() {
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
    public DescribeElasticBandwidthSpecResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeElasticBandwidthSpecResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeElasticBandwidthSpecResponseBody body);

        @Override
        DescribeElasticBandwidthSpecResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeElasticBandwidthSpecResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeElasticBandwidthSpecResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeElasticBandwidthSpecResponse response) {
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
        public Builder body(DescribeElasticBandwidthSpecResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeElasticBandwidthSpecResponse build() {
            return new DescribeElasticBandwidthSpecResponse(this);
        } 

    } 

}
