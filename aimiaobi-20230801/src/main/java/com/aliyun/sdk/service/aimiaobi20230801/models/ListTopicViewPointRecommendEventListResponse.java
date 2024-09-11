// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTopicViewPointRecommendEventListResponse} extends {@link TeaModel}
 *
 * <p>ListTopicViewPointRecommendEventListResponse</p>
 */
public class ListTopicViewPointRecommendEventListResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListTopicViewPointRecommendEventListResponseBody body;

    private ListTopicViewPointRecommendEventListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListTopicViewPointRecommendEventListResponse create() {
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
    public ListTopicViewPointRecommendEventListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTopicViewPointRecommendEventListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListTopicViewPointRecommendEventListResponseBody body);

        @Override
        ListTopicViewPointRecommendEventListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTopicViewPointRecommendEventListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListTopicViewPointRecommendEventListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTopicViewPointRecommendEventListResponse response) {
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
        public Builder body(ListTopicViewPointRecommendEventListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTopicViewPointRecommendEventListResponse build() {
            return new ListTopicViewPointRecommendEventListResponse(this);
        } 

    } 

}
