// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcubeUpgradePackageResponse} extends {@link TeaModel}
 *
 * <p>CreateMcubeUpgradePackageResponse</p>
 */
public class CreateMcubeUpgradePackageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMcubeUpgradePackageResponseBody body;

    private CreateMcubeUpgradePackageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMcubeUpgradePackageResponse create() {
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
    public CreateMcubeUpgradePackageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMcubeUpgradePackageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMcubeUpgradePackageResponseBody body);

        @Override
        CreateMcubeUpgradePackageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMcubeUpgradePackageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMcubeUpgradePackageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMcubeUpgradePackageResponse response) {
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
        public Builder body(CreateMcubeUpgradePackageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMcubeUpgradePackageResponse build() {
            return new CreateMcubeUpgradePackageResponse(this);
        } 

    } 

}
