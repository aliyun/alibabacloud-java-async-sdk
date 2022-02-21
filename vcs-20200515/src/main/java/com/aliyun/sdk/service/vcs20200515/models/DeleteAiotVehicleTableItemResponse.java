// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAiotVehicleTableItemResponse} extends {@link TeaModel}
 *
 * <p>DeleteAiotVehicleTableItemResponse</p>
 */
public class DeleteAiotVehicleTableItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAiotVehicleTableItemResponseBody body;

    private DeleteAiotVehicleTableItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAiotVehicleTableItemResponse create() {
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
    public DeleteAiotVehicleTableItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAiotVehicleTableItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAiotVehicleTableItemResponseBody body);

        @Override
        DeleteAiotVehicleTableItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAiotVehicleTableItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAiotVehicleTableItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAiotVehicleTableItemResponse response) {
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
        public Builder body(DeleteAiotVehicleTableItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAiotVehicleTableItemResponse build() {
            return new DeleteAiotVehicleTableItemResponse(this);
        } 

    } 

}
