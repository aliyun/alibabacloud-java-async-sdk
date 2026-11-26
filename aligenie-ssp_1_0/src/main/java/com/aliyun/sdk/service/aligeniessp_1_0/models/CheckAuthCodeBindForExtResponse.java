// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link CheckAuthCodeBindForExtResponse} extends {@link TeaModel}
 *
 * <p>CheckAuthCodeBindForExtResponse</p>
 */
public class CheckAuthCodeBindForExtResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CheckAuthCodeBindForExtResponseBody body;

    private CheckAuthCodeBindForExtResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CheckAuthCodeBindForExtResponse create() {
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
    public CheckAuthCodeBindForExtResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckAuthCodeBindForExtResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CheckAuthCodeBindForExtResponseBody body);

        @Override
        CheckAuthCodeBindForExtResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckAuthCodeBindForExtResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CheckAuthCodeBindForExtResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckAuthCodeBindForExtResponse response) {
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
        public Builder body(CheckAuthCodeBindForExtResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckAuthCodeBindForExtResponse build() {
            return new CheckAuthCodeBindForExtResponse(this);
        } 

    } 

}
