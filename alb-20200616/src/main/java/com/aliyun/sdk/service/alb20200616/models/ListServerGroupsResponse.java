// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServerGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListServerGroupsResponse</p>
 */
public class ListServerGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListServerGroupsResponseBody body;

    private ListServerGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListServerGroupsResponse create() {
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
    public ListServerGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListServerGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListServerGroupsResponseBody body);

        @Override
        ListServerGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListServerGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListServerGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListServerGroupsResponse response) {
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
        public Builder body(ListServerGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListServerGroupsResponse build() {
            return new ListServerGroupsResponse(this);
        } 

    } 

}
