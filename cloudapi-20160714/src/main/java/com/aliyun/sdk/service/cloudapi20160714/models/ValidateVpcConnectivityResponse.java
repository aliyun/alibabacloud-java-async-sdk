// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateVpcConnectivityResponse} extends {@link TeaModel}
 *
 * <p>ValidateVpcConnectivityResponse</p>
 */
public class ValidateVpcConnectivityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ValidateVpcConnectivityResponseBody body;

    private ValidateVpcConnectivityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ValidateVpcConnectivityResponse create() {
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
    public ValidateVpcConnectivityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ValidateVpcConnectivityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ValidateVpcConnectivityResponseBody body);

        @Override
        ValidateVpcConnectivityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ValidateVpcConnectivityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ValidateVpcConnectivityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ValidateVpcConnectivityResponse response) {
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
        public Builder body(ValidateVpcConnectivityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ValidateVpcConnectivityResponse build() {
            return new ValidateVpcConnectivityResponse(this);
        } 

    } 

}
