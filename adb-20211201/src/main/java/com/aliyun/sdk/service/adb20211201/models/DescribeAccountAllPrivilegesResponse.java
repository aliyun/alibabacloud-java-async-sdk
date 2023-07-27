// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountAllPrivilegesResponse} extends {@link TeaModel}
 *
 * <p>DescribeAccountAllPrivilegesResponse</p>
 */
public class DescribeAccountAllPrivilegesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAccountAllPrivilegesResponseBody body;

    private DescribeAccountAllPrivilegesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAccountAllPrivilegesResponse create() {
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
    public DescribeAccountAllPrivilegesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAccountAllPrivilegesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAccountAllPrivilegesResponseBody body);

        @Override
        DescribeAccountAllPrivilegesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAccountAllPrivilegesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAccountAllPrivilegesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAccountAllPrivilegesResponse response) {
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
        public Builder body(DescribeAccountAllPrivilegesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAccountAllPrivilegesResponse build() {
            return new DescribeAccountAllPrivilegesResponse(this);
        } 

    } 

}
