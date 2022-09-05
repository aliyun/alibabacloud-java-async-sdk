// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUsersPasswordResponse} extends {@link TeaModel}
 *
 * <p>DescribeUsersPasswordResponse</p>
 */
public class DescribeUsersPasswordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUsersPasswordResponseBody body;

    private DescribeUsersPasswordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUsersPasswordResponse create() {
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
    public DescribeUsersPasswordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUsersPasswordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUsersPasswordResponseBody body);

        @Override
        DescribeUsersPasswordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUsersPasswordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUsersPasswordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUsersPasswordResponse response) {
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
        public Builder body(DescribeUsersPasswordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUsersPasswordResponse build() {
            return new DescribeUsersPasswordResponse(this);
        } 

    } 

}
