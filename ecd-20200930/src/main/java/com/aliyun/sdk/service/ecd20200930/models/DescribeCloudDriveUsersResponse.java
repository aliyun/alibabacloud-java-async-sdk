// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudDriveUsersResponse} extends {@link TeaModel}
 *
 * <p>DescribeCloudDriveUsersResponse</p>
 */
public class DescribeCloudDriveUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCloudDriveUsersResponseBody body;

    private DescribeCloudDriveUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCloudDriveUsersResponse create() {
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
    public DescribeCloudDriveUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCloudDriveUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCloudDriveUsersResponseBody body);

        @Override
        DescribeCloudDriveUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCloudDriveUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCloudDriveUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCloudDriveUsersResponse response) {
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
        public Builder body(DescribeCloudDriveUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCloudDriveUsersResponse build() {
            return new DescribeCloudDriveUsersResponse(this);
        } 

    } 

}
