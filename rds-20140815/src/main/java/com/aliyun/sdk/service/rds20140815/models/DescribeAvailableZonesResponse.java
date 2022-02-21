// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableZonesResponse} extends {@link TeaModel}
 *
 * <p>DescribeAvailableZonesResponse</p>
 */
public class DescribeAvailableZonesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAvailableZonesResponseBody body;

    private DescribeAvailableZonesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAvailableZonesResponse create() {
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
    public DescribeAvailableZonesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAvailableZonesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAvailableZonesResponseBody body);

        @Override
        DescribeAvailableZonesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAvailableZonesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAvailableZonesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAvailableZonesResponse response) {
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
        public Builder body(DescribeAvailableZonesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAvailableZonesResponse build() {
            return new DescribeAvailableZonesResponse(this);
        } 

    } 

}
