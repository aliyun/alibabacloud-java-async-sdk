// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVaultReplicationRegionsResponse} extends {@link TeaModel}
 *
 * <p>DescribeVaultReplicationRegionsResponse</p>
 */
public class DescribeVaultReplicationRegionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVaultReplicationRegionsResponseBody body;

    private DescribeVaultReplicationRegionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVaultReplicationRegionsResponse create() {
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
    public DescribeVaultReplicationRegionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVaultReplicationRegionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVaultReplicationRegionsResponseBody body);

        @Override
        DescribeVaultReplicationRegionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVaultReplicationRegionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVaultReplicationRegionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVaultReplicationRegionsResponse response) {
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
        public Builder body(DescribeVaultReplicationRegionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVaultReplicationRegionsResponse build() {
            return new DescribeVaultReplicationRegionsResponse(this);
        } 

    } 

}
