// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshProxyStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshProxyStatusResponse</p>
 */
public class DescribeServiceMeshProxyStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeServiceMeshProxyStatusResponseBody body;

    private DescribeServiceMeshProxyStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeServiceMeshProxyStatusResponse create() {
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
    public DescribeServiceMeshProxyStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeServiceMeshProxyStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeServiceMeshProxyStatusResponseBody body);

        @Override
        DescribeServiceMeshProxyStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeServiceMeshProxyStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeServiceMeshProxyStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeServiceMeshProxyStatusResponse response) {
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
        public Builder body(DescribeServiceMeshProxyStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeServiceMeshProxyStatusResponse build() {
            return new DescribeServiceMeshProxyStatusResponse(this);
        } 

    } 

}
