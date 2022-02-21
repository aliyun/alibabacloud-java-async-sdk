// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMultiZoneClusterResponse} extends {@link TeaModel}
 *
 * <p>DescribeMultiZoneClusterResponse</p>
 */
public class DescribeMultiZoneClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMultiZoneClusterResponseBody body;

    private DescribeMultiZoneClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMultiZoneClusterResponse create() {
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
    public DescribeMultiZoneClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMultiZoneClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMultiZoneClusterResponseBody body);

        @Override
        DescribeMultiZoneClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMultiZoneClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMultiZoneClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMultiZoneClusterResponse response) {
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
        public Builder body(DescribeMultiZoneClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMultiZoneClusterResponse build() {
            return new DescribeMultiZoneClusterResponse(this);
        } 

    } 

}
