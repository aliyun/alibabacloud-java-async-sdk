// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPermissionApplyOrdersResponse} extends {@link TeaModel}
 *
 * <p>ListPermissionApplyOrdersResponse</p>
 */
public class ListPermissionApplyOrdersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPermissionApplyOrdersResponseBody body;

    private ListPermissionApplyOrdersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPermissionApplyOrdersResponse create() {
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
    public ListPermissionApplyOrdersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPermissionApplyOrdersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPermissionApplyOrdersResponseBody body);

        @Override
        ListPermissionApplyOrdersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPermissionApplyOrdersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPermissionApplyOrdersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPermissionApplyOrdersResponse response) {
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
        public Builder body(ListPermissionApplyOrdersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPermissionApplyOrdersResponse build() {
            return new ListPermissionApplyOrdersResponse(this);
        } 

    } 

}
