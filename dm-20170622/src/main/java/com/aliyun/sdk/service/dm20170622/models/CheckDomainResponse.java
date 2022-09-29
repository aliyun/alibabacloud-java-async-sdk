// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDomainResponse} extends {@link TeaModel}
 *
 * <p>CheckDomainResponse</p>
 */
public class CheckDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckDomainResponseBody body;

    private CheckDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckDomainResponse create() {
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
    public CheckDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckDomainResponseBody body);

        @Override
        CheckDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckDomainResponse response) {
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
        public Builder body(CheckDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckDomainResponse build() {
            return new CheckDomainResponse(this);
        } 

    } 

}
