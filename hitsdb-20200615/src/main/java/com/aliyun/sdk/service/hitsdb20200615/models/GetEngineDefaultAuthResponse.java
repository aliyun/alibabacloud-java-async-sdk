// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEngineDefaultAuthResponse} extends {@link TeaModel}
 *
 * <p>GetEngineDefaultAuthResponse</p>
 */
public class GetEngineDefaultAuthResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetEngineDefaultAuthResponseBody body;

    private GetEngineDefaultAuthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetEngineDefaultAuthResponse create() {
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
    public GetEngineDefaultAuthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEngineDefaultAuthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetEngineDefaultAuthResponseBody body);

        @Override
        GetEngineDefaultAuthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEngineDefaultAuthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetEngineDefaultAuthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEngineDefaultAuthResponse response) {
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
        public Builder body(GetEngineDefaultAuthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEngineDefaultAuthResponse build() {
            return new GetEngineDefaultAuthResponse(this);
        } 

    } 

}
