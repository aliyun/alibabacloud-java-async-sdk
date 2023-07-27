// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnabledPrivilegesResponse} extends {@link TeaModel}
 *
 * <p>DescribeEnabledPrivilegesResponse</p>
 */
public class DescribeEnabledPrivilegesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEnabledPrivilegesResponseBody body;

    private DescribeEnabledPrivilegesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEnabledPrivilegesResponse create() {
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
    public DescribeEnabledPrivilegesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEnabledPrivilegesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEnabledPrivilegesResponseBody body);

        @Override
        DescribeEnabledPrivilegesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEnabledPrivilegesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEnabledPrivilegesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEnabledPrivilegesResponse response) {
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
        public Builder body(DescribeEnabledPrivilegesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEnabledPrivilegesResponse build() {
            return new DescribeEnabledPrivilegesResponse(this);
        } 

    } 

}
