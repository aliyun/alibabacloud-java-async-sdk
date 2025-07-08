// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link OpencPrevFlagNewResponse} extends {@link TeaModel}
 *
 * <p>OpencPrevFlagNewResponse</p>
 */
public class OpencPrevFlagNewResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private OpencPrevFlagNewResponseBody body;

    private OpencPrevFlagNewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static OpencPrevFlagNewResponse create() {
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
    public OpencPrevFlagNewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpencPrevFlagNewResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(OpencPrevFlagNewResponseBody body);

        @Override
        OpencPrevFlagNewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpencPrevFlagNewResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private OpencPrevFlagNewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpencPrevFlagNewResponse response) {
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
        public Builder body(OpencPrevFlagNewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpencPrevFlagNewResponse build() {
            return new OpencPrevFlagNewResponse(this);
        } 

    } 

}
