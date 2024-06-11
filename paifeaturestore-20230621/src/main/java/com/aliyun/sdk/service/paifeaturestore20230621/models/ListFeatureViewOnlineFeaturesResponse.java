// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFeatureViewOnlineFeaturesResponse} extends {@link TeaModel}
 *
 * <p>ListFeatureViewOnlineFeaturesResponse</p>
 */
public class ListFeatureViewOnlineFeaturesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListFeatureViewOnlineFeaturesResponseBody body;

    private ListFeatureViewOnlineFeaturesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListFeatureViewOnlineFeaturesResponse create() {
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
    public ListFeatureViewOnlineFeaturesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFeatureViewOnlineFeaturesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListFeatureViewOnlineFeaturesResponseBody body);

        @Override
        ListFeatureViewOnlineFeaturesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFeatureViewOnlineFeaturesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListFeatureViewOnlineFeaturesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFeatureViewOnlineFeaturesResponse response) {
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
        public Builder body(ListFeatureViewOnlineFeaturesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFeatureViewOnlineFeaturesResponse build() {
            return new ListFeatureViewOnlineFeaturesResponse(this);
        } 

    } 

}
