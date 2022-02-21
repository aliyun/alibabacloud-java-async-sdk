// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateDnsGtmCnameRrCanUseResponse} extends {@link TeaModel}
 *
 * <p>ValidateDnsGtmCnameRrCanUseResponse</p>
 */
public class ValidateDnsGtmCnameRrCanUseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ValidateDnsGtmCnameRrCanUseResponseBody body;

    private ValidateDnsGtmCnameRrCanUseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ValidateDnsGtmCnameRrCanUseResponse create() {
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
    public ValidateDnsGtmCnameRrCanUseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ValidateDnsGtmCnameRrCanUseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ValidateDnsGtmCnameRrCanUseResponseBody body);

        @Override
        ValidateDnsGtmCnameRrCanUseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ValidateDnsGtmCnameRrCanUseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ValidateDnsGtmCnameRrCanUseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ValidateDnsGtmCnameRrCanUseResponse response) {
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
        public Builder body(ValidateDnsGtmCnameRrCanUseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ValidateDnsGtmCnameRrCanUseResponse build() {
            return new ValidateDnsGtmCnameRrCanUseResponse(this);
        } 

    } 

}
