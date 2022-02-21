// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNewProjectEipMonitorDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeNewProjectEipMonitorDataResponse</p>
 */
public class DescribeNewProjectEipMonitorDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeNewProjectEipMonitorDataResponseBody body;

    private DescribeNewProjectEipMonitorDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeNewProjectEipMonitorDataResponse create() {
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
    public DescribeNewProjectEipMonitorDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNewProjectEipMonitorDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeNewProjectEipMonitorDataResponseBody body);

        @Override
        DescribeNewProjectEipMonitorDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNewProjectEipMonitorDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeNewProjectEipMonitorDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNewProjectEipMonitorDataResponse response) {
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
        public Builder body(DescribeNewProjectEipMonitorDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNewProjectEipMonitorDataResponse build() {
            return new DescribeNewProjectEipMonitorDataResponse(this);
        } 

    } 

}
