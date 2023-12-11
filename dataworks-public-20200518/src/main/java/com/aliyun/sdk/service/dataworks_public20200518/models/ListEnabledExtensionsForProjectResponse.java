// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnabledExtensionsForProjectResponse} extends {@link TeaModel}
 *
 * <p>ListEnabledExtensionsForProjectResponse</p>
 */
public class ListEnabledExtensionsForProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEnabledExtensionsForProjectResponseBody body;

    private ListEnabledExtensionsForProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEnabledExtensionsForProjectResponse create() {
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
    public ListEnabledExtensionsForProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEnabledExtensionsForProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEnabledExtensionsForProjectResponseBody body);

        @Override
        ListEnabledExtensionsForProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEnabledExtensionsForProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEnabledExtensionsForProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEnabledExtensionsForProjectResponse response) {
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
        public Builder body(ListEnabledExtensionsForProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEnabledExtensionsForProjectResponse build() {
            return new ListEnabledExtensionsForProjectResponse(this);
        } 

    } 

}
