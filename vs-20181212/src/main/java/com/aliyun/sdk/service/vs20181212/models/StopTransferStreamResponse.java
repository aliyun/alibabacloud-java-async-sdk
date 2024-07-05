// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopTransferStreamResponse} extends {@link TeaModel}
 *
 * <p>StopTransferStreamResponse</p>
 */
public class StopTransferStreamResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private StopTransferStreamResponseBody body;

    private StopTransferStreamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static StopTransferStreamResponse create() {
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
    public StopTransferStreamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopTransferStreamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(StopTransferStreamResponseBody body);

        @Override
        StopTransferStreamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopTransferStreamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private StopTransferStreamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopTransferStreamResponse response) {
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
        public Builder body(StopTransferStreamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopTransferStreamResponse build() {
            return new StopTransferStreamResponse(this);
        } 

    } 

}
