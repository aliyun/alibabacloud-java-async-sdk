// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDevicesPropertyResponse} extends {@link TeaModel}
 *
 * <p>SetDevicesPropertyResponse</p>
 */
public class SetDevicesPropertyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDevicesPropertyResponseBody body;

    private SetDevicesPropertyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDevicesPropertyResponse create() {
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
    public SetDevicesPropertyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDevicesPropertyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDevicesPropertyResponseBody body);

        @Override
        SetDevicesPropertyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDevicesPropertyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDevicesPropertyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDevicesPropertyResponse response) {
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
        public Builder body(SetDevicesPropertyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDevicesPropertyResponse build() {
            return new SetDevicesPropertyResponse(this);
        } 

    } 

}
