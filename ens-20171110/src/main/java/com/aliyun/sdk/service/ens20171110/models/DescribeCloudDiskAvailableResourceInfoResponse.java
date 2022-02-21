// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudDiskAvailableResourceInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeCloudDiskAvailableResourceInfoResponse</p>
 */
public class DescribeCloudDiskAvailableResourceInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCloudDiskAvailableResourceInfoResponseBody body;

    private DescribeCloudDiskAvailableResourceInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCloudDiskAvailableResourceInfoResponse create() {
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
    public DescribeCloudDiskAvailableResourceInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCloudDiskAvailableResourceInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCloudDiskAvailableResourceInfoResponseBody body);

        @Override
        DescribeCloudDiskAvailableResourceInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCloudDiskAvailableResourceInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCloudDiskAvailableResourceInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCloudDiskAvailableResourceInfoResponse response) {
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
        public Builder body(DescribeCloudDiskAvailableResourceInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCloudDiskAvailableResourceInfoResponse build() {
            return new DescribeCloudDiskAvailableResourceInfoResponse(this);
        } 

    } 

}
