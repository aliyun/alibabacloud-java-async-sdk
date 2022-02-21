// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshCdnDomainConfigsCacheResponse} extends {@link TeaModel}
 *
 * <p>RefreshCdnDomainConfigsCacheResponse</p>
 */
public class RefreshCdnDomainConfigsCacheResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefreshCdnDomainConfigsCacheResponseBody body;

    private RefreshCdnDomainConfigsCacheResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RefreshCdnDomainConfigsCacheResponse create() {
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
    public RefreshCdnDomainConfigsCacheResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshCdnDomainConfigsCacheResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RefreshCdnDomainConfigsCacheResponseBody body);

        @Override
        RefreshCdnDomainConfigsCacheResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshCdnDomainConfigsCacheResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RefreshCdnDomainConfigsCacheResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshCdnDomainConfigsCacheResponse response) {
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
        public Builder body(RefreshCdnDomainConfigsCacheResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshCdnDomainConfigsCacheResponse build() {
            return new RefreshCdnDomainConfigsCacheResponse(this);
        } 

    } 

}
