// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20201210.models;

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
 * {@link SuggestCategoryResponse} extends {@link TeaModel}
 *
 * <p>SuggestCategoryResponse</p>
 */
public class SuggestCategoryResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SuggestCategoryResponseBody body;

    private SuggestCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SuggestCategoryResponse create() {
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
    public SuggestCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SuggestCategoryResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(SuggestCategoryResponseBody body);

        @Override
        SuggestCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SuggestCategoryResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private SuggestCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SuggestCategoryResponse response) {
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
        public Builder body(SuggestCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SuggestCategoryResponse build() {
            return new SuggestCategoryResponse(this);
        } 

    } 

}
