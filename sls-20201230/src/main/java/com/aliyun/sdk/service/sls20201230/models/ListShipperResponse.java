// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListShipperResponse} extends {@link TeaModel}
 *
 * <p>ListShipperResponse</p>
 */
public class ListShipperResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListShipperResponseBody body;

    private ListShipperResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListShipperResponse create() {
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
    public ListShipperResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListShipperResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListShipperResponseBody body);

        @Override
        ListShipperResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListShipperResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListShipperResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListShipperResponse response) {
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
        public Builder body(ListShipperResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListShipperResponse build() {
            return new ListShipperResponse(this);
        } 

    } 

}
