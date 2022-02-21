// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEdgeDevicesResponse} extends {@link TeaModel}
 *
 * <p>ListEdgeDevicesResponse</p>
 */
public class ListEdgeDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEdgeDevicesResponseBody body;

    private ListEdgeDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEdgeDevicesResponse create() {
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
    public ListEdgeDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEdgeDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEdgeDevicesResponseBody body);

        @Override
        ListEdgeDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEdgeDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEdgeDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEdgeDevicesResponse response) {
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
        public Builder body(ListEdgeDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEdgeDevicesResponse build() {
            return new ListEdgeDevicesResponse(this);
        } 

    } 

}
