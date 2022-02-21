// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOTAStaticUpgradeJobResponse} extends {@link TeaModel}
 *
 * <p>CreateOTAStaticUpgradeJobResponse</p>
 */
public class CreateOTAStaticUpgradeJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOTAStaticUpgradeJobResponseBody body;

    private CreateOTAStaticUpgradeJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOTAStaticUpgradeJobResponse create() {
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
    public CreateOTAStaticUpgradeJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOTAStaticUpgradeJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOTAStaticUpgradeJobResponseBody body);

        @Override
        CreateOTAStaticUpgradeJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOTAStaticUpgradeJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOTAStaticUpgradeJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOTAStaticUpgradeJobResponse response) {
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
        public Builder body(CreateOTAStaticUpgradeJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOTAStaticUpgradeJobResponse build() {
            return new CreateOTAStaticUpgradeJobResponse(this);
        } 

    } 

}
