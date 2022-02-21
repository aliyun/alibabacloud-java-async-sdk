// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceModelResponse} extends {@link TeaModel}
 *
 * <p>ListDeviceModelResponse</p>
 */
public class ListDeviceModelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDeviceModelResponseBody body;

    private ListDeviceModelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDeviceModelResponse create() {
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
    public ListDeviceModelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDeviceModelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDeviceModelResponseBody body);

        @Override
        ListDeviceModelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDeviceModelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDeviceModelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDeviceModelResponse response) {
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
        public Builder body(ListDeviceModelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDeviceModelResponse build() {
            return new ListDeviceModelResponse(this);
        } 

    } 

}
