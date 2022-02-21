// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddVersionBlackDevicesResponse} extends {@link TeaModel}
 *
 * <p>AddVersionBlackDevicesResponse</p>
 */
public class AddVersionBlackDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddVersionBlackDevicesResponseBody body;

    private AddVersionBlackDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddVersionBlackDevicesResponse create() {
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
    public AddVersionBlackDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddVersionBlackDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddVersionBlackDevicesResponseBody body);

        @Override
        AddVersionBlackDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddVersionBlackDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddVersionBlackDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddVersionBlackDevicesResponse response) {
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
        public Builder body(AddVersionBlackDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddVersionBlackDevicesResponse build() {
            return new AddVersionBlackDevicesResponse(this);
        } 

    } 

}
