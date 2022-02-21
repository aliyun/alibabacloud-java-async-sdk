// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClientPackageResponse} extends {@link TeaModel}
 *
 * <p>DescribeClientPackageResponse</p>
 */
public class DescribeClientPackageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClientPackageResponseBody body;

    private DescribeClientPackageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClientPackageResponse create() {
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
    public DescribeClientPackageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClientPackageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClientPackageResponseBody body);

        @Override
        DescribeClientPackageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClientPackageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClientPackageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClientPackageResponse response) {
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
        public Builder body(DescribeClientPackageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClientPackageResponse build() {
            return new DescribeClientPackageResponse(this);
        } 

    } 

}
