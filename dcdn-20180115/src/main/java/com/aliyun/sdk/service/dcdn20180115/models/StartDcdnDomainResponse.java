// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartDcdnDomainResponse} extends {@link TeaModel}
 *
 * <p>StartDcdnDomainResponse</p>
 */
public class StartDcdnDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartDcdnDomainResponseBody body;

    private StartDcdnDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartDcdnDomainResponse create() {
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
    public StartDcdnDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartDcdnDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartDcdnDomainResponseBody body);

        @Override
        StartDcdnDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartDcdnDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartDcdnDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartDcdnDomainResponse response) {
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
        public Builder body(StartDcdnDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartDcdnDomainResponse build() {
            return new StartDcdnDomainResponse(this);
        } 

    } 

}
