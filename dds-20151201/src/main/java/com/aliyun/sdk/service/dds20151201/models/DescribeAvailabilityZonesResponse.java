// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailabilityZonesResponse} extends {@link TeaModel}
 *
 * <p>DescribeAvailabilityZonesResponse</p>
 */
public class DescribeAvailabilityZonesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAvailabilityZonesResponseBody body;

    private DescribeAvailabilityZonesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAvailabilityZonesResponse create() {
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
    public DescribeAvailabilityZonesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAvailabilityZonesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAvailabilityZonesResponseBody body);

        @Override
        DescribeAvailabilityZonesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAvailabilityZonesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAvailabilityZonesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAvailabilityZonesResponse response) {
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
        public Builder body(DescribeAvailabilityZonesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAvailabilityZonesResponse build() {
            return new DescribeAvailabilityZonesResponse(this);
        } 

    } 

}
