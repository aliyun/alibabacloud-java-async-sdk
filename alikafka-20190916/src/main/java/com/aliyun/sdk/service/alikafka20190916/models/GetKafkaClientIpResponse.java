// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetKafkaClientIpResponse} extends {@link TeaModel}
 *
 * <p>GetKafkaClientIpResponse</p>
 */
public class GetKafkaClientIpResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetKafkaClientIpResponseBody body;

    private GetKafkaClientIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetKafkaClientIpResponse create() {
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
    public GetKafkaClientIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetKafkaClientIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetKafkaClientIpResponseBody body);

        @Override
        GetKafkaClientIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetKafkaClientIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetKafkaClientIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetKafkaClientIpResponse response) {
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
        public Builder body(GetKafkaClientIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetKafkaClientIpResponse build() {
            return new GetKafkaClientIpResponse(this);
        } 

    } 

}
