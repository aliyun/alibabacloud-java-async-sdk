// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AbortCasesResponse} extends {@link TeaModel}
 *
 * <p>AbortCasesResponse</p>
 */
public class AbortCasesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AbortCasesResponseBody body;

    private AbortCasesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AbortCasesResponse create() {
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
    public AbortCasesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AbortCasesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AbortCasesResponseBody body);

        @Override
        AbortCasesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AbortCasesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AbortCasesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AbortCasesResponse response) {
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
        public Builder body(AbortCasesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AbortCasesResponse build() {
            return new AbortCasesResponse(this);
        } 

    } 

}
