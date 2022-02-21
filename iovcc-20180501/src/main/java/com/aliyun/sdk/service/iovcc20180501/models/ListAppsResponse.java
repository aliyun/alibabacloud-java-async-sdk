// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppsResponse} extends {@link TeaModel}
 *
 * <p>ListAppsResponse</p>
 */
public class ListAppsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAppsResponseBody body;

    private ListAppsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAppsResponse create() {
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
    public ListAppsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAppsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAppsResponseBody body);

        @Override
        ListAppsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAppsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAppsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAppsResponse response) {
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
        public Builder body(ListAppsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAppsResponse build() {
            return new ListAppsResponse(this);
        } 

    } 

}
