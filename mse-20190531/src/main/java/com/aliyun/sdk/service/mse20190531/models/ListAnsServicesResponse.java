// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAnsServicesResponse} extends {@link TeaModel}
 *
 * <p>ListAnsServicesResponse</p>
 */
public class ListAnsServicesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListAnsServicesResponseBody body;

    private ListAnsServicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListAnsServicesResponse create() {
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
    public ListAnsServicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAnsServicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListAnsServicesResponseBody body);

        @Override
        ListAnsServicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAnsServicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListAnsServicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAnsServicesResponse response) {
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
        public Builder body(ListAnsServicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAnsServicesResponse build() {
            return new ListAnsServicesResponse(this);
        } 

    } 

}
