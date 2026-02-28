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
 * {@link PageQuerySharedSpeechOpenResponse} extends {@link TeaModel}
 *
 * <p>PageQuerySharedSpeechOpenResponse</p>
 */
public class PageQuerySharedSpeechOpenResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private PageQuerySharedSpeechOpenResponseBody body;

    private PageQuerySharedSpeechOpenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static PageQuerySharedSpeechOpenResponse create() {
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
    public PageQuerySharedSpeechOpenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PageQuerySharedSpeechOpenResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(PageQuerySharedSpeechOpenResponseBody body);

        @Override
        PageQuerySharedSpeechOpenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PageQuerySharedSpeechOpenResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private PageQuerySharedSpeechOpenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PageQuerySharedSpeechOpenResponse response) {
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
        public Builder body(PageQuerySharedSpeechOpenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PageQuerySharedSpeechOpenResponse build() {
            return new PageQuerySharedSpeechOpenResponse(this);
        } 

    } 

}
