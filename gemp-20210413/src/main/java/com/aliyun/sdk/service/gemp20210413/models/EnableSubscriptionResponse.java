// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableSubscriptionResponse} extends {@link TeaModel}
 *
 * <p>EnableSubscriptionResponse</p>
 */
public class EnableSubscriptionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private EnableSubscriptionResponseBody body;

    private EnableSubscriptionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static EnableSubscriptionResponse create() {
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
    public EnableSubscriptionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableSubscriptionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(EnableSubscriptionResponseBody body);

        @Override
        EnableSubscriptionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableSubscriptionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private EnableSubscriptionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableSubscriptionResponse response) {
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
        public Builder body(EnableSubscriptionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableSubscriptionResponse build() {
            return new EnableSubscriptionResponse(this);
        } 

    } 

}
