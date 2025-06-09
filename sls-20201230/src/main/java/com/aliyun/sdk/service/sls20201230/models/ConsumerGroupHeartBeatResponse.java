// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link ConsumerGroupHeartBeatResponse} extends {@link TeaModel}
 *
 * <p>ConsumerGroupHeartBeatResponse</p>
 */
public class ConsumerGroupHeartBeatResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<Integer> body;

    private ConsumerGroupHeartBeatResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ConsumerGroupHeartBeatResponse create() {
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
    public java.util.List<Integer> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConsumerGroupHeartBeatResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List<Integer> body);

        @Override
        ConsumerGroupHeartBeatResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConsumerGroupHeartBeatResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private java.util.List<Integer> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConsumerGroupHeartBeatResponse response) {
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
        public Builder body(java.util.List<Integer> body) {
            this.body = body;
            return this;
        }

        @Override
        public ConsumerGroupHeartBeatResponse build() {
            return new ConsumerGroupHeartBeatResponse(this);
        } 

    } 

}
