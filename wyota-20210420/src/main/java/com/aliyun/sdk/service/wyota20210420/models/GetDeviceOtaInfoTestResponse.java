// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDeviceOtaInfoTestResponse} extends {@link TeaModel}
 *
 * <p>GetDeviceOtaInfoTestResponse</p>
 */
public class GetDeviceOtaInfoTestResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetDeviceOtaInfoTestResponseBody body;

    private GetDeviceOtaInfoTestResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetDeviceOtaInfoTestResponse create() {
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
    public GetDeviceOtaInfoTestResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDeviceOtaInfoTestResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetDeviceOtaInfoTestResponseBody body);

        @Override
        GetDeviceOtaInfoTestResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDeviceOtaInfoTestResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetDeviceOtaInfoTestResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDeviceOtaInfoTestResponse response) {
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
        public Builder body(GetDeviceOtaInfoTestResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDeviceOtaInfoTestResponse build() {
            return new GetDeviceOtaInfoTestResponse(this);
        } 

    } 

}
