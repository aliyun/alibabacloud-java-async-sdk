// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReactivateDomainResponse} extends {@link TeaModel}
 *
 * <p>ReactivateDomainResponse</p>
 */
public class ReactivateDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReactivateDomainResponseBody body;

    private ReactivateDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReactivateDomainResponse create() {
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
    public ReactivateDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReactivateDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReactivateDomainResponseBody body);

        @Override
        ReactivateDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReactivateDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReactivateDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReactivateDomainResponse response) {
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
        public Builder body(ReactivateDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReactivateDomainResponse build() {
            return new ReactivateDomainResponse(this);
        } 

    } 

}
