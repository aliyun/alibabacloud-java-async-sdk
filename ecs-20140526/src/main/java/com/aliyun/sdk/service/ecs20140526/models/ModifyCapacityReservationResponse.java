// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCapacityReservationResponse} extends {@link TeaModel}
 *
 * <p>ModifyCapacityReservationResponse</p>
 */
public class ModifyCapacityReservationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyCapacityReservationResponseBody body;

    private ModifyCapacityReservationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyCapacityReservationResponse create() {
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
    public ModifyCapacityReservationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyCapacityReservationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyCapacityReservationResponseBody body);

        @Override
        ModifyCapacityReservationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyCapacityReservationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyCapacityReservationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyCapacityReservationResponse response) {
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
        public Builder body(ModifyCapacityReservationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyCapacityReservationResponse build() {
            return new ModifyCapacityReservationResponse(this);
        } 

    } 

}
