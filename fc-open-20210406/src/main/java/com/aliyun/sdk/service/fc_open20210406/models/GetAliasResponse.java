// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAliasResponse} extends {@link TeaModel}
 *
 * <p>GetAliasResponse</p>
 */
public class GetAliasResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAliasResponseBody body;

    private GetAliasResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAliasResponse create() {
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
    public GetAliasResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAliasResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAliasResponseBody body);

        @Override
        GetAliasResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAliasResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAliasResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAliasResponse response) {
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
        public Builder body(GetAliasResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAliasResponse build() {
            return new GetAliasResponse(this);
        } 

    } 

}
