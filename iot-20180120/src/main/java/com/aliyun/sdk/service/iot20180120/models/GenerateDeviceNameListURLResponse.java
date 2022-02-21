// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateDeviceNameListURLResponse} extends {@link TeaModel}
 *
 * <p>GenerateDeviceNameListURLResponse</p>
 */
public class GenerateDeviceNameListURLResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateDeviceNameListURLResponseBody body;

    private GenerateDeviceNameListURLResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateDeviceNameListURLResponse create() {
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
    public GenerateDeviceNameListURLResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateDeviceNameListURLResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateDeviceNameListURLResponseBody body);

        @Override
        GenerateDeviceNameListURLResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateDeviceNameListURLResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateDeviceNameListURLResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateDeviceNameListURLResponse response) {
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
        public Builder body(GenerateDeviceNameListURLResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateDeviceNameListURLResponse build() {
            return new GenerateDeviceNameListURLResponse(this);
        } 

    } 

}
