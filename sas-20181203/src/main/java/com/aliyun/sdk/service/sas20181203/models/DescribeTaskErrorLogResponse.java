// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTaskErrorLogResponse} extends {@link TeaModel}
 *
 * <p>DescribeTaskErrorLogResponse</p>
 */
public class DescribeTaskErrorLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTaskErrorLogResponseBody body;

    private DescribeTaskErrorLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTaskErrorLogResponse create() {
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
    public DescribeTaskErrorLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTaskErrorLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTaskErrorLogResponseBody body);

        @Override
        DescribeTaskErrorLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTaskErrorLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTaskErrorLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTaskErrorLogResponse response) {
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
        public Builder body(DescribeTaskErrorLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTaskErrorLogResponse build() {
            return new DescribeTaskErrorLogResponse(this);
        } 

    } 

}
