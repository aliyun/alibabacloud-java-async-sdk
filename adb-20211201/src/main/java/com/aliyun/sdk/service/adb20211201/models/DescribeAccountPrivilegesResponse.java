// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountPrivilegesResponse} extends {@link TeaModel}
 *
 * <p>DescribeAccountPrivilegesResponse</p>
 */
public class DescribeAccountPrivilegesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAccountPrivilegesResponseBody body;

    private DescribeAccountPrivilegesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAccountPrivilegesResponse create() {
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
    public DescribeAccountPrivilegesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAccountPrivilegesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAccountPrivilegesResponseBody body);

        @Override
        DescribeAccountPrivilegesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAccountPrivilegesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAccountPrivilegesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAccountPrivilegesResponse response) {
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
        public Builder body(DescribeAccountPrivilegesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAccountPrivilegesResponse build() {
            return new DescribeAccountPrivilegesResponse(this);
        } 

    } 

}
