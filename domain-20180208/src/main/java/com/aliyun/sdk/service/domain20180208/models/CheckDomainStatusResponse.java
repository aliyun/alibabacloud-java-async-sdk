// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDomainStatusResponse} extends {@link TeaModel}
 *
 * <p>CheckDomainStatusResponse</p>
 */
public class CheckDomainStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckDomainStatusResponseBody body;

    private CheckDomainStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckDomainStatusResponse create() {
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
    public CheckDomainStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckDomainStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckDomainStatusResponseBody body);

        @Override
        CheckDomainStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckDomainStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckDomainStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckDomainStatusResponse response) {
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
        public Builder body(CheckDomainStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckDomainStatusResponse build() {
            return new CheckDomainStatusResponse(this);
        } 

    } 

}
