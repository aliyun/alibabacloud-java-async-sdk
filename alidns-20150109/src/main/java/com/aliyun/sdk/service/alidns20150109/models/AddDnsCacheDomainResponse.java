// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDnsCacheDomainResponse} extends {@link TeaModel}
 *
 * <p>AddDnsCacheDomainResponse</p>
 */
public class AddDnsCacheDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddDnsCacheDomainResponseBody body;

    private AddDnsCacheDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddDnsCacheDomainResponse create() {
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
    public AddDnsCacheDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddDnsCacheDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddDnsCacheDomainResponseBody body);

        @Override
        AddDnsCacheDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddDnsCacheDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddDnsCacheDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddDnsCacheDomainResponse response) {
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
        public Builder body(AddDnsCacheDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddDnsCacheDomainResponse build() {
            return new AddDnsCacheDomainResponse(this);
        } 

    } 

}
