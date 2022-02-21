// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDeviceDesiredPropertyResponse} extends {@link TeaModel}
 *
 * <p>SetDeviceDesiredPropertyResponse</p>
 */
public class SetDeviceDesiredPropertyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDeviceDesiredPropertyResponseBody body;

    private SetDeviceDesiredPropertyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDeviceDesiredPropertyResponse create() {
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
    public SetDeviceDesiredPropertyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDeviceDesiredPropertyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDeviceDesiredPropertyResponseBody body);

        @Override
        SetDeviceDesiredPropertyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDeviceDesiredPropertyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDeviceDesiredPropertyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDeviceDesiredPropertyResponse response) {
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
        public Builder body(SetDeviceDesiredPropertyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDeviceDesiredPropertyResponse build() {
            return new SetDeviceDesiredPropertyResponse(this);
        } 

    } 

}
