// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateWebhookContactResponse} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateWebhookContactResponse</p>
 */
public class CreateOrUpdateWebhookContactResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateOrUpdateWebhookContactResponseBody body;

    private CreateOrUpdateWebhookContactResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateOrUpdateWebhookContactResponse create() {
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
    public CreateOrUpdateWebhookContactResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOrUpdateWebhookContactResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateOrUpdateWebhookContactResponseBody body);

        @Override
        CreateOrUpdateWebhookContactResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOrUpdateWebhookContactResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateOrUpdateWebhookContactResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOrUpdateWebhookContactResponse response) {
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
        public Builder body(CreateOrUpdateWebhookContactResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOrUpdateWebhookContactResponse build() {
            return new CreateOrUpdateWebhookContactResponse(this);
        } 

    } 

}
