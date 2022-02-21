// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMaintenanceActionResponse} extends {@link TeaModel}
 *
 * <p>DescribeMaintenanceActionResponse</p>
 */
public class DescribeMaintenanceActionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMaintenanceActionResponseBody body;

    private DescribeMaintenanceActionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMaintenanceActionResponse create() {
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
    public DescribeMaintenanceActionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMaintenanceActionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMaintenanceActionResponseBody body);

        @Override
        DescribeMaintenanceActionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMaintenanceActionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMaintenanceActionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMaintenanceActionResponse response) {
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
        public Builder body(DescribeMaintenanceActionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMaintenanceActionResponse build() {
            return new DescribeMaintenanceActionResponse(this);
        } 

    } 

}
