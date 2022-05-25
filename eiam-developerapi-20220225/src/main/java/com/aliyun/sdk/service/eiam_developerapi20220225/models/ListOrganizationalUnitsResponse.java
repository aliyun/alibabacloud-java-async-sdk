// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link ListOrganizationalUnitsResponse} extends {@link TeaModel}
 *
 * <p>ListOrganizationalUnitsResponse</p>
 */
public class ListOrganizationalUnitsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOrganizationalUnitsResponseBody body;

    private ListOrganizationalUnitsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOrganizationalUnitsResponse create() {
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
    public ListOrganizationalUnitsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOrganizationalUnitsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOrganizationalUnitsResponseBody body);

        @Override
        ListOrganizationalUnitsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOrganizationalUnitsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOrganizationalUnitsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOrganizationalUnitsResponse response) {
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
        public Builder body(ListOrganizationalUnitsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOrganizationalUnitsResponse build() {
            return new ListOrganizationalUnitsResponse(this);
        } 

    } 

}
