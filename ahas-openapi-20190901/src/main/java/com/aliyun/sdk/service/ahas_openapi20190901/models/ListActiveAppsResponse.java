// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListActiveAppsResponse} extends {@link TeaModel}
 *
 * <p>ListActiveAppsResponse</p>
 */
public class ListActiveAppsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListActiveAppsResponseBody body;

    private ListActiveAppsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListActiveAppsResponse create() {
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
    public ListActiveAppsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListActiveAppsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListActiveAppsResponseBody body);

        @Override
        ListActiveAppsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListActiveAppsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListActiveAppsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListActiveAppsResponse response) {
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
        public Builder body(ListActiveAppsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListActiveAppsResponse build() {
            return new ListActiveAppsResponse(this);
        } 

    } 

}
