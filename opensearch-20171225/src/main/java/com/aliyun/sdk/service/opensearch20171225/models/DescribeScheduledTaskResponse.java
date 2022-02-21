// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScheduledTaskResponse} extends {@link TeaModel}
 *
 * <p>DescribeScheduledTaskResponse</p>
 */
public class DescribeScheduledTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeScheduledTaskResponseBody body;

    private DescribeScheduledTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeScheduledTaskResponse create() {
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
    public DescribeScheduledTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeScheduledTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeScheduledTaskResponseBody body);

        @Override
        DescribeScheduledTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeScheduledTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeScheduledTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeScheduledTaskResponse response) {
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
        public Builder body(DescribeScheduledTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeScheduledTaskResponse build() {
            return new DescribeScheduledTaskResponse(this);
        } 

    } 

}
