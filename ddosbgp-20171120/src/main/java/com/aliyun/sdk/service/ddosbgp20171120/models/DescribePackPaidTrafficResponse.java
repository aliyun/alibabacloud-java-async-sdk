// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePackPaidTrafficResponse} extends {@link TeaModel}
 *
 * <p>DescribePackPaidTrafficResponse</p>
 */
public class DescribePackPaidTrafficResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePackPaidTrafficResponseBody body;

    private DescribePackPaidTrafficResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePackPaidTrafficResponse create() {
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
    public DescribePackPaidTrafficResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePackPaidTrafficResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePackPaidTrafficResponseBody body);

        @Override
        DescribePackPaidTrafficResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePackPaidTrafficResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePackPaidTrafficResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePackPaidTrafficResponse response) {
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
        public Builder body(DescribePackPaidTrafficResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePackPaidTrafficResponse build() {
            return new DescribePackPaidTrafficResponse(this);
        } 

    } 

}
