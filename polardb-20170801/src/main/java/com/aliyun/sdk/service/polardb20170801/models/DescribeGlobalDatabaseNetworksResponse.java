// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGlobalDatabaseNetworksResponse} extends {@link TeaModel}
 *
 * <p>DescribeGlobalDatabaseNetworksResponse</p>
 */
public class DescribeGlobalDatabaseNetworksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGlobalDatabaseNetworksResponseBody body;

    private DescribeGlobalDatabaseNetworksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGlobalDatabaseNetworksResponse create() {
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
    public DescribeGlobalDatabaseNetworksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGlobalDatabaseNetworksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGlobalDatabaseNetworksResponseBody body);

        @Override
        DescribeGlobalDatabaseNetworksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGlobalDatabaseNetworksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGlobalDatabaseNetworksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGlobalDatabaseNetworksResponse response) {
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
        public Builder body(DescribeGlobalDatabaseNetworksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGlobalDatabaseNetworksResponse build() {
            return new DescribeGlobalDatabaseNetworksResponse(this);
        } 

    } 

}
