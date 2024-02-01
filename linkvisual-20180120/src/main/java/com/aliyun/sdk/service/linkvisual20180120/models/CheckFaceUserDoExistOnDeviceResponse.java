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
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private CheckFaceUserDoExistOnDeviceResponseBody body;

    private CheckFaceUserDoExistOnDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public CheckFaceUserDoExistOnDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckFaceUserDoExistOnDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CheckFaceUserDoExistOnDeviceResponseBody body);

        @Override
        CheckFaceUserDoExistOnDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckFaceUserDoExistOnDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CheckFaceUserDoExistOnDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckFaceUserDoExistOnDeviceResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
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
