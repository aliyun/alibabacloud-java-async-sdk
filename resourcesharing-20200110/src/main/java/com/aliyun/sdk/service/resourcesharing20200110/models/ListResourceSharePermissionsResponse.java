// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceSharePermissionsResponse} extends {@link TeaModel}
 *
 * <p>ListResourceSharePermissionsResponse</p>
 */
public class ListResourceSharePermissionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListResourceSharePermissionsResponseBody body;

    private ListResourceSharePermissionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListResourceSharePermissionsResponse create() {
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
    public ListResourceSharePermissionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListResourceSharePermissionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListResourceSharePermissionsResponseBody body);

        @Override
        ListResourceSharePermissionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListResourceSharePermissionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListResourceSharePermissionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListResourceSharePermissionsResponse response) {
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
        public Builder body(ListResourceSharePermissionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListResourceSharePermissionsResponse build() {
            return new ListResourceSharePermissionsResponse(this);
        } 

    } 

}
