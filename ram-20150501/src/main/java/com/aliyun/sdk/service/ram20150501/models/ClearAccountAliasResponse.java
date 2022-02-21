// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClearAccountAliasResponse} extends {@link TeaModel}
 *
 * <p>ClearAccountAliasResponse</p>
 */
public class ClearAccountAliasResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ClearAccountAliasResponseBody body;

    private ClearAccountAliasResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ClearAccountAliasResponse create() {
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
    public ClearAccountAliasResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ClearAccountAliasResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ClearAccountAliasResponseBody body);

        @Override
        ClearAccountAliasResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ClearAccountAliasResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ClearAccountAliasResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ClearAccountAliasResponse response) {
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
        public Builder body(ClearAccountAliasResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ClearAccountAliasResponse build() {
            return new ClearAccountAliasResponse(this);
        } 

    } 

}
