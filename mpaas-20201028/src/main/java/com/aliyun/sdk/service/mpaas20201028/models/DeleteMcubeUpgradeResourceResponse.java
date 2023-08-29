// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMcubeUpgradeResourceResponse} extends {@link TeaModel}
 *
 * <p>DeleteMcubeUpgradeResourceResponse</p>
 */
public class DeleteMcubeUpgradeResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMcubeUpgradeResourceResponseBody body;

    private DeleteMcubeUpgradeResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMcubeUpgradeResourceResponse create() {
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
    public DeleteMcubeUpgradeResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMcubeUpgradeResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMcubeUpgradeResourceResponseBody body);

        @Override
        DeleteMcubeUpgradeResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMcubeUpgradeResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMcubeUpgradeResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMcubeUpgradeResourceResponse response) {
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
        public Builder body(DeleteMcubeUpgradeResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMcubeUpgradeResourceResponse build() {
            return new DeleteMcubeUpgradeResourceResponse(this);
        } 

    } 

}
