// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGlobalSecurityIPGroupRelationResponse} extends {@link TeaModel}
 *
 * <p>DescribeGlobalSecurityIPGroupRelationResponse</p>
 */
public class DescribeGlobalSecurityIPGroupRelationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGlobalSecurityIPGroupRelationResponseBody body;

    private DescribeGlobalSecurityIPGroupRelationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGlobalSecurityIPGroupRelationResponse create() {
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
    public DescribeGlobalSecurityIPGroupRelationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGlobalSecurityIPGroupRelationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGlobalSecurityIPGroupRelationResponseBody body);

        @Override
        DescribeGlobalSecurityIPGroupRelationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGlobalSecurityIPGroupRelationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGlobalSecurityIPGroupRelationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGlobalSecurityIPGroupRelationResponse response) {
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
        public Builder body(DescribeGlobalSecurityIPGroupRelationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGlobalSecurityIPGroupRelationResponse build() {
            return new DescribeGlobalSecurityIPGroupRelationResponse(this);
        } 

    } 

}
