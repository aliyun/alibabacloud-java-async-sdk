// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeZonesResponse} extends {@link TeaModel}
 *
 * <p>DescribeZonesResponse</p>
 */
public class DescribeZonesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeZonesResponseBody body;

    private DescribeZonesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeZonesResponse create() {
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
    public DescribeZonesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeZonesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeZonesResponseBody body);

        @Override
        DescribeZonesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeZonesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeZonesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeZonesResponse response) {
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
        public Builder body(DescribeZonesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeZonesResponse build() {
            return new DescribeZonesResponse(this);
        } 

    } 

}
