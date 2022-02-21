// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckFaceUserDoExistOnDeviceResponse} extends {@link TeaModel}
 *
 * <p>CheckFaceUserDoExistOnDeviceResponse</p>
 */
public class CheckFaceUserDoExistOnDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckFaceUserDoExistOnDeviceResponseBody body;

    private CheckFaceUserDoExistOnDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckFaceUserDoExistOnDeviceResponse create() {
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
    public CheckFaceUserDoExistOnDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckFaceUserDoExistOnDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckFaceUserDoExistOnDeviceResponseBody body);

        @Override
        CheckFaceUserDoExistOnDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckFaceUserDoExistOnDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckFaceUserDoExistOnDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckFaceUserDoExistOnDeviceResponse response) {
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
        public Builder body(CheckFaceUserDoExistOnDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckFaceUserDoExistOnDeviceResponse build() {
            return new CheckFaceUserDoExistOnDeviceResponse(this);
        } 

    } 

}
