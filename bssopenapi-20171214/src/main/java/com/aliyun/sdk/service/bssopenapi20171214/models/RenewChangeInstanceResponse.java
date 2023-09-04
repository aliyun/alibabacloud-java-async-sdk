// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewChangeInstanceResponse} extends {@link TeaModel}
 *
 * <p>RenewChangeInstanceResponse</p>
 */
public class RenewChangeInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RenewChangeInstanceResponseBody body;

    private RenewChangeInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RenewChangeInstanceResponse create() {
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
    public RenewChangeInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RenewChangeInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RenewChangeInstanceResponseBody body);

        @Override
        RenewChangeInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RenewChangeInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RenewChangeInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RenewChangeInstanceResponse response) {
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
        public Builder body(RenewChangeInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RenewChangeInstanceResponse build() {
            return new RenewChangeInstanceResponse(this);
        } 

    } 

}
