// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCubeDataLevelPermissionConfigResponse} extends {@link TeaModel}
 *
 * <p>ListCubeDataLevelPermissionConfigResponse</p>
 */
public class ListCubeDataLevelPermissionConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCubeDataLevelPermissionConfigResponseBody body;

    private ListCubeDataLevelPermissionConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCubeDataLevelPermissionConfigResponse create() {
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
    public ListCubeDataLevelPermissionConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCubeDataLevelPermissionConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCubeDataLevelPermissionConfigResponseBody body);

        @Override
        ListCubeDataLevelPermissionConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCubeDataLevelPermissionConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCubeDataLevelPermissionConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCubeDataLevelPermissionConfigResponse response) {
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
        public Builder body(ListCubeDataLevelPermissionConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCubeDataLevelPermissionConfigResponse build() {
            return new ListCubeDataLevelPermissionConfigResponse(this);
        } 

    } 

}
