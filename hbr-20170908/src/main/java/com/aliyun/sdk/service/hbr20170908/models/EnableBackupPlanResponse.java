// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableBackupPlanResponse} extends {@link TeaModel}
 *
 * <p>EnableBackupPlanResponse</p>
 */
public class EnableBackupPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableBackupPlanResponseBody body;

    private EnableBackupPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableBackupPlanResponse create() {
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
    public EnableBackupPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableBackupPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableBackupPlanResponseBody body);

        @Override
        EnableBackupPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableBackupPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableBackupPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableBackupPlanResponse response) {
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
        public Builder body(EnableBackupPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableBackupPlanResponse build() {
            return new EnableBackupPlanResponse(this);
        } 

    } 

}
