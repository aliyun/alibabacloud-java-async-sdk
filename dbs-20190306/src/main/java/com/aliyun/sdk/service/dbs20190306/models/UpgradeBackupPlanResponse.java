// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeBackupPlanResponse} extends {@link TeaModel}
 *
 * <p>UpgradeBackupPlanResponse</p>
 */
public class UpgradeBackupPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpgradeBackupPlanResponseBody body;

    private UpgradeBackupPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpgradeBackupPlanResponse create() {
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
    public UpgradeBackupPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeBackupPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpgradeBackupPlanResponseBody body);

        @Override
        UpgradeBackupPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeBackupPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpgradeBackupPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeBackupPlanResponse response) {
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
        public Builder body(UpgradeBackupPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeBackupPlanResponse build() {
            return new UpgradeBackupPlanResponse(this);
        } 

    } 

}
