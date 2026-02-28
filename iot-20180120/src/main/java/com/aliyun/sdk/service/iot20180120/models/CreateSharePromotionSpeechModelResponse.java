// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CreateSharePromotionSpeechModelResponse} extends {@link TeaModel}
 *
 * <p>CreateSharePromotionSpeechModelResponse</p>
 */
public class CreateSharePromotionSpeechModelResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateSharePromotionSpeechModelResponseBody body;

    private CreateSharePromotionSpeechModelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateSharePromotionSpeechModelResponse create() {
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
    public CreateSharePromotionSpeechModelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSharePromotionSpeechModelResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateSharePromotionSpeechModelResponseBody body);

        @Override
        CreateSharePromotionSpeechModelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSharePromotionSpeechModelResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreateSharePromotionSpeechModelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSharePromotionSpeechModelResponse response) {
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
        public Builder body(CreateSharePromotionSpeechModelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSharePromotionSpeechModelResponse build() {
            return new CreateSharePromotionSpeechModelResponse(this);
        } 

    } 

}
