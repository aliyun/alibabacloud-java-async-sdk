// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link OpenLdpsColumnarIndexResponse} extends {@link TeaModel}
 *
 * <p>OpenLdpsColumnarIndexResponse</p>
 */
public class OpenLdpsColumnarIndexResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private OpenLdpsColumnarIndexResponseBody body;

    private OpenLdpsColumnarIndexResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static OpenLdpsColumnarIndexResponse create() {
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
    public OpenLdpsColumnarIndexResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenLdpsColumnarIndexResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(OpenLdpsColumnarIndexResponseBody body);

        @Override
        OpenLdpsColumnarIndexResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenLdpsColumnarIndexResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private OpenLdpsColumnarIndexResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenLdpsColumnarIndexResponse response) {
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
        public Builder body(OpenLdpsColumnarIndexResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenLdpsColumnarIndexResponse build() {
            return new OpenLdpsColumnarIndexResponse(this);
        } 

    } 

}
