// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSubscriptionResponse} extends {@link TeaModel}
 *
 * <p>CreateSubscriptionResponse</p>
 */
public class CreateSubscriptionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateSubscriptionResponseBody body;

    private CreateSubscriptionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateSubscriptionResponse create() {
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
    public CreateSubscriptionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSubscriptionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateSubscriptionResponseBody body);

        @Override
        CreateSubscriptionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSubscriptionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateSubscriptionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSubscriptionResponse response) {
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
        public Builder body(CreateSubscriptionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSubscriptionResponse build() {
            return new CreateSubscriptionResponse(this);
        } 

    } 

}
