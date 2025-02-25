// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveAppAuthTokenResponse} extends {@link TeaModel}
 *
 * <p>SaveAppAuthTokenResponse</p>
 */
public class SaveAppAuthTokenResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private SaveAppAuthTokenResponseBody body;

    private SaveAppAuthTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SaveAppAuthTokenResponse create() {
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
    public SaveAppAuthTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveAppAuthTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SaveAppAuthTokenResponseBody body);

        @Override
        SaveAppAuthTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveAppAuthTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SaveAppAuthTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveAppAuthTokenResponse response) {
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
        public Builder body(SaveAppAuthTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveAppAuthTokenResponse build() {
            return new SaveAppAuthTokenResponse(this);
        } 

    } 

}
