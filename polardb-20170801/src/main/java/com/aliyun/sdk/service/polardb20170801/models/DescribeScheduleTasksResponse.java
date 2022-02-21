// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScheduleTasksResponse} extends {@link TeaModel}
 *
 * <p>DescribeScheduleTasksResponse</p>
 */
public class DescribeScheduleTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeScheduleTasksResponseBody body;

    private DescribeScheduleTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeScheduleTasksResponse create() {
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
    public DescribeScheduleTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeScheduleTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeScheduleTasksResponseBody body);

        @Override
        DescribeScheduleTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeScheduleTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeScheduleTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeScheduleTasksResponse response) {
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
        public Builder body(DescribeScheduleTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeScheduleTasksResponse build() {
            return new DescribeScheduleTasksResponse(this);
        } 

    } 

}
