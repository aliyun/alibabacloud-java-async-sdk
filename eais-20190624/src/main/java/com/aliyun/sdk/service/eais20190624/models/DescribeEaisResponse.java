// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEaisResponse} extends {@link TeaModel}
 *
 * <p>DescribeEaisResponse</p>
 */
public class DescribeEaisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEaisResponseBody body;

    private DescribeEaisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEaisResponse create() {
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
    public DescribeEaisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEaisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEaisResponseBody body);

        @Override
        DescribeEaisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEaisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEaisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEaisResponse response) {
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
        public Builder body(DescribeEaisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEaisResponse build() {
            return new DescribeEaisResponse(this);
        } 

    } 

}
