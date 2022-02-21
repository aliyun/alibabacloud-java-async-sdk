// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountAliasResponse} extends {@link TeaModel}
 *
 * <p>GetAccountAliasResponse</p>
 */
public class GetAccountAliasResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAccountAliasResponseBody body;

    private GetAccountAliasResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAccountAliasResponse create() {
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
    public GetAccountAliasResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAccountAliasResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAccountAliasResponseBody body);

        @Override
        GetAccountAliasResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAccountAliasResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAccountAliasResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAccountAliasResponse response) {
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
        public Builder body(GetAccountAliasResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAccountAliasResponse build() {
            return new GetAccountAliasResponse(this);
        } 

    } 

}
