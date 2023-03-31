// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGlobalSecurityIPGroupResponse} extends {@link TeaModel}
 *
 * <p>DescribeGlobalSecurityIPGroupResponse</p>
 */
public class DescribeGlobalSecurityIPGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGlobalSecurityIPGroupResponseBody body;

    private DescribeGlobalSecurityIPGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGlobalSecurityIPGroupResponse create() {
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
    public DescribeGlobalSecurityIPGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGlobalSecurityIPGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGlobalSecurityIPGroupResponseBody body);

        @Override
        DescribeGlobalSecurityIPGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGlobalSecurityIPGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGlobalSecurityIPGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGlobalSecurityIPGroupResponse response) {
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
        public Builder body(DescribeGlobalSecurityIPGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGlobalSecurityIPGroupResponse build() {
            return new DescribeGlobalSecurityIPGroupResponse(this);
        } 

    } 

}
