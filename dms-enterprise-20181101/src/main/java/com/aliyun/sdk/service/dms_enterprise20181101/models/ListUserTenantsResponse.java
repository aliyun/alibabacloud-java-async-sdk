// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserTenantsResponse} extends {@link TeaModel}
 *
 * <p>ListUserTenantsResponse</p>
 */
public class ListUserTenantsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUserTenantsResponseBody body;

    private ListUserTenantsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUserTenantsResponse create() {
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
    public ListUserTenantsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUserTenantsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUserTenantsResponseBody body);

        @Override
        ListUserTenantsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUserTenantsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUserTenantsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUserTenantsResponse response) {
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
        public Builder body(ListUserTenantsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUserTenantsResponse build() {
            return new ListUserTenantsResponse(this);
        } 

    } 

}
