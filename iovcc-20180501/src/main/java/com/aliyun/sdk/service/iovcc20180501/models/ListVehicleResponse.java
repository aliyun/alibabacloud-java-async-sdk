// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVehicleResponse} extends {@link TeaModel}
 *
 * <p>ListVehicleResponse</p>
 */
public class ListVehicleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVehicleResponseBody body;

    private ListVehicleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVehicleResponse create() {
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
    public ListVehicleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVehicleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVehicleResponseBody body);

        @Override
        ListVehicleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVehicleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVehicleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVehicleResponse response) {
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
        public Builder body(ListVehicleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVehicleResponse build() {
            return new ListVehicleResponse(this);
        } 

    } 

}
