// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExportProgressResponse} extends {@link TeaModel}
 *
 * <p>DescribeExportProgressResponse</p>
 */
public class DescribeExportProgressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeExportProgressResponseBody body;

    private DescribeExportProgressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeExportProgressResponse create() {
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
    public DescribeExportProgressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeExportProgressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeExportProgressResponseBody body);

        @Override
        DescribeExportProgressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeExportProgressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeExportProgressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeExportProgressResponse response) {
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
        public Builder body(DescribeExportProgressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeExportProgressResponse build() {
            return new DescribeExportProgressResponse(this);
        } 

    } 

}
