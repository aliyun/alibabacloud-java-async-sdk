// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobResourceUsageResponse} extends {@link TeaModel}
 *
 * <p>DescribeJobResourceUsageResponse</p>
 */
public class DescribeJobResourceUsageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeJobResourceUsageResponseBody body;

    private DescribeJobResourceUsageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeJobResourceUsageResponse create() {
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
    public DescribeJobResourceUsageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeJobResourceUsageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeJobResourceUsageResponseBody body);

        @Override
        DescribeJobResourceUsageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeJobResourceUsageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeJobResourceUsageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeJobResourceUsageResponse response) {
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
        public Builder body(DescribeJobResourceUsageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeJobResourceUsageResponse build() {
            return new DescribeJobResourceUsageResponse(this);
        } 

    } 

}
