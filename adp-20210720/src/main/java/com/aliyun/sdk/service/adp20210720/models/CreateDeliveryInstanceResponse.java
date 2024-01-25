// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeliveryInstanceResponse} extends {@link TeaModel}
 *
 * <p>CreateDeliveryInstanceResponse</p>
 */
public class CreateDeliveryInstanceResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private CreateDeliveryInstanceResponseBody body;

    private CreateDeliveryInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateDeliveryInstanceResponse create() {
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
    public CreateDeliveryInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDeliveryInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateDeliveryInstanceResponseBody body);

        @Override
        CreateDeliveryInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDeliveryInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateDeliveryInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDeliveryInstanceResponse response) {
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
        public Builder body(CreateDeliveryInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDeliveryInstanceResponse build() {
            return new CreateDeliveryInstanceResponse(this);
        } 

    } 

}
