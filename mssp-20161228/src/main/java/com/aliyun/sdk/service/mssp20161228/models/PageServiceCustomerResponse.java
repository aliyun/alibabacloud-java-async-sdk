// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PageServiceCustomerResponse} extends {@link TeaModel}
 *
 * <p>PageServiceCustomerResponse</p>
 */
public class PageServiceCustomerResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private PageServiceCustomerResponseBody body;

    private PageServiceCustomerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static PageServiceCustomerResponse create() {
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
    public PageServiceCustomerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PageServiceCustomerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(PageServiceCustomerResponseBody body);

        @Override
        PageServiceCustomerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PageServiceCustomerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private PageServiceCustomerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PageServiceCustomerResponse response) {
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
        public Builder body(PageServiceCustomerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PageServiceCustomerResponse build() {
            return new PageServiceCustomerResponse(this);
        } 

    } 

}
