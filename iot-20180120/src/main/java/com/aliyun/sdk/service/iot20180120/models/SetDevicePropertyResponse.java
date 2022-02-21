// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDevicePropertyResponse} extends {@link TeaModel}
 *
 * <p>SetDevicePropertyResponse</p>
 */
public class SetDevicePropertyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDevicePropertyResponseBody body;

    private SetDevicePropertyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDevicePropertyResponse create() {
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
    public SetDevicePropertyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDevicePropertyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDevicePropertyResponseBody body);

        @Override
        SetDevicePropertyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDevicePropertyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDevicePropertyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDevicePropertyResponse response) {
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
        public Builder body(SetDevicePropertyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDevicePropertyResponse build() {
            return new SetDevicePropertyResponse(this);
        } 

    } 

}
