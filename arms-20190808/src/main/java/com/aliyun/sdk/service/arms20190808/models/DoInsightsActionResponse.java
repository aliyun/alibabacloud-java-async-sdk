// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DoInsightsActionResponse} extends {@link TeaModel}
 *
 * <p>DoInsightsActionResponse</p>
 */
public class DoInsightsActionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DoInsightsActionResponseBody body;

    private DoInsightsActionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DoInsightsActionResponse create() {
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
    public DoInsightsActionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DoInsightsActionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DoInsightsActionResponseBody body);

        @Override
        DoInsightsActionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DoInsightsActionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DoInsightsActionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DoInsightsActionResponse response) {
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
        public Builder body(DoInsightsActionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DoInsightsActionResponse build() {
            return new DoInsightsActionResponse(this);
        } 

    } 

}
