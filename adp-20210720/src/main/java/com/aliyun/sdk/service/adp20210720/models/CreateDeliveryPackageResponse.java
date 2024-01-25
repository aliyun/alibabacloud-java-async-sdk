// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeliveryPackageResponse} extends {@link TeaModel}
 *
 * <p>CreateDeliveryPackageResponse</p>
 */
public class CreateDeliveryPackageResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private CreateDeliveryPackageResponseBody body;

    private CreateDeliveryPackageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateDeliveryPackageResponse create() {
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
    public CreateDeliveryPackageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDeliveryPackageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateDeliveryPackageResponseBody body);

        @Override
        CreateDeliveryPackageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDeliveryPackageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateDeliveryPackageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDeliveryPackageResponse response) {
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
        public Builder body(CreateDeliveryPackageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDeliveryPackageResponse build() {
            return new CreateDeliveryPackageResponse(this);
        } 

    } 

}
