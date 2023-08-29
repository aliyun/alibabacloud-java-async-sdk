// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMcubeNebulaTasksResponse} extends {@link TeaModel}
 *
 * <p>ListMcubeNebulaTasksResponse</p>
 */
public class ListMcubeNebulaTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMcubeNebulaTasksResponseBody body;

    private ListMcubeNebulaTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMcubeNebulaTasksResponse create() {
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
    public ListMcubeNebulaTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMcubeNebulaTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMcubeNebulaTasksResponseBody body);

        @Override
        ListMcubeNebulaTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMcubeNebulaTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMcubeNebulaTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMcubeNebulaTasksResponse response) {
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
        public Builder body(ListMcubeNebulaTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMcubeNebulaTasksResponse build() {
            return new ListMcubeNebulaTasksResponse(this);
        } 

    } 

}
