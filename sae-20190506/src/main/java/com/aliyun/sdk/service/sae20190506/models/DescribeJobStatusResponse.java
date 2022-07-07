// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeJobStatusResponse</p>
 */
public class DescribeJobStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeJobStatusResponseBody body;

    private DescribeJobStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeJobStatusResponse create() {
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
    public DescribeJobStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeJobStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeJobStatusResponseBody body);

        @Override
        DescribeJobStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeJobStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeJobStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeJobStatusResponse response) {
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
        public Builder body(DescribeJobStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeJobStatusResponse build() {
            return new DescribeJobStatusResponse(this);
        } 

    } 

}
