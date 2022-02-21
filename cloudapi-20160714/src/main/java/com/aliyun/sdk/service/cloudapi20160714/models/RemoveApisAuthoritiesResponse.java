// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveApisAuthoritiesResponse} extends {@link TeaModel}
 *
 * <p>RemoveApisAuthoritiesResponse</p>
 */
public class RemoveApisAuthoritiesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveApisAuthoritiesResponseBody body;

    private RemoveApisAuthoritiesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveApisAuthoritiesResponse create() {
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
    public RemoveApisAuthoritiesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveApisAuthoritiesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveApisAuthoritiesResponseBody body);

        @Override
        RemoveApisAuthoritiesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveApisAuthoritiesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveApisAuthoritiesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveApisAuthoritiesResponse response) {
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
        public Builder body(RemoveApisAuthoritiesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveApisAuthoritiesResponse build() {
            return new RemoveApisAuthoritiesResponse(this);
        } 

    } 

}
