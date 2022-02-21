// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAiotVehicleTableItemsResponse} extends {@link TeaModel}
 *
 * <p>DescribeAiotVehicleTableItemsResponse</p>
 */
public class DescribeAiotVehicleTableItemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAiotVehicleTableItemsResponseBody body;

    private DescribeAiotVehicleTableItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAiotVehicleTableItemsResponse create() {
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
    public DescribeAiotVehicleTableItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAiotVehicleTableItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAiotVehicleTableItemsResponseBody body);

        @Override
        DescribeAiotVehicleTableItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAiotVehicleTableItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAiotVehicleTableItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAiotVehicleTableItemsResponse response) {
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
        public Builder body(DescribeAiotVehicleTableItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAiotVehicleTableItemsResponse build() {
            return new DescribeAiotVehicleTableItemsResponse(this);
        } 

    } 

}
