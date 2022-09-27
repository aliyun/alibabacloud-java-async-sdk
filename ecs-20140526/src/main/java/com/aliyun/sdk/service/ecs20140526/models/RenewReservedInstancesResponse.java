// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewReservedInstancesResponse} extends {@link TeaModel}
 *
 * <p>RenewReservedInstancesResponse</p>
 */
public class RenewReservedInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RenewReservedInstancesResponseBody body;

    private RenewReservedInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RenewReservedInstancesResponse create() {
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
    public RenewReservedInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RenewReservedInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RenewReservedInstancesResponseBody body);

        @Override
        RenewReservedInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RenewReservedInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RenewReservedInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RenewReservedInstancesResponse response) {
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
        public Builder body(RenewReservedInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RenewReservedInstancesResponse build() {
            return new RenewReservedInstancesResponse(this);
        } 

    } 

}
