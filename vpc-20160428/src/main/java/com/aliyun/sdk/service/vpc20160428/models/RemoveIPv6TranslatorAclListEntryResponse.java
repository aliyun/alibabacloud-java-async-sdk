// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveIPv6TranslatorAclListEntryResponse} extends {@link TeaModel}
 *
 * <p>RemoveIPv6TranslatorAclListEntryResponse</p>
 */
public class RemoveIPv6TranslatorAclListEntryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveIPv6TranslatorAclListEntryResponseBody body;

    private RemoveIPv6TranslatorAclListEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveIPv6TranslatorAclListEntryResponse create() {
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
    public RemoveIPv6TranslatorAclListEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveIPv6TranslatorAclListEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveIPv6TranslatorAclListEntryResponseBody body);

        @Override
        RemoveIPv6TranslatorAclListEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveIPv6TranslatorAclListEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveIPv6TranslatorAclListEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveIPv6TranslatorAclListEntryResponse response) {
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
        public Builder body(RemoveIPv6TranslatorAclListEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveIPv6TranslatorAclListEntryResponse build() {
            return new RemoveIPv6TranslatorAclListEntryResponse(this);
        } 

    } 

}
