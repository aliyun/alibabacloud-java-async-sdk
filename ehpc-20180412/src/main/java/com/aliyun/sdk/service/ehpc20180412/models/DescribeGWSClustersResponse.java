// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGWSClustersResponse} extends {@link TeaModel}
 *
 * <p>DescribeGWSClustersResponse</p>
 */
public class DescribeGWSClustersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGWSClustersResponseBody body;

    private DescribeGWSClustersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGWSClustersResponse create() {
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
    public DescribeGWSClustersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGWSClustersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGWSClustersResponseBody body);

        @Override
        DescribeGWSClustersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGWSClustersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGWSClustersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGWSClustersResponse response) {
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
        public Builder body(DescribeGWSClustersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGWSClustersResponse build() {
            return new DescribeGWSClustersResponse(this);
        } 

    } 

}
