// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHybridMonitorNamespaceListResponse} extends {@link TeaModel}
 *
 * <p>DescribeHybridMonitorNamespaceListResponse</p>
 */
public class DescribeHybridMonitorNamespaceListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHybridMonitorNamespaceListResponseBody body;

    private DescribeHybridMonitorNamespaceListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHybridMonitorNamespaceListResponse create() {
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
    public DescribeHybridMonitorNamespaceListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHybridMonitorNamespaceListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHybridMonitorNamespaceListResponseBody body);

        @Override
        DescribeHybridMonitorNamespaceListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHybridMonitorNamespaceListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHybridMonitorNamespaceListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHybridMonitorNamespaceListResponse response) {
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
        public Builder body(DescribeHybridMonitorNamespaceListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHybridMonitorNamespaceListResponse build() {
            return new DescribeHybridMonitorNamespaceListResponse(this);
        } 

    } 

}
