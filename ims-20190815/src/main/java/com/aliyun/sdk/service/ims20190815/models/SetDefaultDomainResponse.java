// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDefaultDomainResponse} extends {@link TeaModel}
 *
 * <p>SetDefaultDomainResponse</p>
 */
public class SetDefaultDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDefaultDomainResponseBody body;

    private SetDefaultDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDefaultDomainResponse create() {
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
    public SetDefaultDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDefaultDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDefaultDomainResponseBody body);

        @Override
        SetDefaultDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDefaultDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDefaultDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDefaultDomainResponse response) {
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
        public Builder body(SetDefaultDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDefaultDomainResponse build() {
            return new SetDefaultDomainResponse(this);
        } 

    } 

}
