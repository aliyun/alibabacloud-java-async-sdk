// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoProvisioningGroupCapacitiesResponse} extends {@link TeaModel}
 *
 * <p>DescribeAutoProvisioningGroupCapacitiesResponse</p>
 */
public class DescribeAutoProvisioningGroupCapacitiesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAutoProvisioningGroupCapacitiesResponseBody body;

    private DescribeAutoProvisioningGroupCapacitiesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAutoProvisioningGroupCapacitiesResponse create() {
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
    public DescribeAutoProvisioningGroupCapacitiesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAutoProvisioningGroupCapacitiesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAutoProvisioningGroupCapacitiesResponseBody body);

        @Override
        DescribeAutoProvisioningGroupCapacitiesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAutoProvisioningGroupCapacitiesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAutoProvisioningGroupCapacitiesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAutoProvisioningGroupCapacitiesResponse response) {
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
        public Builder body(DescribeAutoProvisioningGroupCapacitiesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAutoProvisioningGroupCapacitiesResponse build() {
            return new DescribeAutoProvisioningGroupCapacitiesResponse(this);
        } 

    } 

}
