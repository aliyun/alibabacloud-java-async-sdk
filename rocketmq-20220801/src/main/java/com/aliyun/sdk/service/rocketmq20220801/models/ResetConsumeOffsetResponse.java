// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetConsumeOffsetResponse} extends {@link TeaModel}
 *
 * <p>ResetConsumeOffsetResponse</p>
 */
public class ResetConsumeOffsetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private ResetConsumeOffsetResponseBody body;

    private ResetConsumeOffsetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ResetConsumeOffsetResponse create() {
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
    public ResetConsumeOffsetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetConsumeOffsetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ResetConsumeOffsetResponseBody body);

        @Override
        ResetConsumeOffsetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetConsumeOffsetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ResetConsumeOffsetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetConsumeOffsetResponse response) {
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
        public Builder body(ResetConsumeOffsetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetConsumeOffsetResponse build() {
            return new ResetConsumeOffsetResponse(this);
        } 

    } 

}
