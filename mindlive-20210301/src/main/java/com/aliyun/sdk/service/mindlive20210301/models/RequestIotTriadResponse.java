// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestIotTriadResponse} extends {@link TeaModel}
 *
 * <p>RequestIotTriadResponse</p>
 */
public class RequestIotTriadResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private RequestIotTriadResponseBody body;

    private RequestIotTriadResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RequestIotTriadResponse create() {
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
    public RequestIotTriadResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RequestIotTriadResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RequestIotTriadResponseBody body);

        @Override
        RequestIotTriadResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RequestIotTriadResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RequestIotTriadResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RequestIotTriadResponse response) {
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
        public Builder body(RequestIotTriadResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RequestIotTriadResponse build() {
            return new RequestIotTriadResponse(this);
        } 

    } 

}
