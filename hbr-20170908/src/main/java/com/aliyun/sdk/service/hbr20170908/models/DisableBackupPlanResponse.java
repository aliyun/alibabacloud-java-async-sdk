// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableBackupPlanResponse} extends {@link TeaModel}
 *
 * <p>DisableBackupPlanResponse</p>
 */
public class DisableBackupPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableBackupPlanResponseBody body;

    private DisableBackupPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableBackupPlanResponse create() {
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
    public DisableBackupPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableBackupPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableBackupPlanResponseBody body);

        @Override
        DisableBackupPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableBackupPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableBackupPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableBackupPlanResponse response) {
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
        public Builder body(DisableBackupPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableBackupPlanResponse build() {
            return new DisableBackupPlanResponse(this);
        } 

    } 

}
