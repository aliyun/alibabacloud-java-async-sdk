// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOrganizationalUnitParentsResponse} extends {@link TeaModel}
 *
 * <p>ListOrganizationalUnitParentsResponse</p>
 */
public class ListOrganizationalUnitParentsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOrganizationalUnitParentsResponseBody body;

    private ListOrganizationalUnitParentsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOrganizationalUnitParentsResponse create() {
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
    public ListOrganizationalUnitParentsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOrganizationalUnitParentsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOrganizationalUnitParentsResponseBody body);

        @Override
        ListOrganizationalUnitParentsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOrganizationalUnitParentsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOrganizationalUnitParentsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOrganizationalUnitParentsResponse response) {
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
        public Builder body(ListOrganizationalUnitParentsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOrganizationalUnitParentsResponse build() {
            return new ListOrganizationalUnitParentsResponse(this);
        } 

    } 

}
