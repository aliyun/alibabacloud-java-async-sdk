// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSubaccountK8sClusterUserConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeSubaccountK8sClusterUserConfigResponse</p>
 */
public class DescribeSubaccountK8sClusterUserConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSubaccountK8sClusterUserConfigResponseBody body;

    private DescribeSubaccountK8sClusterUserConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSubaccountK8sClusterUserConfigResponse create() {
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
    public DescribeSubaccountK8sClusterUserConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSubaccountK8sClusterUserConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSubaccountK8sClusterUserConfigResponseBody body);

        @Override
        DescribeSubaccountK8sClusterUserConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSubaccountK8sClusterUserConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSubaccountK8sClusterUserConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSubaccountK8sClusterUserConfigResponse response) {
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
        public Builder body(DescribeSubaccountK8sClusterUserConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSubaccountK8sClusterUserConfigResponse build() {
            return new DescribeSubaccountK8sClusterUserConfigResponse(this);
        } 

    } 

}
