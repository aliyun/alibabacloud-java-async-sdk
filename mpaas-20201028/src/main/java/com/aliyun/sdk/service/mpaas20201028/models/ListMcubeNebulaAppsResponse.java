// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMcubeNebulaAppsResponse} extends {@link TeaModel}
 *
 * <p>ListMcubeNebulaAppsResponse</p>
 */
public class ListMcubeNebulaAppsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMcubeNebulaAppsResponseBody body;

    private ListMcubeNebulaAppsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMcubeNebulaAppsResponse create() {
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
    public ListMcubeNebulaAppsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMcubeNebulaAppsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMcubeNebulaAppsResponseBody body);

        @Override
        ListMcubeNebulaAppsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMcubeNebulaAppsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMcubeNebulaAppsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMcubeNebulaAppsResponse response) {
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
        public Builder body(ListMcubeNebulaAppsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMcubeNebulaAppsResponse build() {
            return new ListMcubeNebulaAppsResponse(this);
        } 

    } 

}
