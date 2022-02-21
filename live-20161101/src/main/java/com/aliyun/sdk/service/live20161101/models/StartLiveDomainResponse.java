// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartLiveDomainResponse} extends {@link TeaModel}
 *
 * <p>StartLiveDomainResponse</p>
 */
public class StartLiveDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartLiveDomainResponseBody body;

    private StartLiveDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartLiveDomainResponse create() {
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
    public StartLiveDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartLiveDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartLiveDomainResponseBody body);

        @Override
        StartLiveDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartLiveDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartLiveDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartLiveDomainResponse response) {
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
        public Builder body(StartLiveDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartLiveDomainResponse build() {
            return new StartLiveDomainResponse(this);
        } 

    } 

}
