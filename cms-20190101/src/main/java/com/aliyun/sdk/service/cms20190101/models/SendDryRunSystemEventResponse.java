// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SendDryRunSystemEventResponse} extends {@link TeaModel}
 *
 * <p>SendDryRunSystemEventResponse</p>
 */
public class SendDryRunSystemEventResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SendDryRunSystemEventResponseBody body;

    private SendDryRunSystemEventResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SendDryRunSystemEventResponse create() {
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
    public SendDryRunSystemEventResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendDryRunSystemEventResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SendDryRunSystemEventResponseBody body);

        @Override
        SendDryRunSystemEventResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendDryRunSystemEventResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SendDryRunSystemEventResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendDryRunSystemEventResponse response) {
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
        public Builder body(SendDryRunSystemEventResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendDryRunSystemEventResponse build() {
            return new SendDryRunSystemEventResponse(this);
        } 

    } 

}
