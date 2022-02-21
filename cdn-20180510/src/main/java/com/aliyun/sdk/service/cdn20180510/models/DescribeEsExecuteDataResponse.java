// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEsExecuteDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeEsExecuteDataResponse</p>
 */
public class DescribeEsExecuteDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEsExecuteDataResponseBody body;

    private DescribeEsExecuteDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEsExecuteDataResponse create() {
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
    public DescribeEsExecuteDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEsExecuteDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEsExecuteDataResponseBody body);

        @Override
        DescribeEsExecuteDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEsExecuteDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEsExecuteDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEsExecuteDataResponse response) {
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
        public Builder body(DescribeEsExecuteDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEsExecuteDataResponse build() {
            return new DescribeEsExecuteDataResponse(this);
        } 

    } 

}
