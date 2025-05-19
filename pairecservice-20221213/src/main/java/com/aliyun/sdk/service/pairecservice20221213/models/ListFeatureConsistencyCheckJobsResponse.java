// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListFeatureConsistencyCheckJobsResponse} extends {@link TeaModel}
 *
 * <p>ListFeatureConsistencyCheckJobsResponse</p>
 */
public class ListFeatureConsistencyCheckJobsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListFeatureConsistencyCheckJobsResponseBody body;

    private ListFeatureConsistencyCheckJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListFeatureConsistencyCheckJobsResponse create() {
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
    public ListFeatureConsistencyCheckJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFeatureConsistencyCheckJobsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListFeatureConsistencyCheckJobsResponseBody body);

        @Override
        ListFeatureConsistencyCheckJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFeatureConsistencyCheckJobsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListFeatureConsistencyCheckJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFeatureConsistencyCheckJobsResponse response) {
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
        public Builder body(ListFeatureConsistencyCheckJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFeatureConsistencyCheckJobsResponse build() {
            return new ListFeatureConsistencyCheckJobsResponse(this);
        } 

    } 

}
