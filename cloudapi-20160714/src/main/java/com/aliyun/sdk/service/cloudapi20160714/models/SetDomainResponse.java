// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDomainResponse} extends {@link TeaModel}
 *
 * <p>SetDomainResponse</p>
 */
public class SetDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDomainResponseBody body;

    private SetDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDomainResponse create() {
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
    public SetDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDomainResponseBody body);

        @Override
        SetDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDomainResponse response) {
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
        public Builder body(SetDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDomainResponse build() {
            return new SetDomainResponse(this);
        } 

    } 

}
