// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAutoScalingActivitiesResponse} extends {@link TeaModel}
 *
 * <p>ListAutoScalingActivitiesResponse</p>
 */
public class ListAutoScalingActivitiesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListAutoScalingActivitiesResponseBody body;

    private ListAutoScalingActivitiesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListAutoScalingActivitiesResponse create() {
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
    public ListAutoScalingActivitiesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAutoScalingActivitiesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListAutoScalingActivitiesResponseBody body);

        @Override
        ListAutoScalingActivitiesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAutoScalingActivitiesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListAutoScalingActivitiesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAutoScalingActivitiesResponse response) {
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
        public Builder body(ListAutoScalingActivitiesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAutoScalingActivitiesResponse build() {
            return new ListAutoScalingActivitiesResponse(this);
        } 

    } 

}
