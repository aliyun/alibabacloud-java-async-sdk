// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AutoRenewInstanceResponse} extends {@link TeaModel}
 *
 * <p>AutoRenewInstanceResponse</p>
 */
public class AutoRenewInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AutoRenewInstanceResponseBody body;

    private AutoRenewInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AutoRenewInstanceResponse create() {
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
    public AutoRenewInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AutoRenewInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AutoRenewInstanceResponseBody body);

        @Override
        AutoRenewInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AutoRenewInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AutoRenewInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AutoRenewInstanceResponse response) {
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
        public Builder body(AutoRenewInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AutoRenewInstanceResponse build() {
            return new AutoRenewInstanceResponse(this);
        } 

    } 

}
