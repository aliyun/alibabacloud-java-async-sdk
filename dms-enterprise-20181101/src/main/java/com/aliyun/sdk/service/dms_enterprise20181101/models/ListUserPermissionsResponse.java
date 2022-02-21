// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserPermissionsResponse} extends {@link TeaModel}
 *
 * <p>ListUserPermissionsResponse</p>
 */
public class ListUserPermissionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUserPermissionsResponseBody body;

    private ListUserPermissionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUserPermissionsResponse create() {
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
    public ListUserPermissionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUserPermissionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUserPermissionsResponseBody body);

        @Override
        ListUserPermissionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUserPermissionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUserPermissionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUserPermissionsResponse response) {
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
        public Builder body(ListUserPermissionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUserPermissionsResponse build() {
            return new ListUserPermissionsResponse(this);
        } 

    } 

}
