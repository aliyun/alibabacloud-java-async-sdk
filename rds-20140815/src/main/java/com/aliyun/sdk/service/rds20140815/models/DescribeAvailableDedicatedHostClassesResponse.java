// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableDedicatedHostClassesResponse} extends {@link TeaModel}
 *
 * <p>DescribeAvailableDedicatedHostClassesResponse</p>
 */
public class DescribeAvailableDedicatedHostClassesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAvailableDedicatedHostClassesResponseBody body;

    private DescribeAvailableDedicatedHostClassesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAvailableDedicatedHostClassesResponse create() {
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
    public DescribeAvailableDedicatedHostClassesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAvailableDedicatedHostClassesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAvailableDedicatedHostClassesResponseBody body);

        @Override
        DescribeAvailableDedicatedHostClassesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAvailableDedicatedHostClassesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAvailableDedicatedHostClassesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAvailableDedicatedHostClassesResponse response) {
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
        public Builder body(DescribeAvailableDedicatedHostClassesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAvailableDedicatedHostClassesResponse build() {
            return new DescribeAvailableDedicatedHostClassesResponse(this);
        } 

    } 

}
