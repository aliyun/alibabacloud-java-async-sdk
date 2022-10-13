// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCreateCustomerInformationResponse} extends {@link TeaModel}
 *
 * <p>GetCreateCustomerInformationResponse</p>
 */
public class GetCreateCustomerInformationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCreateCustomerInformationResponseBody body;

    private GetCreateCustomerInformationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCreateCustomerInformationResponse create() {
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
     * @return body
     */
    public GetCreateCustomerInformationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCreateCustomerInformationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCreateCustomerInformationResponseBody body);

        @Override
        GetCreateCustomerInformationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCreateCustomerInformationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCreateCustomerInformationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCreateCustomerInformationResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(GetCreateCustomerInformationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCreateCustomerInformationResponse build() {
            return new GetCreateCustomerInformationResponse(this);
        } 

    } 

}
