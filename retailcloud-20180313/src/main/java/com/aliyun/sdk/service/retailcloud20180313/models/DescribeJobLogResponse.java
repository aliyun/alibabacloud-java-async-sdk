// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobLogResponse} extends {@link TeaModel}
 *
 * <p>DescribeJobLogResponse</p>
 */
public class DescribeJobLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeJobLogResponseBody body;

    private DescribeJobLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeJobLogResponse create() {
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
    public DescribeJobLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeJobLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeJobLogResponseBody body);

        @Override
        DescribeJobLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeJobLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeJobLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeJobLogResponse response) {
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
        public Builder body(DescribeJobLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeJobLogResponse build() {
            return new DescribeJobLogResponse(this);
        } 

    } 

}
