// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteReservationDemandResponse} extends {@link TeaModel}
 *
 * <p>DeleteReservationDemandResponse</p>
 */
public class DeleteReservationDemandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteReservationDemandResponseBody body;

    private DeleteReservationDemandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteReservationDemandResponse create() {
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
    public DeleteReservationDemandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteReservationDemandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteReservationDemandResponseBody body);

        @Override
        DeleteReservationDemandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteReservationDemandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteReservationDemandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteReservationDemandResponse response) {
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
        public Builder body(DeleteReservationDemandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteReservationDemandResponse build() {
            return new DeleteReservationDemandResponse(this);
        } 

    } 

}
