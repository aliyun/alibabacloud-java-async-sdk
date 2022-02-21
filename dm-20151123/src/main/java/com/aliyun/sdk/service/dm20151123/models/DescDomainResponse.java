// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescDomainResponse} extends {@link TeaModel}
 *
 * <p>DescDomainResponse</p>
 */
public class DescDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescDomainResponseBody body;

    private DescDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescDomainResponse create() {
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
    public DescDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescDomainResponseBody body);

        @Override
        DescDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescDomainResponse response) {
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
        public Builder body(DescDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescDomainResponse build() {
            return new DescDomainResponse(this);
        } 

    } 

}
