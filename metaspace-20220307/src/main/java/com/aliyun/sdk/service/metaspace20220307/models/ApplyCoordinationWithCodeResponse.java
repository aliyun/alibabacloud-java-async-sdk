// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.metaspace20220307.models;

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
 * {@link ApplyCoordinationWithCodeResponse} extends {@link TeaModel}
 *
 * <p>ApplyCoordinationWithCodeResponse</p>
 */
public class ApplyCoordinationWithCodeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ApplyCoordinationWithCodeResponseBody body;

    private ApplyCoordinationWithCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ApplyCoordinationWithCodeResponse create() {
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
    public ApplyCoordinationWithCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApplyCoordinationWithCodeResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ApplyCoordinationWithCodeResponseBody body);

        @Override
        ApplyCoordinationWithCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApplyCoordinationWithCodeResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ApplyCoordinationWithCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApplyCoordinationWithCodeResponse response) {
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
        public Builder body(ApplyCoordinationWithCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApplyCoordinationWithCodeResponse build() {
            return new ApplyCoordinationWithCodeResponse(this);
        } 

    } 

}
