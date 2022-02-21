// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterScaledNodeResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterScaledNodeResponse</p>
 */
public class DescribeClusterScaledNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private DescribeClusterScaledNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static DescribeClusterScaledNodeResponse create() {
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

    public interface Builder extends Response.Builder<DescribeClusterScaledNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        DescribeClusterScaledNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterScaledNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterScaledNodeResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public DescribeClusterScaledNodeResponse build() {
            return new DescribeClusterScaledNodeResponse(this);
        } 

    } 

}
