// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link SubmitReviewInfoV4Response} extends {@link TeaModel}
 *
 * <p>SubmitReviewInfoV4Response</p>
 */
public class SubmitReviewInfoV4Response extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SubmitReviewInfoV4ResponseBody body;

    private SubmitReviewInfoV4Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SubmitReviewInfoV4Response create() {
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
    public SubmitReviewInfoV4ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitReviewInfoV4Response, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(SubmitReviewInfoV4ResponseBody body);

        @Override
        SubmitReviewInfoV4Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitReviewInfoV4Response, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private SubmitReviewInfoV4ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitReviewInfoV4Response response) {
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
        public Builder body(SubmitReviewInfoV4ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitReviewInfoV4Response build() {
            return new SubmitReviewInfoV4Response(this);
        } 

    } 

}
