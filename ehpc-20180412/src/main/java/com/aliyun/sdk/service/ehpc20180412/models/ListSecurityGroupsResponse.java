// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecurityGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListSecurityGroupsResponse</p>
 */
public class ListSecurityGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSecurityGroupsResponseBody body;

    private ListSecurityGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSecurityGroupsResponse create() {
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
    public ListSecurityGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSecurityGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSecurityGroupsResponseBody body);

        @Override
        ListSecurityGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSecurityGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSecurityGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSecurityGroupsResponse response) {
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
        public Builder body(ListSecurityGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSecurityGroupsResponse build() {
            return new ListSecurityGroupsResponse(this);
        } 

    } 

}
