// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVariableGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListVariableGroupsResponse</p>
 */
public class ListVariableGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVariableGroupsResponseBody body;

    private ListVariableGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVariableGroupsResponse create() {
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
    public ListVariableGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVariableGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVariableGroupsResponseBody body);

        @Override
        ListVariableGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVariableGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVariableGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVariableGroupsResponse response) {
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
        public Builder body(ListVariableGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVariableGroupsResponse build() {
            return new ListVariableGroupsResponse(this);
        } 

    } 

}
