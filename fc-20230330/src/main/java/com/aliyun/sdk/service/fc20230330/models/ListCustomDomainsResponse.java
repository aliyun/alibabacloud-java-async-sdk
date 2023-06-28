// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomDomainsResponse} extends {@link TeaModel}
 *
 * <p>ListCustomDomainsResponse</p>
 */
public class ListCustomDomainsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCustomDomainOutput body;

    private ListCustomDomainsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCustomDomainsResponse create() {
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
    public ListCustomDomainOutput getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCustomDomainsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCustomDomainOutput body);

        @Override
        ListCustomDomainsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCustomDomainsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCustomDomainOutput body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCustomDomainsResponse response) {
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
        public Builder body(ListCustomDomainOutput body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCustomDomainsResponse build() {
            return new ListCustomDomainsResponse(this);
        } 

    } 

}
