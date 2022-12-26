// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterBasicInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterBasicInfoResponse</p>
 */
public class DescribeClusterBasicInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClusterBasicInfoResponseBody body;

    private DescribeClusterBasicInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClusterBasicInfoResponse create() {
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
    public DescribeClusterBasicInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterBasicInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClusterBasicInfoResponseBody body);

        @Override
        DescribeClusterBasicInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterBasicInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClusterBasicInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterBasicInfoResponse response) {
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
        public Builder body(DescribeClusterBasicInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterBasicInfoResponse build() {
            return new DescribeClusterBasicInfoResponse(this);
        } 

    } 

}
