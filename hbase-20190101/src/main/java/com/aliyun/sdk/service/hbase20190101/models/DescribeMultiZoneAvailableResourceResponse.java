// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMultiZoneAvailableResourceResponse} extends {@link TeaModel}
 *
 * <p>DescribeMultiZoneAvailableResourceResponse</p>
 */
public class DescribeMultiZoneAvailableResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMultiZoneAvailableResourceResponseBody body;

    private DescribeMultiZoneAvailableResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMultiZoneAvailableResourceResponse create() {
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
    public DescribeMultiZoneAvailableResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMultiZoneAvailableResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMultiZoneAvailableResourceResponseBody body);

        @Override
        DescribeMultiZoneAvailableResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMultiZoneAvailableResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMultiZoneAvailableResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMultiZoneAvailableResourceResponse response) {
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
        public Builder body(DescribeMultiZoneAvailableResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMultiZoneAvailableResourceResponse build() {
            return new DescribeMultiZoneAvailableResourceResponse(this);
        } 

    } 

}
