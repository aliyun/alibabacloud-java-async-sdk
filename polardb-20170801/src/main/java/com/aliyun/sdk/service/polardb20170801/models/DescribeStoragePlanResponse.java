// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStoragePlanResponse} extends {@link TeaModel}
 *
 * <p>DescribeStoragePlanResponse</p>
 */
public class DescribeStoragePlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeStoragePlanResponseBody body;

    private DescribeStoragePlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeStoragePlanResponse create() {
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
    public DescribeStoragePlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeStoragePlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeStoragePlanResponseBody body);

        @Override
        DescribeStoragePlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeStoragePlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeStoragePlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeStoragePlanResponse response) {
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
        public Builder body(DescribeStoragePlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeStoragePlanResponse build() {
            return new DescribeStoragePlanResponse(this);
        } 

    } 

}
