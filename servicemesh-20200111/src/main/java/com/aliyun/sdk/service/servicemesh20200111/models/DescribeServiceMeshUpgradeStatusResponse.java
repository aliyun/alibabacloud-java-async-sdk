// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshUpgradeStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshUpgradeStatusResponse</p>
 */
public class DescribeServiceMeshUpgradeStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeServiceMeshUpgradeStatusResponseBody body;

    private DescribeServiceMeshUpgradeStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeServiceMeshUpgradeStatusResponse create() {
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
    public DescribeServiceMeshUpgradeStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeServiceMeshUpgradeStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeServiceMeshUpgradeStatusResponseBody body);

        @Override
        DescribeServiceMeshUpgradeStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeServiceMeshUpgradeStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeServiceMeshUpgradeStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeServiceMeshUpgradeStatusResponse response) {
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
        public Builder body(DescribeServiceMeshUpgradeStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeServiceMeshUpgradeStatusResponse build() {
            return new DescribeServiceMeshUpgradeStatusResponse(this);
        } 

    } 

}
