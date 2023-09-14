// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitIsvCustomerTermsResponse} extends {@link TeaModel}
 *
 * <p>SubmitIsvCustomerTermsResponse</p>
 */
public class SubmitIsvCustomerTermsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitIsvCustomerTermsResponseBody body;

    private SubmitIsvCustomerTermsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SubmitIsvCustomerTermsResponse create() {
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
    public SubmitIsvCustomerTermsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitIsvCustomerTermsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SubmitIsvCustomerTermsResponseBody body);

        @Override
        SubmitIsvCustomerTermsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitIsvCustomerTermsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SubmitIsvCustomerTermsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitIsvCustomerTermsResponse response) {
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
        public Builder body(SubmitIsvCustomerTermsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitIsvCustomerTermsResponse build() {
            return new SubmitIsvCustomerTermsResponse(this);
        } 

    } 

}
