// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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
 * {@link OpenDomainSlsConfigResponse} extends {@link TeaModel}
 *
 * <p>OpenDomainSlsConfigResponse</p>
 */
public class OpenDomainSlsConfigResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private OpenDomainSlsConfigResponseBody body;

    private OpenDomainSlsConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static OpenDomainSlsConfigResponse create() {
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
    public OpenDomainSlsConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenDomainSlsConfigResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(OpenDomainSlsConfigResponseBody body);

        @Override
        OpenDomainSlsConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenDomainSlsConfigResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private OpenDomainSlsConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenDomainSlsConfigResponse response) {
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
        public Builder body(OpenDomainSlsConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenDomainSlsConfigResponse build() {
            return new OpenDomainSlsConfigResponse(this);
        } 

    } 

}
