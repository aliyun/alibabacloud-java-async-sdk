// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHistoryTasksStatResponse} extends {@link TeaModel}
 *
 * <p>DescribeHistoryTasksStatResponse</p>
 */
public class DescribeHistoryTasksStatResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHistoryTasksStatResponseBody body;

    private DescribeHistoryTasksStatResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHistoryTasksStatResponse create() {
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
    public DescribeHistoryTasksStatResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHistoryTasksStatResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHistoryTasksStatResponseBody body);

        @Override
        DescribeHistoryTasksStatResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHistoryTasksStatResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHistoryTasksStatResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHistoryTasksStatResponse response) {
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
        public Builder body(DescribeHistoryTasksStatResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHistoryTasksStatResponse build() {
            return new DescribeHistoryTasksStatResponse(this);
        } 

    } 

}
