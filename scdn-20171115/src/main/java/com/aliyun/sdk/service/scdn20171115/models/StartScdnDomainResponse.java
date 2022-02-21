// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartScdnDomainResponse} extends {@link TeaModel}
 *
 * <p>StartScdnDomainResponse</p>
 */
public class StartScdnDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartScdnDomainResponseBody body;

    private StartScdnDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartScdnDomainResponse create() {
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
    public StartScdnDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartScdnDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartScdnDomainResponseBody body);

        @Override
        StartScdnDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartScdnDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartScdnDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartScdnDomainResponse response) {
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
        public Builder body(StartScdnDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartScdnDomainResponse build() {
            return new StartScdnDomainResponse(this);
        } 

    } 

}
