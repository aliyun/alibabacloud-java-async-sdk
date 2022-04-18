// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePackagesResponse} extends {@link TeaModel}
 *
 * <p>DescribePackagesResponse</p>
 */
public class DescribePackagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePackagesResponseBody body;

    private DescribePackagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePackagesResponse create() {
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
    public DescribePackagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePackagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePackagesResponseBody body);

        @Override
        DescribePackagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePackagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePackagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePackagesResponse response) {
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
        public Builder body(DescribePackagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePackagesResponse build() {
            return new DescribePackagesResponse(this);
        } 

    } 

}
