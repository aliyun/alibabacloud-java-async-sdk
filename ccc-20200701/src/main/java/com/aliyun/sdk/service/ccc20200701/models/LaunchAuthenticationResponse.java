// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LaunchAuthenticationResponse} extends {@link TeaModel}
 *
 * <p>LaunchAuthenticationResponse</p>
 */
public class LaunchAuthenticationResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private LaunchAuthenticationResponseBody body;

    private LaunchAuthenticationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static LaunchAuthenticationResponse create() {
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
    public LaunchAuthenticationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LaunchAuthenticationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(LaunchAuthenticationResponseBody body);

        @Override
        LaunchAuthenticationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LaunchAuthenticationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private LaunchAuthenticationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LaunchAuthenticationResponse response) {
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
        public Builder body(LaunchAuthenticationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LaunchAuthenticationResponse build() {
            return new LaunchAuthenticationResponse(this);
        } 

    } 

}
