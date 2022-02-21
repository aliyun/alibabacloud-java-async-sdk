// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteBackupPlanResponse} extends {@link TeaModel}
 *
 * <p>ExecuteBackupPlanResponse</p>
 */
public class ExecuteBackupPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExecuteBackupPlanResponseBody body;

    private ExecuteBackupPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExecuteBackupPlanResponse create() {
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
    public ExecuteBackupPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExecuteBackupPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExecuteBackupPlanResponseBody body);

        @Override
        ExecuteBackupPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExecuteBackupPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExecuteBackupPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExecuteBackupPlanResponse response) {
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
        public Builder body(ExecuteBackupPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExecuteBackupPlanResponse build() {
            return new ExecuteBackupPlanResponse(this);
        } 

    } 

}
