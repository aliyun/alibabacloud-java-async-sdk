// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindParentPlatformDeviceResponse} extends {@link TeaModel}
 *
 * <p>UnbindParentPlatformDeviceResponse</p>
 */
public class UnbindParentPlatformDeviceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UnbindParentPlatformDeviceResponseBody body;

    private UnbindParentPlatformDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UnbindParentPlatformDeviceResponse create() {
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
    public UnbindParentPlatformDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindParentPlatformDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UnbindParentPlatformDeviceResponseBody body);

        @Override
        UnbindParentPlatformDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindParentPlatformDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UnbindParentPlatformDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindParentPlatformDeviceResponse response) {
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
        public Builder body(UnbindParentPlatformDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindParentPlatformDeviceResponse build() {
            return new UnbindParentPlatformDeviceResponse(this);
        } 

    } 

}
