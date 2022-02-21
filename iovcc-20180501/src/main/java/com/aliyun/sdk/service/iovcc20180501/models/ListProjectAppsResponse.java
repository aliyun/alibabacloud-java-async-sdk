// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectAppsResponse} extends {@link TeaModel}
 *
 * <p>ListProjectAppsResponse</p>
 */
public class ListProjectAppsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProjectAppsResponseBody body;

    private ListProjectAppsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProjectAppsResponse create() {
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
    public ListProjectAppsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProjectAppsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProjectAppsResponseBody body);

        @Override
        ListProjectAppsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProjectAppsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProjectAppsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProjectAppsResponse response) {
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
        public Builder body(ListProjectAppsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProjectAppsResponse build() {
            return new ListProjectAppsResponse(this);
        } 

    } 

}
