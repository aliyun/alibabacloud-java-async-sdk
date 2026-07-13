// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RevokeAtiRegistrantResponse} extends {@link TeaModel}
 *
 * <p>RevokeAtiRegistrantResponse</p>
 */
public class RevokeAtiRegistrantResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RevokeAtiRegistrantResponseBody body;

    private RevokeAtiRegistrantResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RevokeAtiRegistrantResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public RevokeAtiRegistrantResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokeAtiRegistrantResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(RevokeAtiRegistrantResponseBody body);

        @Override
        RevokeAtiRegistrantResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokeAtiRegistrantResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private RevokeAtiRegistrantResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokeAtiRegistrantResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(RevokeAtiRegistrantResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokeAtiRegistrantResponse build() {
            return new RevokeAtiRegistrantResponse(this);
        } 

    } 

}
