// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMcubeUpgradePackagesResponse} extends {@link TeaModel}
 *
 * <p>ListMcubeUpgradePackagesResponse</p>
 */
public class ListMcubeUpgradePackagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMcubeUpgradePackagesResponseBody body;

    private ListMcubeUpgradePackagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMcubeUpgradePackagesResponse create() {
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
    public ListMcubeUpgradePackagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMcubeUpgradePackagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMcubeUpgradePackagesResponseBody body);

        @Override
        ListMcubeUpgradePackagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMcubeUpgradePackagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMcubeUpgradePackagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMcubeUpgradePackagesResponse response) {
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
        public Builder body(ListMcubeUpgradePackagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMcubeUpgradePackagesResponse build() {
            return new ListMcubeUpgradePackagesResponse(this);
        } 

    } 

}
