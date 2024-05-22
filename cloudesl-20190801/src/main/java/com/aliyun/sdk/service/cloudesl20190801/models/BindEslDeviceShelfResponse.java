// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindEslDeviceShelfResponse} extends {@link TeaModel}
 *
 * <p>BindEslDeviceShelfResponse</p>
 */
public class BindEslDeviceShelfResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private BindEslDeviceShelfResponseBody body;

    private BindEslDeviceShelfResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static BindEslDeviceShelfResponse create() {
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
    public BindEslDeviceShelfResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindEslDeviceShelfResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(BindEslDeviceShelfResponseBody body);

        @Override
        BindEslDeviceShelfResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindEslDeviceShelfResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private BindEslDeviceShelfResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindEslDeviceShelfResponse response) {
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
        public Builder body(BindEslDeviceShelfResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindEslDeviceShelfResponse build() {
            return new BindEslDeviceShelfResponse(this);
        } 

    } 

}
