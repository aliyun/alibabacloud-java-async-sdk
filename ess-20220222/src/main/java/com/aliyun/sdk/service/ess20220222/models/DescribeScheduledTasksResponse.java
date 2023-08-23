// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScheduledTasksResponse} extends {@link TeaModel}
 *
 * <p>DescribeScheduledTasksResponse</p>
 */
public class DescribeScheduledTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeScheduledTasksResponseBody body;

    private DescribeScheduledTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeScheduledTasksResponse create() {
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
    public DescribeScheduledTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeScheduledTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeScheduledTasksResponseBody body);

        @Override
        DescribeScheduledTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeScheduledTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeScheduledTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeScheduledTasksResponse response) {
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
        public Builder body(DescribeScheduledTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeScheduledTasksResponse build() {
            return new DescribeScheduledTasksResponse(this);
        } 

    } 

}
