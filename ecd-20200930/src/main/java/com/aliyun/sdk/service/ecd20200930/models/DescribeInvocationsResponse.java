// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInvocationsResponse} extends {@link TeaModel}
 *
 * <p>DescribeInvocationsResponse</p>
 */
public class DescribeInvocationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeInvocationsResponseBody body;

    private DescribeInvocationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeInvocationsResponse create() {
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
    public DescribeInvocationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInvocationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeInvocationsResponseBody body);

        @Override
        DescribeInvocationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInvocationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeInvocationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInvocationsResponse response) {
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
        public Builder body(DescribeInvocationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInvocationsResponse build() {
            return new DescribeInvocationsResponse(this);
        } 

    } 

}
