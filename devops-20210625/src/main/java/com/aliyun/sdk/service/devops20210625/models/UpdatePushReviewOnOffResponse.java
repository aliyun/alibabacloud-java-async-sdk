// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link UpdatePushReviewOnOffResponse} extends {@link TeaModel}
 *
 * <p>UpdatePushReviewOnOffResponse</p>
 */
public class UpdatePushReviewOnOffResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdatePushReviewOnOffResponseBody body;

    private UpdatePushReviewOnOffResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdatePushReviewOnOffResponse create() {
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
    public UpdatePushReviewOnOffResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePushReviewOnOffResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdatePushReviewOnOffResponseBody body);

        @Override
        UpdatePushReviewOnOffResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePushReviewOnOffResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private UpdatePushReviewOnOffResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePushReviewOnOffResponse response) {
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
        public Builder body(UpdatePushReviewOnOffResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePushReviewOnOffResponse build() {
            return new UpdatePushReviewOnOffResponse(this);
        } 

    } 

}
