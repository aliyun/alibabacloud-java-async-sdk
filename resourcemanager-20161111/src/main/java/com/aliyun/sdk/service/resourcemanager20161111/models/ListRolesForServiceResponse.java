// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRolesForServiceResponse} extends {@link TeaModel}
 *
 * <p>ListRolesForServiceResponse</p>
 */
public class ListRolesForServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRolesForServiceResponseBody body;

    private ListRolesForServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRolesForServiceResponse create() {
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
    public ListRolesForServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRolesForServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRolesForServiceResponseBody body);

        @Override
        ListRolesForServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRolesForServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRolesForServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRolesForServiceResponse response) {
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
        public Builder body(ListRolesForServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRolesForServiceResponse build() {
            return new ListRolesForServiceResponse(this);
        } 

    } 

}
