// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAiotVehicleTableItemResponse} extends {@link TeaModel}
 *
 * <p>UpdateAiotVehicleTableItemResponse</p>
 */
public class UpdateAiotVehicleTableItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAiotVehicleTableItemResponseBody body;

    private UpdateAiotVehicleTableItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAiotVehicleTableItemResponse create() {
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
    public UpdateAiotVehicleTableItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAiotVehicleTableItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAiotVehicleTableItemResponseBody body);

        @Override
        UpdateAiotVehicleTableItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAiotVehicleTableItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAiotVehicleTableItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAiotVehicleTableItemResponse response) {
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
        public Builder body(UpdateAiotVehicleTableItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAiotVehicleTableItemResponse build() {
            return new UpdateAiotVehicleTableItemResponse(this);
        } 

    } 

}
