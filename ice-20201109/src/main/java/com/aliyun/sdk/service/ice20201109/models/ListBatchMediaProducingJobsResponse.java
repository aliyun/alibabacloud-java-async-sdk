// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBatchMediaProducingJobsResponse} extends {@link TeaModel}
 *
 * <p>ListBatchMediaProducingJobsResponse</p>
 */
public class ListBatchMediaProducingJobsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListBatchMediaProducingJobsResponseBody body;

    private ListBatchMediaProducingJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListBatchMediaProducingJobsResponse create() {
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
    public ListBatchMediaProducingJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBatchMediaProducingJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListBatchMediaProducingJobsResponseBody body);

        @Override
        ListBatchMediaProducingJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBatchMediaProducingJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListBatchMediaProducingJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBatchMediaProducingJobsResponse response) {
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
        public Builder body(ListBatchMediaProducingJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBatchMediaProducingJobsResponse build() {
            return new ListBatchMediaProducingJobsResponse(this);
        } 

    } 

}
