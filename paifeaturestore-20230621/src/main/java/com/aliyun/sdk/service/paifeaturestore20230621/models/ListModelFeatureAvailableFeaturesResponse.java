// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListModelFeatureAvailableFeaturesResponse} extends {@link TeaModel}
 *
 * <p>ListModelFeatureAvailableFeaturesResponse</p>
 */
public class ListModelFeatureAvailableFeaturesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListModelFeatureAvailableFeaturesResponseBody body;

    private ListModelFeatureAvailableFeaturesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListModelFeatureAvailableFeaturesResponse create() {
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
    public ListModelFeatureAvailableFeaturesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListModelFeatureAvailableFeaturesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListModelFeatureAvailableFeaturesResponseBody body);

        @Override
        ListModelFeatureAvailableFeaturesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListModelFeatureAvailableFeaturesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListModelFeatureAvailableFeaturesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListModelFeatureAvailableFeaturesResponse response) {
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
        public Builder body(ListModelFeatureAvailableFeaturesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListModelFeatureAvailableFeaturesResponse build() {
            return new ListModelFeatureAvailableFeaturesResponse(this);
        } 

    } 

}
