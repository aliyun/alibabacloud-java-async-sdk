// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDecodeBlindWatermarkResultResponse} extends {@link TeaModel}
 *
 * <p>GetDecodeBlindWatermarkResultResponse</p>
 */
public class GetDecodeBlindWatermarkResultResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetDecodeBlindWatermarkResultResponseBody body;

    private GetDecodeBlindWatermarkResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetDecodeBlindWatermarkResultResponse create() {
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
    public GetDecodeBlindWatermarkResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDecodeBlindWatermarkResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetDecodeBlindWatermarkResultResponseBody body);

        @Override
        GetDecodeBlindWatermarkResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDecodeBlindWatermarkResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetDecodeBlindWatermarkResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDecodeBlindWatermarkResultResponse response) {
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
        public Builder body(GetDecodeBlindWatermarkResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDecodeBlindWatermarkResultResponse build() {
            return new GetDecodeBlindWatermarkResultResponse(this);
        } 

    } 

}
