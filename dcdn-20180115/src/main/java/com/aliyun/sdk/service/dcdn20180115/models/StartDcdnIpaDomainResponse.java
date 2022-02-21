// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartDcdnIpaDomainResponse} extends {@link TeaModel}
 *
 * <p>StartDcdnIpaDomainResponse</p>
 */
public class StartDcdnIpaDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartDcdnIpaDomainResponseBody body;

    private StartDcdnIpaDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartDcdnIpaDomainResponse create() {
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
    public StartDcdnIpaDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartDcdnIpaDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartDcdnIpaDomainResponseBody body);

        @Override
        StartDcdnIpaDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartDcdnIpaDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartDcdnIpaDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartDcdnIpaDomainResponse response) {
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
        public Builder body(StartDcdnIpaDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartDcdnIpaDomainResponse build() {
            return new StartDcdnIpaDomainResponse(this);
        } 

    } 

}
