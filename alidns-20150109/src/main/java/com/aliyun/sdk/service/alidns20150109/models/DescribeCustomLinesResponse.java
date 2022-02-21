// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomLinesResponse} extends {@link TeaModel}
 *
 * <p>DescribeCustomLinesResponse</p>
 */
public class DescribeCustomLinesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCustomLinesResponseBody body;

    private DescribeCustomLinesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCustomLinesResponse create() {
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
    public DescribeCustomLinesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCustomLinesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCustomLinesResponseBody body);

        @Override
        DescribeCustomLinesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCustomLinesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCustomLinesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCustomLinesResponse response) {
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
        public Builder body(DescribeCustomLinesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCustomLinesResponse build() {
            return new DescribeCustomLinesResponse(this);
        } 

    } 

}
