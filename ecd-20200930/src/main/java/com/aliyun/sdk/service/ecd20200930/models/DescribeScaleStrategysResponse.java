// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScaleStrategysResponse} extends {@link TeaModel}
 *
 * <p>DescribeScaleStrategysResponse</p>
 */
public class DescribeScaleStrategysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeScaleStrategysResponseBody body;

    private DescribeScaleStrategysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeScaleStrategysResponse create() {
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
    public DescribeScaleStrategysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeScaleStrategysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeScaleStrategysResponseBody body);

        @Override
        DescribeScaleStrategysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeScaleStrategysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeScaleStrategysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeScaleStrategysResponse response) {
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
        public Builder body(DescribeScaleStrategysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeScaleStrategysResponse build() {
            return new DescribeScaleStrategysResponse(this);
        } 

    } 

}
