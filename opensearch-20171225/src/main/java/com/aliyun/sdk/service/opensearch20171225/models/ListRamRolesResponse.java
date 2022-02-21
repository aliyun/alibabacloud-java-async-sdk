// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRamRolesResponse} extends {@link TeaModel}
 *
 * <p>ListRamRolesResponse</p>
 */
public class ListRamRolesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRamRolesResponseBody body;

    private ListRamRolesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRamRolesResponse create() {
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
    public ListRamRolesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRamRolesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRamRolesResponseBody body);

        @Override
        ListRamRolesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRamRolesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRamRolesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRamRolesResponse response) {
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
        public Builder body(ListRamRolesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRamRolesResponse build() {
            return new ListRamRolesResponse(this);
        } 

    } 

}
