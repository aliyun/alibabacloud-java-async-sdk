// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobDataParsingTaskProgressResponse} extends {@link TeaModel}
 *
 * <p>DescribeJobDataParsingTaskProgressResponse</p>
 */
public class DescribeJobDataParsingTaskProgressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeJobDataParsingTaskProgressResponseBody body;

    private DescribeJobDataParsingTaskProgressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeJobDataParsingTaskProgressResponse create() {
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
    public DescribeJobDataParsingTaskProgressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeJobDataParsingTaskProgressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeJobDataParsingTaskProgressResponseBody body);

        @Override
        DescribeJobDataParsingTaskProgressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeJobDataParsingTaskProgressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeJobDataParsingTaskProgressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeJobDataParsingTaskProgressResponse response) {
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
        public Builder body(DescribeJobDataParsingTaskProgressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeJobDataParsingTaskProgressResponse build() {
            return new DescribeJobDataParsingTaskProgressResponse(this);
        } 

    } 

}
