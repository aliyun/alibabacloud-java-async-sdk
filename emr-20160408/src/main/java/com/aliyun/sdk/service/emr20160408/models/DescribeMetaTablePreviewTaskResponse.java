// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetaTablePreviewTaskResponse} extends {@link TeaModel}
 *
 * <p>DescribeMetaTablePreviewTaskResponse</p>
 */
public class DescribeMetaTablePreviewTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMetaTablePreviewTaskResponseBody body;

    private DescribeMetaTablePreviewTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMetaTablePreviewTaskResponse create() {
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
    public DescribeMetaTablePreviewTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMetaTablePreviewTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMetaTablePreviewTaskResponseBody body);

        @Override
        DescribeMetaTablePreviewTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMetaTablePreviewTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMetaTablePreviewTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMetaTablePreviewTaskResponse response) {
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
        public Builder body(DescribeMetaTablePreviewTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMetaTablePreviewTaskResponse build() {
            return new DescribeMetaTablePreviewTaskResponse(this);
        } 

    } 

}
