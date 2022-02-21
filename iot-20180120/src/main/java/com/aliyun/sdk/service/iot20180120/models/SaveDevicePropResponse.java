// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveDevicePropResponse} extends {@link TeaModel}
 *
 * <p>SaveDevicePropResponse</p>
 */
public class SaveDevicePropResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveDevicePropResponseBody body;

    private SaveDevicePropResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveDevicePropResponse create() {
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
    public SaveDevicePropResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveDevicePropResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveDevicePropResponseBody body);

        @Override
        SaveDevicePropResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveDevicePropResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveDevicePropResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveDevicePropResponse response) {
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
        public Builder body(SaveDevicePropResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveDevicePropResponse build() {
            return new SaveDevicePropResponse(this);
        } 

    } 

}
