// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link AttachInstanceSDGResponse} extends {@link TeaModel}
 *
 * <p>AttachInstanceSDGResponse</p>
 */
public class AttachInstanceSDGResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AttachInstanceSDGResponseBody body;

    private AttachInstanceSDGResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AttachInstanceSDGResponse create() {
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
    public AttachInstanceSDGResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachInstanceSDGResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(AttachInstanceSDGResponseBody body);

        @Override
        AttachInstanceSDGResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachInstanceSDGResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private AttachInstanceSDGResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachInstanceSDGResponse response) {
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
        public Builder body(AttachInstanceSDGResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachInstanceSDGResponse build() {
            return new AttachInstanceSDGResponse(this);
        } 

    } 

}
