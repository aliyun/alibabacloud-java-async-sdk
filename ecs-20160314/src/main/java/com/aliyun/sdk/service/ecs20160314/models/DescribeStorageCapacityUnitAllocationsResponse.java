// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStorageCapacityUnitAllocationsResponse} extends {@link TeaModel}
 *
 * <p>DescribeStorageCapacityUnitAllocationsResponse</p>
 */
public class DescribeStorageCapacityUnitAllocationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeStorageCapacityUnitAllocationsResponseBody body;

    private DescribeStorageCapacityUnitAllocationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeStorageCapacityUnitAllocationsResponse create() {
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
    public DescribeStorageCapacityUnitAllocationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeStorageCapacityUnitAllocationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeStorageCapacityUnitAllocationsResponseBody body);

        @Override
        DescribeStorageCapacityUnitAllocationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeStorageCapacityUnitAllocationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeStorageCapacityUnitAllocationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeStorageCapacityUnitAllocationsResponse response) {
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
        public Builder body(DescribeStorageCapacityUnitAllocationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeStorageCapacityUnitAllocationsResponse build() {
            return new DescribeStorageCapacityUnitAllocationsResponse(this);
        } 

    } 

}
