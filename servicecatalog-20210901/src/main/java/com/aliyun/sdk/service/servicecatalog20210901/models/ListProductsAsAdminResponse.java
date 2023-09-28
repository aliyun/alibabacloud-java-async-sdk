// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductsAsAdminResponse} extends {@link TeaModel}
 *
 * <p>ListProductsAsAdminResponse</p>
 */
public class ListProductsAsAdminResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private ListProductsAsAdminResponseBody body;

    private ListProductsAsAdminResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListProductsAsAdminResponse create() {
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
    public ListProductsAsAdminResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProductsAsAdminResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListProductsAsAdminResponseBody body);

        @Override
        ListProductsAsAdminResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProductsAsAdminResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListProductsAsAdminResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProductsAsAdminResponse response) {
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
        public Builder body(ListProductsAsAdminResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProductsAsAdminResponse build() {
            return new ListProductsAsAdminResponse(this);
        } 

    } 

}
