// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListABMetricGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListABMetricGroupsResponse</p>
 */
public class ListABMetricGroupsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListABMetricGroupsResponseBody body;

    private ListABMetricGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListABMetricGroupsResponse create() {
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
    public ListABMetricGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListABMetricGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListABMetricGroupsResponseBody body);

        @Override
        ListABMetricGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListABMetricGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListABMetricGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListABMetricGroupsResponse response) {
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
        public Builder body(ListABMetricGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListABMetricGroupsResponse build() {
            return new ListABMetricGroupsResponse(this);
        } 

    } 

}
