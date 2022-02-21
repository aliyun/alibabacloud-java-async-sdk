// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveAppsAuthoritiesResponse} extends {@link TeaModel}
 *
 * <p>RemoveAppsAuthoritiesResponse</p>
 */
public class RemoveAppsAuthoritiesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveAppsAuthoritiesResponseBody body;

    private RemoveAppsAuthoritiesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveAppsAuthoritiesResponse create() {
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
    public RemoveAppsAuthoritiesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveAppsAuthoritiesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveAppsAuthoritiesResponseBody body);

        @Override
        RemoveAppsAuthoritiesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveAppsAuthoritiesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveAppsAuthoritiesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveAppsAuthoritiesResponse response) {
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
        public Builder body(RemoveAppsAuthoritiesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveAppsAuthoritiesResponse build() {
            return new RemoveAppsAuthoritiesResponse(this);
        } 

    } 

}
