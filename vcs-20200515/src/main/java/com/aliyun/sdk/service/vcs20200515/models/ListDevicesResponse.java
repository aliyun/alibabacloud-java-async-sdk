// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDevicesResponse} extends {@link TeaModel}
 *
 * <p>ListDevicesResponse</p>
 */
public class ListDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDevicesResponseBody body;

    private ListDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDevicesResponse create() {
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
    public ListDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDevicesResponseBody body);

        @Override
        ListDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDevicesResponse response) {
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
        public Builder body(ListDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDevicesResponse build() {
            return new ListDevicesResponse(this);
        } 

    } 

}
