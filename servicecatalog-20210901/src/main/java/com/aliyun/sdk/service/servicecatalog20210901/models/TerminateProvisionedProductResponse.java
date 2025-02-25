// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TerminateProvisionedProductResponse} extends {@link TeaModel}
 *
 * <p>TerminateProvisionedProductResponse</p>
 */
public class TerminateProvisionedProductResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private TerminateProvisionedProductResponseBody body;

    private TerminateProvisionedProductResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static TerminateProvisionedProductResponse create() {
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
    public TerminateProvisionedProductResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TerminateProvisionedProductResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(TerminateProvisionedProductResponseBody body);

        @Override
        TerminateProvisionedProductResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TerminateProvisionedProductResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private TerminateProvisionedProductResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TerminateProvisionedProductResponse response) {
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
        public Builder body(TerminateProvisionedProductResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TerminateProvisionedProductResponse build() {
            return new TerminateProvisionedProductResponse(this);
        } 

    } 

}
