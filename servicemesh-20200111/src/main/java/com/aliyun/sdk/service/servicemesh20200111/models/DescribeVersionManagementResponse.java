// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVersionManagementResponse} extends {@link TeaModel}
 *
 * <p>DescribeVersionManagementResponse</p>
 */
public class DescribeVersionManagementResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVersionManagementResponseBody body;

    private DescribeVersionManagementResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVersionManagementResponse create() {
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
    public DescribeVersionManagementResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVersionManagementResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVersionManagementResponseBody body);

        @Override
        DescribeVersionManagementResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVersionManagementResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVersionManagementResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVersionManagementResponse response) {
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
        public Builder body(DescribeVersionManagementResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVersionManagementResponse build() {
            return new DescribeVersionManagementResponse(this);
        } 

    } 

}
