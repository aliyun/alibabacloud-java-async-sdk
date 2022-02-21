// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetAppsAuthoritiesResponse} extends {@link TeaModel}
 *
 * <p>SetAppsAuthoritiesResponse</p>
 */
public class SetAppsAuthoritiesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetAppsAuthoritiesResponseBody body;

    private SetAppsAuthoritiesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetAppsAuthoritiesResponse create() {
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
    public SetAppsAuthoritiesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetAppsAuthoritiesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetAppsAuthoritiesResponseBody body);

        @Override
        SetAppsAuthoritiesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetAppsAuthoritiesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetAppsAuthoritiesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetAppsAuthoritiesResponse response) {
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
        public Builder body(SetAppsAuthoritiesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetAppsAuthoritiesResponse build() {
            return new SetAppsAuthoritiesResponse(this);
        } 

    } 

}
