// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataLevelPermissionWhiteListResponse} extends {@link TeaModel}
 *
 * <p>ListDataLevelPermissionWhiteListResponse</p>
 */
public class ListDataLevelPermissionWhiteListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDataLevelPermissionWhiteListResponseBody body;

    private ListDataLevelPermissionWhiteListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDataLevelPermissionWhiteListResponse create() {
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
    public ListDataLevelPermissionWhiteListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDataLevelPermissionWhiteListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDataLevelPermissionWhiteListResponseBody body);

        @Override
        ListDataLevelPermissionWhiteListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDataLevelPermissionWhiteListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDataLevelPermissionWhiteListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDataLevelPermissionWhiteListResponse response) {
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
        public Builder body(ListDataLevelPermissionWhiteListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDataLevelPermissionWhiteListResponse build() {
            return new ListDataLevelPermissionWhiteListResponse(this);
        } 

    } 

}
