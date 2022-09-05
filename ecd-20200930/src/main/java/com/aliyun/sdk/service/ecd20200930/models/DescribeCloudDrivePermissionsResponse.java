// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudDrivePermissionsResponse} extends {@link TeaModel}
 *
 * <p>DescribeCloudDrivePermissionsResponse</p>
 */
public class DescribeCloudDrivePermissionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCloudDrivePermissionsResponseBody body;

    private DescribeCloudDrivePermissionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCloudDrivePermissionsResponse create() {
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
    public DescribeCloudDrivePermissionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCloudDrivePermissionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCloudDrivePermissionsResponseBody body);

        @Override
        DescribeCloudDrivePermissionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCloudDrivePermissionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCloudDrivePermissionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCloudDrivePermissionsResponse response) {
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
        public Builder body(DescribeCloudDrivePermissionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCloudDrivePermissionsResponse build() {
            return new DescribeCloudDrivePermissionsResponse(this);
        } 

    } 

}
