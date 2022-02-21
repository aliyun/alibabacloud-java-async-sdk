// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHostDevicesResponse} extends {@link TeaModel}
 *
 * <p>ListHostDevicesResponse</p>
 */
public class ListHostDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHostDevicesResponseBody body;

    private ListHostDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHostDevicesResponse create() {
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
    public ListHostDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHostDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHostDevicesResponseBody body);

        @Override
        ListHostDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHostDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHostDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHostDevicesResponse response) {
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
        public Builder body(ListHostDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHostDevicesResponse build() {
            return new ListHostDevicesResponse(this);
        } 

    } 

}
