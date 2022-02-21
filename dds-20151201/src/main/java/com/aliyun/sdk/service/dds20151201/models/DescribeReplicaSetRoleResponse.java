// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReplicaSetRoleResponse} extends {@link TeaModel}
 *
 * <p>DescribeReplicaSetRoleResponse</p>
 */
public class DescribeReplicaSetRoleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeReplicaSetRoleResponseBody body;

    private DescribeReplicaSetRoleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeReplicaSetRoleResponse create() {
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
    public DescribeReplicaSetRoleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeReplicaSetRoleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeReplicaSetRoleResponseBody body);

        @Override
        DescribeReplicaSetRoleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeReplicaSetRoleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeReplicaSetRoleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeReplicaSetRoleResponse response) {
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
        public Builder body(DescribeReplicaSetRoleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeReplicaSetRoleResponse build() {
            return new DescribeReplicaSetRoleResponse(this);
        } 

    } 

}
