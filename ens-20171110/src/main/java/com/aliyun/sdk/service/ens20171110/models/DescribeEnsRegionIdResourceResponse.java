// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsRegionIdResourceResponse} extends {@link TeaModel}
 *
 * <p>DescribeEnsRegionIdResourceResponse</p>
 */
public class DescribeEnsRegionIdResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEnsRegionIdResourceResponseBody body;

    private DescribeEnsRegionIdResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEnsRegionIdResourceResponse create() {
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
    public DescribeEnsRegionIdResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEnsRegionIdResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEnsRegionIdResourceResponseBody body);

        @Override
        DescribeEnsRegionIdResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEnsRegionIdResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEnsRegionIdResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEnsRegionIdResourceResponse response) {
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
        public Builder body(DescribeEnsRegionIdResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEnsRegionIdResourceResponse build() {
            return new DescribeEnsRegionIdResourceResponse(this);
        } 

    } 

}
