// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetResellerUserQuotaResponse} extends {@link TeaModel}
 *
 * <p>SetResellerUserQuotaResponse</p>
 */
public class SetResellerUserQuotaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetResellerUserQuotaResponseBody body;

    private SetResellerUserQuotaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetResellerUserQuotaResponse create() {
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
    public SetResellerUserQuotaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetResellerUserQuotaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetResellerUserQuotaResponseBody body);

        @Override
        SetResellerUserQuotaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetResellerUserQuotaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetResellerUserQuotaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetResellerUserQuotaResponse response) {
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
        public Builder body(SetResellerUserQuotaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetResellerUserQuotaResponse build() {
            return new SetResellerUserQuotaResponse(this);
        } 

    } 

}
