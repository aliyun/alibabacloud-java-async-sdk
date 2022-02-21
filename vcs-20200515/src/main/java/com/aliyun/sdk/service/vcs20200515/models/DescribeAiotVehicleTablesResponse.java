// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAiotVehicleTablesResponse} extends {@link TeaModel}
 *
 * <p>DescribeAiotVehicleTablesResponse</p>
 */
public class DescribeAiotVehicleTablesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAiotVehicleTablesResponseBody body;

    private DescribeAiotVehicleTablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAiotVehicleTablesResponse create() {
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
    public DescribeAiotVehicleTablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAiotVehicleTablesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAiotVehicleTablesResponseBody body);

        @Override
        DescribeAiotVehicleTablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAiotVehicleTablesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAiotVehicleTablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAiotVehicleTablesResponse response) {
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
        public Builder body(DescribeAiotVehicleTablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAiotVehicleTablesResponse build() {
            return new DescribeAiotVehicleTablesResponse(this);
        } 

    } 

}
