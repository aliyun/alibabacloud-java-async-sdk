// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPermissionsResponse} extends {@link TeaModel}
 *
 * <p>ListPermissionsResponse</p>
 */
public class ListPermissionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPermissionsResponseBody body;

    private ListPermissionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPermissionsResponse create() {
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
    public ListPermissionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPermissionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPermissionsResponseBody body);

        @Override
        ListPermissionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPermissionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPermissionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPermissionsResponse response) {
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
        public Builder body(ListPermissionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPermissionsResponse build() {
            return new ListPermissionsResponse(this);
        } 

    } 

}
