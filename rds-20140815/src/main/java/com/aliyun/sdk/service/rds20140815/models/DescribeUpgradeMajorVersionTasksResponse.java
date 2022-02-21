// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUpgradeMajorVersionTasksResponse} extends {@link TeaModel}
 *
 * <p>DescribeUpgradeMajorVersionTasksResponse</p>
 */
public class DescribeUpgradeMajorVersionTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUpgradeMajorVersionTasksResponseBody body;

    private DescribeUpgradeMajorVersionTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUpgradeMajorVersionTasksResponse create() {
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
    public DescribeUpgradeMajorVersionTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUpgradeMajorVersionTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUpgradeMajorVersionTasksResponseBody body);

        @Override
        DescribeUpgradeMajorVersionTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUpgradeMajorVersionTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUpgradeMajorVersionTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUpgradeMajorVersionTasksResponse response) {
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
        public Builder body(DescribeUpgradeMajorVersionTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUpgradeMajorVersionTasksResponse build() {
            return new DescribeUpgradeMajorVersionTasksResponse(this);
        } 

    } 

}
