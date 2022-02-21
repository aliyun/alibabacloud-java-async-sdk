// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewBackupPlanResponse} extends {@link TeaModel}
 *
 * <p>RenewBackupPlanResponse</p>
 */
public class RenewBackupPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RenewBackupPlanResponseBody body;

    private RenewBackupPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RenewBackupPlanResponse create() {
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
    public RenewBackupPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RenewBackupPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RenewBackupPlanResponseBody body);

        @Override
        RenewBackupPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RenewBackupPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RenewBackupPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RenewBackupPlanResponse response) {
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
        public Builder body(RenewBackupPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RenewBackupPlanResponse build() {
            return new RenewBackupPlanResponse(this);
        } 

    } 

}
