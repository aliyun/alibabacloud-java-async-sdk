// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOfficeSiteUsersResponse} extends {@link TeaModel}
 *
 * <p>ListOfficeSiteUsersResponse</p>
 */
public class ListOfficeSiteUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOfficeSiteUsersResponseBody body;

    private ListOfficeSiteUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOfficeSiteUsersResponse create() {
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
    public ListOfficeSiteUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOfficeSiteUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOfficeSiteUsersResponseBody body);

        @Override
        ListOfficeSiteUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOfficeSiteUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOfficeSiteUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOfficeSiteUsersResponse response) {
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
        public Builder body(ListOfficeSiteUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOfficeSiteUsersResponse build() {
            return new ListOfficeSiteUsersResponse(this);
        } 

    } 

}
