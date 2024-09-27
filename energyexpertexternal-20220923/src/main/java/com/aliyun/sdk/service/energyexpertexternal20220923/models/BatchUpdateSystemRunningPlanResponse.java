// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchUpdateSystemRunningPlanResponse} extends {@link TeaModel}
 *
 * <p>BatchUpdateSystemRunningPlanResponse</p>
 */
public class BatchUpdateSystemRunningPlanResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private BatchUpdateSystemRunningPlanResponseBody body;

    private BatchUpdateSystemRunningPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static BatchUpdateSystemRunningPlanResponse create() {
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
    public BatchUpdateSystemRunningPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchUpdateSystemRunningPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(BatchUpdateSystemRunningPlanResponseBody body);

        @Override
        BatchUpdateSystemRunningPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchUpdateSystemRunningPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private BatchUpdateSystemRunningPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchUpdateSystemRunningPlanResponse response) {
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
        public Builder body(BatchUpdateSystemRunningPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchUpdateSystemRunningPlanResponse build() {
            return new BatchUpdateSystemRunningPlanResponse(this);
        } 

    } 

}
