// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResolverAvailableZonesResponse} extends {@link TeaModel}
 *
 * <p>DescribeResolverAvailableZonesResponse</p>
 */
public class DescribeResolverAvailableZonesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeResolverAvailableZonesResponseBody body;

    private DescribeResolverAvailableZonesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeResolverAvailableZonesResponse create() {
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
    public DescribeResolverAvailableZonesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeResolverAvailableZonesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeResolverAvailableZonesResponseBody body);

        @Override
        DescribeResolverAvailableZonesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeResolverAvailableZonesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeResolverAvailableZonesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeResolverAvailableZonesResponse response) {
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
        public Builder body(DescribeResolverAvailableZonesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeResolverAvailableZonesResponse build() {
            return new DescribeResolverAvailableZonesResponse(this);
        } 

    } 

}
