// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link ApplyScheduledPlanResponse} extends {@link TeaModel}
 *
 * <p>ApplyScheduledPlanResponse</p>
 */
public class ApplyScheduledPlanResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ApplyScheduledPlanResponseBody body;

    private ApplyScheduledPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ApplyScheduledPlanResponse create() {
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
    public ApplyScheduledPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApplyScheduledPlanResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ApplyScheduledPlanResponseBody body);

        @Override
        ApplyScheduledPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApplyScheduledPlanResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ApplyScheduledPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApplyScheduledPlanResponse response) {
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
        public Builder body(ApplyScheduledPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApplyScheduledPlanResponse build() {
            return new ApplyScheduledPlanResponse(this);
        } 

    } 

}
