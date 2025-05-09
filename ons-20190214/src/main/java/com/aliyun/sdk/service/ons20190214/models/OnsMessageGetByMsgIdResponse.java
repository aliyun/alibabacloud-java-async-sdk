// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

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
 * {@link OnsMessageGetByMsgIdResponse} extends {@link TeaModel}
 *
 * <p>OnsMessageGetByMsgIdResponse</p>
 */
public class OnsMessageGetByMsgIdResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private OnsMessageGetByMsgIdResponseBody body;

    private OnsMessageGetByMsgIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static OnsMessageGetByMsgIdResponse create() {
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
    public OnsMessageGetByMsgIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsMessageGetByMsgIdResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(OnsMessageGetByMsgIdResponseBody body);

        @Override
        OnsMessageGetByMsgIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsMessageGetByMsgIdResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private OnsMessageGetByMsgIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsMessageGetByMsgIdResponse response) {
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
        public Builder body(OnsMessageGetByMsgIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsMessageGetByMsgIdResponse build() {
            return new OnsMessageGetByMsgIdResponse(this);
        } 

    } 

}
