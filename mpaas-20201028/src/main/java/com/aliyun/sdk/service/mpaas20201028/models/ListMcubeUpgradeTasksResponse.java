// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMcubeUpgradeTasksResponse} extends {@link TeaModel}
 *
 * <p>ListMcubeUpgradeTasksResponse</p>
 */
public class ListMcubeUpgradeTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMcubeUpgradeTasksResponseBody body;

    private ListMcubeUpgradeTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMcubeUpgradeTasksResponse create() {
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
    public ListMcubeUpgradeTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMcubeUpgradeTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMcubeUpgradeTasksResponseBody body);

        @Override
        ListMcubeUpgradeTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMcubeUpgradeTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMcubeUpgradeTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMcubeUpgradeTasksResponse response) {
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
        public Builder body(ListMcubeUpgradeTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMcubeUpgradeTasksResponse build() {
            return new ListMcubeUpgradeTasksResponse(this);
        } 

    } 

}
