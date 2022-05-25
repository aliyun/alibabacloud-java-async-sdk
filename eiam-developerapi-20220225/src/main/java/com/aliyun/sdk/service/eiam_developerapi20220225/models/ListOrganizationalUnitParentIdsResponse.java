// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link ListOrganizationalUnitParentIdsResponse} extends {@link TeaModel}
 *
 * <p>ListOrganizationalUnitParentIdsResponse</p>
 */
public class ListOrganizationalUnitParentIdsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOrganizationalUnitParentIdsResponseBody body;

    private ListOrganizationalUnitParentIdsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOrganizationalUnitParentIdsResponse create() {
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
    public ListOrganizationalUnitParentIdsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOrganizationalUnitParentIdsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOrganizationalUnitParentIdsResponseBody body);

        @Override
        ListOrganizationalUnitParentIdsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOrganizationalUnitParentIdsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOrganizationalUnitParentIdsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOrganizationalUnitParentIdsResponse response) {
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
        public Builder body(ListOrganizationalUnitParentIdsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOrganizationalUnitParentIdsResponse build() {
            return new ListOrganizationalUnitParentIdsResponse(this);
        } 

    } 

}
