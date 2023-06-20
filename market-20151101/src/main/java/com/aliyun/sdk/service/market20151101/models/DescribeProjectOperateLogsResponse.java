// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProjectOperateLogsResponse} extends {@link TeaModel}
 *
 * <p>DescribeProjectOperateLogsResponse</p>
 */
public class DescribeProjectOperateLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeProjectOperateLogsResponseBody body;

    private DescribeProjectOperateLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeProjectOperateLogsResponse create() {
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
    public DescribeProjectOperateLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeProjectOperateLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeProjectOperateLogsResponseBody body);

        @Override
        DescribeProjectOperateLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeProjectOperateLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeProjectOperateLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeProjectOperateLogsResponse response) {
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
        public Builder body(DescribeProjectOperateLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeProjectOperateLogsResponse build() {
            return new DescribeProjectOperateLogsResponse(this);
        } 

    } 

}
