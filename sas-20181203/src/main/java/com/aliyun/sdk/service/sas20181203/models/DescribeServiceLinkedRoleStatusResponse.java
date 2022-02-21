// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceLinkedRoleStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeServiceLinkedRoleStatusResponse</p>
 */
public class DescribeServiceLinkedRoleStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeServiceLinkedRoleStatusResponseBody body;

    private DescribeServiceLinkedRoleStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeServiceLinkedRoleStatusResponse create() {
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
    public DescribeServiceLinkedRoleStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeServiceLinkedRoleStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeServiceLinkedRoleStatusResponseBody body);

        @Override
        DescribeServiceLinkedRoleStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeServiceLinkedRoleStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeServiceLinkedRoleStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeServiceLinkedRoleStatusResponse response) {
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
        public Builder body(DescribeServiceLinkedRoleStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeServiceLinkedRoleStatusResponse build() {
            return new DescribeServiceLinkedRoleStatusResponse(this);
        } 

    } 

}
