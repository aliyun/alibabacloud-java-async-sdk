// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageTranslateResponse} extends {@link TeaModel}
 *
 * <p>GetImageTranslateResponse</p>
 */
public class GetImageTranslateResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetImageTranslateResponseBody body;

    private GetImageTranslateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetImageTranslateResponse create() {
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
    public GetImageTranslateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetImageTranslateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetImageTranslateResponseBody body);

        @Override
        GetImageTranslateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetImageTranslateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetImageTranslateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetImageTranslateResponse response) {
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
        public Builder body(GetImageTranslateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetImageTranslateResponse build() {
            return new GetImageTranslateResponse(this);
        } 

    } 

}
