// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDigitalWatermarkExtractResultResponse} extends {@link TeaModel}
 *
 * <p>GetDigitalWatermarkExtractResultResponse</p>
 */
public class GetDigitalWatermarkExtractResultResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GetDigitalWatermarkExtractResultResponseBody body;

    private GetDigitalWatermarkExtractResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetDigitalWatermarkExtractResultResponse create() {
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
    public GetDigitalWatermarkExtractResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDigitalWatermarkExtractResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetDigitalWatermarkExtractResultResponseBody body);

        @Override
        GetDigitalWatermarkExtractResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDigitalWatermarkExtractResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetDigitalWatermarkExtractResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDigitalWatermarkExtractResultResponse response) {
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
        public Builder body(GetDigitalWatermarkExtractResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDigitalWatermarkExtractResultResponse build() {
            return new GetDigitalWatermarkExtractResultResponse(this);
        } 

    } 

}
