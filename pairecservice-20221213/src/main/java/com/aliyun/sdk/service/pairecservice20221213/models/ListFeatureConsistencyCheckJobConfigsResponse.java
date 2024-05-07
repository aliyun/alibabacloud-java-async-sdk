// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFeatureConsistencyCheckJobConfigsResponse} extends {@link TeaModel}
 *
 * <p>ListFeatureConsistencyCheckJobConfigsResponse</p>
 */
public class ListFeatureConsistencyCheckJobConfigsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListFeatureConsistencyCheckJobConfigsResponseBody body;

    private ListFeatureConsistencyCheckJobConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListFeatureConsistencyCheckJobConfigsResponse create() {
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
    public ListFeatureConsistencyCheckJobConfigsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFeatureConsistencyCheckJobConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListFeatureConsistencyCheckJobConfigsResponseBody body);

        @Override
        ListFeatureConsistencyCheckJobConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFeatureConsistencyCheckJobConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListFeatureConsistencyCheckJobConfigsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFeatureConsistencyCheckJobConfigsResponse response) {
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
        public Builder body(ListFeatureConsistencyCheckJobConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFeatureConsistencyCheckJobConfigsResponse build() {
            return new ListFeatureConsistencyCheckJobConfigsResponse(this);
        } 

    } 

}
