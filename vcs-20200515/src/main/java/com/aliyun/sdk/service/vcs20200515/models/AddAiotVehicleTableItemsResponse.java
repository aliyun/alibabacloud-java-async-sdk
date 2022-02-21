// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAiotVehicleTableItemsResponse} extends {@link TeaModel}
 *
 * <p>AddAiotVehicleTableItemsResponse</p>
 */
public class AddAiotVehicleTableItemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddAiotVehicleTableItemsResponseBody body;

    private AddAiotVehicleTableItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddAiotVehicleTableItemsResponse create() {
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
    public AddAiotVehicleTableItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddAiotVehicleTableItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddAiotVehicleTableItemsResponseBody body);

        @Override
        AddAiotVehicleTableItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddAiotVehicleTableItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddAiotVehicleTableItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddAiotVehicleTableItemsResponse response) {
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
        public Builder body(AddAiotVehicleTableItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddAiotVehicleTableItemsResponse build() {
            return new AddAiotVehicleTableItemsResponse(this);
        } 

    } 

}
