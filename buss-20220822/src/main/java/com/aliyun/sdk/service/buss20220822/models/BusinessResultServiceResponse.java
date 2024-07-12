// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.buss20220822.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BusinessResultServiceResponse} extends {@link TeaModel}
 *
 * <p>BusinessResultServiceResponse</p>
 */
public class BusinessResultServiceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private BusinessResultServiceResponseBody body;

    private BusinessResultServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static BusinessResultServiceResponse create() {
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
    public BusinessResultServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BusinessResultServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(BusinessResultServiceResponseBody body);

        @Override
        BusinessResultServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BusinessResultServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private BusinessResultServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BusinessResultServiceResponse response) {
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
        public Builder body(BusinessResultServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BusinessResultServiceResponse build() {
            return new BusinessResultServiceResponse(this);
        } 

    } 

}
