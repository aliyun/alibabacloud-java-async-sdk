// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SendOpsMessageToTerminalsResponse} extends {@link TeaModel}
 *
 * <p>SendOpsMessageToTerminalsResponse</p>
 */
public class SendOpsMessageToTerminalsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SendOpsMessageToTerminalsResponseBody body;

    private SendOpsMessageToTerminalsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SendOpsMessageToTerminalsResponse create() {
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
    public SendOpsMessageToTerminalsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendOpsMessageToTerminalsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SendOpsMessageToTerminalsResponseBody body);

        @Override
        SendOpsMessageToTerminalsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendOpsMessageToTerminalsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SendOpsMessageToTerminalsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendOpsMessageToTerminalsResponse response) {
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
        public Builder body(SendOpsMessageToTerminalsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendOpsMessageToTerminalsResponse build() {
            return new SendOpsMessageToTerminalsResponse(this);
        } 

    } 

}
