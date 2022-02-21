// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIllegalUrlExportTaskResponse} extends {@link TeaModel}
 *
 * <p>DescribeIllegalUrlExportTaskResponse</p>
 */
public class DescribeIllegalUrlExportTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeIllegalUrlExportTaskResponseBody body;

    private DescribeIllegalUrlExportTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeIllegalUrlExportTaskResponse create() {
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
    public DescribeIllegalUrlExportTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIllegalUrlExportTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeIllegalUrlExportTaskResponseBody body);

        @Override
        DescribeIllegalUrlExportTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIllegalUrlExportTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeIllegalUrlExportTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIllegalUrlExportTaskResponse response) {
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
        public Builder body(DescribeIllegalUrlExportTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIllegalUrlExportTaskResponse build() {
            return new DescribeIllegalUrlExportTaskResponse(this);
        } 

    } 

}
