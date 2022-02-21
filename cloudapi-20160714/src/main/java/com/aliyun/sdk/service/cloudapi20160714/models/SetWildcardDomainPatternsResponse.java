// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetWildcardDomainPatternsResponse} extends {@link TeaModel}
 *
 * <p>SetWildcardDomainPatternsResponse</p>
 */
public class SetWildcardDomainPatternsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetWildcardDomainPatternsResponseBody body;

    private SetWildcardDomainPatternsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetWildcardDomainPatternsResponse create() {
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
    public SetWildcardDomainPatternsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetWildcardDomainPatternsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetWildcardDomainPatternsResponseBody body);

        @Override
        SetWildcardDomainPatternsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetWildcardDomainPatternsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetWildcardDomainPatternsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetWildcardDomainPatternsResponse response) {
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
        public Builder body(SetWildcardDomainPatternsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetWildcardDomainPatternsResponse build() {
            return new SetWildcardDomainPatternsResponse(this);
        } 

    } 

}
