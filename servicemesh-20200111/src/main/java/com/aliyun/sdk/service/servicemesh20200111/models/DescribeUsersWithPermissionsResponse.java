// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUsersWithPermissionsResponse} extends {@link TeaModel}
 *
 * <p>DescribeUsersWithPermissionsResponse</p>
 */
public class DescribeUsersWithPermissionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUsersWithPermissionsResponseBody body;

    private DescribeUsersWithPermissionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUsersWithPermissionsResponse create() {
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
    public DescribeUsersWithPermissionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUsersWithPermissionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUsersWithPermissionsResponseBody body);

        @Override
        DescribeUsersWithPermissionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUsersWithPermissionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUsersWithPermissionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUsersWithPermissionsResponse response) {
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
        public Builder body(DescribeUsersWithPermissionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUsersWithPermissionsResponse build() {
            return new DescribeUsersWithPermissionsResponse(this);
        } 

    } 

}
