// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartBackupPlanResponse} extends {@link TeaModel}
 *
 * <p>StartBackupPlanResponse</p>
 */
public class StartBackupPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartBackupPlanResponseBody body;

    private StartBackupPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartBackupPlanResponse create() {
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
    public StartBackupPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartBackupPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartBackupPlanResponseBody body);

        @Override
        StartBackupPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartBackupPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartBackupPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartBackupPlanResponse response) {
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
        public Builder body(StartBackupPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartBackupPlanResponse build() {
            return new StartBackupPlanResponse(this);
        } 

    } 

}
