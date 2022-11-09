// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewInstanceResponse} extends {@link TeaModel}
 *
 * <p>RenewInstanceResponse</p>
 */
public class RenewInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RenewInstanceResponseBody body;

    private RenewInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RenewInstanceResponse create() {
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
    public RenewInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RenewInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RenewInstanceResponseBody body);

        @Override
        RenewInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RenewInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RenewInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RenewInstanceResponse response) {
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
        public Builder body(RenewInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RenewInstanceResponse build() {
            return new RenewInstanceResponse(this);
        } 

    } 

}
