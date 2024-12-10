// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTrainingJobMetricsResponse} extends {@link TeaModel}
 *
 * <p>ListTrainingJobMetricsResponse</p>
 */
public class ListTrainingJobMetricsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListTrainingJobMetricsResponseBody body;

    private ListTrainingJobMetricsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListTrainingJobMetricsResponse create() {
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
    public ListTrainingJobMetricsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTrainingJobMetricsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListTrainingJobMetricsResponseBody body);

        @Override
        ListTrainingJobMetricsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTrainingJobMetricsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListTrainingJobMetricsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTrainingJobMetricsResponse response) {
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
        public Builder body(ListTrainingJobMetricsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTrainingJobMetricsResponse build() {
            return new ListTrainingJobMetricsResponse(this);
        } 

    } 

}
