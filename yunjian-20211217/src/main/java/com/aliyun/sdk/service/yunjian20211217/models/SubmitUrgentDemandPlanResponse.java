// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yunjian20211217.models;

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
 * {@link SubmitUrgentDemandPlanResponse} extends {@link TeaModel}
 *
 * <p>SubmitUrgentDemandPlanResponse</p>
 */
public class SubmitUrgentDemandPlanResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SubmitUrgentDemandPlanResponseBody body;

    private SubmitUrgentDemandPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SubmitUrgentDemandPlanResponse create() {
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
    public SubmitUrgentDemandPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitUrgentDemandPlanResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(SubmitUrgentDemandPlanResponseBody body);

        @Override
        SubmitUrgentDemandPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitUrgentDemandPlanResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private SubmitUrgentDemandPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitUrgentDemandPlanResponse response) {
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
        public Builder body(SubmitUrgentDemandPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitUrgentDemandPlanResponse build() {
            return new SubmitUrgentDemandPlanResponse(this);
        } 

    } 

}
